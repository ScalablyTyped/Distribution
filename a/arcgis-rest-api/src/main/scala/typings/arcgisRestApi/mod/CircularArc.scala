package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircularArc
  extends StObject
     with JsonCurve {
  
  var c: js.Tuple2[Position, Position2D]
}
object CircularArc {
  
  inline def apply(c: js.Tuple2[Position, Position2D]): CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularArc]
  }
  
  extension [Self <: CircularArc](x: Self) {
    
    inline def setC(value: js.Tuple2[Position, Position2D]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
