package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendEmailRequest extends js.Object {
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
  /**
    * An object that contains the body of the message. You can send either a Simple message or a Raw message.
    */
  var Content: EmailContent
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: awsDashSdkLib.clientsPinpointemailMod.Destination
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.undefined
  /**
    * The address that Amazon Pinpoint should send bounce and complaint notifications to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
}

object SendEmailRequest {
  @scala.inline
  def apply(
    Content: EmailContent,
    Destination: Destination,
    ConfigurationSetName: ConfigurationSetName = null,
    EmailTags: MessageTagList = null,
    FeedbackForwardingEmailAddress: EmailAddress = null,
    FromEmailAddress: EmailAddress = null,
    ReplyToAddresses: EmailAddressList = null
  ): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content, Destination = Destination)
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName)
    if (EmailTags != null) __obj.updateDynamic("EmailTags")(EmailTags)
    if (FeedbackForwardingEmailAddress != null) __obj.updateDynamic("FeedbackForwardingEmailAddress")(FeedbackForwardingEmailAddress)
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress)
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses)
    __obj.asInstanceOf[SendEmailRequest]
  }
}

