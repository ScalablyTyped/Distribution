package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallDomainList extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall domain list.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Arn] = js.undefined
  
  /**
    * The date and time that the domain list was created, in Unix time format and Coordinated Universal Time (UTC). 
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of running the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The number of domain names that are specified in the domain list.
    */
  var DomainCount: js.UndefOr[Unsigned] = js.undefined
  
  /**
    * The ID of the domain list. 
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list AWSManagedDomainsMalwareDomainList has the managed owner name Route 53 Resolver DNS Firewall.
    */
  var ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined
  
  /**
    * The date and time that the domain list was last modified, in Unix time format and Coordinated Universal Time (UTC). 
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * The name of the domain list. 
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The status of the domain list. 
    */
  var Status: js.UndefOr[FirewallDomainListStatus] = js.undefined
  
  /**
    * Additional information about the status of the list, if available.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
}
object FirewallDomainList {
  
  inline def apply(): FirewallDomainList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallDomainList]
  }
  
  extension [Self <: FirewallDomainList](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDomainCount(value: Unsigned): Self = StObject.set(x, "DomainCount", value.asInstanceOf[js.Any])
    
    inline def setDomainCountUndefined: Self = StObject.set(x, "DomainCount", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setManagedOwnerName(value: ServicePrinciple): Self = StObject.set(x, "ManagedOwnerName", value.asInstanceOf[js.Any])
    
    inline def setManagedOwnerNameUndefined: Self = StObject.set(x, "ManagedOwnerName", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FirewallDomainListStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
