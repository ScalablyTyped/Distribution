package typings.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALIGNEND extends js.Object {
  
  var ALIGN_END: String = js.native
  
  var ALIGN_START: String = js.native
  
  var CENTER: String = js.native
  
  var OFFSET_END: String = js.native
  
  var OFFSET_START: String = js.native
}
object ALIGNEND {
  
  @scala.inline
  def apply(ALIGN_END: String, ALIGN_START: String, CENTER: String, OFFSET_END: String, OFFSET_START: String): ALIGNEND = {
    val __obj = js.Dynamic.literal(ALIGN_END = ALIGN_END.asInstanceOf[js.Any], ALIGN_START = ALIGN_START.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], OFFSET_END = OFFSET_END.asInstanceOf[js.Any], OFFSET_START = OFFSET_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALIGNEND]
  }
  
  @scala.inline
  implicit class ALIGNENDOps[Self <: ALIGNEND] (val x: Self) extends AnyVal {
    
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
    def setALIGN_END(value: String): Self = this.set("ALIGN_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALIGN_START(value: String): Self = this.set("ALIGN_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCENTER(value: String): Self = this.set("CENTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFFSET_END(value: String): Self = this.set("OFFSET_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFFSET_START(value: String): Self = this.set("OFFSET_START", value.asInstanceOf[js.Any])
  }
}
