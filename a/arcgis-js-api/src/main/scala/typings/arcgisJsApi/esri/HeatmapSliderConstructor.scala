package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapSliderConstructor
  extends StObject
     with Instantiable0[HeatmapSlider]
     with Instantiable1[/* properties */ HeatmapSliderProperties, HeatmapSlider] {
  
  /**
  		 * A convenience function used to create a HeatmapSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#HeatmapRendererResult) of the [heatmapRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#fromHeatmapRendererResult)
  		 */
  def fromHeatmapRendererResult(rendererResult: HeatmapRendererResult): HeatmapSlider = js.native
}
