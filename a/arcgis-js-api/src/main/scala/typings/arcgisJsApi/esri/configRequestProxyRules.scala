package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configRequestProxyRules extends StObject {
  
  /**
    * The URL of the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  /**
    * URL prefix for resources that need to be accessed through a specific proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var urlPrefix: js.UndefOr[String] = js.undefined
}
object configRequestProxyRules {
  
  inline def apply(): configRequestProxyRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configRequestProxyRules]
  }
  
  extension [Self <: configRequestProxyRules](x: Self) {
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
    
    inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
  }
}
