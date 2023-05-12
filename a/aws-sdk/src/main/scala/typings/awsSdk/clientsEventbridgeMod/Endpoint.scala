package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The ARN of the endpoint.
    */
  var Arn: js.UndefOr[EndpointArn] = js.undefined
  
  /**
    * The time the endpoint was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description for the endpoint.
    */
  var Description: js.UndefOr[EndpointDescription] = js.undefined
  
  /**
    * The URL subdomain of the endpoint. For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is abcde.veo.
    */
  var EndpointId: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EndpointId] = js.undefined
  
  /**
    * The URL of the endpoint.
    */
  var EndpointUrl: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EndpointUrl] = js.undefined
  
  /**
    * The event buses being used by the endpoint.
    */
  var EventBuses: js.UndefOr[EndpointEventBusList] = js.undefined
  
  /**
    * The last time the endpoint was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var Name: js.UndefOr[EndpointName] = js.undefined
  
  /**
    * Whether event replication was enabled or disabled for this endpoint. The default state is ENABLED which means you must supply a RoleArn. If you don't have a RoleArn or you don't want event replication enabled, set the state to DISABLED.
    */
  var ReplicationConfig: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ReplicationConfig] = js.undefined
  
  /**
    * The ARN of the role used by event replication for the endpoint.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The routing configuration of the endpoint.
    */
  var RoutingConfig: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.RoutingConfig] = js.undefined
  
  /**
    * The current state of the endpoint.
    */
  var State: js.UndefOr[EndpointState] = js.undefined
  
  /**
    * The reason the endpoint is in its current state.
    */
  var StateReason: js.UndefOr[EndpointStateReason] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EndpointArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: EndpointDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setEndpointUrl(value: EndpointUrl): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    inline def setEventBuses(value: EndpointEventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    inline def setEventBusesVarargs(value: EndpointEventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReplicationConfig(value: ReplicationConfig): Self = StObject.set(x, "ReplicationConfig", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigUndefined: Self = StObject.set(x, "ReplicationConfig", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoutingConfig(value: RoutingConfig): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    
    inline def setState(value: EndpointState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: EndpointStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
