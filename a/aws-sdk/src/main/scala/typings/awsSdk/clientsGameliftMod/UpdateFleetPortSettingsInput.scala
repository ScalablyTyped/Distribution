package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetPortSettingsInput extends StObject {
  
  /**
    * A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * A collection of port settings to be added to the fleet resource.
    */
  var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined
  
  /**
    * A collection of port settings to be removed from the fleet resource.
    */
  var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined
}
object UpdateFleetPortSettingsInput {
  
  inline def apply(FleetId: FleetIdOrArn): UpdateFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetPortSettingsInput]
  }
  
  extension [Self <: UpdateFleetPortSettingsInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setInboundPermissionAuthorizations(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissionAuthorizations", value.asInstanceOf[js.Any])
    
    inline def setInboundPermissionAuthorizationsUndefined: Self = StObject.set(x, "InboundPermissionAuthorizations", js.undefined)
    
    inline def setInboundPermissionAuthorizationsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissionAuthorizations", js.Array(value*))
    
    inline def setInboundPermissionRevocations(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissionRevocations", value.asInstanceOf[js.Any])
    
    inline def setInboundPermissionRevocationsUndefined: Self = StObject.set(x, "InboundPermissionRevocations", js.undefined)
    
    inline def setInboundPermissionRevocationsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissionRevocations", js.Array(value*))
  }
}
