package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDevEnvironmentSessionRequest extends StObject {
  
  /**
    * The system-generated unique ID of the Dev Environment.
    */
  var id: Uuid
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  var sessionConfiguration: DevEnvironmentSessionConfiguration
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object StartDevEnvironmentSessionRequest {
  
  inline def apply(
    id: Uuid,
    projectName: NameString,
    sessionConfiguration: DevEnvironmentSessionConfiguration,
    spaceName: NameString
  ): StartDevEnvironmentSessionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], sessionConfiguration = sessionConfiguration.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDevEnvironmentSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDevEnvironmentSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSessionConfiguration(value: DevEnvironmentSessionConfiguration): Self = StObject.set(x, "sessionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
