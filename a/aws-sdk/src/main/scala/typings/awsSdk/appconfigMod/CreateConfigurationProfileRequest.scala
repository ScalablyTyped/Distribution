package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationProfileRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * A description of the configuration profile.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format ssm-document://&lt;Document_name&gt; or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format ssm-parameter://&lt;Parameter_name&gt; or the ARN. For an Amazon S3 object, specify the URI in the following format: s3://&lt;bucket&gt;/&lt;objectKey&gt; . Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
    */
  var LocationUri: Uri
  
  /**
    * A name for the configuration profile.
    */
  var Name: typings.awsSdk.appconfigMod.Name
  
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.undefined
}
object CreateConfigurationProfileRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, LocationUri: Uri, Name: Name): CreateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], LocationUri = LocationUri.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationProfileRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationProfileRequestMutableBuilder[Self <: CreateConfigurationProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLocationUri(value: Uri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalRoleArn(value: RoleArn): Self = StObject.set(x, "RetrievalRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalRoleArnUndefined: Self = StObject.set(x, "RetrievalRoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setValidators(value: ValidatorList): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "Validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "Validators", js.Array(value :_*))
  }
}
