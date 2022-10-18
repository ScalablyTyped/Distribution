package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectPoliciesResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of project policies.
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * A list of project policies attached to the project.
    */
  var ProjectPolicies: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectPolicies] = js.undefined
}
object ListProjectPoliciesResponse {
  
  inline def apply(): ListProjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectPoliciesResponse]
  }
  
  extension [Self <: ListProjectPoliciesResponse](x: Self) {
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectPolicies(value: ProjectPolicies): Self = StObject.set(x, "ProjectPolicies", value.asInstanceOf[js.Any])
    
    inline def setProjectPoliciesUndefined: Self = StObject.set(x, "ProjectPolicies", js.undefined)
    
    inline def setProjectPoliciesVarargs(value: ProjectPolicy*): Self = StObject.set(x, "ProjectPolicies", js.Array(value*))
  }
}
