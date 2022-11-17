package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig extends StObject {
  
  var breakpoints: js.UndefOr[js.Array[Double]] = js.undefined
}
object ImageConfig {
  
  inline def apply(): ImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfig]
  }
  
  extension [Self <: ImageConfig](x: Self) {
    
    inline def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}
