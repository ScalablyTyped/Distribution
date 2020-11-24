package typings.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WIZ_FILETIME extends js.Object {
  
  val dwHighDateTime: Double = js.native
  
  val dwLowDateTime: Double = js.native
}
object WIZ_FILETIME {
  
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIZ_FILETIME]
  }
  
  @scala.inline
  implicit class WIZ_FILETIMEOps[Self <: WIZ_FILETIME] (val x: Self) extends AnyVal {
    
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
    def setDwHighDateTime(value: Double): Self = this.set("dwHighDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwLowDateTime(value: Double): Self = this.set("dwLowDateTime", value.asInstanceOf[js.Any])
  }
}
