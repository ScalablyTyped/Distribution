package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends js.Object {
  
  var read: js.UndefOr[js.Any] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
}
object Read {
  
  @scala.inline
  def apply(): Read = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read]
  }
  
  @scala.inline
  implicit class ReadOps[Self <: Read] (val x: Self) extends AnyVal {
    
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
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
