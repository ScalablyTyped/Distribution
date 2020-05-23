package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProperty extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Id: String
  @JSName("Office.PickerProperty_typekey")
  var OfficeDotPickerProperty_typekey: PickerProperty
  val Type: MsoPickerField
  val Value: js.Any
}

object PickerProperty {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotPickerProperty_typekey: PickerProperty,
    Type: MsoPickerField,
    Value: js.Any
  ): PickerProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerProperty_typekey")(OfficeDotPickerProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProperty]
  }
}

