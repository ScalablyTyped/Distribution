package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsGetDisplayedSymbolOptions extends StObject {
  
  /**
  		 * The renderer of the layer associated with the `graphic`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
  		 */
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  /**
  		 * The [resolution](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resolution) of the view at which the symbol is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
  		 */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [view scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) at which the symbol is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
  		 */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The spatial reference of the view in which the symbol is displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
  		 */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  
  /**
  		 * The [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) of the view, if the symbol is displayed in a SceneView.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
  		 */
  var viewingMode: js.UndefOr[String] = js.undefined
}
object symbolUtilsGetDisplayedSymbolOptions {
  
  inline def apply(): symbolUtilsGetDisplayedSymbolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsGetDisplayedSymbolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsGetDisplayedSymbolOptions] (val x: Self) extends AnyVal {
    
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
