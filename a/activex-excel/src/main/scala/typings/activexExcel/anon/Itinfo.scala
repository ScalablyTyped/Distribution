package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Itinfo extends js.Object {
  
  val itinfo: Double = js.native
  
  val lcid: Double = js.native
  
  var pptinfo: js.UndefOr[scala.Nothing] = js.native
}
object Itinfo {
  
  @scala.inline
  def apply(itinfo: Double, lcid: Double): Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itinfo]
  }
  
  @scala.inline
  implicit class ItinfoOps[Self <: Itinfo] (val x: Self) extends AnyVal {
    
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
    def setItinfo(value: Double): Self = this.set("itinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = this.set("lcid", value.asInstanceOf[js.Any])
  }
}
