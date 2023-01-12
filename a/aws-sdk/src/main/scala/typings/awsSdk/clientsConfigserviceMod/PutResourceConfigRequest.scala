package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourceConfigRequest extends StObject {
  
  /**
    * The configuration object of the resource in valid JSON format. It must match the schema registered with CloudFormation.  The configuration JSON must not exceed 64 KB. 
    */
  var Configuration: typings.awsSdk.clientsConfigserviceMod.Configuration
  
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsSdk.clientsConfigserviceMod.ResourceId
  
  /**
    * Name of the resource.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceName] = js.undefined
  
  /**
    * The type of the resource. The custom resource type must be registered with CloudFormation.   You cannot use the organization names “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It is the first part of the ResourceType up to the first ::. 
    */
  var ResourceType: ResourceTypeString
  
  /**
    * Version of the schema registered for the ResourceType in CloudFormation.
    */
  var SchemaVersionId: typings.awsSdk.clientsConfigserviceMod.SchemaVersionId
  
  /**
    * Tags associated with the resource.  This field is not to be confused with the Amazon Web Services-wide tag feature for Amazon Web Services resources. Tags for PutResourceConfig are tags that you supply for the configuration items of your custom resources. 
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Tags] = js.undefined
}
object PutResourceConfigRequest {
  
  inline def apply(
    Configuration: Configuration,
    ResourceId: ResourceId,
    ResourceType: ResourceTypeString,
    SchemaVersionId: SchemaVersionId
  ): PutResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SchemaVersionId = SchemaVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourceConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceType(value: ResourceTypeString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionId(value: SchemaVersionId): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
