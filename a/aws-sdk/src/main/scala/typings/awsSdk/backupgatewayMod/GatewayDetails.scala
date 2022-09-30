package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayArn] = js.undefined
  
  /**
    * The display name of the gateway.
    */
  var GatewayDisplayName: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of the gateway type.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayType] = js.undefined
  
  /**
    * The hypervisor ID of the gateway.
    */
  var HypervisorId: js.UndefOr[typings.awsSdk.backupgatewayMod.HypervisorId] = js.undefined
  
  /**
    * Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
    */
  var LastSeenTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone. Can be weekly or monthly.
    */
  var MaintenanceStartTime: js.UndefOr[typings.awsSdk.backupgatewayMod.MaintenanceStartTime] = js.undefined
  
  /**
    * Details showing the next update availability time of the gateway.
    */
  var NextUpdateAvailabilityTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for backup gateway.
    */
  var VpcEndpoint: js.UndefOr[typings.awsSdk.backupgatewayMod.VpcEndpoint] = js.undefined
}
object GatewayDetails {
  
  inline def apply(): GatewayDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayDetails]
  }
  
  extension [Self <: GatewayDetails](x: Self) {
    
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
    
    inline def setMaintenanceStartTime(value: MaintenanceStartTime): Self = StObject.set(x, "MaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartTimeUndefined: Self = StObject.set(x, "MaintenanceStartTime", js.undefined)
    
    inline def setNextUpdateAvailabilityTime(value: js.Date): Self = StObject.set(x, "NextUpdateAvailabilityTime", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateAvailabilityTimeUndefined: Self = StObject.set(x, "NextUpdateAvailabilityTime", js.undefined)
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointUndefined: Self = StObject.set(x, "VpcEndpoint", js.undefined)
  }
}
