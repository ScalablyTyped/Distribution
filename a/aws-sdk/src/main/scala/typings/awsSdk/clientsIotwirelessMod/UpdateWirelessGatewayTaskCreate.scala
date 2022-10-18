package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWirelessGatewayTaskCreate extends StObject {
  
  /**
    * The properties that relate to the LoRaWAN wireless gateway.
    */
  var LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskCreate] = js.undefined
  
  /**
    * The IAM role used to read data from the S3 bucket.
    */
  var UpdateDataRole: js.UndefOr[UpdateDataSource] = js.undefined
  
  /**
    * The link to the S3 bucket.
    */
  var UpdateDataSource: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.UpdateDataSource] = js.undefined
}
object UpdateWirelessGatewayTaskCreate {
  
  inline def apply(): UpdateWirelessGatewayTaskCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWirelessGatewayTaskCreate]
  }
  
  extension [Self <: UpdateWirelessGatewayTaskCreate](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANUpdateGatewayTaskCreate): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setUpdateDataRole(value: UpdateDataSource): Self = StObject.set(x, "UpdateDataRole", value.asInstanceOf[js.Any])
    
    inline def setUpdateDataRoleUndefined: Self = StObject.set(x, "UpdateDataRole", js.undefined)
    
    inline def setUpdateDataSource(value: UpdateDataSource): Self = StObject.set(x, "UpdateDataSource", value.asInstanceOf[js.Any])
    
    inline def setUpdateDataSourceUndefined: Self = StObject.set(x, "UpdateDataSource", js.undefined)
  }
}
