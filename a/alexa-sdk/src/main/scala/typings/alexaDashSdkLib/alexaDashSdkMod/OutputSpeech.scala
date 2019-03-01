package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSpeech extends js.Object {
  var ssml: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: alexaDashSdkLib.alexaDashSdkLibStrings.PlainText | alexaDashSdkLib.alexaDashSdkLibStrings.SSML
}

object OutputSpeech {
  @scala.inline
  def apply(
    `type`: alexaDashSdkLib.alexaDashSdkLibStrings.PlainText | alexaDashSdkLib.alexaDashSdkLibStrings.SSML,
    ssml: java.lang.String = null,
    text: java.lang.String = null
  ): OutputSpeech = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OutputSpeech]
  }
}

