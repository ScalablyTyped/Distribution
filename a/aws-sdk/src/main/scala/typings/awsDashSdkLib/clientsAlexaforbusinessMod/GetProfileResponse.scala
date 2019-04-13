package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProfileResponse extends js.Object {
  /**
    * The details of the room profile requested. Required.
    */
  var Profile: js.UndefOr[Profile] = js.undefined
}

object GetProfileResponse {
  @scala.inline
  def apply(Profile: Profile = null): GetProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (Profile != null) __obj.updateDynamic("Profile")(Profile)
    __obj.asInstanceOf[GetProfileResponse]
  }
}

