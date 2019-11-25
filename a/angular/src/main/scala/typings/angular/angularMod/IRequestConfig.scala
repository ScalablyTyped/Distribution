package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventListenerOrEventListenerObject
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
  var eventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.undefined
  /**
    * HTTP method (e.g. 'GET', 'POST', etc)
    */
  var method: String
  /**
    * Event listeners to be bound to the XMLHttpRequest upload object.
    * To bind events to the XMLHttpRequest object, use eventHandlers. The handler will be called in the context of a $apply block.
    */
  var uploadEventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.undefined
  /**
    * Absolute or relative URL of the resource that is being requested.
    */
  var url: String
}

object IRequestConfig {
  @scala.inline
  def apply(
    method: String,
    url: String,
    cache: js.Any = null,
    data: js.Any = null,
    eventHandlers: StringDictionary[EventListenerOrEventListenerObject] = null,
    headers: IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: String = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    params: js.Any = null,
    responseType: String = null,
    timeout: Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    uploadEventHandlers: StringDictionary[EventListenerOrEventListenerObject] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): IRequestConfig = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam.asInstanceOf[js.Any])
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (uploadEventHandlers != null) __obj.updateDynamic("uploadEventHandlers")(uploadEventHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestConfig]
  }
}

