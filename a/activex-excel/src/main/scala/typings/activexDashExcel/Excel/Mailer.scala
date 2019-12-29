package typings.activexDashExcel.Excel

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Macintosh only */
@JSGlobal("Excel.Mailer")
@js.native
class Mailer protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var BCCRecipients: js.Any = js.native
  var CCRecipients: js.Any = js.native
  val Creator: XlCreator = js.native
  var Enclosures: js.Any = js.native
  @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: Mailer = js.native
  val Parent: js.Any = js.native
  val Received: Boolean = js.native
  val SendDateTime: VarDate = js.native
  val Sender: String = js.native
  var Subject: String = js.native
  var ToRecipients: js.Any = js.native
  var WhichAddress: js.Any = js.native
}

