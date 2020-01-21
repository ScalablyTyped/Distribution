package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
}

object GetUserSettingsRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String): GetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUserSettingsRequest]
  }
}

