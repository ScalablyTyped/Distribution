package typings.accedoAccedoOne.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccedoProfile extends js.Object {
  var profileDescription: String
  var profileId: String
  var profileLastModified: String
  var profileName: String
}

object AccedoProfile {
  @scala.inline
  def apply(profileDescription: String, profileId: String, profileLastModified: String, profileName: String): AccedoProfile = {
    val __obj = js.Dynamic.literal(profileDescription = profileDescription.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], profileLastModified = profileLastModified.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoProfile]
  }
}

