package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityVerificationAttributes extends js.Object {
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: awsDashSdkLib.clientsSesMod.VerificationStatus
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[VerificationToken] = js.undefined
}

object IdentityVerificationAttributes {
  @scala.inline
  def apply(VerificationStatus: VerificationStatus, VerificationToken: VerificationToken = null): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    if (VerificationToken != null) __obj.updateDynamic("VerificationToken")(VerificationToken)
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
}

