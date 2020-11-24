package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.ICU
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICU_MARKER extends js.Object {
  
  var marker: ICU = js.native
}
object ICU_MARKER {
  
  @scala.inline
  def apply(marker: ICU): ICU_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICU_MARKER]
  }
  
  @scala.inline
  implicit class ICU_MARKEROps[Self <: ICU_MARKER] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: ICU): Self = this.set("marker", value.asInstanceOf[js.Any])
  }
}
