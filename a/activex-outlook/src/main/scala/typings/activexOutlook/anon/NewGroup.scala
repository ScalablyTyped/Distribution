package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewGroup extends js.Object {
  
  val NewGroup: OutlookBarGroup = js.native
}
object NewGroup {
  
  @scala.inline
  def apply(NewGroup: OutlookBarGroup): NewGroup = {
    val __obj = js.Dynamic.literal(NewGroup = NewGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewGroup]
  }
  
  @scala.inline
  implicit class NewGroupOps[Self <: NewGroup] (val x: Self) extends AnyVal {
    
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
    def setNewGroup(value: OutlookBarGroup): Self = this.set("NewGroup", value.asInstanceOf[js.Any])
  }
}
