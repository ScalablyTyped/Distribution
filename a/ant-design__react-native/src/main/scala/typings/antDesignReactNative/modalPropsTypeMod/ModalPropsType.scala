package typings.antDesignReactNative.modalPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalPropsType[T] extends js.Object {
  var animateAppear: js.UndefOr[Boolean] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animationType: js.UndefOr[js.Any] = js.native
  var closable: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[js.Array[Action[T]]] = js.native
  var locale: js.UndefOr[js.Object] = js.native
  var maskClosable: js.UndefOr[Boolean] = js.native
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var operation: js.UndefOr[Boolean] = js.native
  var popup: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var visible: Boolean = js.native
}

object ModalPropsType {
  @scala.inline
  def apply[T](visible: Boolean): ModalPropsType[T] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalPropsType[T]]
  }
  @scala.inline
  implicit class ModalPropsTypeOps[Self <: ModalPropsType[_], T] (val x: Self with ModalPropsType[T]) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateAppear(value: Boolean): Self = this.set("animateAppear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateAppear: Self = this.set("animateAppear", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimationType(value: js.Any): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setFooterVarargs(value: Action[T]*): Self = this.set("footer", js.Array(value :_*))
    @scala.inline
    def setFooter(value: js.Array[Action[T]]): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setLocale(value: js.Object): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOperation(value: Boolean): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

