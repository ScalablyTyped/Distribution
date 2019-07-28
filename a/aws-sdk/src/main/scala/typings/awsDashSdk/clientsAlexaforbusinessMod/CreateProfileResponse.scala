package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProfileResponse extends js.Object {
  /**
    * The ARN of the newly created room profile in the response.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
}

object CreateProfileResponse {
  @scala.inline
  def apply(ProfileArn: Arn = null): CreateProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    __obj.asInstanceOf[CreateProfileResponse]
  }
}

