package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariableLegendOptions extends StObject {
  
  /**
    * Indicates whether to show the visual variable in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title describing the visualization of the visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}
object VisualVariableLegendOptions {
  
  inline def apply(): VisualVariableLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualVariableLegendOptions]
  }
  
  extension [Self <: VisualVariableLegendOptions](x: Self) {
    
    inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
