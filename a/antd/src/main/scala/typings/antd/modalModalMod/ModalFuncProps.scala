package typings.antd.modalModalMod

import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.cancel
import typings.antd.antdStrings.ok
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalFuncProps extends js.Object {
  var autoFocusButton: js.UndefOr[Null | ok | cancel] = js.native
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
  var cancelText: js.UndefOr[ReactNode] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[ReactNode] = js.native
  var direction: js.UndefOr[String] = js.native
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var maskClosable: js.UndefOr[Boolean] = js.native
  var maskStyle: js.UndefOr[CSSProperties] = js.native
  var maskTransitionName: js.UndefOr[String] = js.native
  var okButtonProps: js.UndefOr[ButtonProps] = js.native
  var okCancel: js.UndefOr[Boolean] = js.native
  var okText: js.UndefOr[ReactNode] = js.native
  var okType: js.UndefOr[LegacyButtonType] = js.native
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onOk: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String | Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ModalFuncProps {
  @scala.inline
  def apply(): ModalFuncProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalFuncProps]
  }
  @scala.inline
  implicit class ModalFuncPropsOps[Self <: ModalFuncProps] (val x: Self) extends AnyVal {
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
    def setAutoFocusButton(value: ok | cancel): Self = this.set("autoFocusButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocusButton: Self = this.set("autoFocusButton", js.undefined)
    @scala.inline
    def setAutoFocusButtonNull: Self = this.set("autoFocusButton", null)
    @scala.inline
    def setCancelButtonProps(value: ButtonProps): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    @scala.inline
    def setCancelText(value: ReactNode): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setGetContainerNull: Self = this.set("getContainer", null)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setMaskStyle(value: CSSProperties): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOkButtonProps(value: ButtonProps): Self = this.set("okButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkButtonProps: Self = this.set("okButtonProps", js.undefined)
    @scala.inline
    def setOkCancel(value: Boolean): Self = this.set("okCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkCancel: Self = this.set("okCancel", js.undefined)
    @scala.inline
    def setOkText(value: ReactNode): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOkType(value: LegacyButtonType): Self = this.set("okType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkType: Self = this.set("okType", js.undefined)
    @scala.inline
    def setOnCancel(value: /* repeated */ js.Any => _): Self = this.set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnOk(value: /* repeated */ js.Any => _): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

