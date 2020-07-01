package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationProfileRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the configuration profile.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * A description of the configuration profile.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.native
}

object UpdateConfigurationProfileRequest {
  @scala.inline
  def apply(
    ApplicationId: Id,
    ConfigurationProfileId: Id,
    Description: Description = null,
    Name: Name = null,
    RetrievalRoleArn: RoleArn = null,
    Validators: ValidatorList = null
  ): UpdateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RetrievalRoleArn != null) __obj.updateDynamic("RetrievalRoleArn")(RetrievalRoleArn.asInstanceOf[js.Any])
    if (Validators != null) __obj.updateDynamic("Validators")(Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationProfileRequest]
  }
}

