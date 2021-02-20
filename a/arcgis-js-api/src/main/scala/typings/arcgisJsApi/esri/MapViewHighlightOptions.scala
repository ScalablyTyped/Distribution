package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapViewHighlightOptions extends AnonymousAccessor {
  
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var color: js.UndefOr[Color_] = js.native
  
  /**
    * The opacity of the fill (area within the halo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The color of the halo surrounding the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.native
  
  /**
    * The opacity of the highlight halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloOpacity: js.UndefOr[Double] = js.native
}
object MapViewHighlightOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, MapViewHighlightOptions]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], MapViewHighlightOptions]])
  ): MapViewHighlightOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewHighlightOptions]
  }
  
  @scala.inline
  implicit class MapViewHighlightOptionsMutableBuilder[Self <: MapViewHighlightOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setHaloColor(value: Color_): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    @scala.inline
    def setHaloOpacity(value: Double): Self = StObject.set(x, "haloOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloOpacityUndefined: Self = StObject.set(x, "haloOpacity", js.undefined)
  }
}
