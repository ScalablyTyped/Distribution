package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAnnouncementResponse extends StObject {
  
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
  implicit class SendAnnouncementResponseMutableBuilder[Self <: SendAnnouncementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnouncementArn(value: Arn): Self = StObject.set(x, "AnnouncementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnouncementArnUndefined: Self = StObject.set(x, "AnnouncementArn", js.undefined)
  }
}
