package typings
package antdDashMobileLib.libInputDashItemCustomKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLTableDataCellElement>, 'onClick'> ]: react.react.HTMLProps<std.HTMLTableDataCellElement>[P]} */ trait KeyboardItemProps extends js.Object {
  var iconOnly: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var tdRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLTableDataCellElement]] = js.undefined
  def onClick(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLTableDataCellElement, reactLib.NativeMouseEvent],
    value: java.lang.String
  ): scala.Unit
}

object KeyboardItemProps {
  @scala.inline
  def apply(
    onClick: (reactLib.reactMod.MouseEvent[stdLib.HTMLTableDataCellElement, reactLib.NativeMouseEvent], java.lang.String) => scala.Unit,
    iconOnly: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    tdRef: reactLib.reactMod.Ref[stdLib.HTMLTableDataCellElement] = null
  ): KeyboardItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardItemProps]
  }
}

