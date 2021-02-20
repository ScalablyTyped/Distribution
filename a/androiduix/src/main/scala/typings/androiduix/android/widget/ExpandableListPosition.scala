package typings.androiduix.android.widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListPosition extends StObject {
  
  var childPos: Double = js.native
  
  var flatListPos: Double = js.native
  
  def getPackedPosition(): Double = js.native
  
  var groupPos: Double = js.native
  
  def recycle(): Unit = js.native
  
  /* private */ def resetState(): js.Any = js.native
  
  var `type`: Double = js.native
}
object ExpandableListPosition {
  
  @scala.inline
  def apply(
    childPos: Double,
    flatListPos: Double,
    getPackedPosition: () => Double,
    groupPos: Double,
    recycle: () => Unit,
    resetState: () => js.Any,
    `type`: Double
  ): ExpandableListPosition = {
    val __obj = js.Dynamic.literal(childPos = childPos.asInstanceOf[js.Any], flatListPos = flatListPos.asInstanceOf[js.Any], getPackedPosition = js.Any.fromFunction0(getPackedPosition), groupPos = groupPos.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), resetState = js.Any.fromFunction0(resetState))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandableListPosition]
  }
  
  @scala.inline
  implicit class ExpandableListPositionMutableBuilder[Self <: ExpandableListPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPos(value: Double): Self = StObject.set(x, "childPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatListPos(value: Double): Self = StObject.set(x, "flatListPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPackedPosition(value: () => Double): Self = StObject.set(x, "getPackedPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupPos(value: Double): Self = StObject.set(x, "groupPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetState(value: () => js.Any): Self = StObject.set(x, "resetState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
