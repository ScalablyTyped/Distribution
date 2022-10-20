package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrivateDnsNamespaceRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of running the operation twice. CreatorRequestId can be any unique string (for example, a date/timestamp).
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The name that you want to assign to this namespace. When you create a private DNS namespace, Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
    */
  var Name: NamespaceNamePrivate
  
  /**
    * Properties for the private DNS namespace.
    */
  var Properties: js.UndefOr[PrivateDnsNamespaceProperties] = js.undefined
  
  /**
    * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon VPC that you want to associate the namespace with.
    */
  var Vpc: ResourceId
}
object CreatePrivateDnsNamespaceRequest {
  
  inline def apply(Name: NamespaceNamePrivate, Vpc: ResourceId): CreatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Vpc = Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
  }
  
  extension [Self <: CreatePrivateDnsNamespaceRequest](x: Self) {
    
    inline def setCreatorRequestId(value: ResourceId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NamespaceNamePrivate): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PrivateDnsNamespaceProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpc(value: ResourceId): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
  }
}
