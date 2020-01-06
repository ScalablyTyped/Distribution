package typings.awsDashSdk.clientsAppconfigMod

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
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Description] = js.native
  /**
    * A URI to locate the configuration. You can specify either a Systems Manager (SSM) document or an SSM Parameter Store parameter. For an SSM document, specify either the document name in the format ssm-document://&lt;Document name&gt; or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format ssm-parameter://&lt;Parameter name&gt; or the ARN.
    */
  var LocationUri: Uri = js.native
  /**
    * A name for the configuration profile.
    */
  var Name: typings.awsDashSdk.clientsAppconfigMod.Name = js.native
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: Arn = js.native
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
  def apply(
    ApplicationId: Id,
    LocationUri: Uri,
    Name: Name,
    RetrievalRoleArn: Arn,
    Description: Description = null,
    Tags: TagMap = null,
    Validators: ValidatorList = null
  ): CreateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], LocationUri = LocationUri.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RetrievalRoleArn = RetrievalRoleArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Validators != null) __obj.updateDynamic("Validators")(Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationProfileRequest]
  }
}

