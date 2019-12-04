package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.Anon_Arraybuffer
import typings.atAngularCommon.Anon_ArraybufferBlobBody
import typings.atAngularCommon.Anon_ArraybufferBlobBodyHeaders
import typings.atAngularCommon.atAngularCommonStrings.DELETE
import typings.atAngularCommon.atAngularCommonStrings.GET
import typings.atAngularCommon.atAngularCommonStrings.HEAD
import typings.atAngularCommon.atAngularCommonStrings.JSONP
import typings.atAngularCommon.atAngularCommonStrings.OPTIONS
import typings.atAngularCommon.atAngularCommonStrings.PATCH
import typings.atAngularCommon.atAngularCommonStrings.POST
import typings.atAngularCommon.atAngularCommonStrings.PUT
import typings.atAngularCommon.atAngularCommonStrings.arraybuffer
import typings.atAngularCommon.atAngularCommonStrings.blob
import typings.atAngularCommon.atAngularCommonStrings.json
import typings.atAngularCommon.atAngularCommonStrings.text
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpRequest")
@js.native
class HttpRequest[T] protected () extends js.Object {
  def this(method: String, url: String) = this()
  def this(method: DELETE, url: String) = this()
  def this(method: GET, url: String) = this()
  def this(method: HEAD, url: String) = this()
  def this(method: JSONP, url: String) = this()
  def this(method: OPTIONS, url: String) = this()
  def this(method: PATCH, url: String) = this()
  def this(method: POST, url: String) = this()
  def this(method: PUT, url: String) = this()
  def this(method: String, url: String, body: T) = this()
  def this(method: DELETE, url: String, init: Anon_Arraybuffer) = this()
  def this(method: GET, url: String, init: Anon_Arraybuffer) = this()
  def this(method: HEAD, url: String, init: Anon_Arraybuffer) = this()
  def this(method: JSONP, url: String, init: Anon_Arraybuffer) = this()
  def this(method: OPTIONS, url: String, init: Anon_Arraybuffer) = this()
  def this(method: PATCH, url: String, body: T) = this()
  def this(method: POST, url: String, body: T) = this()
  def this(method: PUT, url: String, body: T) = this()
  def this(method: String, url: String, body: T, init: Anon_Arraybuffer) = this()
  def this(method: String, url: String, body: Null, init: Anon_Arraybuffer) = this()
  def this(method: PATCH, url: String, body: T, init: Anon_Arraybuffer) = this()
  def this(method: PATCH, url: String, body: Null, init: Anon_Arraybuffer) = this()
  def this(method: POST, url: String, body: T, init: Anon_Arraybuffer) = this()
  def this(method: POST, url: String, body: Null, init: Anon_Arraybuffer) = this()
  def this(method: PUT, url: String, body: T, init: Anon_Arraybuffer) = this()
  def this(method: PUT, url: String, body: Null, init: Anon_Arraybuffer) = this()
  /**
    * The request body, or `null` if one isn't set.
    *
    * Bodies are not enforced to be immutable, as they can include a reference to any
    * user-defined data type. However, interceptors should take care to preserve
    * idempotence by treating them as such.
    */
  val body: T | Null = js.native
  /**
    * Outgoing headers for this request.
    */
  val headers: HttpHeaders = js.native
  /**
    * The outgoing HTTP request method.
    */
  val method: String = js.native
  /**
    * Outgoing URL parameters.
    */
  val params: HttpParams = js.native
  /**
    * Whether this request should be made in a way that exposes progress events.
    *
    * Progress events are expensive (change detection runs on each event) and so
    * they should only be requested if the consumer intends to monitor them.
    */
  val reportProgress: Boolean = js.native
  /**
    * The expected response type of the server.
    *
    * This is used to parse the response appropriately before returning it to
    * the requestee.
    */
  val responseType: arraybuffer | blob | json | text = js.native
  val url: String = js.native
  /**
    * The outgoing URL with all URL parameters set.
    */
  val urlWithParams: String = js.native
  /**
    * Whether this request should be sent with outgoing credentials (cookies).
    */
  val withCredentials: Boolean = js.native
  def clone(update: Anon_ArraybufferBlobBody[T]): HttpRequest[T] = js.native
  def clone[V](update: Anon_ArraybufferBlobBodyHeaders[V]): HttpRequest[V] = js.native
  /**
    * Examine the body and attempt to infer an appropriate MIME type
    * for it.
    *
    * If no such type can be inferred, this method will return `null`.
    */
  def detectContentTypeHeader(): String | Null = js.native
  /**
    * Transform the free-form body into a serialized format suitable for
    * transmission to the server.
    */
  def serializeBody(): ArrayBuffer | Blob | FormData | String | Null = js.native
}

