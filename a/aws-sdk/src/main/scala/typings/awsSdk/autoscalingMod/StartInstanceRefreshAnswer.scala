package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartInstanceRefreshAnswer extends js.Object {
  
  /**
    * A unique ID for tracking the progress of the request.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
}
object StartInstanceRefreshAnswer {
  
  @scala.inline
  def apply(): StartInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstanceRefreshAnswer]
  }
  
  @scala.inline
  implicit class StartInstanceRefreshAnswerOps[Self <: StartInstanceRefreshAnswer] (val x: Self) extends AnyVal {
    
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
    def setInstanceRefreshId(value: XmlStringMaxLen255): Self = this.set("InstanceRefreshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceRefreshId: Self = this.set("InstanceRefreshId", js.undefined)
  }
}
