package typings.alexaVoiceService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: String
    
    var boundary: String
    
    var headers: String
    
    var httpVersion: String
    
    var method: String
    
    var multipart: String
    
    var statusCode: String
    
    var statusMessage: String
    
    var url: String
  }
  object Body {
    
    inline def apply(
      body: String,
      boundary: String,
      headers: String,
      httpVersion: String,
      method: String,
      multipart: String,
      statusCode: String,
      statusMessage: String,
      url: String
    ): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMultipart(value: String): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var response: Body
    
    var xhr: Any
  }
  object Response {
    
    inline def apply(response: Body, xhr: Any): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setResponse(value: Body): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
}
