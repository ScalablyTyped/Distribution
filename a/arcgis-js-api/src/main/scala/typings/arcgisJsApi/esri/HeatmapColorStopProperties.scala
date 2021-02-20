package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapColorStopProperties extends StObject {
  
  /**
    * The color to shade a given pixel based on its calculated pixel intensity [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The ratio of a pixel's intensity value to the [minPixelIntensity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity) of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio)
    */
  var ratio: js.UndefOr[Double] = js.native
}
object HeatmapColorStopProperties {
  
  @scala.inline
  def apply(): HeatmapColorStopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapColorStopProperties]
  }
  
  @scala.inline
  implicit class HeatmapColorStopPropertiesMutableBuilder[Self <: HeatmapColorStopProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
