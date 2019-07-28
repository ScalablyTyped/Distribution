package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailContent extends js.Object {
  /**
    * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   If you include attachments, they must be in a file format that Amazon Pinpoint supports.    The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
    */
  var Raw: js.UndefOr[RawMessage] = js.undefined
  /**
    * The simple email message. The message consists of a subject and a message body.
    */
  var Simple: js.UndefOr[Message] = js.undefined
}

object EmailContent {
  @scala.inline
  def apply(Raw: RawMessage = null, Simple: Message = null): EmailContent = {
    val __obj = js.Dynamic.literal()
    if (Raw != null) __obj.updateDynamic("Raw")(Raw)
    if (Simple != null) __obj.updateDynamic("Simple")(Simple)
    __obj.asInstanceOf[EmailContent]
  }
}

