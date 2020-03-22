package typings.antdMobile.customKeyboardMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardItemProps extends HTMLTableDataProps {
  var iconOnly: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var tdRef: js.UndefOr[Ref[HTMLTableDataCellElement]] = js.undefined
  def onClick(event: MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], value: String): Unit
}

object KeyboardItemProps {
  @scala.inline
  def apply(
    onClick: (MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], String) => Unit,
    HTMLTableDataProps: HTMLTableDataProps = null,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    tdRef: Ref[HTMLTableDataCellElement] = null
  ): KeyboardItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    if (HTMLTableDataProps != null) js.Dynamic.global.Object.assign(__obj, HTMLTableDataProps)
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardItemProps]
  }
}

