package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.EW.ReadsHeaders
import typings.akamaiEdgeworkers.anon.Headers
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
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
  @JSImport("http-request", "httpRequest")
  @js.native
  def httpRequest(url: String): js.Promise[HttpResponse] = js.native
  @JSImport("http-request", "httpRequest")
  @js.native
  def httpRequest(url: String, options: Headers): js.Promise[HttpResponse] = js.native
  
  /**
    * Describes the result of a `httpRequest()`.
    */
  @js.native
  trait HttpResponse extends ReadsHeaders {
    
    var body: ReadableStream[_] = js.native
    
    /**
      * Parses the body of the response as JSON. The response is buffered
      * and `JSON.parse()` is run on the text.
      */
    def json(): js.Promise[_] = js.native
    
    /**
      * A boolean which is true for 2XX responses
      */
    val ok: Boolean = js.native
    
    /**
      * The HTTP status code
      */
    val status: Double = js.native
    
    /**
      * Returns a Promise that resolves to a string containing the
      * response body. Note that the body is buffered in memory.
      */
    def text(): js.Promise[String] = js.native
  }
  object HttpResponse {
    
    @scala.inline
    def apply(
      body: ReadableStream[_],
      getHeader: String => js.Array[String] | Null,
      json: () => js.Promise[_],
      ok: Boolean,
      status: Double,
      text: () => js.Promise[String]
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ReadableStream[_]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: () => js.Promise[_]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
