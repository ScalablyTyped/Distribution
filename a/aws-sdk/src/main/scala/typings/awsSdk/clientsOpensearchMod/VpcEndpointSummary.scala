package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainArn] = js.undefined
  
  /**
    * The current status of the endpoint.
    */
  var Status: js.UndefOr[VpcEndpointStatus] = js.undefined
  
  /**
    * The unique identifier of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.VpcEndpointId] = js.undefined
  
  /**
    * The creator of the endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.undefined
}
object VpcEndpointSummary {
  
  inline def apply(): VpcEndpointSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpointSummary] (val x: Self) extends AnyVal {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcEndpointOwner(value: String): Self = StObject.set(x, "VpcEndpointOwner", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointOwnerUndefined: Self = StObject.set(x, "VpcEndpointOwner", js.undefined)
  }
}
