package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var EntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntitiesDetectionJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntitiesDetectionJobsResponse {
  
  inline def apply(): ListEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntitiesDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setEntitiesDetectionJobPropertiesList(value: EntitiesDetectionJobPropertiesList): Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setEntitiesDetectionJobPropertiesListUndefined: Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", js.undefined)
    
    inline def setEntitiesDetectionJobPropertiesListVarargs(value: EntitiesDetectionJobProperties*): Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
