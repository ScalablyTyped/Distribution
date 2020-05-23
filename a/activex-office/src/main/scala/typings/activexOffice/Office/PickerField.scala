package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerField extends js.Object {
  val Application: js.Any
  val Creator: Double
  val IsHidden: Boolean
  val Name: String
  @JSName("Office.PickerField_typekey")
  var OfficeDotPickerField_typekey: PickerField
  val Type: MsoPickerField
}

object PickerField {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    IsHidden: Boolean,
    Name: String,
    OfficeDotPickerField_typekey: PickerField,
    Type: MsoPickerField
  ): PickerField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsHidden = IsHidden.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerField_typekey")(OfficeDotPickerField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerField]
  }
}

