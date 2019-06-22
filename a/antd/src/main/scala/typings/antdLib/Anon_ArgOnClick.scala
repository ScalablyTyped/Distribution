package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgOnClick extends js.Object {
  var onClick: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var prefixCls: java.lang.String
  var rowKey: js.Any
  var store: antdLib.libTableCreateStoreMod.Store
}

object Anon_ArgOnClick {
  @scala.inline
  def apply(
    prefixCls: java.lang.String,
    rowKey: js.Any,
    store: antdLib.libTableCreateStoreMod.Store,
    onClick: /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event] => scala.Unit = null,
    onContextMenu: /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event] => scala.Unit = null,
    onDoubleClick: /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event] => scala.Unit = null,
    onMouseEnter: /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event] => scala.Unit = null,
    onMouseLeave: /* arg */ reactLib.reactMod.SyntheticEvent[stdLib.Element, stdLib.Event] => scala.Unit = null
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

