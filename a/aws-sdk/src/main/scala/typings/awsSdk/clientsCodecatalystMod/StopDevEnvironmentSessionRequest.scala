package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDevEnvironmentSessionRequest extends StObject {
  
  /**
    * The system-generated unique ID of the Dev Environment. To obtain this ID, use ListDevEnvironments.
    */
  var id: Uuid
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The system-generated unique ID of the Dev Environment session. This ID is returned by StartDevEnvironmentSession.
    */
  var sessionId: StopDevEnvironmentSessionRequestSessionIdString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object StopDevEnvironmentSessionRequest {
  
  inline def apply(
    id: Uuid,
    projectName: NameString,
    sessionId: StopDevEnvironmentSessionRequestSessionIdString,
    spaceName: NameString
  ): StopDevEnvironmentSessionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDevEnvironmentSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDevEnvironmentSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: StopDevEnvironmentSessionRequestSessionIdString): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
