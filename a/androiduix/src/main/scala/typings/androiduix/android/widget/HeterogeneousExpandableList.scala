package typings.androiduix.android.widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeterogeneousExpandableList extends StObject {
  
  def getChildType(groupPosition: Double, childPosition: Double): Double = js.native
  
  def getChildTypeCount(): Double = js.native
  
  def getGroupType(groupPosition: Double): Double = js.native
  
  def getGroupTypeCount(): Double = js.native
}
object HeterogeneousExpandableList {
  
  @scala.inline
  def apply(
    getChildType: (Double, Double) => Double,
    getChildTypeCount: () => Double,
    getGroupType: Double => Double,
    getGroupTypeCount: () => Double
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal(getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount))
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
  
  @scala.inline
  implicit class HeterogeneousExpandableListMutableBuilder[Self <: HeterogeneousExpandableList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetChildType(value: (Double, Double) => Double): Self = StObject.set(x, "getChildType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildTypeCount(value: () => Double): Self = StObject.set(x, "getChildTypeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupType(value: Double => Double): Self = StObject.set(x, "getGroupType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupTypeCount(value: () => Double): Self = StObject.set(x, "getGroupTypeCount", js.Any.fromFunction0(value))
  }
}
