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
    * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[__string] = js.undefined
  /**
    * The verified email address to send the email message from. The default value is the FromAddress specified for the email channel.
    */
  var FromAddress: js.UndefOr[__string] = js.undefined
  /**
    * The email message, represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[RawEmail] = js.undefined
  /**
    * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOf__string] = js.undefined
  /**
    * The email message, composed of a subject, a text part, and an HTML part.
    */
  var SimpleEmail: js.UndefOr[SimpleEmail] = js.undefined
  /**
    * The default message variables to use in the email message. You can override the default variables with individual address variables.
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

