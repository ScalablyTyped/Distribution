package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailConfigurationType extends js.Object {
  /**
    * The destination to which the receiver of the email should reply to.
    */
  var ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the email source.
    */
  var SourceArn: js.UndefOr[ArnType] = js.undefined
}

object EmailConfigurationType {
  @scala.inline
  def apply(ReplyToEmailAddress: EmailAddressType = null, SourceArn: ArnType = null): EmailConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (ReplyToEmailAddress != null) __obj.updateDynamic("ReplyToEmailAddress")(ReplyToEmailAddress)
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn)
    __obj.asInstanceOf[EmailConfigurationType]
  }
}

