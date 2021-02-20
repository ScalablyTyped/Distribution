package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinates
  extends typings.amapJsApi.AMap.GeoJSON.Geometry {
  
  var coordinates: js.Tuple2[Double, Double] = js.native
  
  var `type`: Point = js.native
}
object Coordinates {
  
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: Point): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit class CoordinatesMutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
