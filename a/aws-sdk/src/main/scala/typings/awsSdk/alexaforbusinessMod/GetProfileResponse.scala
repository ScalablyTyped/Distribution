package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProfileResponse extends StObject {
  
  /**
    * The details of the room profile requested. Required.
    */
  var Profile: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Profile] = js.native
}
object GetProfileResponse {
  
  @scala.inline
  def apply(): GetProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileResponse]
  }
  
  @scala.inline
  implicit class GetProfileResponseMutableBuilder[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
  }
}
