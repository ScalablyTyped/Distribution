package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomRoutingEndpointGroupRequest extends StObject {
  
  /**
    * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint group to accept client traffic on.
    */
  var DestinationConfigurations: CustomRoutingDestinationConfigurations
  
  /**
    * The Amazon Web Services Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typings.awsSdk.clientsGlobalacceleratorMod.IdempotencyToken
  
  /**
    * The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
    */
  var ListenerArn: GenericString
}
object CreateCustomRoutingEndpointGroupRequest {
  
  inline def apply(
    DestinationConfigurations: CustomRoutingDestinationConfigurations,
    EndpointGroupRegion: GenericString,
    IdempotencyToken: IdempotencyToken,
    ListenerArn: GenericString
  ): CreateCustomRoutingEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(DestinationConfigurations = DestinationConfigurations.asInstanceOf[js.Any], EndpointGroupRegion = EndpointGroupRegion.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomRoutingEndpointGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomRoutingEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationConfigurations(value: CustomRoutingDestinationConfigurations): Self = StObject.set(x, "DestinationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigurationsVarargs(value: CustomRoutingDestinationConfiguration*): Self = StObject.set(x, "DestinationConfigurations", js.Array(value*))
    
    inline def setEndpointGroupRegion(value: GenericString): Self = StObject.set(x, "EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
