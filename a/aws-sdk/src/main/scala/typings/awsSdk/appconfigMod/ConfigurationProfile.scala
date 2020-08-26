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
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.native
}

object ConfigurationProfile {
  @scala.inline
  def apply(): ConfigurationProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfile]
  }
  @scala.inline
  implicit class ConfigurationProfileOps[Self <: ConfigurationProfile] (val x: Self) extends AnyVal {
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
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setLocationUri(value: Uri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
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

