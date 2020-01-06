package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityProfileResponse extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.native
  /**
    * The name you gave to the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
}

object CreateSecurityProfileResponse {
  @scala.inline
  def apply(securityProfileArn: SecurityProfileArn = null, securityProfileName: SecurityProfileName = null): CreateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (securityProfileArn != null) __obj.updateDynamic("securityProfileArn")(securityProfileArn.asInstanceOf[js.Any])
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityProfileResponse]
  }
}

