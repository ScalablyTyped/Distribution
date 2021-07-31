package typings.allTheCities

import typings.allTheCities.allTheCitiesStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coordinates extends StObject {
    
    var coordinates: js.Tuple2[Double, Double]
    
    var `type`: Point
  }
  object Coordinates {
    
    @scala.inline
    def apply(coordinates: js.Tuple2[Double, Double]): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
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
}
