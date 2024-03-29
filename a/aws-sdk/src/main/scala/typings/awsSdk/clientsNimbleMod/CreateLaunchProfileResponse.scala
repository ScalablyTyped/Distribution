package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchProfileResponse extends StObject {
  
  /**
    * The launch profile.
    */
  var launchProfile: js.UndefOr[LaunchProfile] = js.undefined
}
object CreateLaunchProfileResponse {
  
  inline def apply(): CreateLaunchProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLaunchProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfile(value: LaunchProfile): Self = StObject.set(x, "launchProfile", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileUndefined: Self = StObject.set(x, "launchProfile", js.undefined)
  }
}
