package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelInstanceRefreshAnswer extends js.Object {
  
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
}
object CancelInstanceRefreshAnswer {
  
  @scala.inline
  def apply(): CancelInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelInstanceRefreshAnswer]
  }
  
  @scala.inline
  implicit class CancelInstanceRefreshAnswerOps[Self <: CancelInstanceRefreshAnswer] (val x: Self) extends AnyVal {
    
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
