package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProperty extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Formula: String
  val IsUserProperty: Boolean
  val Name: String
  @JSName("Outlook.UserProperty_typekey")
  var OutlookDotUserProperty_typekey: UserProperty
  val Parent: js.Any
  val Session: NameSpace
  val Type: OlUserPropertyType
  var ValidationFormula: String
  var ValidationText: String
  var Value: js.Any
  def Delete(): Unit
}

object UserProperty {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    Formula: String,
    IsUserProperty: Boolean,
    Name: String,
    OutlookDotUserProperty_typekey: UserProperty,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlUserPropertyType,
    ValidationFormula: String,
    ValidationText: String,
    Value: js.Any
  ): UserProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], IsUserProperty = IsUserProperty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidationFormula = ValidationFormula.asInstanceOf[js.Any], ValidationText = ValidationText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.UserProperty_typekey")(OutlookDotUserProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProperty]
  }
}

