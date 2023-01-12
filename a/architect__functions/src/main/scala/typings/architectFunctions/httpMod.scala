package typings.architectFunctions

import typings.awsLambda.handlerMod.Context
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyResult
import typings.express.mod.Application_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  trait ArcHttp extends StObject {
    
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.async
      */
    def async(fns: HttpHandler*): LambdaHandler
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.async
      */
    @JSName("async")
    var async_Original: HttpAsync
    
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.express
      */
    def express(app: Application_): LambdaHandler
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.express
      */
    @JSName("express")
    var express_Original: HttpExpress
    
    /**
      * https://github.com/architect/functions/blob/3f11406b651f2854371906ad5f9eb9c300433032/src/http/index.js#L21-L26
      */
    var helpers: Helpers
    
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.proxy
      */
    def proxy(options: HttpProxyOptions): HttpHandler
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.proxy
      */
    @JSName("proxy")
    var proxy_Original: HttpProxy
    
    /**
      * https://arc.codes/docs/en/reference/runtime/node#arc.http.session
      */
    var session: HttpSession
  }
  object ArcHttp {
    
    inline def apply(
      async: HttpAsync,
      express: /* app */ Application_ => LambdaHandler,
      helpers: Helpers,
      proxy: /* options */ HttpProxyOptions => HttpHandler,
      session: HttpSession
    ): ArcHttp = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], express = js.Any.fromFunction1(express), helpers = helpers.asInstanceOf[js.Any], proxy = js.Any.fromFunction1(proxy), session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcHttp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcHttp] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: HttpAsync): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setExpress(value: /* app */ Application_ => LambdaHandler): Self = StObject.set(x, "express", js.Any.fromFunction1(value))
      
      inline def setHelpers(value: Helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: /* options */ HttpProxyOptions => HttpHandler): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
      
      inline def setSession(value: HttpSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Helpers extends StObject {
    
    def bodyParser(req: HttpRequest): Record[String, Any] = js.native
    
    def interpolate(req: HttpRequest): HttpRequest = js.native
    
    def static(asset: String): String = js.native
    def static(asset: String, options: StaticOptions): String = js.native
    
    def url(url: String): String = js.native
  }
  
  type HtmlBody = String
  
  @js.native
  trait HttpAsync extends StObject {
    
    def apply(fns: HttpHandler*): LambdaHandler = js.native
  }
  
  type HttpExpress = js.Function1[/* app */ Application_, LambdaHandler]
  
  type HttpHandler = js.Function1[/* req */ HttpRequest, js.Promise[js.UndefOr[HttpResponse]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.architectFunctions.architectFunctionsStrings.GET
    - typings.architectFunctions.architectFunctionsStrings.POST
    - typings.architectFunctions.architectFunctionsStrings.PATCH
    - typings.architectFunctions.architectFunctionsStrings.PUT
    - typings.architectFunctions.architectFunctionsStrings.DELETE
  */
  trait HttpMethods extends StObject
  object HttpMethods {
    
    inline def DELETE: typings.architectFunctions.architectFunctionsStrings.DELETE = "DELETE".asInstanceOf[typings.architectFunctions.architectFunctionsStrings.DELETE]
    
    inline def GET: typings.architectFunctions.architectFunctionsStrings.GET = "GET".asInstanceOf[typings.architectFunctions.architectFunctionsStrings.GET]
    
    inline def PATCH: typings.architectFunctions.architectFunctionsStrings.PATCH = "PATCH".asInstanceOf[typings.architectFunctions.architectFunctionsStrings.PATCH]
    
    inline def POST: typings.architectFunctions.architectFunctionsStrings.POST = "POST".asInstanceOf[typings.architectFunctions.architectFunctionsStrings.POST]
    
    inline def PUT: typings.architectFunctions.architectFunctionsStrings.PUT = "PUT".asInstanceOf[typings.architectFunctions.architectFunctionsStrings.PUT]
  }
  
  type HttpProxy = js.Function1[/* options */ HttpProxyOptions, HttpHandler]
  
  trait HttpProxyOptions extends StObject {
    
    var alias: Record[String, String]
    
    var spa: Boolean
  }
  object HttpProxyOptions {
    
    inline def apply(alias: Record[String, String], spa: Boolean): HttpProxyOptions = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], spa = spa.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpProxyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpProxyOptions] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: Record[String, String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setSpa(value: Boolean): Self = StObject.set(x, "spa", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpRequest extends StObject {
    
    /**
      * The request body in a base64-encoded buffer. You'll need to parse request.body before you can use it, but Architect provides tools to do this - see parsing request bodies.
      */
    var body: RequestBody
    
    /**
      * All client request headers
      */
    var headers: Record[String, String]
    
    var httpMethod: HttpMethods
    
    /**
      * Indicates whether body is base64-encoded binary payload (will always be true if body has not null)
      */
    var isBase64Encoded: Boolean
    
    /**
      * The absolute path of the request
      */
    var path: String
    
    /**
      * Any URL params, if defined in your HTTP Function's path (e.g. foo in GET /:foo/bar)
      */
    var pathParameters: Record[String, String]
    
    /**
      * Any query params if present in the client request
      */
    var queryStringParameters: Record[String, String]
    
    /**
      * The absolute path of the request, with resources substituted for actual path parts (e.g. /{foo}/bar)
      */
    var resource: String
    
    /**
      * When the request/response is run through arc.http.async (https://arc.codes/docs/en/reference/runtime/node#arc.http.async) then it will have session added.
      */
    var session: js.UndefOr[SessionData] = js.undefined
  }
  object HttpRequest {
    
    inline def apply(
      body: RequestBody,
      headers: Record[String, String],
      httpMethod: HttpMethods,
      isBase64Encoded: Boolean,
      path: String,
      pathParameters: Record[String, String],
      queryStringParameters: Record[String, String],
      resource: String
    ): HttpRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathParameters = pathParameters.asInstanceOf[js.Any], queryStringParameters = queryStringParameters.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: HttpMethods): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: Record[String, String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParameters(value: Record[String, String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSession(value: SessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait HttpResponse extends StObject {
    
    /**
      * Contains request body, either as a plain string (no encoding or serialization required) or, if binary, base64-encoded buffer
      * Note: The maximum body payload size is 6MB
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * All response headers
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * When used with https://arc.codes/docs/en/reference/runtime/node#arc.http.async
      * json sets the Content-Type header to application/json
      */
    var html: js.UndefOr[HtmlBody] = js.undefined
    
    /**
      * Indicates whether body is base64-encoded binary payload
      * Required to be set to true if emitting a binary payload
      */
    var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When used with https://arc.codes/docs/en/reference/runtime/node#arc.http.async
      * json sets the Content-Type header to application/json
      */
    var json: js.UndefOr[JsonBody] = js.undefined
    
    /**
      * When the request/response is run through arc.http.async (https://arc.codes/docs/en/reference/runtime/node#arc.http.async) then it will have session added.
      */
    var session: js.UndefOr[SessionData] = js.undefined
    
    /**
      * Alias for @see statusCode
      */
    var status: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the HTTP status code
      */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object HttpResponse {
    
    inline def apply(): HttpResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHtml(value: HtmlBody): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      inline def setJson(value: JsonBody): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setSession(value: SessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait HttpSession extends StObject {
    
    def read(req: HttpRequest): js.Promise[SessionData]
    
    def write(sess: SessionData): js.Promise[String]
  }
  object HttpSession {
    
    inline def apply(read: HttpRequest => js.Promise[SessionData], write: SessionData => js.Promise[String]): HttpSession = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[HttpSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpSession] (val x: Self) extends AnyVal {
      
      inline def setRead(value: HttpRequest => js.Promise[SessionData]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: SessionData => js.Promise[String]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type JsonBody = Any
  
  type LambdaHandler = js.Function2[
    /* event */ APIGatewayProxyEvent, 
    /* context */ Context, 
    js.Promise[APIGatewayProxyResult]
  ]
  
  type RequestBody = Any
  
  type SessionData = Record[String, Any]
  
  trait StaticOptions extends StObject {
    
    var stagePath: String
  }
  object StaticOptions {
    
    inline def apply(stagePath: String): StaticOptions = {
      val __obj = js.Dynamic.literal(stagePath = stagePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticOptions] (val x: Self) extends AnyVal {
      
      inline def setStagePath(value: String): Self = StObject.set(x, "stagePath", value.asInstanceOf[js.Any])
    }
  }
}
