package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimeZone")
@js.native
class TimeZone protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Bias: Double = js.native
  val Class: OlObjectClass = js.native
  val DaylightBias: Double = js.native
  val DaylightDate: VarDate = js.native
  val DaylightDesignation: String = js.native
  val ID: String = js.native
  val Name: String = js.native
  @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val StandardBias: Double = js.native
  val StandardDate: VarDate = js.native
  val StandardDesignation: String = js.native
}

