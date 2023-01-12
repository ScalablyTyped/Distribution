package typings.awsCloudfrontFunction

import org.scalablytyped.runtime.StringDictionary
import typings.awsCloudfrontFunction.anon.AttributesMultiValue
import typings.awsCloudfrontFunction.anon.MultiValue
import typings.awsCloudfrontFunction.awsCloudfrontFunctionStrings.`1Dot0`
import typings.awsCloudfrontFunction.awsCloudfrontFunctionStrings.`viewer-request`
import typings.awsCloudfrontFunction.awsCloudfrontFunctionStrings.`viewer-response`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AWSCloudFrontFunction {
  
  trait Context extends StObject {
    
    var distributionDomainName: String
    
    var distributionId: String
    
    var eventType: `viewer-request` | `viewer-response`
    
    var requestId: String
  }
  object Context {
    
    inline def apply(
      distributionDomainName: String,
      distributionId: String,
      eventType: `viewer-request` | `viewer-response`,
      requestId: String
    ): Context = {
      val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setDistributionDomainName(value: String): Self = StObject.set(x, "distributionDomainName", value.asInstanceOf[js.Any])
      
      inline def setDistributionId(value: String): Self = StObject.set(x, "distributionId", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: `viewer-request` | `viewer-response`): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var context: Context
    
    var request: Request
    
    var response: Response
    
    var version: `1Dot0`
    
    var viewer: Viewer
  }
  object Event {
    
    inline def apply(context: Context, request: Request, response: Response, viewer: Viewer): Event = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], version = "1.0", viewer = viewer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `1Dot0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setViewer(value: Viewer): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var cookies: ValueObject
    
    var headers: ValueObject
    
    var method: String
    
    var querystring: ValueObject
    
    var uri: String
  }
  object Request {
    
    inline def apply(cookies: ValueObject, headers: ValueObject, method: String, querystring: ValueObject, uri: String): Request = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: ValueObject): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ValueObject): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQuerystring(value: ValueObject): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var cookies: js.UndefOr[ResponseCookie] = js.undefined
    
    var headers: js.UndefOr[ValueObject] = js.undefined
    
    var statusCode: Double
    
    var statusDescription: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply(statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: ResponseCookie): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setHeaders(value: ValueObject): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      inline def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
    }
  }
  
  type ResponseCookie = StringDictionary[AttributesMultiValue]
  
  type ValueObject = StringDictionary[MultiValue]
  
  trait Viewer extends StObject {
    
    var ip: String
  }
  object Viewer {
    
    inline def apply(ip: String): Viewer = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Viewer] (val x: Self) extends AnyVal {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    }
  }
}
