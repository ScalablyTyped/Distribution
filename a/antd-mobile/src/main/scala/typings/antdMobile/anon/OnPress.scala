package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPress[T] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[T] = js.native
  var text: String = js.native
}

object OnPress {
  @scala.inline
  def apply[T](text: String): OnPress[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPress[T]]
  }
  @scala.inline
  implicit class OnPressOps[Self <: OnPress[_], T] (val x: Self with OnPress[T]) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setStyle(value: T): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

