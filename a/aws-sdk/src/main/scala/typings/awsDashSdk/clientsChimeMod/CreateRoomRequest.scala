package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The idempotency token for the request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsChimeMod.ClientRequestToken] = js.native
  /**
    * The room name.
    */
  var Name: SensitiveString = js.native
}

object CreateRoomRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, Name: SensitiveString, ClientRequestToken: ClientRequestToken = null): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
}

