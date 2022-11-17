package typings.angularCommon.httpMod

import typings.angularCommon.anon.HeadersParams
import typings.angularCommon.anon.Method
import typings.angularCommon.anon.SetHeaders
import typings.std.Blob
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpRequest")
@js.native
open class HttpRequest[T] protected () extends StObject {
  def this(
    method: "DELETE" | "GET" | "HEAD" | "JSONP" | "OPTIONS" | "POST" | "PUT" | "PATCH" | String,
    url: String
  ) = this()
  def this(method: "POST" | "PUT" | "PATCH" | String, url: String, body: T) = this()
  def this(method: "DELETE" | "GET" | "HEAD" | "JSONP" | "OPTIONS", url: String, init: HeadersParams) = this()
  def this(method: "POST" | "PUT" | "PATCH" | String, url: String, body: T, init: HeadersParams) = this()
  def this(method: "POST" | "PUT" | "PATCH" | String, url: String, body: Null, init: HeadersParams) = this()
  
  /**
    * The request body, or `null` if one isn't set.
    *
    * Bodies are not enforced to be immutable, as they can include a reference to any
    * user-defined data type. However, interceptors should take care to preserve
    * idempotence by treating them as such.
    */
  val body: T | Null = js.native
  
  def clone(update: Method[T]): HttpRequest[T] = js.native
  def clone[V](update: SetHeaders[V]): HttpRequest[V] = js.native
  
  /**
    * Shared and mutable context that can be used by interceptors
    */
  val context: HttpContext = js.native
  
  /**
    * Examine the body and attempt to infer an appropriate MIME type
    * for it.
    *
    * If no such type can be inferred, this method will return `null`.
    */
  def detectContentTypeHeader(): String | Null = js.native
  
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
    *
    * To pass a string representation of HTTP parameters in the URL-query-string format,
    * the `HttpParamsOptions`' `fromString` may be used. For example:
    *
    * ```
    * new HttpParams({fromString: 'angular=awesome'})
    * ```
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
  val responseType: "arraybuffer" | "blob" | "json" | "text" = js.native
  
  /**
    * Transform the free-form body into a serialized format suitable for
    * transmission to the server.
    */
  def serializeBody(): js.typedarray.ArrayBuffer | Blob | FormData | String | Null = js.native
  
  val url: String = js.native
  
  /**
    * The outgoing URL with all URL parameters set.
    */
  val urlWithParams: String = js.native
  
  /**
    * Whether this request should be sent with outgoing credentials (cookies).
    */
  val withCredentials: Boolean = js.native
}
