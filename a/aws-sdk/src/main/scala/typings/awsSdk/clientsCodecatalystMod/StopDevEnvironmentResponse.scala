package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDevEnvironmentResponse extends StObject {
  
  /**
    * The system-generated unique ID of the Dev Environment. 
    */
  var id: Uuid
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
  
  /**
    * The status of the Dev Environment. 
    */
  var status: DevEnvironmentStatus
}
object StopDevEnvironmentResponse {
  
  inline def apply(id: Uuid, projectName: NameString, spaceName: NameString, status: DevEnvironmentStatus): StopDevEnvironmentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDevEnvironmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDevEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DevEnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
