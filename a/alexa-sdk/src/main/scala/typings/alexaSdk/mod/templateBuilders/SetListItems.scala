package typings.alexaSdk.mod.templateBuilders

import typings.alexaSdk.mod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetListItems[T /* <: TemplateBuilder[T] */] extends js.Object {
  def setListItems(listItems: js.Array[ListItem]): T = js.native
}

object SetListItems {
  @scala.inline
  def apply[/* <: typings.alexaSdk.mod.templateBuilders.TemplateBuilder[T] */ T](setListItems: js.Array[ListItem] => T): SetListItems[T] = {
    val __obj = js.Dynamic.literal(setListItems = js.Any.fromFunction1(setListItems))
    __obj.asInstanceOf[SetListItems[T]]
  }
  @scala.inline
  implicit class SetListItemsOps[Self <: SetListItems[_], /* <: typings.alexaSdk.mod.templateBuilders.TemplateBuilder[T] */ T] (val x: Self with SetListItems[T]) extends AnyVal {
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
    def setSetListItems(value: js.Array[ListItem] => T): Self = this.set("setListItems", js.Any.fromFunction1(value))
  }
  
}

