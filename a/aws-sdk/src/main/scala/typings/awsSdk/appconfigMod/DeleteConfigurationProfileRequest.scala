package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationProfileRequest extends js.Object {
  /**
    * The application ID that includes the configuration profile you want to delete.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the configuration profile you want to delete.
    */
  var ConfigurationProfileId: Id = js.native
}

object DeleteConfigurationProfileRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): DeleteConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationProfileRequest]
  }
}

