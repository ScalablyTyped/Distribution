package typings.angularCommon.httpMod

import typings.angularCommon.anon.Body
import typings.angularCommon.anon.BodyContext
import typings.angularCommon.anon.BodyContextHeaders
import typings.angularCommon.anon.BodyContextHeadersObserve
import typings.angularCommon.anon.Context
import typings.angularCommon.anon.ContextHeaders
import typings.angularCommon.anon.ContextHeadersObserve
import typings.angularCommon.anon.ContextHeadersObserveParams
import typings.angularCommon.anon.ContextHeadersObserveParamsReportProgress
import typings.angularCommon.anon.ContextHeadersObserveParamsReportProgressResponseType
import typings.angularCommon.anon.ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.anon.Headers
import typings.angularCommon.anon.HeadersObserve
import typings.angularCommon.anon.HeadersObserveParams
import typings.angularCommon.anon.HeadersObserveParamsReportProgress
import typings.angularCommon.anon.HeadersObserveParamsReportProgressResponseType
import typings.angularCommon.anon.HeadersObserveParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.anon.Observe
import typings.angularCommon.anon.ObserveParams
import typings.angularCommon.anon.ObserveParamsReportProgress
import typings.angularCommon.anon.ObserveParamsReportProgressResponseType
import typings.angularCommon.anon.ObserveParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.anon.Params
import typings.angularCommon.anon.ParamsReportProgress
import typings.angularCommon.anon.ParamsReportProgressResponseType
import typings.angularCommon.anon.ParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.anon.ReportProgress
import typings.angularCommon.anon.ReportProgressResponseType
import typings.angularCommon.anon.ReportProgressResponseTypeWithCredentials
import typings.angularCommon.anon.ResponseType
import typings.angularCommon.anon.ResponseTypeWithCredentials
import typings.angularCommon.anon.WithCredentials
import typings.angularCommon.anon.`0`
import typings.angularCommon.anon.`1`
import typings.angularCommon.anon.`2`
import typings.angularCommon.anon.`3`
import typings.angularCommon.anon.`4`
import typings.angularCommon.anon.`5`
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.rxjs.mod.Observable_
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpClient")
@js.native
open class HttpClient protected () extends StObject {
  def this(handler: HttpHandler) = this()
  
  /**
    * Constructs a `DELETE` request that interprets the body as JSON and
    * returns the response body as an object parsed from JSON.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Object`.
    */
  def delete(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text string and returns
    * a string.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def delete(url: String, options: BodyContextHeaders): Observable_[String] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer` and returns
    *  the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`, with the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: BodyContextHeadersObserve): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: ContextHeadersObserve): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns the full
    * `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of type `Blob`.
    */
  def delete(url: String, options: ContextHeadersObserveParams): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request, with the response body as a
    * `Blob`.
    */
  def delete(url: String, options: HeadersObserveParams): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text stream and
    *  returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`, with the response body of type string.
    */
  def delete(url: String, options: HeadersObserveParamsReportProgress): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with the response
    * body of type string.
    */
  def delete(url: String, options: ObserveParamsReportProgress): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `DELETE` request the interprets the body as a JavaScript object and returns
    * the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of type `Object`.
    *
    */
  def delete(url: String, options: ObserveParamsReportProgressResponseType): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with response body of
    * type `Object`.
    */
  def delete(url: String, options: ParamsReportProgressResponseType): Observable_[HttpEvent[js.Object]] = js.native
  def delete(url: String, options: ParamsReportProgressResponseTypeWithCredentials): Observable_[js.Object] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: ReportProgressResponseType): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response body as a `Blob`.
    */
  def delete(url: String, options: ResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `DELETE`request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request, with a response
    * body in the requested type.
    */
  def delete[T](url: String, options: ReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a DELETE request that interprets the body as JSON and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with response body in the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String, options: ObserveParamsReportProgressResponseType): Observable_[HttpResponse[T]] = js.native
  @JSName("delete")
  def delete_T[T](url: String, options: ParamsReportProgressResponseTypeWithCredentials): Observable_[T] = js.native
  
  /**
    * Constructs a `GET` request that interprets the body as JSON and
    * returns the response body as an object parsed from JSON.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    *
    * @return An `Observable` of the response body as a JavaScript object.
    */
  def get(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns the
    * response in an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns
    *  the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with the response
    * body as an `ArrayBuffer`.
    */
  def get(url: String, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string and returns
    * the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob`
    * and returns the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string
    * and returns the response as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs a `GET` request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Object`.
    */
  def get(url: String, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def get(url: String, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text stream and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type string.
    */
  def get(url: String, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as JSON and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`,
    * with the response body of type `Object`.
    */
  def get(url: String, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def get(url: String, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as JSON and returns
    * the response body in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `GET` request that interprets the body as JSON and returns the full
    * event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as JSON and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("get")
  def get_T[T](url: String, options: `5`): Observable_[T] = js.native
  
  /* private */ var handler: Any = js.native
  
  /**
    * Constructs a `HEAD` request that interprets the body as JSON and
    * returns the response body as an object parsed from JSON.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an object parsed from JSON.
    */
  def head(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer` and
    * returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an  `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with the response body of type
    * string.
    */
  def head(url: String, options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response, with the response body as a `Blob`.
    */
  def head(url: String, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as a `Blob`.
    */
  def head(url: String, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string and returns the response
    * as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def head(url: String, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as JSON
    * and returns the full HTTP event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with a response body of
    * type `Object`.
    */
  def head(url: String, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer`
    *  and returns the full HTTP response.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as a blob.
    */
  def head(url: String, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as text stream
    * and returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type string.
    */
  def head(url: String, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as JSON and
    * returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type `Object`.
    */
  def head(url: String, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def head(url: String, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as JSON and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body of the given type.
    */
  @JSName("head")
  def head_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as JSON and
    * returns the full event stream.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with a response body in the requested type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    */
  @JSName("head")
  def head_T[T](url: String, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body of the requested type.
    */
  @JSName("head")
  def head_T[T](url: String, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("head")
  def head_T[T](url: String, options: `5`): Observable_[T] = js.native
  
  /**
    * Constructs a `JSONP` request for the given URL and name of the callback parameter.
    *
    * @param url The resource URL.
    * @param callbackParam The callback function name.
    *
    * @return An `Observable` of the response object, with response body as an object.
    */
  def jsonp(url: String, callbackParam: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `JSONP` request for the given URL and name of the callback parameter.
    *
    * @param url The resource URL.
    * @param callbackParam The callback function name.
    *
    * You must install a suitable interceptor, such as one provided by `HttpClientJsonpModule`.
    * If no such interceptor is reached,
    * then the `JSONP` request can be rejected by the configured backend.
    *
    * @return An `Observable` of the response object, with response body in the requested type.
    */
  @JSName("jsonp")
  def jsonp_T[T](url: String, callbackParam: String): Observable_[T] = js.native
  
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON and returns the
    * response body as an object parsed from JSON.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an object parsed from JSON.
    */
  def options(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an
    * `ArrayBuffer` and returns the response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return  An `Observable` of all `HttpEvent`s for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with the response body of type string.
    */
  def options(url: String, options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def options(url: String, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as a `Blob`.
    */
  def options(url: String, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string and
    * returns a string value.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def options(url: String, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request with the response
    * body of type `Object`.
    */
  def options(url: String, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an `ArrayBuffer`
    *  and returns the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob`
    *  and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def options(url: String, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as text stream
    * and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type string.
    */
  def options(url: String, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type `Object`.
    */
  def options(url: String, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def options(url: String, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON and returns the
    * response in a given type.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse`, with a response body of the given type.
    */
  @JSName("options")
  def options_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as JSON and
    * returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("options")
  def options_T[T](url: String, options: `5`): Observable_[T] = js.native
  
  /**
    * Constructs a `PATCH` request that interprets the body as JSON and
    * returns the response body as an object parsed from JSON.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an object parsed from JSON.
    */
  def patch(url: String): Observable_[js.Object] = js.native
  def patch(url: String, body: Any): Observable_[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer` and returns
    * the response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: Any, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer` and
    *  returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: Any, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text string and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request, with a
    * response body of type string.
    */
  def patch(
    url: String,
    body: Any,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob` and returns the response
    * as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def patch(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request, with the
    * response body as `Blob`.
    */
  def patch(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def patch(url: String, body: Any, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with a response body of type `Object`.
    */
  def patch(url: String, body: Any, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: Any, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob` and returns the full
    * `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def patch(url: String, body: Any, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text stream and returns the
    * full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body of type string.
    */
  def patch(url: String, body: Any, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  def patch(url: String, body: Any, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def patch(url: String, body: Any, options: `5`): Observable_[js.Object] = js.native
  def patch(url: String, body: Null, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  def patch(url: String, body: Null, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  def patch(
    url: String,
    body: Null,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  def patch(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  def patch(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def patch(url: String, body: Null, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  def patch(url: String, body: Null, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  def patch(url: String, body: Null, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  def patch(url: String, body: Null, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  def patch(url: String, body: Null, options: `3`): Observable_[HttpResponse[String]] = js.native
  def patch(url: String, body: Null, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def patch(url: String, body: Null, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as JSON
    * and returns the response in a given type.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body in the given type.
    */
  @JSName("patch")
  def patch_T[T](url: String): Observable_[T] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Any): Observable_[T] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as JSON
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvent`s for the request,
    * with a response body in the requested type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: Any, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the given type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: Any, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Any, options: `5`): Observable_[T] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: `0`): Observable_[HttpEvent[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: `5`): Observable_[T] = js.native
  
  /**
    * Constructs a `POST` request that interprets the body as JSON
    * and returns the response body as an object parsed from JSON.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as an object parsed from JSON.
    */
  def post(url: String): Observable_[js.Object] = js.native
  def post(url: String, body: Any): Observable_[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as an `ArrayBuffer` and returns
    * an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: Any, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `POST` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: Any, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text string and returns the full
    * event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvent`s for the request,
    * with a response body of type string.
    */
  def post(
    url: String,
    body: Any,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob` and returns the
    * response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def post(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob`
    * and returns the response in an observable of the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with the response body as `Blob`.
    */
  def post(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def post(url: String, body: Any, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs a POST request that interprets the body as JSON and returns the full
    * event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvent`s for the request,
    * with a response body of type `Object`.
    */
  def post(url: String, body: Any, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a POST request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HttpResponse` for the request, with the response body as an
    * `ArrayBuffer`.
    */
  def post(url: String, body: Any, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob` and returns the full
    * `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def post(url: String, body: Any, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text stream and returns
    * the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body of type string.
    */
  def post(url: String, body: Any, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as JSON
    * and returns the full `HttpResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request, with a response body of type
    * `Object`.
    */
  def post(url: String, body: Any, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def post(url: String, body: Any, options: `5`): Observable_[js.Object] = js.native
  def post(url: String, body: Null, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  def post(url: String, body: Null, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  def post(
    url: String,
    body: Null,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  def post(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  def post(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def post(url: String, body: Null, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  def post(url: String, body: Null, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  def post(url: String, body: Null, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  def post(url: String, body: Null, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  def post(url: String, body: Null, options: `3`): Observable_[HttpResponse[String]] = js.native
  def post(url: String, body: Null, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def post(url: String, body: Null, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as JSON
    * and returns an observable of the response.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HttpResponse` for the request, with a response body in the
    * requested type.
    */
  @JSName("post")
  def post_T[T](url: String): Observable_[T] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Any): Observable_[T] = js.native
  /**
    * Constructs a POST request that interprets the body as JSON and returns the full
    * event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with a response body in the requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: Any, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as JSON and returns the
    * full `HttpResponse`.
    *
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request, with a response body in the
    * requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: Any, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Any, options: `5`): Observable_[T] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: `0`): Observable_[HttpEvent[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: `5`): Observable_[T] = js.native
  
  /**
    * Constructs a `PUT` request that interprets the body as JSON
    * and returns an observable of JavaScript object.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response as a JavaScript object.
    */
  def put(url: String): Observable_[js.Object] = js.native
  def put(url: String, body: Any): Observable_[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an `ArrayBuffer` and returns the
    * response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: Any, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: Any, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text string and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with a response body
    * of type string.
    */
  def put(
    url: String,
    body: Any,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def put(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: Any, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def put(url: String, body: Any, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as JSON and returns the full
    * event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request, with a response body of
    * type `Object`.
    */
  def put(url: String, body: Any, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an
    * `ArrayBuffer` and returns an observable of the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request, with the response body as an
    * `ArrayBuffer`.
    */
  def put(url: String, body: Any, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: Any, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text stream and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request, with a response body of type
    * string.
    */
  def put(url: String, body: Any, options: `3`): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as JSON and returns the full
    * HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request, with a response body
    * of type 'Object`.
    */
  def put(url: String, body: Any, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def put(url: String, body: Any, options: `5`): Observable_[js.Object] = js.native
  def put(url: String, body: Null, options: ContextHeadersObserveParamsReportProgress): Observable_[js.typedarray.ArrayBuffer] = js.native
  def put(url: String, body: Null, options: ContextHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  def put(
    url: String,
    body: Null,
    options: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpEvent[String]] = js.native
  def put(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseType): Observable_[Blob] = js.native
  def put(url: String, body: Null, options: HeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def put(url: String, body: Null, options: ObserveParamsReportProgressResponseTypeWithCredentials): Observable_[String] = js.native
  def put(url: String, body: Null, options: `0`): Observable_[HttpEvent[js.Object]] = js.native
  def put(url: String, body: Null, options: `1`): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  def put(url: String, body: Null, options: `2`): Observable_[HttpResponse[Blob]] = js.native
  def put(url: String, body: Null, options: `3`): Observable_[HttpResponse[String]] = js.native
  def put(url: String, body: Null, options: `4`): Observable_[HttpResponse[js.Object]] = js.native
  def put(url: String, body: Null, options: `5`): Observable_[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an instance of the requested type
    * and returns an observable of the requested type.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the requested type.
    */
  @JSName("put")
  def put_T[T](url: String): Observable_[T] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Any): Observable_[T] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as JSON and returns the
    * full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with a response body in the requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: Any, options: `0`): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an instance of the requested type and
    * returns the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: Any, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Any, options: `5`): Observable_[T] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: `0`): Observable_[HttpEvent[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: `4`): Observable_[HttpResponse[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: `5`): Observable_[T] = js.native
  
  /**
    * Constructs a request which interprets the body as a JavaScript object and returns the full
    * `HttpResponse` as a JavaScript object.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of type `Object`.
    */
  /**
    * Constructs a request where response type and requested observable are not known statically.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the requested response, with body of type `any`.
    */
  def request(method: String, url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a request that interprets the body as an `ArrayBuffer` and returns the response in
    * an `ArrayBuffer`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def request(method: String, url: String, options: Body): Observable_[js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a request which interprets the body as a `Blob` and returns the full `HttpResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: BodyContext): Observable_[HttpResponse[Blob]] = js.native
  /**
    * Constructs a request that interprets the body as a blob and returns
    * the response as a blob.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: Context): Observable_[Blob] = js.native
  /**
    * Constructs a request which interprets the body as a text stream and returns the full
    * `HttpResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the HTTP response, with the response body of type string.
    */
  def request(method: String, url: String, options: ContextHeaders): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a request that interprets the body as a text string and
    * returns a string value.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def request(method: String, url: String, options: Headers): Observable_[String] = js.native
  /**
    * Constructs a request which interprets the body as a JavaScript object and returns the full
    * `HttpResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`,
    * with the response body of type `Object`.
    */
  def request(method: String, url: String, options: HeadersObserve): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a request that interprets the body as an `ArrayBuffer` and returns the
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an array of `HttpEvent`s for
    * the request.
    */
  def request(method: String, url: String, options: Observe): Observable_[HttpEvent[js.typedarray.ArrayBuffer]] = js.native
  def request(method: String, url: String, options: ObserveParams): Observable_[js.Object] = js.native
  /**
    * Constructs a request that interprets the body as a `Blob` and returns
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: Params): Observable_[HttpEvent[Blob]] = js.native
  def request(method: String, url: String, options: ParamsReportProgress): Observable_[Any] = js.native
  /**
    * Constructs a request which interprets the body as a text string and returns the full event
    * stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body of type string.
    */
  def request(method: String, url: String, options: ReportProgress): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a request which interprets the body as a JavaScript object and returns the full
    * event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the  request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body of type `Object`.
    */
  def request(method: String, url: String, options: ResponseType): Observable_[HttpEvent[Any]] = js.native
  /**
    * Constructs a request which interprets the body as an `ArrayBuffer`
    * and returns the full `HttpResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body as an `ArrayBuffer`.
    */
  def request(method: String, url: String, options: WithCredentials): Observable_[HttpResponse[js.typedarray.ArrayBuffer]] = js.native
  /**
    * Sends an `HttpRequest` and returns a stream of `HttpEvent`s.
    *
    * @return An `Observable` of the response, with the response body as a stream of `HttpEvent`s.
    */
  def request[R](req: HttpRequest[Any]): Observable_[HttpEvent[R]] = js.native
  /**
    * Constructs a request which interprets the body as a JavaScript object
    * with the response body of the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HttpResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String): Observable_[R] = js.native
  /**
    * Constructs a request which interprets the body as a JavaScript object and returns
    * the full `HttpResponse` with the response body in the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the full `HttpResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: HeadersObserve): Observable_[HttpResponse[R]] = js.native
  @JSName("request")
  def request_R[R](method: String, url: String, options: ObserveParams): Observable_[R] = js.native
  /**
    * Constructs a request which interprets the body as a JavaScript object and returns the full
    * event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvent`s for the request,
    * with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: ResponseType): Observable_[HttpEvent[R]] = js.native
}
/* static members */
object HttpClient {
  
  @JSImport("@angular/common/http", "HttpClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http", "HttpClient.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HttpClient, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HttpClient, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "HttpClient.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[HttpClient] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[HttpClient]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
