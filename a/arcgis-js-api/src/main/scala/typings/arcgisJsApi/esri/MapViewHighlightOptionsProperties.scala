package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewHighlightOptionsProperties
  extends StObject
     with Object {
  
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The opacity of the fill (area within the halo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The color of the halo surrounding the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The opacity of the highlight halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
}
object MapViewHighlightOptionsProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewHighlightOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewHighlightOptionsProperties]
  }
  
  @scala.inline
  implicit class MapViewHighlightOptionsPropertiesMutableBuilder[Self <: MapViewHighlightOptionsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setHaloColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    @scala.inline
    def setHaloColorVarargs(value: Double*): Self = StObject.set(x, "haloColor", js.Array(value :_*))
    
    @scala.inline
    def setHaloOpacity(value: Double): Self = StObject.set(x, "haloOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloOpacityUndefined: Self = StObject.set(x, "haloOpacity", js.undefined)
  }
}
