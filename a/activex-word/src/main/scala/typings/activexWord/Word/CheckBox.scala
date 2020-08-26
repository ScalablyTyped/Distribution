package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBox extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var AutoSize: Boolean = js.native
  val Creator: Double = js.native
  var Default: Boolean = js.native
  val Parent: js.Any = js.native
  var Size: Double = js.native
  val Valid: Boolean = js.native
  var Value: Boolean = js.native
  @JSName("Word.CheckBox_typekey")
  var WordDotCheckBox_typekey: CheckBox = js.native
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
  @scala.inline
  implicit class CheckBoxOps[Self <: CheckBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("Default", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("Valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotCheckBox_typekey(value: CheckBox): Self = this.set("Word.CheckBox_typekey", value.asInstanceOf[js.Any])
  }
  
}

