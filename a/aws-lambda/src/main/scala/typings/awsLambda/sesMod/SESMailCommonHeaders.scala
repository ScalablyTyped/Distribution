package typings.awsLambda.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESMailCommonHeaders extends StObject {
  
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  
  var cc: js.UndefOr[js.Array[String]] = js.undefined
  
  var date: String
  
  var from: js.UndefOr[js.Array[String]] = js.undefined
  
  var messageId: String
  
  var replyTo: js.UndefOr[js.Array[String]] = js.undefined
  
  var returnPath: String
  
  var sender: js.UndefOr[js.Array[String]] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[js.Array[String]] = js.undefined
}
object SESMailCommonHeaders {
  
  inline def apply(date: String, messageId: String, returnPath: String): SESMailCommonHeaders = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], returnPath = returnPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMailCommonHeaders]
  }
  
  extension [Self <: SESMailCommonHeaders](x: Self) {
    
    inline def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
    
    inline def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setReplyTo(value: js.Array[String]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setReplyToVarargs(value: String*): Self = StObject.set(x, "replyTo", js.Array(value*))
    
    inline def setReturnPath(value: String): Self = StObject.set(x, "returnPath", value.asInstanceOf[js.Any])
    
    inline def setSender(value: js.Array[String]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSenderVarargs(value: String*): Self = StObject.set(x, "sender", js.Array(value*))
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
