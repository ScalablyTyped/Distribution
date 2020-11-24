package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
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
  implicit class configRequestOps[Self <: configRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpsDomainsVarargs(value: String*): Self = this.set("httpsDomains", js.Array(value :_*))
    
    @scala.inline
    def setHttpsDomains(value: js.Array[String]): Self = this.set("httpsDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsDomains: Self = this.set("httpsDomains", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: RequestInterceptor*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[RequestInterceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
    
    @scala.inline
    def setMaxUrlLength(value: Double): Self = this.set("maxUrlLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUrlLength: Self = this.set("maxUrlLength", js.undefined)
    
    @scala.inline
    def setProxyRulesVarargs(value: configRequestProxyRules*): Self = this.set("proxyRules", js.Array(value :_*))
    
    @scala.inline
    def setProxyRules(value: js.Array[configRequestProxyRules]): Self = this.set("proxyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyRules: Self = this.set("proxyRules", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTrustedServersVarargs(value: String*): Self = this.set("trustedServers", js.Array(value :_*))
    
    @scala.inline
    def setTrustedServers(value: js.Array[String]): Self = this.set("trustedServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustedServers: Self = this.set("trustedServers", js.undefined)
    
    @scala.inline
    def setUseIdentity(value: Boolean): Self = this.set("useIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIdentity: Self = this.set("useIdentity", js.undefined)
  }
}
