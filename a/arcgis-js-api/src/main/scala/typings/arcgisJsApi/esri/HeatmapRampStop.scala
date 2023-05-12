package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRampStop extends StObject {
  
  /**
    * The color of the pixel corresponding to the appropriate pixel `ratio`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var color: Color_
  
  /**
    * The label of the color stop displayed in the legend.
    *
    * [Read more...](global.html)
    */
  var label: String
  
  /**
    * A number between `0` and `1` describing the position of the label on the ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var offset: Double
  
  /**
    * The ratio of a pixel's intensity value to the minPixelIntensity of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var ratio: Double
}
object HeatmapRampStop {
  
  inline def apply(color: Color_, label: String, offset: Double, ratio: Double): HeatmapRampStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRampStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapRampStop] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
