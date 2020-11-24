package typings.accedoAccedoOne.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccedoProfile extends js.Object {
  
  var profileDescription: String = js.native
  
  var profileId: String = js.native
  
  var profileLastModified: String = js.native
  
  var profileName: String = js.native
}
object AccedoProfile {
  
  @scala.inline
  def apply(profileDescription: String, profileId: String, profileLastModified: String, profileName: String): AccedoProfile = {
    val __obj = js.Dynamic.literal(profileDescription = profileDescription.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], profileLastModified = profileLastModified.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoProfile]
  }
  
  @scala.inline
  implicit class AccedoProfileOps[Self <: AccedoProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProfileDescription(value: String): Self = this.set("profileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileLastModified(value: String): Self = this.set("profileLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileName(value: String): Self = this.set("profileName", value.asInstanceOf[js.Any])
  }
}
