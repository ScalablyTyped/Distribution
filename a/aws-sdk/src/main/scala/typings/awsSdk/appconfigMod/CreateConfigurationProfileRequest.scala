package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationProfileRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * A description of the configuration profile.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format ssm-document://&lt;Document_name&gt; or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format ssm-parameter://&lt;Parameter_name&gt; or the ARN. For an Amazon S3 object, specify the URI in the following format: s3://&lt;bucket&gt;/&lt;objectKey&gt; . Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
    */
  var LocationUri: Uri = js.native
  /**
    * A name for the configuration profile.
    */
  var Name: typings.awsSdk.appconfigMod.Name = js.native
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.native
}

object CreateConfigurationProfileRequest {
  @scala.inline
  def apply(ApplicationId: Id, LocationUri: Uri, Name: Name): CreateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], LocationUri = LocationUri.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationProfileRequest]
  }
  @scala.inline
  implicit class CreateConfigurationProfileRequestOps[Self <: CreateConfigurationProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationUri(value: Uri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRetrievalRoleArn(value: RoleArn): Self = this.set("RetrievalRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrievalRoleArn: Self = this.set("RetrievalRoleArn", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("Validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: ValidatorList): Self = this.set("Validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("Validators", js.undefined)
  }
  
}

