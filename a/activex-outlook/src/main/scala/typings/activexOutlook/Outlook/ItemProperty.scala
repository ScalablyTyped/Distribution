package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProperty extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Formula: String
  val IsUserProperty: Boolean
  val Name: String
  @JSName("Outlook.ItemProperty_typekey")
  var OutlookDotItemProperty_typekey: ItemProperty
  val Parent: js.Any
  val Session: NameSpace
  val Type: OlUserPropertyType
  var ValidationFormula: String
  var ValidationText: String
  var Value: js.Any
  def Delete(): Unit
}

object ItemProperty {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    Formula: String,
    IsUserProperty: Boolean,
    Name: String,
    OutlookDotItemProperty_typekey: ItemProperty,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlUserPropertyType,
    ValidationFormula: String,
    ValidationText: String,
    Value: js.Any
  ): ItemProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], IsUserProperty = IsUserProperty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidationFormula = ValidationFormula.asInstanceOf[js.Any], ValidationText = ValidationText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ItemProperty_typekey")(OutlookDotItemProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProperty]
  }
}

