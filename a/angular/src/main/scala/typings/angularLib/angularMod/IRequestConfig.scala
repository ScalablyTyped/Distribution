package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
trait IRequestConfig extends IRequestShortcutConfig {
  /**
    * Event listeners to be bound to the XMLHttpRequest object.
    * To bind events to the XMLHttpRequest upload object, use uploadEventHandlers. The handler will be called in the context of a $apply block.
    */
  var eventHandlers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject]
  ] = js.undefined
  /**
    * HTTP method (e.g. 'GET', 'POST', etc)
    */
  var method: java.lang.String
  /**
    * Event listeners to be bound to the XMLHttpRequest upload object.
    * To bind events to the XMLHttpRequest object, use eventHandlers. The handler will be called in the context of a $apply block.
    */
  var uploadEventHandlers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject]
  ] = js.undefined
  /**
    * Absolute or relative URL of the resource that is being requested.
    */
  var url: java.lang.String
}

object IRequestConfig {
  @scala.inline
  def apply(
    method: java.lang.String,
    url: java.lang.String,
    cache: js.Any = null,
    data: js.Any = null,
    eventHandlers: org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject] = null,
    headers: IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: java.lang.String = null,
    paramSerializer: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]) = null,
    params: js.Any = null,
    responseType: java.lang.String = null,
    timeout: scala.Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    uploadEventHandlers: org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
  ): IRequestConfig = {
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (uploadEventHandlers != null) __obj.updateDynamic("uploadEventHandlers")(uploadEventHandlers)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[IRequestConfig]
  }
}

