package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSigningProfileRequest extends StObject {
  
  /**
    * The name of the signing profile to be canceled.
    */
  var profileName: ProfileName
}
object CancelSigningProfileRequest {
  
  inline def apply(profileName: ProfileName): CancelSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSigningProfileRequest]
  }
  
  extension [Self <: CancelSigningProfileRequest](x: Self) {
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
  }
}
