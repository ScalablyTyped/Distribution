package typings.antd.esTableInterfaceMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends js.Object {
  var key: String
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  var text: ReactNode
}

object SelectionItem {
  @scala.inline
  def apply(key: String, onSelect: /* key */ js.Array[String] => Unit = null, text: ReactNode = null): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionItem]
  }
}

