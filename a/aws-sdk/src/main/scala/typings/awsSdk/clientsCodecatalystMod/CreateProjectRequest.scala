package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  
  /**
    * The friendly name of the project that will be displayed to users.
    */
  var displayName: ProjectDisplayName
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object CreateProjectRequest {
  
  inline def apply(displayName: ProjectDisplayName, spaceName: NameString): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: ProjectDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
