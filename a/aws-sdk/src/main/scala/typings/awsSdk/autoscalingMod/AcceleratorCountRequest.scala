package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorCountRequest extends StObject {
  
  /**
    * The maximum value.
    */
  var Max: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The minimum value.
    */
  var Min: js.UndefOr[NullablePositiveInteger] = js.undefined
}
object AcceleratorCountRequest {
  
  inline def apply(): AcceleratorCountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorCountRequest]
  }
  
  extension [Self <: AcceleratorCountRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveInteger): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveInteger): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
