package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSelect extends js.Object {
  def onSelect(): Unit = js.native
}

object OnSelect {
  @scala.inline
  def apply(onSelect: () => Unit): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[OnSelect]
  }
  @scala.inline
  implicit class OnSelectOps[Self <: OnSelect] (val x: Self) extends AnyVal {
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
    def setOnSelect(value: () => Unit): Self = this.set("onSelect", js.Any.fromFunction0(value))
  }
  
}

