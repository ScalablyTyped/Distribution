package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends stdLib.Object {
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
  var authMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If uploading a file, specify the form data or element used to submit the file here. If specified, the parameters of the `query` will be added to the URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[stdLib.FormData | stdLib.HTMLFormElement | java.lang.String] = js.undefined
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache. If `false`, the browser's default cache handling will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Headers to use for the request. This is an object whose property names are header names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates if the request should be made using the HTTP POST method. By default, this is determined automatically based on the request size.  **Possible Values:** auto | post
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Query parameters for the request. The query parameters will be added to the URL if: a GET request is used, or if the `body` property is set. Otherwise, the query parameters will be added to the body request parameters if: the `body` property is not set, and a POST request is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * Response format.  **Possible Values:** json | xml | text | blob | array-buffer | document | image
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
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
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server. Set to `0` to wait for the response indefinitely.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the request should use the proxy. By default this is determined automatically based on the domain of the request URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    authMode: java.lang.String = null,
    body: stdLib.FormData | stdLib.HTMLFormElement | java.lang.String = null,
    cacheBust: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null,
    method: java.lang.String = null,
    query: js.Any = null,
    responseType: java.lang.String = null,
    signal: stdLib.AbortSignal = null,
    timeout: scala.Int | scala.Double = null,
    useProxy: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (authMode != null) __obj.updateDynamic("authMode")(authMode)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheBust)) __obj.updateDynamic("cacheBust")(cacheBust)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (query != null) __obj.updateDynamic("query")(query)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useProxy)) __obj.updateDynamic("useProxy")(useProxy)
    __obj.asInstanceOf[RequestOptions]
  }
}

