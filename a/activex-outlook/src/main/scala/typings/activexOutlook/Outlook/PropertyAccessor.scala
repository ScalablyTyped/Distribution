package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyAccessor extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Value: js.Any): String = js.native
  def DeleteProperties(SchemaNames: js.Any): js.Any = js.native
  def DeleteProperty(SchemaName: String): Unit = js.native
  def GetProperties(SchemaNames: js.Any): js.Any = js.native
  def GetProperty(SchemaName: String): js.Any = js.native
  def LocalTimeToUTC(Value: VarDate): VarDate = js.native
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any = js.native
  def SetProperty(SchemaName: String, Value: js.Any): Unit = js.native
  def StringToBinary(Value: String): js.Any = js.native
  def UTCToLocalTime(Value: VarDate): VarDate = js.native
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
  @scala.inline
  implicit class PropertyAccessorOps[Self <: PropertyAccessor] (val x: Self) extends AnyVal {
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
    def setBinaryToString(value: js.Any => String): Self = this.set("BinaryToString", js.Any.fromFunction1(value))
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteProperties(value: js.Any => js.Any): Self = this.set("DeleteProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteProperty(value: String => Unit): Self = this.set("DeleteProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperties(value: js.Any => js.Any): Self = this.set("GetProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperty(value: String => js.Any): Self = this.set("GetProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setLocalTimeToUTC(value: VarDate => VarDate): Self = this.set("LocalTimeToUTC", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotPropertyAccessor_typekey(value: PropertyAccessor): Self = this.set("Outlook.PropertyAccessor_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetProperties(value: (js.Any, js.Any) => js.Any): Self = this.set("SetProperties", js.Any.fromFunction2(value))
    @scala.inline
    def setSetProperty(value: (String, js.Any) => Unit): Self = this.set("SetProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setStringToBinary(value: String => js.Any): Self = this.set("StringToBinary", js.Any.fromFunction1(value))
    @scala.inline
    def setUTCToLocalTime(value: VarDate => VarDate): Self = this.set("UTCToLocalTime", js.Any.fromFunction1(value))
  }
  
}

