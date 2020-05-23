package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Words extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val First: Range
  val Last: Range
  val Parent: js.Any
  @JSName("Word.Words_typekey")
  var WordDotWords_typekey: Words
  def Item(Index: Double): Range
}

object Words {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    First: Range,
    Item: Double => Range,
    Last: Range,
    Parent: js.Any,
    WordDotWords_typekey: Words
  ): Words = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Last = Last.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Words_typekey")(WordDotWords_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
}

