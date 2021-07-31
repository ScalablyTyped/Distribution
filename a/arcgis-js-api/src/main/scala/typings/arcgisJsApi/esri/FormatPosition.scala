package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatPosition
  extends StObject
     with Object {
  
  /**
    * A string representing the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position)
    */
  var coordinate: String
  
  /**
    * A point geometry representing the location described by the conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position)
    */
  var location: Point
}
object FormatPosition {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: String,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FormatPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FormatPosition]
  }
  
  @scala.inline
  implicit class FormatPositionMutableBuilder[Self <: FormatPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: String): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
