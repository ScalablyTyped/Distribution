package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventListeners
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onClick: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
}

object TableEventListeners {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClick: /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onContextMenu: /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onDoubleClick: /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseEnter: /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseLeave: /* arg */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null
  ): TableEventListeners = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[TableEventListeners]
  }
}

