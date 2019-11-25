package typings.activexDashScripting

import typings.activexDashScripting.Scripting.Dictionary
import typings.activexDashScripting.activexDashScriptingStrings.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: Dictionary[TKey, TValue],
    propertyName: Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(set: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

