package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row
  val Parent: js.Any
  val Session: NameSpace
  def BinaryToString(Index: js.Any): String
  def GetValues(): js.Any
  def Item(Index: js.Any): js.Any
  def LocalTimeToUTC(Index: js.Any): VarDate
  def UTCToLocalTime(Index: js.Any): VarDate
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
}

