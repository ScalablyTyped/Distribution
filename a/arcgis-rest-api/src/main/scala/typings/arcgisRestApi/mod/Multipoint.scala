package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multipoint
  extends StObject
     with HasZM
     with Geometry {
  
  var points: js.Array[Position]
}
object Multipoint {
  
  inline def apply(points: js.Array[Position]): Multipoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipoint]
  }
  
  extension [Self <: Multipoint](x: Self) {
    
    inline def setPoints(value: js.Array[Position]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Position*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
