package typings.alexaVoiceService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var boundary: String = js.native
    
    var headers: String = js.native
    
    var httpVersion: String = js.native
    
    var method: String = js.native
    
    var multipart: String = js.native
    
    var statusCode: String = js.native
    
    var statusMessage: String = js.native
    
    var url: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipart(value: String): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var response: Body = js.native
    
    var xhr: js.Any = js.native
  }
  object Response {
    
    @scala.inline
    def apply(response: Body, xhr: js.Any): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: Body): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
}
