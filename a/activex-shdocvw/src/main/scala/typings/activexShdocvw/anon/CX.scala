package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CX extends js.Object {
  
  var CX: Double = js.native
  
  var CY: Double = js.native
}
object CX {
  
  @scala.inline
  def apply(CX: Double, CY: Double): CX = {
    val __obj = js.Dynamic.literal(CX = CX.asInstanceOf[js.Any], CY = CY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CX]
  }
  
  @scala.inline
  implicit class CXOps[Self <: CX] (val x: Self) extends AnyVal {
    
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
    def setCX(value: Double): Self = this.set("CX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCY(value: Double): Self = this.set("CY", value.asInstanceOf[js.Any])
  }
}
