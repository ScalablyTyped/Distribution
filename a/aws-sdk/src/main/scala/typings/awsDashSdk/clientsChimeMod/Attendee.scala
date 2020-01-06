package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attendee extends js.Object {
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.native
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.native
  /**
    * The join token used by the Amazon Chime SDK attendee.
    */
  var JoinToken: js.UndefOr[JoinTokenString] = js.native
}

object Attendee {
  @scala.inline
  def apply(
    AttendeeId: GuidString = null,
    ExternalUserId: ExternalUserIdType = null,
    JoinToken: JoinTokenString = null
  ): Attendee = {
    val __obj = js.Dynamic.literal()
    if (AttendeeId != null) __obj.updateDynamic("AttendeeId")(AttendeeId.asInstanceOf[js.Any])
    if (ExternalUserId != null) __obj.updateDynamic("ExternalUserId")(ExternalUserId.asInstanceOf[js.Any])
    if (JoinToken != null) __obj.updateDynamic("JoinToken")(JoinToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attendee]
  }
}

