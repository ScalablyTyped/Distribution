package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallDomainListRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows you to retry failed requests without the risk of running the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId
  
  /**
    * A name that lets you identify the domain list to manage and use it.
    */
  var Name: typings.awsSdk.clientsRoute53resolverMod.Name
  
  /**
    * A list of the tag keys and values that you want to associate with the domain list. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFirewallDomainListRequest {
  
  inline def apply(CreatorRequestId: CreatorRequestId, Name: Name): CreateFirewallDomainListRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallDomainListRequest]
  }
  
  extension [Self <: CreateFirewallDomainListRequest](x: Self) {
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
