package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialViewPropertiesProperties extends StObject {
  
  /**
  		 * The background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#background)
  		 */
  var background: js.UndefOr[ColorBackgroundProperties] = js.undefined
  
  /**
  		 * The spatial reference of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The initial viewpoint of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint)
  		 */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}
object InitialViewPropertiesProperties {
  
  inline def apply(): InitialViewPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialViewPropertiesProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialViewPropertiesProperties] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: ColorBackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
