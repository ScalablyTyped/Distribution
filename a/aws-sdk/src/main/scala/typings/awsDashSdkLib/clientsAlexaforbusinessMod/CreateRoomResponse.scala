package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomResponse extends js.Object {
  /**
    * The ARN of the newly created room in the response.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}

object CreateRoomResponse {
  @scala.inline
  def apply(RoomArn: Arn = null): CreateRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[CreateRoomResponse]
  }
}

