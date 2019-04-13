package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[__string] = js.undefined
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[__string] = js.undefined
  /**
    * An email represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[RawEmail] = js.undefined
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOf__string] = js.undefined
  /**
    * An email composed of a subject, a text part and a html part.
    */
  var SimpleEmail: js.UndefOr[SimpleEmail] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
}

object EmailMessage {
  @scala.inline
  def apply(
    Body: __string = null,
    FeedbackForwardingAddress: __string = null,
    FromAddress: __string = null,
    RawEmail: RawEmail = null,
    ReplyToAddresses: ListOf__string = null,
    SimpleEmail: SimpleEmail = null,
    Substitutions: MapOfListOf__string = null
  ): EmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (FeedbackForwardingAddress != null) __obj.updateDynamic("FeedbackForwardingAddress")(FeedbackForwardingAddress)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (RawEmail != null) __obj.updateDynamic("RawEmail")(RawEmail)
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses)
    if (SimpleEmail != null) __obj.updateDynamic("SimpleEmail")(SimpleEmail)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    __obj.asInstanceOf[EmailMessage]
  }
}

