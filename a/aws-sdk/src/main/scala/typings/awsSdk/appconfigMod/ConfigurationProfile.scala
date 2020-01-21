package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationProfile extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The configuration profile description.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The configuration profile ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.native
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[Arn] = js.native
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.native
}

object ConfigurationProfile {
  @scala.inline
  def apply(
    ApplicationId: Id = null,
    Description: Description = null,
    Id: Id = null,
    LocationUri: Uri = null,
    Name: Name = null,
    RetrievalRoleArn: Arn = null,
    Validators: ValidatorList = null
  ): ConfigurationProfile = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RetrievalRoleArn != null) __obj.updateDynamic("RetrievalRoleArn")(RetrievalRoleArn.asInstanceOf[js.Any])
    if (Validators != null) __obj.updateDynamic("Validators")(Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationProfile]
  }
}

