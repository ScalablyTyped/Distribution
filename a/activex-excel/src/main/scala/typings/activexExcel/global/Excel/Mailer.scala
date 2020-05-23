package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Macintosh only */
@JSGlobal("Excel.Mailer")
@js.native
class Mailer protected ()
  extends typings.activexExcel.Excel.Mailer {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var BCCRecipients: js.Any = js.native
  /* CompleteClass */
  override var CCRecipients: js.Any = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Enclosures: js.Any = js.native
  /* CompleteClass */
  @JSName("Excel.Mailer_typekey")
  override var ExcelDotMailer_typekey: typings.activexExcel.Excel.Mailer = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Received: Boolean = js.native
  /* CompleteClass */
  override val SendDateTime: VarDate = js.native
  /* CompleteClass */
  override val Sender: String = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  override var ToRecipients: js.Any = js.native
  /* CompleteClass */
  override var WhichAddress: js.Any = js.native
}

