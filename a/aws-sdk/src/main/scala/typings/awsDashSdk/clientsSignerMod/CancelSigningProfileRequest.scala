package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSigningProfileRequest extends js.Object {
  /**
    * The name of the signing profile to be canceled.
    */
  var profileName: ProfileName
}

object CancelSigningProfileRequest {
  @scala.inline
  def apply(profileName: ProfileName): CancelSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName)
  
    __obj.asInstanceOf[CancelSigningProfileRequest]
  }
}

