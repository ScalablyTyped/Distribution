package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /**
    * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character set. For example, you could specify UTF-8, ISO-8859-1, or Shift_JIS.
    */
  var Charset: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.Charset] = js.undefined
  /**
    * The content of the message itself.
    */
  var Data: MessageData
}

object Content {
  @scala.inline
  def apply(Data: MessageData, Charset: Charset = null): Content = {
    val __obj = js.Dynamic.literal(Data = Data)
    if (Charset != null) __obj.updateDynamic("Charset")(Charset)
    __obj.asInstanceOf[Content]
  }
}

