package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Categories extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Categories_typekey")
  var WordDotCategories_typekey: Categories
  def Item(Index: js.Any): Category
}

object Categories {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Category,
    Parent: js.Any,
    WordDotCategories_typekey: Categories
  ): Categories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Categories_typekey")(WordDotCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
}

