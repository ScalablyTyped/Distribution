package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityProfileResponse extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
  /**
    * The name you gave to the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
}

object CreateSecurityProfileResponse {
  @scala.inline
  def apply(securityProfileArn: SecurityProfileArn = null, securityProfileName: SecurityProfileName = null): CreateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (securityProfileArn != null) __obj.updateDynamic("securityProfileArn")(securityProfileArn)
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName)
    __obj.asInstanceOf[CreateSecurityProfileResponse]
  }
}

