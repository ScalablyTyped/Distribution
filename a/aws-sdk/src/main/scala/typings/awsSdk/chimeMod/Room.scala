package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Room extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the room creator.
    */
  var CreatedBy: js.UndefOr[NonEmptyString] = js.native
  /**
    * The room creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The room name.
    */
  var Name: js.UndefOr[SensitiveString] = js.native
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The room update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object Room {
  @scala.inline
  def apply(
    AccountId: NonEmptyString = null,
    CreatedBy: NonEmptyString = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    Name: SensitiveString = null,
    RoomId: NonEmptyString = null,
    UpdatedTimestamp: Iso8601Timestamp = null
  ): Room = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoomId != null) __obj.updateDynamic("RoomId")(RoomId.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
}

