package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsGetDisplayedColorOptions extends StObject {
  
  /**
  		 * The renderer of the layer associated with the `graphic`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedColor)
  		 */
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  /**
  		 * The [resolution](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resolution) of the view at which the graphic is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedColor)
  		 */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [view scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) at which the graphic is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedColor)
  		 */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The spatial reference of the view in which the graphic is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedColor)
  		 */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  
  /**
  		 * The [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) of the view, if the graphic is displayed in a SceneView.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedColor)
  		 */
  var viewingMode: js.UndefOr[String] = js.undefined
}
object symbolUtilsGetDisplayedColorOptions {
  
  inline def apply(): symbolUtilsGetDisplayedColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsGetDisplayedColorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsGetDisplayedColorOptions] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setViewingMode(value: String): Self = StObject.set(x, "viewingMode", value.asInstanceOf[js.Any])
    
    inline def setViewingModeUndefined: Self = StObject.set(x, "viewingMode", js.undefined)
  }
}
