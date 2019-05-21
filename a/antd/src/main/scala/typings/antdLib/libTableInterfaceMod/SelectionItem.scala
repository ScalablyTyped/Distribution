package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends js.Object {
  var key: java.lang.String
  var onSelect: SelectionItemSelectFn
  var text: reactLib.reactMod.ReactNode
}

object SelectionItem {
  @scala.inline
  def apply(key: java.lang.String, onSelect: SelectionItemSelectFn, text: reactLib.reactMod.ReactNode): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key, onSelect = onSelect, text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionItem]
  }
}

