package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configRequest
  extends stdLib.Object {
  /**
    * List of domain suffixes known to support https. This will automatically upgrade requests made to such domains to use https instead of http when the application is not running on http. Note that port numbers should not be included in the domain suffix to be matched.  If no `httpsDomains` list exists , the API redirects all calls using https. If the list exists and a domain of a required http resource is not listed, the API sends the URL as it is specified within the code. Likewise, if the list exists and the domain of a required http resource is listed in it, the API sends an https request to that resource.  The list includes the following domain suffixes by default:
    *   * `arcgis.com`
    *   * `arcgisonline.com`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var httpsDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * **Since:** 4.8 Allows developers to modify requests before or after they are sent. The first interceptor that matches the request URL will be used.  Example:
    * ```js
    * const featureLayerUrl = "http://sampleserver6.arcgisonline.com/arcgis/rest/services/USA/MapServer/0";
    *
    * esriConfig.request.interceptors.push({
    *   // set the `urls` property to the URL of the FeatureLayer so that this
    *   // interceptor only applies to requests made to the FeatureLayer URL
    *   urls: featureLayerUrl,
    *   // use the BeforeInterceptorCallback to check if the query of the
    *   // FeatureLayer has a maxAllowableOffset property set.
    *   // if so, then set the maxAllowableOffset to 0
    *   before: function(params) {
    *     if (params.requestOptions.query.maxAllowableOffset) {
    *       params.requestOptions.query.maxAllowableOffset = 0;
    *     }
    *   },
    *   // use the AfterInterceptorCallback to check if `ssl` is set to 'true'
    *   // on the response to the request, if it's set to 'false', change
    *   // the value to 'true' before returning the response
    *   after: function(response) {
    *     if (!response.ssl) {
    *       response.ssl = true;
    *     }
    *   }
    * });
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var interceptors: js.UndefOr[js.Array[RequestInterceptor]] = js.undefined
  /**
    * Maximum number of characters allowed in the URL for HTTP GET requests made by [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html). If this limit is exceeded, HTTP POST method will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    *
    * @default 2000
    */
  var maxUrlLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * A proxy rule defines a proxy for a set of resources with an identical URL prefix. When using [esriRequest](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html), if a target URL matches a rule, then the request will be sent to the specified proxy. Rather than populating this array directly, use the urlUtils.addProxyRule() method. Rule objects have the following properties:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyRules: js.UndefOr[js.Array[configRequestProxyRules]] = js.undefined
  /**
    * Resource proxy for your application. It is used by the library when communicating with a web server hosted on a domain that is different from the domain where your application is hosted.  The library may or may not use the proxy depending on the type of request made, whether the server support CORS, whether the application is being run on older versions of browsers etc. To keep it simple, it is recommended that you always configure a resource proxy for your application.  You can download the resource proxy from this [GitHub repo](https://github.com/Esri/resource-proxy).
    * ```js
    * require(["esri/config"], function(esriConfig) {
    *   esriConfig.request.proxyUrl = "/resource-proxy/Java/proxy.jsp";
    * });
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of milliseconds [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) will wait for response from a server. If a server fails to respond before this time expires, then the request is considered to have encountered an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    *
    * @default 60000
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Since:** 4.9 Indicates whether cross origin requests made to the associated server should include credentials such as cookies and authorization headers.
    * ```js
    * require(["esri/config"], function(esriConfig) {
    *   esriConfig.request.trustedServers.push("[<protocol>//]<hostname>.<domain>[:<port>]");
    * });
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var trustedServers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * **Since:** 4.5 Indicates whether `esri/request` will request a credential from `IdentityManager`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    *
    * @default true
    */
  var useIdentity: js.UndefOr[scala.Boolean] = js.undefined
}

object configRequest {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    httpsDomains: js.Array[java.lang.String] = null,
    interceptors: js.Array[RequestInterceptor] = null,
    maxUrlLength: scala.Int | scala.Double = null,
    proxyRules: js.Array[configRequestProxyRules] = null,
    proxyUrl: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    trustedServers: js.Array[java.lang.String] = null,
    useIdentity: js.UndefOr[scala.Boolean] = js.undefined
  ): configRequest = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (httpsDomains != null) __obj.updateDynamic("httpsDomains")(httpsDomains)
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    if (maxUrlLength != null) __obj.updateDynamic("maxUrlLength")(maxUrlLength.asInstanceOf[js.Any])
    if (proxyRules != null) __obj.updateDynamic("proxyRules")(proxyRules)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (trustedServers != null) __obj.updateDynamic("trustedServers")(trustedServers)
    if (!js.isUndefined(useIdentity)) __obj.updateDynamic("useIdentity")(useIdentity)
    __obj.asInstanceOf[configRequest]
  }
}

