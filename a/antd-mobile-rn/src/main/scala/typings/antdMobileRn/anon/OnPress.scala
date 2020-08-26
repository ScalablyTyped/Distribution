package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPress extends js.Object {
  def onPress(): Unit = js.native
}

object OnPress {
  @scala.inline
  def apply(onPress: () => Unit): OnPress = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[OnPress]
  }
  @scala.inline
  implicit class OnPressOps[Self <: OnPress] (val x: Self) extends AnyVal {
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
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
  }
  
}

