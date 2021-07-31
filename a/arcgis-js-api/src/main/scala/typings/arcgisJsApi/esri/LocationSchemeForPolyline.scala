package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSchemeForPolyline
  extends StObject
     with Object
     with LocationScheme {
  
  /**
    * The color of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var color: Color_
  
  /**
    * The opacity of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var opacity: Double
  
  /**
    * The width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var width: Double
}
object LocationSchemeForPolyline {
  
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): LocationSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSchemeForPolyline]
  }
  
  @scala.inline
  implicit class LocationSchemeForPolylineMutableBuilder[Self <: LocationSchemeForPolyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
