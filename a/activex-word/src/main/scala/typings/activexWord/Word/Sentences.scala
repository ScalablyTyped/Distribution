package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentences extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val First: Range
  val Last: Range
  val Parent: js.Any
  @JSName("Word.Sentences_typekey")
  var WordDotSentences_typekey: Sentences
  def Item(Index: Double): Range
}

object Sentences {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    First: Range,
    Item: Double => Range,
    Last: Range,
    Parent: js.Any,
    WordDotSentences_typekey: Sentences
  ): Sentences = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Last = Last.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Sentences_typekey")(WordDotSentences_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentences]
  }
}

