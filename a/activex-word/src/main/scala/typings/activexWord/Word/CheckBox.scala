package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBox extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoSize: Boolean
  val Creator: Double
  var Default: Boolean
  val Parent: js.Any
  var Size: Double
  val Valid: Boolean
  var Value: Boolean
  @JSName("Word.CheckBox_typekey")
  var WordDotCheckBox_typekey: CheckBox
}

object CheckBox {
  @scala.inline
  def apply(
    Application: Application,
    AutoSize: Boolean,
    Creator: Double,
    Default: Boolean,
    Parent: js.Any,
    Size: Double,
    Valid: Boolean,
    Value: Boolean,
    WordDotCheckBox_typekey: CheckBox
  ): CheckBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CheckBox_typekey")(WordDotCheckBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
}

