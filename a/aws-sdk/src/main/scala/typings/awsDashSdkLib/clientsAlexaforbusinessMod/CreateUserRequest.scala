package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The email address for the user.
    */
  var Email: js.UndefOr[Email] = js.undefined
  /**
    * The first name for the user.
    */
  var FirstName: js.UndefOr[user_FirstName] = js.undefined
  /**
    * The last name for the user.
    */
  var LastName: js.UndefOr[user_LastName] = js.undefined
  /**
    * The tags for the user.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ARN for the user.
    */
  var UserId: user_UserId
}

object CreateUserRequest {
  @scala.inline
  def apply(
    UserId: user_UserId,
    ClientRequestToken: ClientRequestToken = null,
    Email: Email = null,
    FirstName: user_FirstName = null,
    LastName: user_LastName = null,
    Tags: TagList = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

