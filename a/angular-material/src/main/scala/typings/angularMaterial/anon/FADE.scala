package typings.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FADE extends js.Object {
  
  var FADE: String = js.native
  
  var SCALE: String = js.native
  
  var SLIDE: String = js.native
}
object FADE {
  
  @scala.inline
  def apply(FADE: String, SCALE: String, SLIDE: String): FADE = {
    val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any], SLIDE = SLIDE.asInstanceOf[js.Any])
    __obj.asInstanceOf[FADE]
  }
  
  @scala.inline
  implicit class FADEOps[Self <: FADE] (val x: Self) extends AnyVal {
    
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
    def setFADE(value: String): Self = this.set("FADE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCALE(value: String): Self = this.set("SCALE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSLIDE(value: String): Self = this.set("SLIDE", value.asInstanceOf[js.Any])
  }
}
