package typings.activexWord.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mailer extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var BCCRecipients: Any
  
  var CCRecipients: Any
  
  val Creator: Double
  
  var Enclosures: Any
  
  val Parent: Any
  
  val Received: Boolean
  
  var Recipients: Any
  
  val SendDateTime: VarDate
  
  val Sender: String
  
  var Subject: String
  
  /* private */ @JSName("Word.Mailer_typekey")
  var WordDotMailer_typekey: Mailer
}
object Mailer {
  
  inline def apply(
    Application: Application,
    BCCRecipients: Any,
    CCRecipients: Any,
    Creator: Double,
    Enclosures: Any,
    Parent: Any,
    Received: Boolean,
    Recipients: Any,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    WordDotMailer_typekey: Mailer
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Mailer_typekey")(WordDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
  
  extension [Self <: Mailer](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBCCRecipients(value: Any): Self = StObject.set(x, "BCCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCCRecipients(value: Any): Self = StObject.set(x, "CCRecipients", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnclosures(value: Any): Self = StObject.set(x, "Enclosures", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: Boolean): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: Any): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    inline def setSendDateTime(value: VarDate): Self = StObject.set(x, "SendDateTime", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setWordDotMailer_typekey(value: Mailer): Self = StObject.set(x, "Word.Mailer_typekey", value.asInstanceOf[js.Any])
  }
}
