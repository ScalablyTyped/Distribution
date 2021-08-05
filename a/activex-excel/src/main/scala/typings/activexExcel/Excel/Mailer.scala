package typings.activexExcel.Excel

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Macintosh only */
trait Mailer extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var BCCRecipients: js.Any
  
  var CCRecipients: js.Any
  
  val Creator: XlCreator
  
  var Enclosures: js.Any
  
  /* private */ @JSName("Excel.Mailer_typekey")
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
  
  inline def apply(
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
  
  extension [Self <: Mailer](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBCCRecipients(value: js.Any): Self = StObject.set(x, "BCCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCCRecipients(value: js.Any): Self = StObject.set(x, "CCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnclosures(value: js.Any): Self = StObject.set(x, "Enclosures", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMailer_typekey(value: Mailer): Self = StObject.set(x, "Excel.Mailer_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: Boolean): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    inline def setSendDateTime(value: VarDate): Self = StObject.set(x, "SendDateTime", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setToRecipients(value: js.Any): Self = StObject.set(x, "ToRecipients", value.asInstanceOf[js.Any])
    
    inline def setWhichAddress(value: js.Any): Self = StObject.set(x, "WhichAddress", value.asInstanceOf[js.Any])
  }
}
