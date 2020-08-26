package typings.antdMobile.swipeActionPropsTypeMod

import typings.antdMobile.anon.OnPress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeActionPropsType[T] extends js.Object {
  /** whether button is disabled*/
  var autoClose: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[js.Array[OnPress[T]]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var right: js.UndefOr[js.Array[OnPress[T]]] = js.native
  var title: js.UndefOr[String] = js.native
}

object SwipeActionPropsType {
  @scala.inline
  def apply[T](): SwipeActionPropsType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeActionPropsType[T]]
  }
  @scala.inline
  implicit class SwipeActionPropsTypeOps[Self <: SwipeActionPropsType[_], T] (val x: Self with SwipeActionPropsType[T]) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLeftVarargs(value: OnPress[T]*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: js.Array[OnPress[T]]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setRightVarargs(value: OnPress[T]*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: js.Array[OnPress[T]]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

