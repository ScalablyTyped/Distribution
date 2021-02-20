package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For convenience the static and instance portions of `TView` and `LView` are merged into a single
  * object in `LViewRange`.
  */
@js.native
trait LViewDebugRangeContent extends StObject {
  
  /**
    * Index into original `LView` or `TView.data`.
    */
  var index: Double = js.native
  
  /**
    * Value from the `LView[index]` location.
    */
  var l: js.Any = js.native
  
  /**
    * Value from the `TView.data[index]` location.
    */
  var t: js.Any = js.native
}
object LViewDebugRangeContent {
  
  @scala.inline
  def apply(index: Double, l: js.Any, t: js.Any): LViewDebugRangeContent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[LViewDebugRangeContent]
  }
  
  @scala.inline
  implicit class LViewDebugRangeContentMutableBuilder[Self <: LViewDebugRangeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: js.Any): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: js.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
