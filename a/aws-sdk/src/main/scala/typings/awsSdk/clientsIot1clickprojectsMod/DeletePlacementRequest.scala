package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlacementRequest extends StObject {
  
  /**
    * The name of the empty placement to delete.
    */
  var placementName: PlacementName
  
  /**
    * The project containing the empty placement to delete.
    */
  var projectName: ProjectName
}
object DeletePlacementRequest {
  
  inline def apply(placementName: PlacementName, projectName: ProjectName): DeletePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlacementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePlacementRequest] (val x: Self) extends AnyVal {
    
    inline def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
