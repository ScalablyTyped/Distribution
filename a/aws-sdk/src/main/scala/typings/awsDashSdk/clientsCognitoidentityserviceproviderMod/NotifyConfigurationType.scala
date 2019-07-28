package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyConfigurationType extends js.Object {
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined
  /**
    * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.undefined
  /**
    * The MFA email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType
}

object NotifyConfigurationType {
  @scala.inline
  def apply(
    SourceArn: ArnType,
    BlockEmail: NotifyEmailType = null,
    From: StringType = null,
    MfaEmail: NotifyEmailType = null,
    NoActionEmail: NotifyEmailType = null,
    ReplyTo: StringType = null
  ): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn)
    if (BlockEmail != null) __obj.updateDynamic("BlockEmail")(BlockEmail)
    if (From != null) __obj.updateDynamic("From")(From)
    if (MfaEmail != null) __obj.updateDynamic("MfaEmail")(MfaEmail)
    if (NoActionEmail != null) __obj.updateDynamic("NoActionEmail")(NoActionEmail)
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo)
    __obj.asInstanceOf[NotifyConfigurationType]
  }
}

