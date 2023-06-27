package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatPosition extends StObject {
  
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
  
  inline def apply(coordinate: String, location: Point): FormatPosition = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatPosition] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: String): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
