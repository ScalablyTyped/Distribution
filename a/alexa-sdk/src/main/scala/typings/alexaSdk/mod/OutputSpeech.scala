package typings.alexaSdk.mod

import typings.alexaSdk.alexaSdkStrings.PlainText
import typings.alexaSdk.alexaSdkStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSpeech extends js.Object {
  var ssml: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var `type`: PlainText | SSML = js.native
}

object OutputSpeech {
  @scala.inline
  def apply(`type`: PlainText | SSML): OutputSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSpeech]
  }
  @scala.inline
  implicit class OutputSpeechOps[Self <: OutputSpeech] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: PlainText | SSML): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsml(value: String): Self = this.set("ssml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsml: Self = this.set("ssml", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

