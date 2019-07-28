package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachSecurityProfileRequest extends js.Object {
  /**
    * The security profile that is attached.
    */
  var securityProfileName: SecurityProfileName
  /**
    * The ARN of the target (thing group) to which the security profile is attached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn
}

object AttachSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): AttachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName, securityProfileTargetArn = securityProfileTargetArn)
  
    __obj.asInstanceOf[AttachSecurityProfileRequest]
  }
}

