package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position
  extends StObject
     with Object {
  
  /**
    * A string representing the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#Position)
    */
  var coordinate: String
  
  /**
    * A point geometry representing the location described by the conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#Position)
    */
  var location: Point
}
object Position {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: String,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Position = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: String): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
