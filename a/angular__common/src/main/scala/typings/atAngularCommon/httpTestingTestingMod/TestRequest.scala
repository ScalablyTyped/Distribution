package typings.atAngularCommon.httpTestingTestingMod

import typings.atAngularCommon.Anon_HeadersName
import typings.atAngularCommon.httpHttpMod.HttpEvent
import typings.atAngularCommon.httpMod.HttpRequest
import typings.rxjs.internalTypesMod.Observer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing/testing", "TestRequest")
@js.native
class TestRequest protected () extends js.Object {
  def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  /**
    * Whether the request was cancelled after it was sent.
    */
  val cancelled: Boolean = js.native
  var observer: js.Any = js.native
  var request: HttpRequest[_] = js.native
  /**
    * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
    */
  def error(error: ErrorEvent): Unit = js.native
  def error(error: ErrorEvent, opts: Anon_HeadersName): Unit = js.native
  /**
    * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
    * request.
    */
  def event(event: HttpEvent[_]): Unit = js.native
  def flush(): Unit = js.native
  def flush(body: String): Unit = js.native
  def flush(body: String, opts: Anon_HeadersName): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null]): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null], opts: Anon_HeadersName): Unit = js.native
  def flush(body: js.Object): Unit = js.native
  def flush(body: js.Object, opts: Anon_HeadersName): Unit = js.native
  def flush(body: Double): Unit = js.native
  def flush(body: Double, opts: Anon_HeadersName): Unit = js.native
  def flush(body: Null, opts: Anon_HeadersName): Unit = js.native
  /**
    * Resolve the request by returning a body plus additional HTTP information (such as response
    * headers) if provided.
    * If the request specifies an expected body type, the body is converted into the requested type.
    * Otherwise, the body is converted to `JSON` by default.
    *
    * Both successful and unsuccessful responses can be delivered via `flush()`.
    */
  def flush(body: ArrayBuffer): Unit = js.native
  def flush(body: ArrayBuffer, opts: Anon_HeadersName): Unit = js.native
  def flush(body: Blob): Unit = js.native
  def flush(body: Blob, opts: Anon_HeadersName): Unit = js.native
}

