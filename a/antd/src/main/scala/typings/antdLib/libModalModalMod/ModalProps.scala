package typings
package antdLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var cancelButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  /** 取消按钮文字*/
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /** 垂直居中 */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** 是否显示右上角的关闭按钮*/
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** 确定按钮 loading*/
  var confirmLoading: js.UndefOr[scala.Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined
  /** 底部内容*/
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var getContainer: js.UndefOr[
    js.Function1[/* instance */ reactLib.reactMod.ReactNs.ReactInstance, reactLib.HTMLElement]
  ] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /** 点击蒙层是否允许关闭*/
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var okButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  /** 确认按钮文字*/
  var okText: js.UndefOr[java.lang.String] = js.undefined
  /** 确认按钮类型*/
  var okType: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
  /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调*/
  var onCancel: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /** 点击确定回调*/
  var onOk: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** 标题*/
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  /** 对话框是否可见*/
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** 宽度*/
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

