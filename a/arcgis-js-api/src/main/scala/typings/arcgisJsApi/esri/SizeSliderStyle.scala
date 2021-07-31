package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderStyle
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The background color of the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * The color of the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}
object SizeSliderStyle {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, SizeSliderStyle]]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], SizeSliderStyle]])
  ): SizeSliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderStyle]
  }
  
  @scala.inline
  implicit class SizeSliderStyleMutableBuilder[Self <: SizeSliderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackBackgroundColor(value: Color_): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    @scala.inline
    def setTrackFillColor(value: Color_): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
  }
}
