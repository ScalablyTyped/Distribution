package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceCountRequest extends StObject {
  
  /**
    * The maximum number of network interfaces. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of network interfaces. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object NetworkInterfaceCountRequest {
  
  inline def apply(): NetworkInterfaceCountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceCountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInterfaceCountRequest] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
