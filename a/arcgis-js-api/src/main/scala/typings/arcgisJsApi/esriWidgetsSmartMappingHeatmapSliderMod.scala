package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapSlider
import typings.arcgisJsApi.esri.HeatmapSliderConstructor
import typings.arcgisJsApi.esri.HeatmapSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingHeatmapSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HeatmapSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  /**
    * The HeatmapSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html)
    */
  open class Class ()
    extends StObject
       with HeatmapSlider {
    def this(properties: HeatmapSliderProperties) = this()
  }
  
  type _To = js.Object & HeatmapSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingHeatmapSliderMod.foo` */
  override def _to: js.Object & HeatmapSliderConstructor = ^
}
