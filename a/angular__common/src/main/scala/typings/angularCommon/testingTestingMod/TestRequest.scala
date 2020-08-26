package typings.angularCommon.testingTestingMod

import typings.angularCommon.anon.StatusText
import typings.angularCommon.httpHttpMod.HttpEvent
import typings.angularCommon.httpMod.HttpRequest
import typings.rxjs.typesMod.Observer
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
  var observer: js.Any = js.native
  var request: HttpRequest[_] = js.native
  /**
    * Whether the request was cancelled after it was sent.
    */
  def cancelled: Boolean = js.native
  /**
    * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
    */
  def error(error: ErrorEvent): Unit = js.native
  def error(error: ErrorEvent, opts: StatusText): Unit = js.native
  /**
    * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
    * request.
    */
  def event(event: HttpEvent[_]): Unit = js.native
  /**
    * Resolve the request by returning a body plus additional HTTP information (such as response
    * headers) if provided.
    * If the request specifies an expected body type, the body is converted into the requested type.
    * Otherwise, the body is converted to `JSON` by default.
    *
    * Both successful and unsuccessful responses can be delivered via `flush()`.
    */
  def flush(): Unit = js.native
  def flush(body: String): Unit = js.native
  def flush(body: String, opts: StatusText): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null]): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null], opts: StatusText): Unit = js.native
  def flush(body: js.Object): Unit = js.native
  def flush(body: js.Object, opts: StatusText): Unit = js.native
  def flush(body: Double): Unit = js.native
  def flush(body: Double, opts: StatusText): Unit = js.native
  def flush(body: Null, opts: StatusText): Unit = js.native
  def flush(body: ArrayBuffer): Unit = js.native
  def flush(body: ArrayBuffer, opts: StatusText): Unit = js.native
  def flush(body: Blob): Unit = js.native
  def flush(body: Blob, opts: StatusText): Unit = js.native
}

