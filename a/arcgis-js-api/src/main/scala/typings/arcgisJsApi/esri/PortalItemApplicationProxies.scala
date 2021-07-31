package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemApplicationProxies
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    proxyId: String,
    proxyUrl: String,
    sourceUrl: String
  ): PortalItemApplicationProxies = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), proxyId = proxyId.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemApplicationProxies]
  }
  
  @scala.inline
  implicit class PortalItemApplicationProxiesMutableBuilder[Self <: PortalItemApplicationProxies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyId(value: String): Self = StObject.set(x, "proxyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
  }
}
