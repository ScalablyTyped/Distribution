package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HeatmapRendererResult
import typings.arcgisJsApi.esri.HeatmapSlider
import typings.arcgisJsApi.esri.HeatmapSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingHeatmapSliderMod {
  
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  /**
  		 * The HeatmapSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html)
  		 */
  open class ^ ()
    extends StObject
       with HeatmapSlider {
    def this(properties: HeatmapSliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create a HeatmapSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#HeatmapRendererResult) of the [heatmapRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#fromHeatmapRendererResult)
  		 */
  inline def fromHeatmapRendererResult(rendererResult: HeatmapRendererResult): HeatmapSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeatmapRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[HeatmapSlider]
}
