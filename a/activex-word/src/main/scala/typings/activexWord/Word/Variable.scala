package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  var Value: String
  @JSName("Word.Variable_typekey")
  var WordDotVariable_typekey: Variable
  def Delete(): Unit
}

object Variable {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotVariable_typekey: Variable
  ): Variable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Variable_typekey")(WordDotVariable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

