package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreateVisualVariableParamsLegendOptions extends StObject {
  
  /**
    * Indicates whether to describe the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createVisualVariable)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createVisualVariable)
    */
  var title: js.UndefOr[String] = js.undefined
}
object colorCreateVisualVariableParamsLegendOptions {
  
  inline def apply(): colorCreateVisualVariableParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[colorCreateVisualVariableParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colorCreateVisualVariableParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
