package typings.activexExcel.Excel

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Macintosh only */
trait Mailer extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var BCCRecipients: js.Any
  var CCRecipients: js.Any
  val Creator: XlCreator
  var Enclosures: js.Any
  @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: Mailer
  val Parent: js.Any
  val Received: Boolean
  val SendDateTime: VarDate
  val Sender: String
  var Subject: String
  var ToRecipients: js.Any
  var WhichAddress: js.Any
}

object Mailer {
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: XlCreator,
    Enclosures: js.Any,
    ExcelDotMailer_typekey: Mailer,
    Parent: js.Any,
    Received: Boolean,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    ToRecipients: js.Any,
    WhichAddress: js.Any
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToRecipients = ToRecipients.asInstanceOf[js.Any], WhichAddress = WhichAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Mailer_typekey")(ExcelDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
}

