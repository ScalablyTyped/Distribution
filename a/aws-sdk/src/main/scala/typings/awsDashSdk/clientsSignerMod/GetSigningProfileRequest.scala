package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningProfileRequest extends js.Object {
  /**
    * The name of the target signing profile.
    */
  var profileName: ProfileName
}

object GetSigningProfileRequest {
  @scala.inline
  def apply(profileName: ProfileName): GetSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName)
  
    __obj.asInstanceOf[GetSigningProfileRequest]
  }
}

