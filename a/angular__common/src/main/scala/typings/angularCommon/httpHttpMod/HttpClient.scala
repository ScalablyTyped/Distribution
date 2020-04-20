package typings.angularCommon.httpHttpMod

import typings.angularCommon.AnonBodyHeaders
import typings.angularCommon.AnonBodyHeadersObserve
import typings.angularCommon.AnonHeadersObserve
import typings.angularCommon.AnonHeadersObserveParams
import typings.angularCommon.AnonHeadersObserveParamsReportProgress
import typings.angularCommon.AnonHeadersObserveParamsReportProgressResponseType
import typings.angularCommon.AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.AnonObserve
import typings.angularCommon.AnonObserveParams
import typings.angularCommon.AnonObserveParamsReportProgress
import typings.angularCommon.AnonObserveParamsReportProgressResponseType
import typings.angularCommon.AnonObserveParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.AnonObserveResponseType
import typings.angularCommon.AnonParamsReportProgress
import typings.angularCommon.AnonParamsReportProgressBoolean
import typings.angularCommon.AnonParamsReportProgressResponseType
import typings.angularCommon.AnonParamsReportProgressResponseTypeWithCredentials
import typings.angularCommon.AnonReportProgress
import typings.angularCommon.AnonReportProgressBoolean
import typings.angularCommon.AnonReportProgressBooleanResponseType
import typings.angularCommon.AnonReportProgressResponseType
import typings.angularCommon.AnonReportProgressResponseTypeWithCredentials
import typings.angularCommon.AnonResponseType
import typings.angularCommon.AnonResponseTypeWithCredentials
import typings.angularCommon.AnonWithCredentials
import typings.angularCommon.AnonWithCredentialsBoolean
import typings.rxjs.mod.Observable_
import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpClient")
@js.native
class HttpClient protected () extends js.Object {
  def this(handler: HttpHandler) = this()
  var handler: js.Any = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
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
  def delete(url: String, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with the response
    *  body of type string.
    */
  def delete(url: String, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer` and returns
    *  the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`, with the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request,
    * with response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with response body of
    * type `Object`.
    */
  def delete(url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `DELETE` request the interprets the body as a JSON object and returns
    * the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Object`.
    *
    */
  def delete(url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request, with the response body as a
    * `Blob`.
    */
  def delete(url: String, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Blob`.
    */
  def delete(url: String, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def delete(url: String, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response body as a `Blob`.
    */
  def delete(url: String, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text stream and
    *  returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`, with the response body of type string.
    */
  def delete(url: String, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a DELETE request that interprets the body as a JSON object and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with response body in the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `DELETE`request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request, with a response
    * body in the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("delete")
  def delete_T[T](url: String, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    *
    * @return An `Observable` of the response body as a JSON object.
    */
  def get(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string
    * and returns the response as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string and returns
    * the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns
    *  the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request, with the response
    * body as an `ArrayBuffer`.
    */
  def get(url: String, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Object`.
    */
  def get(url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`,
    * with the response body of type `Object`.
    */
  def get(url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns the
    * response in an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    *  with the response body as a `Blob`.
    */
  def get(url: String, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def get(url: String, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob`
    * and returns the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text stream and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type string.
    */
  def get(url: String, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and returns
    * the response body in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("get")
  def get_T[T](url: String, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def head(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string and returns the response
    * as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def head(url: String, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all HttpEvents for the request, with the response body of type
    *     string.
    */
  def head(url: String, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer`
    *  and returns the full HTTP response.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an  `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of tall `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object
    * and returns the full HTTP event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with a response body of
    * type `Object`.
    */
  def head(url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type `Object`.
    */
  def head(url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer` and
    * returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def head(url: String, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a blob.
    */
  def head(url: String, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def head(url: String, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response, with the response body as a `Blob`.
    */
  def head(url: String, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as text stream
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type string.
    */
  def head(url: String, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a response body of the given type.
    */
  @JSName("head")
  def head_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the full event stream.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request
    * , with a response body in the requested type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    */
  @JSName("head")
  def head_T[T](url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a responmse body of the requested type.
    */
  @JSName("head")
  def head_T[T](url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("head")
  def head_T[T](url: String, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
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
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and returns the
    * response body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def options(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string and
    * returns a string value.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def options(url: String, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request,
    * with the response body of type string.
    */
  def options(url: String, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
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
  def options(url: String, options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvents` for the request with the response
    * body of type `Object`.
    */
  def options(url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type `Object`.
    */
  def options(url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an
    * `ArrayBuffer` and returns the response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def options(url: String, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob`
    *  and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    *  with the response body as a `Blob`.
    */
  def options(url: String, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def options(url: String, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def options(url: String, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as text stream
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    *  with the response body of type string.
    */
  def options(url: String, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and returns the
    * response in a given type.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HTTPResponse`, with a response body of the given type.
    */
  @JSName("options")
  def options_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("options")
  def options_T[T](url: String, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  def patch(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def patch(url: String, body: js.Any): Observable_[js.Object] = js.native
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
  def patch(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text string and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents`for the request, with a
    * response body of type string.
    */
  def patch(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    *  with the response body as an `ArrayBuffer`.
    */
  def patch(
    url: String,
    body: js.Any,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer` and
    *  returns the the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    * with a response body of type `Object`.
    */
  def patch(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  def patch(url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
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
  def patch(url: String, body: js.Any, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request, with the
    * response body as `Blob`.
    */
  def patch(url: String, body: js.Any, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def patch(url: String, body: js.Any, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def patch(url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
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
  def patch(url: String, body: js.Any, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text stream and returns the
    * full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body of type string.
    */
  def patch(url: String, body: js.Any, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  def patch(url: String, body: Null, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  def patch(url: String, body: Null, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  def patch(
    url: String,
    body: Null,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  def patch(url: String, body: Null, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  def patch(url: String, body: Null, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  def patch(url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  def patch(url: String, body: Null, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  def patch(url: String, body: Null, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def patch(url: String, body: Null, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def patch(url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  def patch(url: String, body: Null, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  def patch(url: String, body: Null, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  @JSName("patch")
  def patch_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
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
  def patch_T[T](url: String, body: js.Any): Observable_[T] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    *  with a response body in the requested type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the given type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  def post(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a
    * JSON object and returns the response body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def post(url: String, body: js.Any): Observable_[js.Object] = js.native
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
  def post(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text string and returns the full
    * event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with a response body of type string.
    */
  def post(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a POST request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HTTPresponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request, with the response body as an
    *     `ArrayBuffer`.
    */
  def post(
    url: String,
    body: js.Any,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a POST request that interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with a response body of type `Object`.
    */
  def post(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body of type
    * `Object`.
    */
  def post(url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
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
  def post(url: String, body: js.Any, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob`
    * and returns the response in an observable of the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request, with the response body as `Blob`.
    */
  def post(url: String, body: js.Any, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a `Blob`.
    */
  def post(url: String, body: js.Any, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def post(url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
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
  def post(url: String, body: js.Any, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text stream and returns
    * the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request,
    * with a response body of type string.
    */
  def post(url: String, body: js.Any, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  def post(url: String, body: Null, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  def post(url: String, body: Null, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  def post(
    url: String,
    body: Null,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  def post(url: String, body: Null, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  def post(url: String, body: Null, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  def post(url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  def post(url: String, body: Null, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  def post(url: String, body: Null, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def post(url: String, body: Null, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def post(url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  def post(url: String, body: Null, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  def post(url: String, body: Null, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  @JSName("post")
  def post_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object
    * and returns an observable of the response.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request, with a response body in the
    *     requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any): Observable_[T] = js.native
  /**
    * Constructs a POST request that interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object and returns the full
    * `HTTPResponse`.
    *
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body in the
    *     requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  def put(url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the response
    * body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def put(url: String, body: js.Any): Observable_[js.Object] = js.native
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
  def put(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text string and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all HttpEvents for the request, with a response body
    * of type string.
    */
  def put(url: String, body: js.Any, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an
    * `ArrayBuffer` and returns an observable of the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with the response body as an
    *     `ArrayBuffer`.
    */
  def put(
    url: String,
    body: js.Any,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request, with a response body of
    * type `Object`.
    */
  def put(url: String, body: js.Any, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full HTTP
    * response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body
    * of type 'Object`.
    */
  def put(url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
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
  def put(url: String, body: js.Any, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the full event
    * stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: js.Any, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: js.Any, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def put(url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
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
  def put(url: String, body: js.Any, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text stream and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body of type
    *     string.
    */
  def put(url: String, body: js.Any, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  def put(url: String, body: Null, options: AnonHeadersObserveParamsReportProgress): Observable_[String] = js.native
  def put(url: String, body: Null, options: AnonHeadersObserveParamsReportProgressResponseType): Observable_[HttpEvent[String]] = js.native
  def put(
    url: String,
    body: Null,
    options: AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials
  ): Observable_[HttpResponse[ArrayBuffer]] = js.native
  def put(url: String, body: Null, options: AnonObserveParamsReportProgressResponseType): Observable_[HttpEvent[ArrayBuffer]] = js.native
  def put(url: String, body: Null, options: AnonObserveParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[js.Object]] = js.native
  def put(url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[js.Object]] = js.native
  def put(url: String, body: Null, options: AnonParamsReportProgressResponseType): Observable_[ArrayBuffer] = js.native
  def put(url: String, body: Null, options: AnonParamsReportProgressResponseTypeWithCredentials): Observable_[HttpEvent[Blob]] = js.native
  def put(url: String, body: Null, options: AnonReportProgressBoolean): Observable_[HttpResponse[Blob]] = js.native
  def put(url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[js.Object] = js.native
  def put(url: String, body: Null, options: AnonReportProgressResponseTypeWithCredentials): Observable_[Blob] = js.native
  def put(url: String, body: Null, options: AnonWithCredentialsBoolean): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the
    * full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  def put[T](url: String, body: js.Any, options: AnonObserveResponseType): Observable_[HttpEvent[T]] = js.native
  def put[T](url: String, body: Null, options: AnonObserveResponseType): Observable_[HttpEvent[T]] = js.native
  @JSName("put")
  def put_T[T](url: String): Observable_[T] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object
    * and returns an observable of the response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body in the
    *     requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: js.Any): Observable_[T] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full HTTP
    * response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: js.Any, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: js.Any, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: AnonParamsReportProgressBoolean): Observable_[HttpResponse[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: AnonReportProgressBooleanResponseType): Observable_[T] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full
    * `HTTPResponse` as a JSON object.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Object`.
    */
  /**
    * Constructs a request where response type and requested observable are not known statically.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the reuested response, wuth body of type `any`.
    */
  def request(method: String, url: String): Observable_[js.Object] = js.native
  /**
    * Constructs a request that interprets the body as a `Blob` and returns
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of of all `HttpEvents` for the request,
    * with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: AnonBodyHeaders): Observable_[HttpEvent[Blob]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full
    * `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`,
    * with the response body of type `Object`.
    */
  def request(method: String, url: String, options: AnonBodyHeadersObserve): Observable_[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a request which interprets the body as a text string and returns the full event
    * stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the reques,
    * with the response body of type string.
    */
  def request(method: String, url: String, options: AnonHeadersObserve): Observable_[HttpEvent[String]] = js.native
  def request(method: String, url: String, options: AnonHeadersObserveParams): Observable_[js.Object] = js.native
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
  def request(method: String, url: String, options: AnonObserve): Observable_[ArrayBuffer] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the  request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    *  with the response body of type `Object`.
    */
  def request(method: String, url: String, options: AnonObserveParams): Observable_[HttpEvent[_]] = js.native
  def request(method: String, url: String, options: AnonObserveParamsReportProgress): Observable_[_] = js.native
  /**
    * Constructs a request which interprets the body as an `ArrayBuffer`
    * and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body as an `ArrayBuffer`.
    */
  def request(method: String, url: String, options: AnonParamsReportProgress): Observable_[HttpResponse[ArrayBuffer]] = js.native
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
  def request(method: String, url: String, options: AnonReportProgress): Observable_[Blob] = js.native
  /**
    * Constructs a request which interprets the body as a `Blob` and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: AnonReportProgressResponseType): Observable_[HttpResponse[Blob]] = js.native
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
  def request(method: String, url: String, options: AnonResponseType): Observable_[String] = js.native
  /**
    * Constructs a request which interprets the body as a text stream and returns the full
    * `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the HTTP response, with the response body of type string.
    */
  def request(method: String, url: String, options: AnonResponseTypeWithCredentials): Observable_[HttpResponse[String]] = js.native
  /**
    * Constructs a request that interprets the body as an `ArrayBuffer` and returns the
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an array of `HTTPEvents` for
    *     the
    * request.
    */
  def request(method: String, url: String, options: AnonWithCredentials): Observable_[HttpEvent[ArrayBuffer]] = js.native
  /**
    * Sends an `HTTPRequest` and returns a stream of `HTTPEvents`.
    *
    * @return An `Observable` of the response, with the response body as a stream of `HTTPEvents`.
    */
  def request[R](req: HttpRequest[_]): Observable_[HttpEvent[R]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object
    * with the response body of the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String): Observable_[R] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns
    * the full `HTTPResponse` with the response body in the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the full `HTTPResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: AnonBodyHeadersObserve): Observable_[HttpResponse[R]] = js.native
  @JSName("request")
  def request_R[R](method: String, url: String, options: AnonHeadersObserveParams): Observable_[R] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full event
    * stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: AnonObserveParams): Observable_[HttpEvent[R]] = js.native
}

