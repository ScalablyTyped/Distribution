package typings.antdDashMobile.libInputDashItemCustomKeyboardMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.Ref
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLTableDataCellElement>, 'onClick'> ]: react.react.HTMLProps<std.HTMLTableDataCellElement>[P]} */ trait KeyboardItemProps extends js.Object {
  var iconOnly: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var tdRef: js.UndefOr[Ref[HTMLTableDataCellElement]] = js.undefined
  def onClick(event: MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], value: String): Unit
}

object KeyboardItemProps {
  @scala.inline
  def apply(
    onClick: (MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], String) => Unit,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    tdRef: Ref[HTMLTableDataCellElement] = null
  ): KeyboardItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardItemProps]
  }
}

