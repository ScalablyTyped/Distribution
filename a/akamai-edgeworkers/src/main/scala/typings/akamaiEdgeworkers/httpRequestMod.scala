package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.EW.ReadsHeaders
import typings.akamaiEdgeworkers.anon.Headers
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
  @JSImport("http-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Performs a subrequest, fetching the requested resource asynchronously.
    *
    * @param url A String containing the URL to fetch. Can be an absolute
    *      or relative URL. Relative URLs will use the parent request as
    *      the base URL. Only "http" and "https" are supported for the
    *      scheme. Specifying port numbers is not supported.
    * @param options May include
    *  - `method` The HTTP method to use.
    *  - `headers` Request headers to specify.
    *  - `body` The request payload.
    *  - `timeout` The request timeout, in milliseconds.
    */
  inline def httpRequest(url: String): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
  inline def httpRequest(url: String, options: Headers): js.Promise[HttpResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpResponse]]
  
  /**
    * Describes the result of a `httpRequest()`.
    */
  trait HttpResponse
    extends StObject
       with ReadsHeaders {
    
    var body: ReadableStream[js.Any]
    
    /**
      * Parses the body of the response as JSON. The response is buffered
      * and `JSON.parse()` is run on the text.
      */
    def json(): js.Promise[js.Any]
    
    /**
      * A boolean which is true for 2XX responses
      */
    val ok: Boolean
    
    /**
      * The HTTP status code
      */
    val status: Double
    
    /**
      * Returns a Promise that resolves to a string containing the
      * response body. Note that the body is buffered in memory.
      */
    def text(): js.Promise[String]
  }
  object HttpResponse {
    
    inline def apply(
      body: ReadableStream[js.Any],
      getHeader: String => js.Array[String] | Null,
      json: () => js.Promise[js.Any],
      ok: Boolean,
      status: Double,
      text: () => js.Promise[String]
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[HttpResponse]
    }
    
    extension [Self <: HttpResponse](x: Self) {
      
      inline def setBody(value: ReadableStream[js.Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[js.Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
