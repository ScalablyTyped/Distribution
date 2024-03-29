package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipCreateRendererParamsLegendOptions extends StObject {
  
  /**
  		 * Indicates whether to include the renderer in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
  		 */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The title used to describe the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object relationshipCreateRendererParamsLegendOptions {
  
  inline def apply(): relationshipCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[relationshipCreateRendererParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: relationshipCreateRendererParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
