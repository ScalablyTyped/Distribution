package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DwCount extends js.Object {
  
  val URL: js.Any = js.native
  
  val dwCount: Double = js.native
}
object DwCount {
  
  @scala.inline
  def apply(URL: js.Any, dwCount: Double): DwCount = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], dwCount = dwCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwCount]
  }
  
  @scala.inline
  implicit class DwCountOps[Self <: DwCount] (val x: Self) extends AnyVal {
    
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
    def setURL(value: js.Any): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwCount(value: Double): Self = this.set("dwCount", value.asInstanceOf[js.Any])
  }
}
