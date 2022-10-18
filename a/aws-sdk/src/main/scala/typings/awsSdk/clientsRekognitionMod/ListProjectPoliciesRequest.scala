package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectPoliciesRequest extends StObject {
  
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 5. If you specify a value greater than 5, a ValidationException error occurs. The default value is 5. 
    */
  var MaxResults: js.UndefOr[ListProjectPoliciesPageSize] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * The ARN of the project for which you want to list the project policies.
    */
  var ProjectArn: typings.awsSdk.clientsRekognitionMod.ProjectArn
}
object ListProjectPoliciesRequest {
  
  inline def apply(ProjectArn: ProjectArn): ListProjectPoliciesRequest = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectPoliciesRequest]
  }
  
  extension [Self <: ListProjectPoliciesRequest](x: Self) {
    
    inline def setMaxResults(value: ListProjectPoliciesPageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
