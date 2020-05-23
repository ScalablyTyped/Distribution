package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZones extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  val CurrentTimeZone: TimeZone
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: TimeZones
  val Parent: js.Any
  val Session: NameSpace
  def ConvertTime(SourceDateTime: VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): VarDate
  def Item(Index: js.Any): TimeZone
}

object TimeZones {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConvertTime: (VarDate, TimeZone, TimeZone) => VarDate,
    Count: Double,
    CurrentTimeZone: TimeZone,
    Item: js.Any => TimeZone,
    OutlookDotTimeZones_typekey: TimeZones,
    Parent: js.Any,
    Session: NameSpace
  ): TimeZones = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConvertTime = js.Any.fromFunction3(ConvertTime), Count = Count.asInstanceOf[js.Any], CurrentTimeZone = CurrentTimeZone.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZones_typekey")(OutlookDotTimeZones_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZones]
  }
}

