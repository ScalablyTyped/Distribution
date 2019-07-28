package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAnnouncementResponse extends js.Object {
  /**
    * The identifier of the announcement.
    */
  var AnnouncementArn: js.UndefOr[Arn] = js.undefined
}

object SendAnnouncementResponse {
  @scala.inline
  def apply(AnnouncementArn: Arn = null): SendAnnouncementResponse = {
    val __obj = js.Dynamic.literal()
    if (AnnouncementArn != null) __obj.updateDynamic("AnnouncementArn")(AnnouncementArn)
    __obj.asInstanceOf[SendAnnouncementResponse]
  }
}

