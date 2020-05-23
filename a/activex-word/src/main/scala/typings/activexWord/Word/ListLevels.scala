package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLevels extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.ListLevels_typekey")
  var WordDotListLevels_typekey: ListLevels
  def Item(Index: Double): ListLevel
}

object ListLevels {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => ListLevel,
    Parent: js.Any,
    WordDotListLevels_typekey: ListLevels
  ): ListLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevels_typekey")(WordDotListLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevels]
  }
}

