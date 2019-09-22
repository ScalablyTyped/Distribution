package typings.antd

import typings.antd.esTableCreateStoreMod.Store
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* arg */ MouseEvent[Element, typings.std.MouseEvent], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* arg */ MouseEvent[Element, typings.std.MouseEvent], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* arg */ MouseEvent[Element, typings.std.MouseEvent], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* arg */ MouseEvent[Element, typings.std.MouseEvent], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* arg */ MouseEvent[Element, typings.std.MouseEvent], Unit]] = js.undefined
  var prefixCls: String
  var rowKey: js.Any
  var store: Store
}

object Anon_Arg {
  @scala.inline
  def apply(
    prefixCls: String,
    rowKey: js.Any,
    store: Store,
    onClick: /* arg */ MouseEvent[Element, typings.std.MouseEvent] => Unit = null,
    onContextMenu: /* arg */ MouseEvent[Element, typings.std.MouseEvent] => Unit = null,
    onDoubleClick: /* arg */ MouseEvent[Element, typings.std.MouseEvent] => Unit = null,
    onMouseEnter: /* arg */ MouseEvent[Element, typings.std.MouseEvent] => Unit = null,
    onMouseLeave: /* arg */ MouseEvent[Element, typings.std.MouseEvent] => Unit = null
  ): Anon_Arg = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls, rowKey = rowKey, store = store)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[Anon_Arg]
  }
}

