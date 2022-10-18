package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchProfileResponse extends StObject {
  
  /**
    * The launch profile.
    */
  var launchProfile: js.UndefOr[LaunchProfile] = js.undefined
}
object UpdateLaunchProfileResponse {
  
  inline def apply(): UpdateLaunchProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLaunchProfileResponse]
  }
  
  extension [Self <: UpdateLaunchProfileResponse](x: Self) {
    
    inline def setLaunchProfile(value: LaunchProfile): Self = StObject.set(x, "launchProfile", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileUndefined: Self = StObject.set(x, "launchProfile", js.undefined)
  }
}
