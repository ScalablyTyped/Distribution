package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapService extends StObject {
  
  /**
  		 * Indicates the layer's supported capabilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
  		 */
  val capabilities: ArcGISMapServiceCapabilities
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
  		 */
  var copyright: String
  
  /**
  		 * The full extent of the layer as defined by the map service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
  		 */
  var fullExtent: Extent
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
  		 */
  var legendEnabled: Boolean
  
  /**
  		 * The spatial reference of the layer as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
  		 */
  val spatialReference: SpatialReference
  
  /**
  		 * The version of ArcGIS Server in which the map service is published.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
  		 */
  val version: Double
}
object ArcGISMapService {
  
  inline def apply(
    capabilities: ArcGISMapServiceCapabilities,
    copyright: String,
    fullExtent: Extent,
    legendEnabled: Boolean,
    spatialReference: SpatialReference,
    version: Double
  ): ArcGISMapService = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], fullExtent = fullExtent.asInstanceOf[js.Any], legendEnabled = legendEnabled.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISMapService] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: ArcGISMapServiceCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setFullExtent(value: Extent): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
