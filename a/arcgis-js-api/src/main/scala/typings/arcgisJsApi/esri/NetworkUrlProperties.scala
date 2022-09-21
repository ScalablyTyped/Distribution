package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkUrlProperties extends StObject {
  
  /**
    * If true, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A url to any ArcGIS Server feature, map, or geoprocessing service that returns a JSON feature set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object NetworkUrlProperties {
  
  inline def apply(): NetworkUrlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkUrlProperties]
  }
  
  extension [Self <: NetworkUrlProperties](x: Self) {
    
    inline def setDoNotLocateOnRestrictedElements(value: Boolean): Self = StObject.set(x, "doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    inline def setDoNotLocateOnRestrictedElementsUndefined: Self = StObject.set(x, "doNotLocateOnRestrictedElements", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
