package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldCircularArc extends JsonCurve {
  
  var a: js.Tuple4[Position, Position2D, Double, Double] = js.native
}
object OldCircularArc {
  
  @scala.inline
  def apply(a: js.Tuple4[Position, Position2D, Double, Double]): OldCircularArc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldCircularArc]
  }
  
  @scala.inline
  implicit class OldCircularArcOps[Self <: OldCircularArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: js.Tuple4[Position, Position2D, Double, Double]): Self = this.set("a", value.asInstanceOf[js.Any])
  }
}
