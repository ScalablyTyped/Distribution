package typings.atlassianCrowdClient.groupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  val active: Boolean = js.native
  
  val attributes: js.UndefOr[js.Any] = js.native
  
  val description: String = js.native
  
  val groupname: String = js.native
  
  def toCrowd(): GroupObj = js.native
}
object Group {
  
  @scala.inline
  def apply(active: Boolean, description: String, groupname: String, toCrowd: () => GroupObj): Group = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupname = groupname.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd))
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupname(value: String): Self = this.set("groupname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCrowd(value: () => GroupObj): Self = this.set("toCrowd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
