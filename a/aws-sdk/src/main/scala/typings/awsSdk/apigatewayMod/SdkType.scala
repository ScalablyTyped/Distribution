package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdkType extends js.Object {
  /**
    * A list of configuration properties of an SdkType.
    */
  var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.native
  /**
    * The description of an SdkType.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of an SdkType instance.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * The identifier of an SdkType instance.
    */
  var id: js.UndefOr[String] = js.native
}

object SdkType {
  @scala.inline
  def apply(): SdkType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkType]
  }
  @scala.inline
  implicit class SdkTypeOps[Self <: SdkType] (val x: Self) extends AnyVal {
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
    def setConfigurationPropertiesVarargs(value: SdkConfigurationProperty*): Self = this.set("configurationProperties", js.Array(value :_*))
    @scala.inline
    def setConfigurationProperties(value: ListOfSdkConfigurationProperty): Self = this.set("configurationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationProperties: Self = this.set("configurationProperties", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

