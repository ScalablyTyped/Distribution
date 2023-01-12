package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderStyleProperties extends StObject {
  
  /**
    * The background color of the slider's track.
    *
    * @default new Color([224, 224, 224])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackBackgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The color of the slider's track.
    *
    * @default new Color([149, 149, 149])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object ClassedSizeSliderStyleProperties {
  
  inline def apply(): ClassedSizeSliderStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassedSizeSliderStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setTrackBackgroundColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    inline def setTrackBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "trackBackgroundColor", js.Array(value*))
    
    inline def setTrackFillColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    inline def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
    
    inline def setTrackFillColorVarargs(value: Double*): Self = StObject.set(x, "trackFillColor", js.Array(value*))
  }
}
