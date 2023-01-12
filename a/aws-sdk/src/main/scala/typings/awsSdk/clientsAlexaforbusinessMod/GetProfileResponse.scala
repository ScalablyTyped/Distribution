package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProfileResponse extends StObject {
  
  /**
    * The details of the room profile requested. Required.
    */
  var Profile: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Profile] = js.undefined
}
object GetProfileResponse {
  
  inline def apply(): GetProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
  }
}
