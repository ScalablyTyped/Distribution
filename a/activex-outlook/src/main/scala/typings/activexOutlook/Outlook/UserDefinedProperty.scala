package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedProperty extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val DisplayFormat: Double
  val Formula: String
  val Name: String
  @JSName("Outlook.UserDefinedProperty_typekey")
  var OutlookDotUserDefinedProperty_typekey: UserDefinedProperty
  val Parent: js.Any
  val Session: NameSpace
  val Type: OlUserPropertyType
  def Delete(): Unit
}

object UserDefinedProperty {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    DisplayFormat: Double,
    Formula: String,
    Name: String,
    OutlookDotUserDefinedProperty_typekey: UserDefinedProperty,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlUserPropertyType
  ): UserDefinedProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayFormat = DisplayFormat.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.UserDefinedProperty_typekey")(OutlookDotUserDefinedProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedProperty]
  }
}

