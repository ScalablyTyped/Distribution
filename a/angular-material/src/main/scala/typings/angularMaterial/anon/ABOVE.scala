package typings.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ABOVE extends js.Object {
  
  var ABOVE: String = js.native
  
  var ALIGN_BOTTOMS: String = js.native
  
  var ALIGN_TOPS: String = js.native
  
  var BELOW: String = js.native
  
  var CENTER: String = js.native
}
object ABOVE {
  
  @scala.inline
  def apply(ABOVE: String, ALIGN_BOTTOMS: String, ALIGN_TOPS: String, BELOW: String, CENTER: String): ABOVE = {
    val __obj = js.Dynamic.literal(ABOVE = ABOVE.asInstanceOf[js.Any], ALIGN_BOTTOMS = ALIGN_BOTTOMS.asInstanceOf[js.Any], ALIGN_TOPS = ALIGN_TOPS.asInstanceOf[js.Any], BELOW = BELOW.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABOVE]
  }
  
  @scala.inline
  implicit class ABOVEOps[Self <: ABOVE] (val x: Self) extends AnyVal {
    
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
    def setABOVE(value: String): Self = this.set("ABOVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALIGN_BOTTOMS(value: String): Self = this.set("ALIGN_BOTTOMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALIGN_TOPS(value: String): Self = this.set("ALIGN_TOPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBELOW(value: String): Self = this.set("BELOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCENTER(value: String): Self = this.set("CENTER", value.asInstanceOf[js.Any])
  }
}
