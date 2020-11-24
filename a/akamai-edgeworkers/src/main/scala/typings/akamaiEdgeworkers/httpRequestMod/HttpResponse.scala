package typings.akamaiEdgeworkers.httpRequestMod

import typings.akamaiEdgeworkers.EW.ReadsHeaders
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class HttpResponseOps[Self <: HttpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: ReadableStream[_]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
  }
}
