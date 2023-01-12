package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileInitializationResponse extends StObject {
  
  /**
    * The launch profile initialization.
    */
  var launchProfileInitialization: js.UndefOr[LaunchProfileInitialization] = js.undefined
}
object GetLaunchProfileInitializationResponse {
  
  inline def apply(): GetLaunchProfileInitializationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchProfileInitializationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchProfileInitializationResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfileInitialization(value: LaunchProfileInitialization): Self = StObject.set(x, "launchProfileInitialization", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileInitializationUndefined: Self = StObject.set(x, "launchProfileInitialization", js.undefined)
  }
}
