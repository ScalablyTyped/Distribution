package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallDomainListMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall domain list metadata.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Arn] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of running the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The ID of the domain list. 
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list AWSManagedDomainsMalwareDomainList has the managed owner name Route 53 Resolver DNS Firewall.
    */
  var ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined
  
  /**
    * The name of the domain list. 
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
}
object FirewallDomainListMetadata {
  
  inline def apply(): FirewallDomainListMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallDomainListMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallDomainListMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setManagedOwnerName(value: ServicePrinciple): Self = StObject.set(x, "ManagedOwnerName", value.asInstanceOf[js.Any])
    
    inline def setManagedOwnerNameUndefined: Self = StObject.set(x, "ManagedOwnerName", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
