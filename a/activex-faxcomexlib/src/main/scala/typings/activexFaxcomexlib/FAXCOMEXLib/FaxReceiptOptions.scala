package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxReceiptOptions Class */
trait FaxReceiptOptions extends StObject {
  
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM
  
  /** Authentication type used by server */
  var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM
  
  /* private */ @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  var FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions
  
  /** Refresh the object */
  def Refresh(): Unit
  
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
  
  /** Save the object */
  def Save(): Unit
  
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  var UseForInboundRouting: Boolean
}
object FaxReceiptOptions {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaxReceiptOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowedReceipts(value: FAX_RECEIPT_TYPE_ENUM): Self = StObject.set(x, "AllowedReceipts", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationType(value: FAX_SMTP_AUTHENTICATION_TYPE_ENUM): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxReceiptOptions_typekey(value: FaxReceiptOptions): Self = StObject.set(x, "FAXCOMEXLib.FaxReceiptOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setSMTPPassword(value: String): Self = StObject.set(x, "SMTPPassword", value.asInstanceOf[js.Any])
    
    inline def setSMTPPort(value: Double): Self = StObject.set(x, "SMTPPort", value.asInstanceOf[js.Any])
    
    inline def setSMTPSender(value: String): Self = StObject.set(x, "SMTPSender", value.asInstanceOf[js.Any])
    
    inline def setSMTPServer(value: String): Self = StObject.set(x, "SMTPServer", value.asInstanceOf[js.Any])
    
    inline def setSMTPUser(value: String): Self = StObject.set(x, "SMTPUser", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setUseForInboundRouting(value: Boolean): Self = StObject.set(x, "UseForInboundRouting", value.asInstanceOf[js.Any])
  }
}
