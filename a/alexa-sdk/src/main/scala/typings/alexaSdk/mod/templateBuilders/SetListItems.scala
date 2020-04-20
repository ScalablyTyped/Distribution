package typings.alexaSdk.mod.templateBuilders

import typings.alexaSdk.mod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetListItems[T /* <: TemplateBuilder[T] */] extends js.Object {
  def setListItems(listItems: js.Array[ListItem]): T
}

object SetListItems {
  @scala.inline
  def apply[T /* <: TemplateBuilder[T] */](setListItems: js.Array[ListItem] => T): SetListItems[T] = {
    val __obj = js.Dynamic.literal(setListItems = js.Any.fromFunction1(setListItems))
    __obj.asInstanceOf[SetListItems[T]]
  }
}

