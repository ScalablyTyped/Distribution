package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeCreateAgeRendererParamsLegendOptions extends StObject {
  
  /**
    * Indicates whether to include the age renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createAgeRenderer)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title used to represent the age size ramp in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createAgeRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}
object sizeCreateAgeRendererParamsLegendOptions {
  
  inline def apply(): sizeCreateAgeRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sizeCreateAgeRendererParamsLegendOptions]
  }
  
  extension [Self <: sizeCreateAgeRendererParamsLegendOptions](x: Self) {
    
    inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
