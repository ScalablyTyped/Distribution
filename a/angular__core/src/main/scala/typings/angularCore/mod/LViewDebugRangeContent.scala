package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For convenience the static and instance portions of `TView` and `LView` are merged into a single
  * object in `LViewRange`.
  */
trait LViewDebugRangeContent extends StObject {
  
  /**
    * Index into original `LView` or `TView.data`.
    */
  var index: Double
  
  /**
    * Value from the `LView[index]` location.
    */
  var l: js.Any
  
  /**
    * Value from the `TView.data[index]` location.
    */
  var t: js.Any
}
object LViewDebugRangeContent {
  
  inline def apply(index: Double, l: js.Any, t: js.Any): LViewDebugRangeContent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[LViewDebugRangeContent]
  }
  
  extension [Self <: LViewDebugRangeContent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Any): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setT(value: js.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
