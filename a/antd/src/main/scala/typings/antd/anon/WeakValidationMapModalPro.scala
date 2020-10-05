package typings.antd.anon

import typings.antd.antdBooleans.`false`
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.antd.modalModalMod.getContainerFunc
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/modal/Modal.ModalProps> */
@js.native
trait WeakValidationMapModalPro extends js.Object {
  var afterClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.native
  var bodyStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var cancelButtonProps: js.UndefOr[Validator[js.UndefOr[ButtonProps | Null]]] = js.native
  var cancelText: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var centered: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var closable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var closeIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var confirmLoading: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var destroyOnClose: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var footer: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var forceRender: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var getContainer: js.UndefOr[Validator[js.UndefOr[`false` | HTMLElement | Null | String | getContainerFunc]]] = js.native
  var keyboard: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var mask: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var maskClosable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var maskStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var maskTransitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var okButtonProps: js.UndefOr[Validator[js.UndefOr[ButtonProps | Null]]] = js.native
  var okText: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var okType: js.UndefOr[Validator[js.UndefOr[LegacyButtonType | Null]]] = js.native
  var onCancel: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]) | Null]
    ]
  ] = js.native
  var onOk: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]) | Null]
    ]
  ] = js.native
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | ReactNode | String]]] = js.native
  var transitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var wrapClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var wrapProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var zIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
}

object WeakValidationMapModalPro {
  @scala.inline
  def apply(): WeakValidationMapModalPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapModalPro]
  }
  @scala.inline
  implicit class WeakValidationMapModalProOps[Self <: WeakValidationMapModalPro] (val x: Self) extends AnyVal {
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
    def setAfterClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = this.set("afterClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setBodyStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setCancelButtonProps(value: Validator[js.UndefOr[ButtonProps | Null]]): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    @scala.inline
    def setCancelText(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setCentered(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setConfirmLoading(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("confirmLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmLoading: Self = this.set("confirmLoading", js.undefined)
    @scala.inline
    def setDestroyOnClose(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("destroyOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyOnClose: Self = this.set("destroyOnClose", js.undefined)
    @scala.inline
    def setFooter(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setForceRender(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setGetContainer(value: Validator[js.UndefOr[`false` | HTMLElement | Null | String | getContainerFunc]]): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setKeyboard(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMask(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskClosable(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setMaskStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOkButtonProps(value: Validator[js.UndefOr[ButtonProps | Null]]): Self = this.set("okButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkButtonProps: Self = this.set("okButtonProps", js.undefined)
    @scala.inline
    def setOkText(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOkType(value: Validator[js.UndefOr[LegacyButtonType | Null]]): Self = this.set("okType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkType: Self = this.set("okType", js.undefined)
    @scala.inline
    def setOnCancel(
      value: Validator[
          js.UndefOr[(js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]) | Null]
        ]
    ): Self = this.set("onCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnOk(
      value: Validator[
          js.UndefOr[(js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]) | Null]
        ]
    ): Self = this.set("onOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | ReactNode | String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Validator[js.UndefOr[Double | Null | String]]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("wrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapClassName: Self = this.set("wrapClassName", js.undefined)
    @scala.inline
    def setWrapProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("wrapProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapProps: Self = this.set("wrapProps", js.undefined)
    @scala.inline
    def setZIndex(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

