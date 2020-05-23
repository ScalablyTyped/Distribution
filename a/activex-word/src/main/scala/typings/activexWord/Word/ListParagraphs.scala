package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListParagraphs extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.ListParagraphs_typekey")
  var WordDotListParagraphs_typekey: ListParagraphs
  def Item(Index: Double): Paragraph
}

object ListParagraphs {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Paragraph,
    Parent: js.Any,
    WordDotListParagraphs_typekey: ListParagraphs
  ): ListParagraphs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListParagraphs_typekey")(WordDotListParagraphs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParagraphs]
  }
}

