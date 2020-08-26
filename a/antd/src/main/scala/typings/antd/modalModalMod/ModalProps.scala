package typings.antd.modalModalMod

import typings.antd.antdBooleans.`false`
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
  /** 取消按钮文字 */
  var cancelText: js.UndefOr[ReactNode] = js.native
  /** 垂直居中 */
  var centered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  /** 是否显示右上角的关闭按钮 */
  var closable: js.UndefOr[Boolean] = js.native
  var closeIcon: js.UndefOr[ReactNode] = js.native
  /** 确定按钮 loading */
  var confirmLoading: js.UndefOr[Boolean] = js.native
  var destroyOnClose: js.UndefOr[Boolean] = js.native
  /** 底部内容 */
  var footer: js.UndefOr[ReactNode] = js.native
  /** 强制渲染 Modal */
  var forceRender: js.UndefOr[Boolean] = js.native
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  /** 点击蒙层是否允许关闭 */
  var maskClosable: js.UndefOr[Boolean] = js.native
  var maskStyle: js.UndefOr[CSSProperties] = js.native
  var maskTransitionName: js.UndefOr[String] = js.native
  var okButtonProps: js.UndefOr[ButtonProps] = js.native
  /** 确认按钮文字 */
  var okText: js.UndefOr[ReactNode] = js.native
  /** 确认按钮类型 */
  var okType: js.UndefOr[LegacyButtonType] = js.native
  /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调 */
  var onCancel: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  /** 点击确定回调 */
  var onOk: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /** 标题 */
  var title: js.UndefOr[ReactNode | String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  /** 对话框是否可见 */
  var visible: js.UndefOr[Boolean] = js.native
  /** 宽度 */
  var width: js.UndefOr[String | Double] = js.native
  var wrapClassName: js.UndefOr[String] = js.native
  var wrapProps: js.UndefOr[js.Any] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
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
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
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
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseIcon(value: ReactNode): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setConfirmLoading(value: Boolean): Self = this.set("confirmLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmLoading: Self = this.set("confirmLoading", js.undefined)
    @scala.inline
    def setDestroyOnClose(value: Boolean): Self = this.set("destroyOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyOnClose: Self = this.set("destroyOnClose", js.undefined)
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setGetContainerNull: Self = this.set("getContainer", null)
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
    def setOkText(value: ReactNode): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOkType(value: LegacyButtonType): Self = this.set("okType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkType: Self = this.set("okType", js.undefined)
    @scala.inline
    def setOnCancel(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnOk(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
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
    def setTitle(value: ReactNode | String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapClassName(value: String): Self = this.set("wrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapClassName: Self = this.set("wrapClassName", js.undefined)
    @scala.inline
    def setWrapProps(value: js.Any): Self = this.set("wrapProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapProps: Self = this.set("wrapProps", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

