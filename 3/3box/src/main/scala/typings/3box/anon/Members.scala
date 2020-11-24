package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Members extends js.Object {
  
  var firstModerator: js.UndefOr[String] = js.native
  
  var members: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Members {
  
  @scala.inline
  def apply(): Members = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit class MembersOps[Self <: Members] (val x: Self) extends AnyVal {
    
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
    def setFirstModerator(value: String): Self = this.set("firstModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstModerator: Self = this.set("firstModerator", js.undefined)
    
    @scala.inline
    def setMembers(value: String): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
