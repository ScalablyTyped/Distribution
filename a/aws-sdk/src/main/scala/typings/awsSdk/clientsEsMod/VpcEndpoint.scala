package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpoint extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.clientsEsMod.DomainArn] = js.undefined
  
  /**
    * The connection endpoint ID for connecting to the domain.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsEsMod.Endpoint] = js.undefined
  
  /**
    * The current status of the endpoint.
    */
  var Status: js.UndefOr[VpcEndpointStatus] = js.undefined
  
  /**
    * The unique identifier of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.clientsEsMod.VpcEndpointId] = js.undefined
  
  /**
    * The creator of the endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[AWSAccount] = js.undefined
  
  /**
    * Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
    */
  var VpcOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
}
object VpcEndpoint {
  
  inline def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  extension [Self <: VpcEndpoint](x: Self) {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcEndpointOwner(value: AWSAccount): Self = StObject.set(x, "VpcEndpointOwner", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointOwnerUndefined: Self = StObject.set(x, "VpcEndpointOwner", js.undefined)
    
    inline def setVpcOptions(value: VPCDerivedInfo): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
    
    inline def setVpcOptionsUndefined: Self = StObject.set(x, "VpcOptions", js.undefined)
  }
}
