package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapColorStop
  extends StObject
     with Accessor {
  
  /**
  		 * The color to shade a given pixel based on its calculated density [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The ratio of a pixel's density value to the [maxDensity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxDensity) of the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio)
  		 */
  var ratio: Double = js.native
}
