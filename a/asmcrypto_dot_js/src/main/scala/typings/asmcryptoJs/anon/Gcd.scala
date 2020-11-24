package typings.asmcryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gcd extends js.Object {
  
  var gcd: this.type = js.native
  
  var x: this.type = js.native
  
  var y: this.type = js.native
}
object Gcd {
  
  @scala.inline
  def apply(gcd: Gcd, x: Gcd, y: Gcd): Gcd = {
    val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gcd]
  }
  
  @scala.inline
  implicit class GcdOps[Self <: Gcd] (val x: Self) extends AnyVal {
    
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
    def setGcd(value: Gcd): Self = this.set("gcd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Gcd): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Gcd): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
