package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningProfileRequest extends js.Object {
  /**
    * The name of the target signing profile.
    */
  var profileName: ProfileName = js.native
}

object GetSigningProfileRequest {
  @scala.inline
  def apply(profileName: ProfileName): GetSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSigningProfileRequest]
  }
}

