package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_RECEIPT_TYPE_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_SMTP_AUTHENTICATION_TYPE_ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxReceiptOptions Class */
@JSGlobal("FAXCOMEXLib.FaxReceiptOptions")
@js.native
/* private */ class FaxReceiptOptions ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions {
  
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  /* CompleteClass */
  var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM = js.native
  
  /** Authentication type used by server */
  /* CompleteClass */
  var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  var FAXCOMEXLibDotFaxReceiptOptions_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** SMTP password */
  /* CompleteClass */
  var SMTPPassword: String = js.native
  
  /** SMTP port number */
  /* CompleteClass */
  var SMTPPort: Double = js.native
  
  /** SMTP sender e-mail address */
  /* CompleteClass */
  var SMTPSender: String = js.native
  
  /** Name of the SMTP server */
  /* CompleteClass */
  var SMTPServer: String = js.native
  
  /** SMTP user name */
  /* CompleteClass */
  var SMTPUser: String = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  /* CompleteClass */
  var UseForInboundRouting: Boolean = js.native
}
