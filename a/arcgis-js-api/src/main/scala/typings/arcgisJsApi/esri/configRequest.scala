package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait configRequest extends Object {
  
  /**
    * List of domain suffixes known to support https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var httpsDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * **Since:** 4.8 Allows developers to modify requests before or after they are sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var interceptors: js.UndefOr[js.Array[RequestInterceptor]] = js.native
  
  /**
    * Maximum number of characters allowed in the URL for HTTP GET requests made by [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var maxUrlLength: js.UndefOr[Double] = js.native
  
  /**
    * A proxy rule defines a proxy for a set of resources with an identical URL prefix.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyRules: js.UndefOr[js.Array[configRequestProxyRules]] = js.native
  
  /**
    * Resource proxy for your application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[String] = js.native
  
  /**
    * Number of milliseconds [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) will wait for response from a server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * **Since:** 4.9 Indicates whether cross origin requests made to the associated server should include credentials such as cookies and authorization headers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var trustedServers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * **Since:** 4.5 Indicates whether `esri/request` will request a credential from `IdentityManager`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var useIdentity: js.UndefOr[Boolean] = js.native
}
object configRequest {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configRequest = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configRequest]
  }
  
  @scala.inline
  implicit class configRequestMutableBuilder[Self <: configRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpsDomains(value: js.Array[String]): Self = StObject.set(x, "httpsDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsDomainsUndefined: Self = StObject.set(x, "httpsDomains", js.undefined)
    
    @scala.inline
    def setHttpsDomainsVarargs(value: String*): Self = StObject.set(x, "httpsDomains", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[RequestInterceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: RequestInterceptor*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    
    @scala.inline
    def setMaxUrlLength(value: Double): Self = StObject.set(x, "maxUrlLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUrlLengthUndefined: Self = StObject.set(x, "maxUrlLength", js.undefined)
    
    @scala.inline
    def setProxyRules(value: js.Array[configRequestProxyRules]): Self = StObject.set(x, "proxyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyRulesUndefined: Self = StObject.set(x, "proxyRules", js.undefined)
    
    @scala.inline
    def setProxyRulesVarargs(value: configRequestProxyRules*): Self = StObject.set(x, "proxyRules", js.Array(value :_*))
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTrustedServers(value: js.Array[String]): Self = StObject.set(x, "trustedServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedServersUndefined: Self = StObject.set(x, "trustedServers", js.undefined)
    
    @scala.inline
    def setTrustedServersVarargs(value: String*): Self = StObject.set(x, "trustedServers", js.Array(value :_*))
    
    @scala.inline
    def setUseIdentity(value: Boolean): Self = StObject.set(x, "useIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseIdentityUndefined: Self = StObject.set(x, "useIdentity", js.undefined)
  }
}
