package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Index: js.Any): String = js.native
  def GetValues(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def LocalTimeToUTC(Index: js.Any): VarDate = js.native
  def UTCToLocalTime(Index: js.Any): VarDate = js.native
}

object Row {
  @scala.inline
  def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    GetValues: () => js.Any,
    Item: js.Any => js.Any,
    LocalTimeToUTC: js.Any => VarDate,
    OutlookDotRow_typekey: Row,
    Parent: js.Any,
    Session: NameSpace,
    UTCToLocalTime: js.Any => VarDate
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], GetValues = js.Any.fromFunction0(GetValues), Item = js.Any.fromFunction1(Item), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.Row_typekey")(OutlookDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
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
    def setGetValues(value: () => js.Any): Self = this.set("GetValues", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setLocalTimeToUTC(value: js.Any => VarDate): Self = this.set("LocalTimeToUTC", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotRow_typekey(value: Row): Self = this.set("Outlook.Row_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setUTCToLocalTime(value: js.Any => VarDate): Self = this.set("UTCToLocalTime", js.Any.fromFunction1(value))
  }
  
}

