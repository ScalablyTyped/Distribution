package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPosition extends js.Object {
  /**
    * The time in ISO format where to start. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  /**
    * The ID of the message or event where to start. 
    */
  var Id: js.UndefOr[ChatItemId] = js.native
  /**
    * The start position of the most recent message where you want to start. 
    */
  var MostRecent: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.MostRecent] = js.native
}

object StartPosition {
  @scala.inline
  def apply(AbsoluteTime: Instant = null, Id: ChatItemId = null, MostRecent: Int | Double = null): StartPosition = {
    val __obj = js.Dynamic.literal()
    if (AbsoluteTime != null) __obj.updateDynamic("AbsoluteTime")(AbsoluteTime.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MostRecent != null) __obj.updateDynamic("MostRecent")(MostRecent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPosition]
  }
}

