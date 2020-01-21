package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimeZones")
@js.native
class TimeZones protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val CurrentTimeZone: TimeZone = js.native
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: TimeZones = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ConvertTime(SourceDateTime: VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): VarDate = js.native
  def Item(Index: js.Any): TimeZone = js.native
}

