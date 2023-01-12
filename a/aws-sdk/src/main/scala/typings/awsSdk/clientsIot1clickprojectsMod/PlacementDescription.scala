package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementDescription extends StObject {
  
  /**
    * The user-defined attributes associated with the placement.
    */
  var attributes: PlacementAttributeMap
  
  /**
    * The date when the placement was initially created, in UNIX epoch time format.
    */
  var createdDate: js.Date
  
  /**
    * The name of the placement.
    */
  var placementName: PlacementName
  
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName
  
  /**
    * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: js.Date
}
object PlacementDescription {
  
  inline def apply(
    attributes: PlacementAttributeMap,
    createdDate: js.Date,
    placementName: PlacementName,
    projectName: ProjectName,
    updatedDate: js.Date
  ): PlacementDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacementDescription] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: PlacementAttributeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
  }
}
