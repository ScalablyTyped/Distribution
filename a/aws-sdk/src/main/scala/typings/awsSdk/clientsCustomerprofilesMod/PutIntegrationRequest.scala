package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutIntegrationRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The configuration that controls how Customer Profiles retrieves data from the source.
    */
  var FlowDefinition: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.FlowDefinition] = js.undefined
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: js.UndefOr[typeName] = js.undefined
  
  /**
    * A map in which each key is an event type from an external application such as Segment or Shopify, and each value is an ObjectTypeName (template) used to ingest the event. It supports the following event types: SegmentIdentify, ShopifyCreateCustomers, ShopifyUpdateCustomers, ShopifyCreateDraftOrders, ShopifyUpdateDraftOrders, ShopifyCreateOrders, and ShopifyUpdatedOrders.
    */
  var ObjectTypeNames: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ObjectTypeNames] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The URI of the S3 bucket or any other type of data source.
    */
  var Uri: js.UndefOr[string1To255] = js.undefined
}
object PutIntegrationRequest {
  
  inline def apply(DomainName: name): PutIntegrationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinition(value: FlowDefinition): Self = StObject.set(x, "FlowDefinition", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionUndefined: Self = StObject.set(x, "FlowDefinition", js.undefined)
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNameUndefined: Self = StObject.set(x, "ObjectTypeName", js.undefined)
    
    inline def setObjectTypeNames(value: ObjectTypeNames): Self = StObject.set(x, "ObjectTypeNames", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNamesUndefined: Self = StObject.set(x, "ObjectTypeNames", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUri(value: string1To255): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "Uri", js.undefined)
  }
}
