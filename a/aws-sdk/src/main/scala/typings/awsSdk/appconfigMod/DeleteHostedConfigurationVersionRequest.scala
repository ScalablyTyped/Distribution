package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHostedConfigurationVersionRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * The versions number to delete.
    */
  var VersionNumber: Integer = js.native
}

object DeleteHostedConfigurationVersionRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id, VersionNumber: Integer): DeleteHostedConfigurationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedConfigurationVersionRequest]
  }
  @scala.inline
  implicit class DeleteHostedConfigurationVersionRequestOps[Self <: DeleteHostedConfigurationVersionRequest] (val x: Self) extends AnyVal {
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
    def setVersionNumber(value: Integer): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
  }
  
}

