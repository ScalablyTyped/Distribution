package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDevEnvironmentSessionResponse extends StObject {
  
  /**
    * The system-generated unique ID of the Dev Environment.
    */
  var id: Uuid
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The system-generated unique ID of the Dev Environment session.
    */
  var sessionId: StopDevEnvironmentSessionResponseSessionIdString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object StopDevEnvironmentSessionResponse {
  
  inline def apply(
    id: Uuid,
    projectName: NameString,
    sessionId: StopDevEnvironmentSessionResponseSessionIdString,
    spaceName: NameString
  ): StopDevEnvironmentSessionResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDevEnvironmentSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDevEnvironmentSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: StopDevEnvironmentSessionResponseSessionIdString): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
