package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gateway extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayArn] = js.undefined
  
  /**
    * The display name of the gateway.
    */
  var GatewayDisplayName: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayType] = js.undefined
  
  /**
    * The hypervisor ID of the gateway.
    */
  var HypervisorId: js.UndefOr[typings.awsSdk.backupgatewayMod.HypervisorId] = js.undefined
  
  /**
    * The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
    */
  var LastSeenTime: js.UndefOr[js.Date] = js.undefined
}
object Gateway {
  
  inline def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  
  extension [Self <: Gateway](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
    
    inline def setGatewayDisplayName(value: Name): Self = StObject.set(x, "GatewayDisplayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayDisplayNameUndefined: Self = StObject.set(x, "GatewayDisplayName", js.undefined)
    
    inline def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
    
    inline def setHypervisorId(value: HypervisorId): Self = StObject.set(x, "HypervisorId", value.asInstanceOf[js.Any])
    
    inline def setHypervisorIdUndefined: Self = StObject.set(x, "HypervisorId", js.undefined)
    
    inline def setLastSeenTime(value: js.Date): Self = StObject.set(x, "LastSeenTime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenTimeUndefined: Self = StObject.set(x, "LastSeenTime", js.undefined)
  }
}
