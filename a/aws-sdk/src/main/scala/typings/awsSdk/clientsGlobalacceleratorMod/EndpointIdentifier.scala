package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointIdentifier extends StObject {
  
  /**
    * Indicates whether client IP address preservation is enabled for an endpoint. The value is true or false.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the endpoint fronted by the accelerator.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID.  An Application Load Balancer can be either internal or internet-facing.
    */
  var EndpointId: GenericString
}
object EndpointIdentifier {
  
  inline def apply(EndpointId: GenericString): EndpointIdentifier = {
    val __obj = js.Dynamic.literal(EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointIdentifier] (val x: Self) extends AnyVal {
    
    inline def setClientIPPreservationEnabled(value: GenericBoolean): Self = StObject.set(x, "ClientIPPreservationEnabled", value.asInstanceOf[js.Any])
    
    inline def setClientIPPreservationEnabledUndefined: Self = StObject.set(x, "ClientIPPreservationEnabled", js.undefined)
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
