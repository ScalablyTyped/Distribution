package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedValues extends js.Object {
  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see How CloudFront Forwards, Caches, and Logs Cookies in the Amazon CloudFront Developer Guide.
    */
  var Cookies: CookiePreference
  /**
    * A complex type that specifies the Headers, if any, that you want CloudFront to base caching on for this cache behavior. 
    */
  var Headers: js.UndefOr[Headers] = js.undefined
  /**
    * Indicates whether you want CloudFront to forward query strings to the origin that is associated with this cache behavior and cache based on the query string parameters. CloudFront behavior depends on the value of QueryString and on the values that you specify for QueryStringCacheKeys, if any: If you specify true for QueryString and you don't specify any values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin and caches based on all query string parameters. Depending on how many query string parameters and values you have, this can adversely affect performance because CloudFront must forward more requests to the origin. If you specify true for QueryString and you specify one or more values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin, but it only caches based on the query string parameters that you specify. If you specify false for QueryString, CloudFront doesn't forward any query string parameters to the origin, and doesn't cache based on query string parameters. For more information, see Configuring CloudFront to Cache Based on Query String Parameters in the Amazon CloudFront Developer Guide.
    */
  var QueryString: scala.Boolean
  /**
    * A complex type that contains information about the query string parameters that you want CloudFront to use for caching for this cache behavior.
    */
  var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined
}

object ForwardedValues {
  @scala.inline
  def apply(
    Cookies: CookiePreference,
    QueryString: scala.Boolean,
    Headers: Headers = null,
    QueryStringCacheKeys: QueryStringCacheKeys = null
  ): ForwardedValues = {
    val __obj = js.Dynamic.literal(Cookies = Cookies, QueryString = QueryString)
    if (Headers != null) __obj.updateDynamic("Headers")(Headers)
    if (QueryStringCacheKeys != null) __obj.updateDynamic("QueryStringCacheKeys")(QueryStringCacheKeys)
    __obj.asInstanceOf[ForwardedValues]
  }
}

