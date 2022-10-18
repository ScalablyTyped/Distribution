package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogLevelsByResourceTypesResponse extends StObject {
  
  var DefaultLogLevel: js.UndefOr[LogLevel] = js.undefined
  
  var WirelessDeviceLogOptions: js.UndefOr[WirelessDeviceLogOptionList] = js.undefined
  
  var WirelessGatewayLogOptions: js.UndefOr[WirelessGatewayLogOptionList] = js.undefined
}
object GetLogLevelsByResourceTypesResponse {
  
  inline def apply(): GetLogLevelsByResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogLevelsByResourceTypesResponse]
  }
  
  extension [Self <: GetLogLevelsByResourceTypesResponse](x: Self) {
    
    inline def setDefaultLogLevel(value: LogLevel): Self = StObject.set(x, "DefaultLogLevel", value.asInstanceOf[js.Any])
    
    inline def setDefaultLogLevelUndefined: Self = StObject.set(x, "DefaultLogLevel", js.undefined)
    
    inline def setWirelessDeviceLogOptions(value: WirelessDeviceLogOptionList): Self = StObject.set(x, "WirelessDeviceLogOptions", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceLogOptionsUndefined: Self = StObject.set(x, "WirelessDeviceLogOptions", js.undefined)
    
    inline def setWirelessDeviceLogOptionsVarargs(value: WirelessDeviceLogOption*): Self = StObject.set(x, "WirelessDeviceLogOptions", js.Array(value*))
    
    inline def setWirelessGatewayLogOptions(value: WirelessGatewayLogOptionList): Self = StObject.set(x, "WirelessGatewayLogOptions", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayLogOptionsUndefined: Self = StObject.set(x, "WirelessGatewayLogOptions", js.undefined)
    
    inline def setWirelessGatewayLogOptionsVarargs(value: WirelessGatewayLogOption*): Self = StObject.set(x, "WirelessGatewayLogOptions", js.Array(value*))
  }
}
