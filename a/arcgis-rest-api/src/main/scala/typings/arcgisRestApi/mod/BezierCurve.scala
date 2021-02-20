package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BezierCurve extends JsonCurve {
  
  var b: js.Tuple3[Position, Position2D, Position2D] = js.native
}
object BezierCurve {
  
  @scala.inline
  def apply(b: js.Tuple3[Position, Position2D, Position2D]): BezierCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurve]
  }
  
  @scala.inline
  implicit class BezierCurveMutableBuilder[Self <: BezierCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: js.Tuple3[Position, Position2D, Position2D]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
