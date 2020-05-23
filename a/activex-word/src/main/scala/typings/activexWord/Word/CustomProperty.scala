package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProperty extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Name: String
  val Parent: js.Any
  var Value: String
  @JSName("Word.CustomProperty_typekey")
  var WordDotCustomProperty_typekey: CustomProperty
  def Delete(): Unit
}

object CustomProperty {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotCustomProperty_typekey: CustomProperty
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomProperty_typekey")(WordDotCustomProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
}

