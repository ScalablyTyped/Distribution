package typings.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DD extends js.Object {
  
  var DD: String = js.native
  
  var hh: String = js.native
  
  var mm: String = js.native
  
  var ss: String = js.native
}
object DD {
  
  @scala.inline
  def apply(DD: String, hh: String, mm: String, ss: String): DD = {
    val __obj = js.Dynamic.literal(DD = DD.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[DD]
  }
  
  @scala.inline
  implicit class DDOps[Self <: DD] (val x: Self) extends AnyVal {
    
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
    def setDD(value: String): Self = this.set("DD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHh(value: String): Self = this.set("hh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMm(value: String): Self = this.set("mm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSs(value: String): Self = this.set("ss", value.asInstanceOf[js.Any])
  }
}
