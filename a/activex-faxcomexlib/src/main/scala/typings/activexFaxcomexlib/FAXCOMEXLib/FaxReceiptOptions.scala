package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxReceiptOptions Class */
@JSGlobal("FAXCOMEXLib.FaxReceiptOptions")
@js.native
class FaxReceiptOptions protected () extends js.Object {
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Authentication type used by server */
  var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = js.native
  @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  var FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions = js.native
  /** SMTP password */
  var SMTPPassword: String = js.native
  /** SMTP port number */
  var SMTPPort: Double = js.native
  /** SMTP sender e-mail address */
  var SMTPSender: String = js.native
  /** Name of the SMTP server */
  var SMTPServer: String = js.native
  /** SMTP user name */
  var SMTPUser: String = js.native
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  var UseForInboundRouting: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

