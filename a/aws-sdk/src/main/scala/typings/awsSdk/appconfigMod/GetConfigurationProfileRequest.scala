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
}

