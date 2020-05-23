package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathRecognizedFunctions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OMathRecognizedFunctions_typekey")
  var WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  def Add(Name: String): OMathRecognizedFunction
  def Item(Index: js.Any): OMathRecognizedFunction
}

object OMathRecognizedFunctions {
  @scala.inline
  def apply(
    Add: String => OMathRecognizedFunction,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathRecognizedFunction,
    Parent: js.Any,
    WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  ): OMathRecognizedFunctions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunctions_typekey")(WordDotOMathRecognizedFunctions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunctions]
  }
}

