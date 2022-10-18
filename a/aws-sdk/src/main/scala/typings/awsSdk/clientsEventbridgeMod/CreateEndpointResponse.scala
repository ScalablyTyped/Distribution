package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointResponse extends StObject {
  
  /**
    * The ARN of the endpoint that was created by this request.
    */
  var Arn: js.UndefOr[EndpointArn] = js.undefined
  
  /**
    * The event buses used by this request.
    */
  var EventBuses: js.UndefOr[EndpointEventBusList] = js.undefined
  
  /**
    * The name of the endpoint that was created by this request.
    */
  var Name: js.UndefOr[EndpointName] = js.undefined
  
  /**
    * Whether event replication was enabled or disabled by this request.
    */
  var ReplicationConfig: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ReplicationConfig] = js.undefined
  
  /**
    * The ARN of the role used by event replication for this request.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The routing configuration defined by this request.
    */
  var RoutingConfig: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.RoutingConfig] = js.undefined
  
  /**
    * The state of the endpoint that was created by this request.
    */
  var State: js.UndefOr[EndpointState] = js.undefined
}
object CreateEndpointResponse {
  
  inline def apply(): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointResponse]
  }
  
  extension [Self <: CreateEndpointResponse](x: Self) {
    
    inline def setArn(value: EndpointArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setEventBuses(value: EndpointEventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    inline def setEventBusesVarargs(value: EndpointEventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReplicationConfig(value: ReplicationConfig): Self = StObject.set(x, "ReplicationConfig", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigUndefined: Self = StObject.set(x, "ReplicationConfig", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoutingConfig(value: RoutingConfig): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    
    inline def setState(value: EndpointState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
