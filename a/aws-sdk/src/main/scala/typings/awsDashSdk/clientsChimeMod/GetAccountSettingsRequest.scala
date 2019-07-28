package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
}

object GetAccountSettingsRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString): GetAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
  
    __obj.asInstanceOf[GetAccountSettingsRequest]
  }
}

