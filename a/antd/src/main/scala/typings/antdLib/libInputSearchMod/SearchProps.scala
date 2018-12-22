package typings
package antdLib.libInputSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchProps
  extends antdLib.libInputInputMod.InputProps {
  var enterButton: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var inputPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var onSearch: js.UndefOr[
    js.Function2[
      /* value */ java.lang.String, 
      /* event */ js.UndefOr[
        (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]
      ], 
      _
    ]
  ] = js.undefined
}

