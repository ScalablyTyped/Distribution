package typings.awsLambda.triggerSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESMail extends StObject {
  
  var commonHeaders: SESMailCommonHeaders
  
  var destination: js.Array[String]
  
  var headers: js.Array[SESMailHeader]
  
  var headersTruncated: Boolean
  
  var messageId: String
  
  var source: String
  
  var timestamp: String
}
object SESMail {
  
  inline def apply(
    commonHeaders: SESMailCommonHeaders,
    destination: js.Array[String],
    headers: js.Array[SESMailHeader],
    headersTruncated: Boolean,
    messageId: String,
    source: String,
    timestamp: String
  ): SESMail = {
    val __obj = js.Dynamic.literal(commonHeaders = commonHeaders.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersTruncated = headersTruncated.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SESMail] (val x: Self) extends AnyVal {
    
    inline def setCommonHeaders(value: SESMailCommonHeaders): Self = StObject.set(x, "commonHeaders", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: js.Array[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationVarargs(value: String*): Self = StObject.set(x, "destination", js.Array(value*))
    
    inline def setHeaders(value: js.Array[SESMailHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersTruncated(value: Boolean): Self = StObject.set(x, "headersTruncated", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: SESMailHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
