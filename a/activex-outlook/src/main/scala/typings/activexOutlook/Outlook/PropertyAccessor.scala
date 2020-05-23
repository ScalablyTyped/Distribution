package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyAccessor extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor
  val Parent: js.Any
  val Session: NameSpace
  def BinaryToString(Value: js.Any): String
  def DeleteProperties(SchemaNames: js.Any): js.Any
  def DeleteProperty(SchemaName: String): Unit
  def GetProperties(SchemaNames: js.Any): js.Any
  def GetProperty(SchemaName: String): js.Any
  def LocalTimeToUTC(Value: VarDate): VarDate
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any
  def SetProperty(SchemaName: String, Value: js.Any): Unit
  def StringToBinary(Value: String): js.Any
  def UTCToLocalTime(Value: VarDate): VarDate
}

object PropertyAccessor {
  @scala.inline
  def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    DeleteProperties: js.Any => js.Any,
    DeleteProperty: String => Unit,
    GetProperties: js.Any => js.Any,
    GetProperty: String => js.Any,
    LocalTimeToUTC: VarDate => VarDate,
    OutlookDotPropertyAccessor_typekey: PropertyAccessor,
    Parent: js.Any,
    Session: NameSpace,
    SetProperties: (js.Any, js.Any) => js.Any,
    SetProperty: (String, js.Any) => Unit,
    StringToBinary: String => js.Any,
    UTCToLocalTime: VarDate => VarDate
  ): PropertyAccessor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], DeleteProperties = js.Any.fromFunction1(DeleteProperties), DeleteProperty = js.Any.fromFunction1(DeleteProperty), GetProperties = js.Any.fromFunction1(GetProperties), GetProperty = js.Any.fromFunction1(GetProperty), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetProperties = js.Any.fromFunction2(SetProperties), SetProperty = js.Any.fromFunction2(SetProperty), StringToBinary = js.Any.fromFunction1(StringToBinary), UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.PropertyAccessor_typekey")(OutlookDotPropertyAccessor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyAccessor]
  }
}

