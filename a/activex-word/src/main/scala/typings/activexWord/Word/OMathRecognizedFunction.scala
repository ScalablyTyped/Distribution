package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathRecognizedFunction extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.OMathRecognizedFunction_typekey")
  var WordDotOMathRecognizedFunction_typekey: OMathRecognizedFunction
  def Delete(): Unit
}

object OMathRecognizedFunction {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotOMathRecognizedFunction_typekey: OMathRecognizedFunction
  ): OMathRecognizedFunction = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunction_typekey")(WordDotOMathRecognizedFunction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunction]
  }
}

