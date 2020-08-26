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
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): UpdateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationProfileRequest]
  }
  @scala.inline
  implicit class UpdateConfigurationProfileRequestOps[Self <: UpdateConfigurationProfileRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRetrievalRoleArn(value: RoleArn): Self = this.set("RetrievalRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrievalRoleArn: Self = this.set("RetrievalRoleArn", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("Validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: ValidatorList): Self = this.set("Validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("Validators", js.undefined)
  }
  
}

