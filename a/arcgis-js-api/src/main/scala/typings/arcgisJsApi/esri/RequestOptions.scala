package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-prompt`
import typings.arcgisJsApi.arcgisJsApiStrings.anonymous
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.blob
import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.image
import typings.arcgisJsApi.arcgisJsApiStrings.immediate
import typings.arcgisJsApi.arcgisJsApiStrings.json
import typings.arcgisJsApi.arcgisJsApiStrings.post
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import typings.std.AbortSignal
import typings.std.FormData
import typings.std.HTMLFormElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends Object {
  /**
    * Indicates if and how requests to ArcGIS Services are authenticated. Only applicable when [`esriConfig.request.useIdentity = true`](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request).
    *
    * | Known Value | Description |
    * |-------------|-------------|
    * | auto |  The user will be signed in when a secure resource is requested. |
    * | anonymous | An error will be returned when a secure resource is requested. |
    * | immediate | The user will be signed in before the resource is requested. |
    * | no-prompt | Checks for whether the user is already signed in. If so, no additional prompts display for sign-in. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var authMode: js.UndefOr[auto | anonymous | immediate | `no-prompt`] = js.undefined
  /**
    * If uploading a file, specify the form data or element used to submit the file here. If specified, the parameters of the `query` will be added to the URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[FormData | HTMLFormElement | String] = js.undefined
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache. If `false`, the browser's default cache handling will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[Boolean] = js.undefined
  /**
    * Headers to use for the request. This is an object whose property names are header names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates if the request should be made using the HTTP POST method. By default, this is determined automatically based on the request size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[auto | post] = js.undefined
  /**
    * Query parameters for the request. The query parameters will be added to the URL if: a GET request is used, or if the `body` property is set. Otherwise, the query parameters will be added to the body request parameters if: the `body` property is not set, and a POST request is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * Response format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var responseType: js.UndefOr[json | xml | text | blob | `array-buffer` | document | image] = js.undefined
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).  Example:
    * ```js
    * const controller = new AbortController();
    * const signal = controller.signal;
    *
    * esriRequest(url, { signal })
    *   .then((response) => {
    *     // The request went OK
    *   })
    *   .catch((err) => {
    *     if (err.name === 'AbortError') {
    *       console.log('Request aborted');
    *     } else {
    *       console.error('Error encountered', err);
    *     }
    *   });
    *
    * // Abort requests that are aware of the controller's signal
    * controller.abort();
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server. Set to `0` to wait for the response indefinitely.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the request should use the proxy. By default this is determined automatically based on the domain of the request URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    authMode: auto | anonymous | immediate | `no-prompt` = null,
    body: FormData | HTMLFormElement | String = null,
    cacheBust: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    method: auto | post = null,
    query: js.Any = null,
    responseType: json | xml | text | blob | `array-buffer` | document | image = null,
    signal: AbortSignal = null,
    timeout: Int | Double = null,
    useProxy: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (authMode != null) __obj.updateDynamic("authMode")(authMode.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheBust)) __obj.updateDynamic("cacheBust")(cacheBust.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useProxy)) __obj.updateDynamic("useProxy")(useProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

