package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEmail extends js.Object {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.undefined
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.undefined
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.undefined
}

object SimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: SimpleEmailPart = null,
    Subject: SimpleEmailPart = null,
    TextPart: SimpleEmailPart = null
  ): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    __obj.asInstanceOf[SimpleEmail]
  }
}

