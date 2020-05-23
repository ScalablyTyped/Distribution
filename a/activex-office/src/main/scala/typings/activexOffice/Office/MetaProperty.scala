package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaProperty extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Id: String
  val IsReadOnly: Boolean
  val IsRequired: Boolean
  val Name: String
  @JSName("Office.MetaProperty_typekey")
  var OfficeDotMetaProperty_typekey: MetaProperty
  val Parent: js.Any
  val Type: MsoMetaPropertyType
  val ValidationError: String
  var Value: js.Any
  def Validate(): String
}

object MetaProperty {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    IsReadOnly: Boolean,
    IsRequired: Boolean,
    Name: String,
    OfficeDotMetaProperty_typekey: MetaProperty,
    Parent: js.Any,
    Type: MsoMetaPropertyType,
    Validate: () => String,
    ValidationError: String,
    Value: js.Any
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), ValidationError = ValidationError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MetaProperty_typekey")(OfficeDotMetaProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
}

