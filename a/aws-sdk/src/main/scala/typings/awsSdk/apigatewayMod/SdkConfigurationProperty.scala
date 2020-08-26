package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdkConfigurationProperty extends js.Object {
  /**
    * The default value of an SdkType configuration property.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of an SdkType configuration property.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of an SdkType configuration property.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * The name of a an SdkType configuration property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A boolean flag of an SdkType configuration property to indicate if the associated SDK configuration property is required (true) or not (false).
    */
  var required: js.UndefOr[Boolean] = js.native
}

object SdkConfigurationProperty {
  @scala.inline
  def apply(): SdkConfigurationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkConfigurationProperty]
  }
  @scala.inline
  implicit class SdkConfigurationPropertyOps[Self <: SdkConfigurationProperty] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

