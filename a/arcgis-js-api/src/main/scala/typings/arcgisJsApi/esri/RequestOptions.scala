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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with Object {
  
  /**
    * Indicates if and how requests to ArcGIS Services are authenticated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var authMode: js.UndefOr[auto | anonymous | immediate | `no-prompt`] = js.undefined
  
  /**
    * If uploading a file, specify the form data or element used to submit the file here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[FormData | HTMLFormElement | String] = js.undefined
  
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Headers to use for the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Indicates if the request should be made using the HTTP POST method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[auto | post] = js.undefined
  
  /**
    * Query parameters for the request.
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
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the request should use the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[Boolean] = js.undefined
}
object RequestOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setAuthMode(value: auto | anonymous | immediate | `no-prompt`): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    inline def setBody(value: FormData | HTMLFormElement | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCacheBust(value: Boolean): Self = StObject.set(x, "cacheBust", value.asInstanceOf[js.Any])
    
    inline def setCacheBustUndefined: Self = StObject.set(x, "cacheBust", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: auto | post): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResponseType(value: json | xml | text | blob | `array-buffer` | document | image): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
    
    inline def setUseProxyUndefined: Self = StObject.set(x, "useProxy", js.undefined)
  }
}
