package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descendants extends js.Object {
  
  var descendants: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[js.Any] = js.native
}
object Descendants {
  
  @scala.inline
  def apply(): Descendants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descendants]
  }
  
  @scala.inline
  implicit class DescendantsOps[Self <: Descendants] (val x: Self) extends AnyVal {
    
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
    def setDescendants(value: Boolean): Self = this.set("descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescendants: Self = this.set("descendants", js.undefined)
    
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
}
