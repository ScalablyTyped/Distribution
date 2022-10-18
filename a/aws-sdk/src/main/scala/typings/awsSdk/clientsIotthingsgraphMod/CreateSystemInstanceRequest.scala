package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSystemInstanceRequest extends StObject {
  
  var definition: DefinitionDocument
  
  /**
    * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This value is required if the value of the target parameter is CLOUD.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The name of the Greengrass group where the system instance will be deployed. This value is required if the value of the target parameter is GREENGRASS.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.undefined
  
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
  
  /**
    * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's resource file. This value is required if the value of the target parameter is GREENGRASS.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target type of the deployment. Valid values are GREENGRASS and CLOUD.
    */
  var target: DeploymentTarget
}
object CreateSystemInstanceRequest {
  
  inline def apply(definition: DefinitionDocument, target: DeploymentTarget): CreateSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemInstanceRequest]
  }
  
  extension [Self <: CreateSystemInstanceRequest](x: Self) {
    
    inline def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setFlowActionsRoleArn(value: RoleArn): Self = StObject.set(x, "flowActionsRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFlowActionsRoleArnUndefined: Self = StObject.set(x, "flowActionsRoleArn", js.undefined)
    
    inline def setGreengrassGroupName(value: GroupName): Self = StObject.set(x, "greengrassGroupName", value.asInstanceOf[js.Any])
    
    inline def setGreengrassGroupNameUndefined: Self = StObject.set(x, "greengrassGroupName", js.undefined)
    
    inline def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "metricsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMetricsConfigurationUndefined: Self = StObject.set(x, "metricsConfiguration", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTarget(value: DeploymentTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
