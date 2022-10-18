package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileRequest extends StObject {
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetLaunchProfileRequest {
  
  inline def apply(launchProfileId: String, studioId: String): GetLaunchProfileRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchProfileRequest]
  }
  
  extension [Self <: GetLaunchProfileRequest](x: Self) {
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
