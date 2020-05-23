package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstLetterExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.FirstLetterExceptions_typekey")
  var WordDotFirstLetterExceptions_typekey: FirstLetterExceptions
  def Add(Name: String): FirstLetterException
  def Item(Index: js.Any): FirstLetterException
}

object FirstLetterExceptions {
  @scala.inline
  def apply(
    Add: String => FirstLetterException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => FirstLetterException,
    Parent: js.Any,
    WordDotFirstLetterExceptions_typekey: FirstLetterExceptions
  ): FirstLetterExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FirstLetterExceptions_typekey")(WordDotFirstLetterExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLetterExceptions]
  }
}

