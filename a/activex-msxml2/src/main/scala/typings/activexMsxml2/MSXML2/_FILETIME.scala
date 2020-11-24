package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _FILETIME extends js.Object {
  
  val dwHighDateTime: Double = js.native
  
  val dwLowDateTime: Double = js.native
}
object _FILETIME {
  
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): _FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FILETIME]
  }
  
  @scala.inline
  implicit class _FILETIMEOps[Self <: _FILETIME] (val x: Self) extends AnyVal {
    
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
