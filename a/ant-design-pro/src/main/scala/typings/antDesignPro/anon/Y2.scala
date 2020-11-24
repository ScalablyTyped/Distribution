package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y2 extends js.Object {
  
  var y1: String = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object Y2 {
  
  @scala.inline
  def apply(y1: String): Y2 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y2]
  }
  
  @scala.inline
  implicit class Y2Ops[Self <: Y2] (val x: Self) extends AnyVal {
    
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
    def setY1(value: String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
