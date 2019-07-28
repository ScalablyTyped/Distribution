package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  var Html: js.UndefOr[Content] = js.undefined
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  var Text: js.UndefOr[Content] = js.undefined
}

object Body {
  @scala.inline
  def apply(Html: Content = null, Text: Content = null): Body = {
    val __obj = js.Dynamic.literal()
    if (Html != null) __obj.updateDynamic("Html")(Html)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    __obj.asInstanceOf[Body]
  }
}

