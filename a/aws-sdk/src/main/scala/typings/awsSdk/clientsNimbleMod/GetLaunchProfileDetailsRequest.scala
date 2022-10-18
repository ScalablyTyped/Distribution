package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileDetailsRequest extends StObject {
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetLaunchProfileDetailsRequest {
  
  inline def apply(launchProfileId: String, studioId: String): GetLaunchProfileDetailsRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchProfileDetailsRequest]
  }
  
  extension [Self <: GetLaunchProfileDetailsRequest](x: Self) {
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
