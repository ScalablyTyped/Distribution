package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileDetailResponse extends StObject {
  
  /**
    * The state of the profile after a read or write operation.
    */
  var profile: js.UndefOr[ProfileDetail] = js.undefined
}
object ProfileDetailResponse {
  
  inline def apply(): ProfileDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileDetailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileDetailResponse] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: ProfileDetail): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
