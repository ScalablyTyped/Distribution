package typings.activexExcel.Excel

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Macintosh only */
trait Mailer extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var BCCRecipients: Any
  
  var CCRecipients: Any
  
  val Creator: XlCreator
  
  var Enclosures: Any
  
  /* private */ @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: Mailer
  
  val Parent: Any
  
  val Received: Boolean
  
  val SendDateTime: VarDate
  
  val Sender: String
  
  var Subject: String
  
  var ToRecipients: Any
  
  var WhichAddress: Any
}
object Mailer {
  
  inline def apply(
    Application: Application,
    BCCRecipients: Any,
    CCRecipients: Any,
    Creator: XlCreator,
    Enclosures: Any,
    ExcelDotMailer_typekey: Mailer,
    Parent: Any,
    Received: Boolean,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    ToRecipients: Any,
    WhichAddress: Any
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToRecipients = ToRecipients.asInstanceOf[js.Any], WhichAddress = WhichAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Mailer_typekey")(ExcelDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mailer] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBCCRecipients(value: Any): Self = StObject.set(x, "BCCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCCRecipients(value: Any): Self = StObject.set(x, "CCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnclosures(value: Any): Self = StObject.set(x, "Enclosures", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMailer_typekey(value: Mailer): Self = StObject.set(x, "Excel.Mailer_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: Boolean): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    inline def setSendDateTime(value: VarDate): Self = StObject.set(x, "SendDateTime", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setToRecipients(value: Any): Self = StObject.set(x, "ToRecipients", value.asInstanceOf[js.Any])
    
    inline def setWhichAddress(value: Any): Self = StObject.set(x, "WhichAddress", value.asInstanceOf[js.Any])
  }
}
