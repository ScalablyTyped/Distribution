package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstModerator extends js.Object {
  
  var firstModerator: js.UndefOr[String] = js.native
  
  var ghost: js.UndefOr[Boolean] = js.native
  
  var ghostBacklogLimit: js.UndefOr[Double] = js.native
  
  var members: js.UndefOr[Boolean] = js.native
  
  var noAutoSub: js.UndefOr[Boolean] = js.native
}
object FirstModerator {
  
  @scala.inline
  def apply(): FirstModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstModerator]
  }
  
  @scala.inline
  implicit class FirstModeratorOps[Self <: FirstModerator] (val x: Self) extends AnyVal {
    
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
    def setGhost(value: Boolean): Self = this.set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    
    @scala.inline
    def setGhostBacklogLimit(value: Double): Self = this.set("ghostBacklogLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhostBacklogLimit: Self = this.set("ghostBacklogLimit", js.undefined)
    
    @scala.inline
    def setMembers(value: Boolean): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setNoAutoSub(value: Boolean): Self = this.set("noAutoSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAutoSub: Self = this.set("noAutoSub", js.undefined)
  }
}
