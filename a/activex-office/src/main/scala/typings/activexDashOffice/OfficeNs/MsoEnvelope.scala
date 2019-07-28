package typings.activexDashOffice.OfficeNs

import typings.activexDashOutlook.OutlookNs.MailItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.MsoEnvelope")
@js.native
class MsoEnvelope protected () extends js.Object {
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  var Introduction: String = js.native
  val Item: MailItem = js.native
  var `Office.MsoEnvelope_typekey`: MsoEnvelope = js.native
  val Parent: js.Any = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
}

