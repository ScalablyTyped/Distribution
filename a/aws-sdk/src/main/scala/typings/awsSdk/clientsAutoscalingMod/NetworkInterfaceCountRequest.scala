package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceCountRequest extends StObject {
  
  /**
    * The maximum number of network interfaces.
    */
  var Max: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The minimum number of network interfaces.
    */
  var Min: js.UndefOr[NullablePositiveInteger] = js.undefined
}
object NetworkInterfaceCountRequest {
  
  inline def apply(): NetworkInterfaceCountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceCountRequest]
  }
  
  extension [Self <: NetworkInterfaceCountRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveInteger): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveInteger): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
