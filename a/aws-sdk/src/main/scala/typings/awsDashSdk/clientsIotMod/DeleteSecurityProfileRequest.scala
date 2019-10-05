package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSecurityProfileRequest extends js.Object {
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The name of the security profile to be deleted.
    */
  var securityProfileName: SecurityProfileName
}

object DeleteSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, expectedVersion: Int | Double = null): DeleteSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName)
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityProfileRequest]
  }
}

