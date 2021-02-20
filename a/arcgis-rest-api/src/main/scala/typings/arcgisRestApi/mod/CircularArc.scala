package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularArc extends JsonCurve {
  
  var c: js.Tuple2[Position, Position2D] = js.native
}
object CircularArc {
  
  @scala.inline
  def apply(c: js.Tuple2[Position, Position2D]): CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularArc]
  }
  
  @scala.inline
  implicit class CircularArcMutableBuilder[Self <: CircularArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: js.Tuple2[Position, Position2D]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
