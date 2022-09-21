package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapColorStop
import typings.arcgisJsApi.esri.HeatmapColorStopConstructor
import typings.arcgisJsApi.esri.HeatmapColorStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapColorStopMod extends Shortcut {
  
  @JSImport("esri/renderers/support/HeatmapColorStop", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HeatmapColorStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/HeatmapColorStop", JSImport.Namespace)
  @js.native
  /**
    * This class is used to define an array of objects describing the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)'s color ramp and associated density value ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html)
    */
  open class Class ()
    extends StObject
       with HeatmapColorStop {
    def this(properties: HeatmapColorStopProperties) = this()
  }
  
  type _To = js.Object & HeatmapColorStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heatmapColorStopMod.foo` */
  override def _to: js.Object & HeatmapColorStopConstructor = ^
}
