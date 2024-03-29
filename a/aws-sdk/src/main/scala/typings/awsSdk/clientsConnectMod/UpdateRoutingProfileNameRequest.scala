package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingProfileNameRequest extends StObject {
  
  /**
    * The description of the routing profile. Must not be more than 250 characters.
    */
  var Description: js.UndefOr[RoutingProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the routing profile. Must not be more than 127 characters.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.undefined
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.clientsConnectMod.RoutingProfileId
}
object UpdateRoutingProfileNameRequest {
  
  inline def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileNameRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileNameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRoutingProfileNameRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
