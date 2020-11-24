package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1FollowupEvent extends js.Object {
  
  var data: js.UndefOr[DialogflowV1Parameters] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object DialogflowV1FollowupEvent {
  
  @scala.inline
  def apply(): DialogflowV1FollowupEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1FollowupEvent]
  }
  
  @scala.inline
  implicit class DialogflowV1FollowupEventOps[Self <: DialogflowV1FollowupEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: DialogflowV1Parameters): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
