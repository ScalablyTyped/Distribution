package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRendererLegendOptions extends StObject {
  
  /**
    * The label used to describe max density areas in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#legendOptions)
    */
  var maxLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The label used to describe low density areas in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#legendOptions)
    */
  var minLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the variable driving the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}
object HeatmapRendererLegendOptions {
  
  inline def apply(): HeatmapRendererLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapRendererLegendOptions]
  }
  
  extension [Self <: HeatmapRendererLegendOptions](x: Self) {
    
    inline def setMaxLabel(value: String): Self = StObject.set(x, "maxLabel", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelUndefined: Self = StObject.set(x, "maxLabel", js.undefined)
    
    inline def setMinLabel(value: String): Self = StObject.set(x, "minLabel", value.asInstanceOf[js.Any])
    
    inline def setMinLabelUndefined: Self = StObject.set(x, "minLabel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
