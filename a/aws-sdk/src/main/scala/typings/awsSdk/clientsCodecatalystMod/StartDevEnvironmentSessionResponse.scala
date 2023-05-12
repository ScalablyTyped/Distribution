package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDevEnvironmentSessionResponse extends StObject {
  
  var accessDetails: DevEnvironmentAccessDetails
  
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
  var sessionId: js.UndefOr[StartDevEnvironmentSessionResponseSessionIdString] = js.undefined
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object StartDevEnvironmentSessionResponse {
  
  inline def apply(
    accessDetails: DevEnvironmentAccessDetails,
    id: Uuid,
    projectName: NameString,
    spaceName: NameString
  ): StartDevEnvironmentSessionResponse = {
    val __obj = js.Dynamic.literal(accessDetails = accessDetails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDevEnvironmentSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDevEnvironmentSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessDetails(value: DevEnvironmentAccessDetails): Self = StObject.set(x, "accessDetails", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: StartDevEnvironmentSessionResponseSessionIdString): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
