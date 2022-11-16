package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) for a point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html)
  */
trait heatmap extends StObject {
  
  /**
    * Generates a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  def createRenderer(params: heatmapCreateRendererParams): js.Promise[HeatmapRendererResult]
  
  /**
    * Allows you to update the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) with opacity, making the low density areas of the heat map to fade out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#updateRenderer)
    */
  def updateRenderer(params: heatmapUpdateRendererParams): HeatmapRenderer
}
object heatmap {
  
  inline def apply(
    createRenderer: heatmapCreateRendererParams => js.Promise[HeatmapRendererResult],
    updateRenderer: heatmapUpdateRendererParams => HeatmapRenderer
  ): heatmap = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), updateRenderer = js.Any.fromFunction1(updateRenderer))
    __obj.asInstanceOf[heatmap]
  }
  
  extension [Self <: heatmap](x: Self) {
    
    inline def setCreateRenderer(value: heatmapCreateRendererParams => js.Promise[HeatmapRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
    
    inline def setUpdateRenderer(value: heatmapUpdateRendererParams => HeatmapRenderer): Self = StObject.set(x, "updateRenderer", js.Any.fromFunction1(value))
  }
}
