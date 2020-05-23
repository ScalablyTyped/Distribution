package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCorrectionsExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OtherCorrectionsExceptions_typekey")
  var WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions
  def Add(Name: String): OtherCorrectionsException
  def Item(Index: js.Any): OtherCorrectionsException
}

object OtherCorrectionsExceptions {
  @scala.inline
  def apply(
    Add: String => OtherCorrectionsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OtherCorrectionsException,
    Parent: js.Any,
    WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions
  ): OtherCorrectionsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OtherCorrectionsExceptions_typekey")(WordDotOtherCorrectionsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCorrectionsExceptions]
  }
}

