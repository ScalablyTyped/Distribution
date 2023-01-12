package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitySliderStyleProperties extends StObject {
  
  /**
    * The color of the slider's track.
    *
    * @default new Color([0, 121, 193])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object OpacitySliderStyleProperties {
  
  inline def apply(): OpacitySliderStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitySliderStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacitySliderStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setTrackFillColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    inline def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
    
    inline def setTrackFillColorVarargs(value: Double*): Self = StObject.set(x, "trackFillColor", js.Array(value*))
  }
}
