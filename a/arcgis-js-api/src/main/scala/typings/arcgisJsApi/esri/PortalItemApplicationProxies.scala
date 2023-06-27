package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemApplicationProxies extends StObject {
  
  /**
  		 * The proxy ID registered in ArcGIS Online or ArcGIS Enterprise Portal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
  		 */
  var proxyId: String
  
  /**
  		 * The proxy URL for the source URL.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
  		 */
  var proxyUrl: String
  
  /**
  		 * The URL of the premium map service layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
  		 */
  var sourceUrl: String
}
object PortalItemApplicationProxies {
  
  inline def apply(proxyId: String, proxyUrl: String, sourceUrl: String): PortalItemApplicationProxies = {
    val __obj = js.Dynamic.literal(proxyId = proxyId.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemApplicationProxies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalItemApplicationProxies] (val x: Self) extends AnyVal {
    
    inline def setProxyId(value: String): Self = StObject.set(x, "proxyId", value.asInstanceOf[js.Any])
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
  }
}
