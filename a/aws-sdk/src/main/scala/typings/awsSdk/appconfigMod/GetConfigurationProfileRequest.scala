package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationProfileRequest extends js.Object {
  /**
    * The ID of the application that includes the configuration profile you want to get.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the configuration profile you want to get.
    */
  var ConfigurationProfileId: Id = js.native
}

object GetConfigurationProfileRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): GetConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationProfileRequest]
  }
  @scala.inline
  implicit class GetConfigurationProfileRequestOps[Self <: GetConfigurationProfileRequest] (val x: Self) extends AnyVal {
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
  }
  
}

