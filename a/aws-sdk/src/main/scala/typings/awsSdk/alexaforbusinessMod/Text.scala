package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  /**
    * The locale of the text message. Currently, en-US is supported.
    */
  var Locale: typings.awsSdk.alexaforbusinessMod.Locale = js.native
  /**
    * The value of the text message.
    */
  var Value: TextValue = js.native
}

object Text {
  @scala.inline
  def apply(Locale: Locale, Value: TextValue): Text = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
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
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TextValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

