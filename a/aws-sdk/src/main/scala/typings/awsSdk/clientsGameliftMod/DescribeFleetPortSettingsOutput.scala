package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetPortSettingsOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that was requested. 
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
  
  /**
    * The requested fleet location, expressed as an Amazon Web Services Region code, such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * The current status of updates to the fleet's port settings in the requested fleet location. A status of PENDING_UPDATE indicates that an update was requested for the fleet but has not yet been completed for the location.
    */
  var UpdateStatus: js.UndefOr[LocationUpdateStatus] = js.undefined
}
object DescribeFleetPortSettingsOutput {
  
  inline def apply(): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
  
  extension [Self <: DescribeFleetPortSettingsOutput](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setInboundPermissions(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissions", value.asInstanceOf[js.Any])
    
    inline def setInboundPermissionsUndefined: Self = StObject.set(x, "InboundPermissions", js.undefined)
    
    inline def setInboundPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissions", js.Array(value*))
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setUpdateStatus(value: LocationUpdateStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
