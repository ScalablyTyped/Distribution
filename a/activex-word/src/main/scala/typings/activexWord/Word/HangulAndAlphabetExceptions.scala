package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HangulAndAlphabetExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.HangulAndAlphabetExceptions_typekey")
  var WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions
  def Add(Name: String): HangulAndAlphabetException
  def Item(Index: js.Any): HangulAndAlphabetException
}

object HangulAndAlphabetExceptions {
  @scala.inline
  def apply(
    Add: String => HangulAndAlphabetException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => HangulAndAlphabetException,
    Parent: js.Any,
    WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions
  ): HangulAndAlphabetExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulAndAlphabetExceptions_typekey")(WordDotHangulAndAlphabetExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulAndAlphabetExceptions]
  }
}

