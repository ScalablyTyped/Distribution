package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

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
  var `FAXCOMEXLib.FaxReceiptOptions_typekey`: FaxReceiptOptions = js.native
  /** SMTP password */
  var SMTPPassword: java.lang.String = js.native
  /** SMTP port number */
  var SMTPPort: scala.Double = js.native
  /** SMTP sender e-mail address */
  var SMTPSender: java.lang.String = js.native
  /** Name of the SMTP server */
  var SMTPServer: java.lang.String = js.native
  /** SMTP user name */
  var SMTPUser: java.lang.String = js.native
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  var UseForInboundRouting: scala.Boolean = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

