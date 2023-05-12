package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDevEnvironmentResponse extends StObject {
  
  /**
    * The system-generated unique ID of the deleted Dev Environment. 
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
}
object DeleteDevEnvironmentResponse {
  
  inline def apply(id: Uuid, projectName: NameString, spaceName: NameString): DeleteDevEnvironmentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDevEnvironmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDevEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
