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
}

