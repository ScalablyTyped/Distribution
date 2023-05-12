package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * The resource definition to be evaluated as per the resource configuration schema type.
    */
  var ResourceConfiguration: typings.awsSdk.clientsConfigserviceMod.ResourceConfiguration
  
  /**
    * The schema type of the resource configuration.  You can find the Resource type schema, or CFN_RESOURCE_SCHEMA, in "Amazon Web Services public extensions" within the CloudFormation registry or with the following CLI commmand: aws cloudformation describe-type --type-name "AWS::S3::Bucket" --type RESOURCE. For more information, see Managing extensions through the CloudFormation registry and Amazon Web Services resource and property types reference in the CloudFormation User Guide. 
    */
  var ResourceConfigurationSchemaType: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceConfigurationSchemaType] = js.undefined
  
  /**
    * A unique resource ID for an evaluation.
    */
  var ResourceId: BaseResourceId
  
  /**
    * The type of resource being evaluated.
    */
  var ResourceType: StringWithCharLimit256
}
object ResourceDetails {
  
  inline def apply(
    ResourceConfiguration: ResourceConfiguration,
    ResourceId: BaseResourceId,
    ResourceType: StringWithCharLimit256
  ): ResourceDetails = {
    val __obj = js.Dynamic.literal(ResourceConfiguration = ResourceConfiguration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setResourceConfiguration(value: ResourceConfiguration): Self = StObject.set(x, "ResourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigurationSchemaType(value: ResourceConfigurationSchemaType): Self = StObject.set(x, "ResourceConfigurationSchemaType", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigurationSchemaTypeUndefined: Self = StObject.set(x, "ResourceConfigurationSchemaType", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
