package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileInitializationRequest extends StObject {
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The launch profile protocol versions supported by the client.
    */
  var launchProfileProtocolVersions: StringList
  
  /**
    * The launch purpose.
    */
  var launchPurpose: String
  
  /**
    * The platform where this Launch Profile will be used, either WINDOWS or LINUX.
    */
  var platform: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetLaunchProfileInitializationRequest {
  
  inline def apply(
    launchProfileId: String,
    launchProfileProtocolVersions: StringList,
    launchPurpose: String,
    platform: String,
    studioId: String
  ): GetLaunchProfileInitializationRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], launchProfileProtocolVersions = launchProfileProtocolVersions.asInstanceOf[js.Any], launchPurpose = launchPurpose.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchProfileInitializationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchProfileInitializationRequest] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersions(value: StringList): Self = StObject.set(x, "launchProfileProtocolVersions", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionsVarargs(value: String*): Self = StObject.set(x, "launchProfileProtocolVersions", js.Array(value*))
    
    inline def setLaunchPurpose(value: String): Self = StObject.set(x, "launchPurpose", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
