package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendAnnouncementResponse extends StObject {
  
  /**
    * The identifier of the announcement.
    */
  var AnnouncementArn: js.UndefOr[Arn] = js.undefined
}
object SendAnnouncementResponse {
  
  inline def apply(): SendAnnouncementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAnnouncementResponse]
  }
  
  extension [Self <: SendAnnouncementResponse](x: Self) {
    
    inline def setAnnouncementArn(value: Arn): Self = StObject.set(x, "AnnouncementArn", value.asInstanceOf[js.Any])
    
    inline def setAnnouncementArnUndefined: Self = StObject.set(x, "AnnouncementArn", js.undefined)
  }
}
