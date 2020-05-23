package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoInitialCapsExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.TwoInitialCapsExceptions_typekey")
  var WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions
  def Add(Name: String): TwoInitialCapsException
  def Item(Index: js.Any): TwoInitialCapsException
}

object TwoInitialCapsExceptions {
  @scala.inline
  def apply(
    Add: String => TwoInitialCapsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => TwoInitialCapsException,
    Parent: js.Any,
    WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions
  ): TwoInitialCapsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TwoInitialCapsExceptions_typekey")(WordDotTwoInitialCapsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoInitialCapsExceptions]
  }
}

