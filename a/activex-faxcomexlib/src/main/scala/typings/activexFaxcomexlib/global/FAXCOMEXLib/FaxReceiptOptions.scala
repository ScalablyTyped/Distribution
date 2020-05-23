package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_RECEIPT_TYPE_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_SMTP_AUTHENTICATION_TYPE_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxReceiptOptions Class */
@JSGlobal("FAXCOMEXLib.FaxReceiptOptions")
@js.native
class FaxReceiptOptions protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions {
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  /* CompleteClass */
  override var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Authentication type used by server */
  /* CompleteClass */
  override var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  override var FAXCOMEXLibDotFaxReceiptOptions_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions = js.native
  /** SMTP password */
  /* CompleteClass */
  override var SMTPPassword: String = js.native
  /** SMTP port number */
  /* CompleteClass */
  override var SMTPPort: Double = js.native
  /** SMTP sender e-mail address */
  /* CompleteClass */
  override var SMTPSender: String = js.native
  /** Name of the SMTP server */
  /* CompleteClass */
  override var SMTPServer: String = js.native
  /** SMTP user name */
  /* CompleteClass */
  override var SMTPUser: String = js.native
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  /* CompleteClass */
  override var UseForInboundRouting: Boolean = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

