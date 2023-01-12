package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorCountRequest extends StObject {
  
  /**
    * The maximum number of accelerators. To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance types, set Max to 0.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of accelerators. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AcceleratorCountRequest {
  
  inline def apply(): AcceleratorCountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorCountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceleratorCountRequest] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
