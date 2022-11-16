package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitySliderStyle
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The color of the slider's track.
    *
    * @default new Color([0, 121, 193])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}
object OpacitySliderStyle {
  
  inline def apply(
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, OpacitySliderStyle]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], OpacitySliderStyle]])
  ): OpacitySliderStyle = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderStyle]
  }
  
  extension [Self <: OpacitySliderStyle](x: Self) {
    
    inline def setTrackFillColor(value: Color_): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    inline def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
  }
}
