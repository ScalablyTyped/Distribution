package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breaks extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Breaks_typekey")
  var WordDotBreaks_typekey: Breaks
  def Item(Index: Double): Break
}

object Breaks {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Break,
    Parent: js.Any,
    WordDotBreaks_typekey: Breaks
  ): Breaks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Breaks_typekey")(WordDotBreaks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breaks]
  }
}

