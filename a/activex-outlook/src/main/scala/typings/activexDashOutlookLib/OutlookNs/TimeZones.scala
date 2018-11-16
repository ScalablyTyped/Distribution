package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimeZones")
@js.native
class TimeZones protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  val CurrentTimeZone: TimeZone = js.native
  var `Outlook.TimeZones_typekey`: TimeZones = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ConvertTime(SourceDateTime: stdLib.VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): stdLib.VarDate = js.native
  def Item(Index: js.Any): TimeZone = js.native
}

