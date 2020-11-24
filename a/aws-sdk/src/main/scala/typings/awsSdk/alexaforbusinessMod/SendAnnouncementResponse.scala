package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAnnouncementResponse extends js.Object {
  
  /**
    * The identifier of the announcement.
    */
  var AnnouncementArn: js.UndefOr[Arn] = js.native
}
object SendAnnouncementResponse {
  
  @scala.inline
  def apply(): SendAnnouncementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAnnouncementResponse]
  }
  
  @scala.inline
  implicit class SendAnnouncementResponseOps[Self <: SendAnnouncementResponse] (val x: Self) extends AnyVal {
    
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
    def setAnnouncementArn(value: Arn): Self = this.set("AnnouncementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnouncementArn: Self = this.set("AnnouncementArn", js.undefined)
  }
}
