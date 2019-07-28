package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachSecurityProfileRequest extends js.Object {
  /**
    * The security profile that is detached.
    */
  var securityProfileName: SecurityProfileName
  /**
    * The ARN of the thing group from which the security profile is detached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn
}

object DetachSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): DetachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName, securityProfileTargetArn = securityProfileTargetArn)
  
    __obj.asInstanceOf[DetachSecurityProfileRequest]
  }
}

