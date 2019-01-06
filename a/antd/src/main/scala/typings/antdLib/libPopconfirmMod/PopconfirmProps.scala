package typings
package antdLib.libPopconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmProps
  extends antdLib.libTooltipMod.AbstractTooltipProps {
  var cancelButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var cancelText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var okText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okType: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
  var onCancel: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  var onConfirm: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("onVisibleChange")
  var onVisibleChange_PopconfirmProps: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

