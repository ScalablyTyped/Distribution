package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderStyle
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The background color of the slider's track.
    *
    * @default new Color([224, 224, 224])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * The color of the slider's track.
    *
    * @default new Color([149, 149, 149])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}
object ClassedSizeSliderStyle {
  
  inline def apply(): ClassedSizeSliderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassedSizeSliderStyle] (val x: Self) extends AnyVal {
    
    inline def setTrackBackgroundColor(value: Color_): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    inline def setTrackFillColor(value: Color_): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    inline def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
  }
}
