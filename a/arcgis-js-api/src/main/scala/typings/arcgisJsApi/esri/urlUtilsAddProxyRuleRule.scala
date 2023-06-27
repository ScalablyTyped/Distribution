package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait urlUtilsAddProxyRuleRule extends StObject {
  
  /**
  		 * The URL of the proxy.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
  		 */
  var proxyUrl: String
  
  /**
  		 * The URL prefix of the resources that should be accessed through the given proxy.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
  		 */
  var urlPrefix: String
}
object urlUtilsAddProxyRuleRule {
  
  inline def apply(proxyUrl: String, urlPrefix: String): urlUtilsAddProxyRuleRule = {
    val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any], urlPrefix = urlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlUtilsAddProxyRuleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: urlUtilsAddProxyRuleRule] (val x: Self) extends AnyVal {
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
  }
}
