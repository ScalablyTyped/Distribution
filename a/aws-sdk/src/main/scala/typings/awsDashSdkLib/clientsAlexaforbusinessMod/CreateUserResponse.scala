package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  /**
    * The ARN of the newly created user in the response.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}

object CreateUserResponse {
  @scala.inline
  def apply(UserArn: Arn = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

