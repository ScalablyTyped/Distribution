package typings.awsLambda.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESMessage extends StObject {
  
  var mail: SESMail
  
  var receipt: SESReceipt
}
object SESMessage {
  
  inline def apply(mail: SESMail, receipt: SESReceipt): SESMessage = {
    val __obj = js.Dynamic.literal(mail = mail.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMessage]
  }
  
  extension [Self <: SESMessage](x: Self) {
    
    inline def setMail(value: SESMail): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    inline def setReceipt(value: SESReceipt): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
  }
}
