package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateConfigurationRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * The version of the configuration to validate.
    */
  var ConfigurationVersion: Version = js.native
}

object ValidateConfigurationRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id, ConfigurationVersion: Version): ValidateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidateConfigurationRequest]
  }
}

