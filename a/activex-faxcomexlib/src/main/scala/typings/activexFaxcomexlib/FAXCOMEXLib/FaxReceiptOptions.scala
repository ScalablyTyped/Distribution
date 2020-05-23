package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxReceiptOptions Class */
trait FaxReceiptOptions extends js.Object {
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM
  /** Authentication type used by server */
  var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM
  @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  var FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions
  /** SMTP password */
  var SMTPPassword: String
  /** SMTP port number */
  var SMTPPort: Double
  /** SMTP sender e-mail address */
  var SMTPSender: String
  /** Name of the SMTP server */
  var SMTPServer: String
  /** SMTP user name */
  var SMTPUser: String
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  var UseForInboundRouting: Boolean
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxReceiptOptions {
  @scala.inline
  def apply(
    AllowedReceipts: FAX_RECEIPT_TYPE_ENUM,
    AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM,
    FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions,
    Refresh: () => Unit,
    SMTPPassword: String,
    SMTPPort: Double,
    SMTPSender: String,
    SMTPServer: String,
    SMTPUser: String,
    Save: () => Unit,
    UseForInboundRouting: Boolean
  ): FaxReceiptOptions = {
    val __obj = js.Dynamic.literal(AllowedReceipts = AllowedReceipts.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), SMTPPassword = SMTPPassword.asInstanceOf[js.Any], SMTPPort = SMTPPort.asInstanceOf[js.Any], SMTPSender = SMTPSender.asInstanceOf[js.Any], SMTPServer = SMTPServer.asInstanceOf[js.Any], SMTPUser = SMTPUser.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), UseForInboundRouting = UseForInboundRouting.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxReceiptOptions_typekey")(FAXCOMEXLibDotFaxReceiptOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxReceiptOptions]
  }
}

