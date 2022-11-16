package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configRequest extends StObject {
  
  /**
    * List of domain suffixes known to support https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var httpsDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * **Since:** 4.8  Allows developers to modify requests before or after they are sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var interceptors: js.UndefOr[js.Array[RequestInterceptor]] = js.undefined
  
  /**
    * Maximum number of characters allowed in the URL for HTTP GET requests made by [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html).
    *
    * @default 2000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var maxUrlLength: js.UndefOr[Double] = js.undefined
  
  /**
    * **Since:** 4.24  The fetch and image network request priority.
    *
    * @default high
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var priority: js.UndefOr[auto | high | low] = js.undefined
  
  /**
    * A proxy rule defines a proxy for a set of resources with an identical URL prefix.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyRules: js.UndefOr[js.Array[configRequestProxyRules]] = js.undefined
  
  /**
    * Resource proxy for your application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Number of milliseconds [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) will wait for response from a server.
    *
    * @default 60000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * **Since:** 4.9  Indicates whether cross origin requests made to the associated server should include credentials such as cookies and authorization headers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var trustedServers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * **Since:** 4.5  Indicates whether `esri/request` will request a credential from `IdentityManager`.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var useIdentity: js.UndefOr[Boolean] = js.undefined
}
object configRequest {
  
  inline def apply(): configRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configRequest]
  }
  
  extension [Self <: configRequest](x: Self) {
    
    inline def setHttpsDomains(value: js.Array[String]): Self = StObject.set(x, "httpsDomains", value.asInstanceOf[js.Any])
    
    inline def setHttpsDomainsUndefined: Self = StObject.set(x, "httpsDomains", js.undefined)
    
    inline def setHttpsDomainsVarargs(value: String*): Self = StObject.set(x, "httpsDomains", js.Array(value*))
    
    inline def setInterceptors(value: js.Array[RequestInterceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
    
    inline def setInterceptorsVarargs(value: RequestInterceptor*): Self = StObject.set(x, "interceptors", js.Array(value*))
    
    inline def setMaxUrlLength(value: Double): Self = StObject.set(x, "maxUrlLength", value.asInstanceOf[js.Any])
    
    inline def setMaxUrlLengthUndefined: Self = StObject.set(x, "maxUrlLength", js.undefined)
    
    inline def setPriority(value: auto | high | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProxyRules(value: js.Array[configRequestProxyRules]): Self = StObject.set(x, "proxyRules", value.asInstanceOf[js.Any])
    
    inline def setProxyRulesUndefined: Self = StObject.set(x, "proxyRules", js.undefined)
    
    inline def setProxyRulesVarargs(value: configRequestProxyRules*): Self = StObject.set(x, "proxyRules", js.Array(value*))
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrustedServers(value: js.Array[String]): Self = StObject.set(x, "trustedServers", value.asInstanceOf[js.Any])
    
    inline def setTrustedServersUndefined: Self = StObject.set(x, "trustedServers", js.undefined)
    
    inline def setTrustedServersVarargs(value: String*): Self = StObject.set(x, "trustedServers", js.Array(value*))
    
    inline def setUseIdentity(value: Boolean): Self = StObject.set(x, "useIdentity", value.asInstanceOf[js.Any])
    
    inline def setUseIdentityUndefined: Self = StObject.set(x, "useIdentity", js.undefined)
  }
}
