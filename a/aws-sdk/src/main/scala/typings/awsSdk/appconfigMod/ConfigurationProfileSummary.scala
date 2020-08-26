package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationProfileSummary extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The ID of the configuration profile.
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
    * The types of validators in the configuration profile.
    */
  var ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.native
}

object ConfigurationProfileSummary {
  @scala.inline
  def apply(): ConfigurationProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfileSummary]
  }
  @scala.inline
  implicit class ConfigurationProfileSummaryOps[Self <: ConfigurationProfileSummary] (val x: Self) extends AnyVal {
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
    def setValidatorTypesVarargs(value: ValidatorType*): Self = this.set("ValidatorTypes", js.Array(value :_*))
    @scala.inline
    def setValidatorTypes(value: ValidatorTypeList): Self = this.set("ValidatorTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidatorTypes: Self = this.set("ValidatorTypes", js.undefined)
  }
  
}

