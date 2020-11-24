package typings.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLICKOUTSIDE extends js.Object {
  
  var CLICK_OUTSIDE: String = js.native
  
  var ESCAPE: String = js.native
}
object CLICKOUTSIDE {
  
  @scala.inline
  def apply(CLICK_OUTSIDE: String, ESCAPE: String): CLICKOUTSIDE = {
    val __obj = js.Dynamic.literal(CLICK_OUTSIDE = CLICK_OUTSIDE.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLICKOUTSIDE]
  }
  
  @scala.inline
  implicit class CLICKOUTSIDEOps[Self <: CLICKOUTSIDE] (val x: Self) extends AnyVal {
    
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
    def setCLICK_OUTSIDE(value: String): Self = this.set("CLICK_OUTSIDE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setESCAPE(value: String): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
  }
}
