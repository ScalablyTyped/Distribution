package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerProperties
  extends StObject
     with LayerProperties
     with ArcGISCachedServiceProperties
     with PortalLayerProperties {
  
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
    * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object ElevationLayerProperties {
  
  inline def apply(): ElevationLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
