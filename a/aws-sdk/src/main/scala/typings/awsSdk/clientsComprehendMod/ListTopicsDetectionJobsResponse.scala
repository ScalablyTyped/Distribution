package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicsDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var TopicsDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.TopicsDetectionJobPropertiesList] = js.undefined
}
object ListTopicsDetectionJobsResponse {
  
  inline def apply(): ListTopicsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTopicsDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTopicsDetectionJobPropertiesList(value: TopicsDetectionJobPropertiesList): Self = StObject.set(x, "TopicsDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setTopicsDetectionJobPropertiesListUndefined: Self = StObject.set(x, "TopicsDetectionJobPropertiesList", js.undefined)
    
    inline def setTopicsDetectionJobPropertiesListVarargs(value: TopicsDetectionJobProperties*): Self = StObject.set(x, "TopicsDetectionJobPropertiesList", js.Array(value*))
  }
}
