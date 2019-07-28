package typings.antd.libTableInterfaceMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends js.Object {
  var key: String
  var onSelect: SelectionItemSelectFn
  var text: ReactNode
}

object SelectionItem {
  @scala.inline
  def apply(key: String, onSelect: SelectionItemSelectFn, text: ReactNode): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key, onSelect = onSelect, text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionItem]
  }
}

