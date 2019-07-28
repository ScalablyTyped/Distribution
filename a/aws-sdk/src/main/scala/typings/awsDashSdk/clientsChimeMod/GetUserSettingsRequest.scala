package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  /**
    * The user ID.
    */
  var UserId: String
}

object GetUserSettingsRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String): GetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId)
  
    __obj.asInstanceOf[GetUserSettingsRequest]
  }
}

