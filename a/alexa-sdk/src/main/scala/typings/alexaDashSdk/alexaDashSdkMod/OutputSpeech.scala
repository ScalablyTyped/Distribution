package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.alexaDashSdkStrings.PlainText
import typings.alexaDashSdk.alexaDashSdkStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSpeech extends js.Object {
  var ssml: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: PlainText | SSML
}

object OutputSpeech {
  @scala.inline
  def apply(`type`: PlainText | SSML, ssml: String = null, text: String = null): OutputSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OutputSpeech]
  }
}

