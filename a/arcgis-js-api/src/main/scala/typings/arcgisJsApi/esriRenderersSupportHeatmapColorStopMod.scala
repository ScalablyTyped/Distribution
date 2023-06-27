package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HeatmapColorStop
import typings.arcgisJsApi.esri.HeatmapColorStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersSupportHeatmapColorStopMod {
  
  @JSImport("esri/renderers/support/HeatmapColorStop", JSImport.Namespace)
  @js.native
  /**
  		 * This class is used to define an array of objects describing the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)'s color ramp and associated density value ratios.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html)
  		 */
  open class ^ ()
    extends StObject
       with HeatmapColorStop {
    def this(properties: HeatmapColorStopProperties) = this()
  }
}
