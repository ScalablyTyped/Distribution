package typings.antd

import typings.antd.libTableCreateStoreMod.Store
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgOnClick extends js.Object {
  var onClick: js.UndefOr[
    js.Function1[/* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent], Unit]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function1[/* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent], Unit]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function1[/* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[/* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent], Unit]
  ] = js.undefined
  var prefixCls: String
  var rowKey: js.Any
  var store: Store
}

object Anon_ArgOnClick {
  @scala.inline
  def apply(
    prefixCls: String,
    rowKey: js.Any,
    store: Store,
    onClick: /* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit = null,
    onContextMenu: /* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit = null,
    onDoubleClick: /* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit = null,
    onMouseEnter: /* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit = null,
    onMouseLeave: /* arg */ typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit = null
  ): Anon_ArgOnClick = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls, rowKey = rowKey, store = store)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[Anon_ArgOnClick]
  }
}

