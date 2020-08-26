package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  /** The text inside of a searchField or textField element. */
  var text: String = js.native
  /**
    * A callback function that is called when the text inside
    * of searchField or textField element changes.
    * */
  def onTextChange(): Unit = js.native
}

object Keyboard {
  @scala.inline
  def apply(onTextChange: () => Unit, text: String): Keyboard = {
    val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction0(onTextChange), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyboard]
  }
  @scala.inline
  implicit class KeyboardOps[Self <: Keyboard] (val x: Self) extends AnyVal {
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
    def setOnTextChange(value: () => Unit): Self = this.set("onTextChange", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

