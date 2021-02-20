package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) for a point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html)
  */
@js.native
trait heatmap extends StObject {
  
  /**
    * Generates a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  def createRenderer(params: heatmapCreateRendererParams): js.Promise[HeatmapRendererResult] = js.native
}
object heatmap {
  
  @scala.inline
  def apply(createRenderer: heatmapCreateRendererParams => js.Promise[HeatmapRendererResult]): heatmap = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[heatmap]
  }
  
  @scala.inline
  implicit class heatmapMutableBuilder[Self <: heatmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRenderer(value: heatmapCreateRendererParams => js.Promise[HeatmapRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
