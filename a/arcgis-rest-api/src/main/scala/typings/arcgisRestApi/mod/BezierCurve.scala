package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BezierCurve
  extends StObject
     with JsonCurve {
  
  var b: js.Tuple3[Position, Position2D, Position2D]
}
object BezierCurve {
  
  inline def apply(b: js.Tuple3[Position, Position2D, Position2D]): BezierCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurve]
  }
  
  extension [Self <: BezierCurve](x: Self) {
    
    inline def setB(value: js.Tuple3[Position, Position2D, Position2D]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
