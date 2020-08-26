package typings.activexScripting

import typings.activexScripting.Scripting.Dictionary
import typings.activexScripting.activexScriptingStrings.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: Dictionary[TKey, TValue],
    propertyName: Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): Unit = js.native
}

object ActiveXObject {
  @scala.inline
  def apply(set: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  @scala.inline
  implicit class ActiveXObjectOps[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSet(value: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Unit): Self = this.set("set", js.Any.fromFunction4(value))
  }
  
}

