package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeClassBreaksRendererResult extends StObject {
  
  /**
  		 * The ID of the basemap used to determine the optimal fill color of the features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var basemapId: String
  
  /**
  		 * Indicates whether the average color of the input view's basemap is `light` or `dark`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var basemapTheme: String
  
  /**
  		 * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var classBreaksResult: ClassBreaksResult
  
  /**
  		 * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var defaultValuesUsed: Boolean
  
  /**
  		 * The renderer object configured to best match the view's background and the spread of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var renderer: ClassBreaksRenderer
  
  /**
  		 * The size scheme used by the visual variables.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
  		 */
  var sizeScheme: SizeScheme
}
object sizeClassBreaksRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    classBreaksResult: ClassBreaksResult,
    defaultValuesUsed: Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme
  ): sizeClassBreaksRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], classBreaksResult = classBreaksResult.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeClassBreaksRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sizeClassBreaksRendererResult] (val x: Self) extends AnyVal {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setClassBreaksResult(value: ClassBreaksResult): Self = StObject.set(x, "classBreaksResult", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
  }
}
