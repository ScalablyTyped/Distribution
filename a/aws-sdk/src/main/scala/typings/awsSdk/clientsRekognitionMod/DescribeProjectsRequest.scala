package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectsRequest extends StObject {
  
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100. 
    */
  var MaxResults: js.UndefOr[ProjectsPageSize] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * A list of the projects that you want Amazon Rekognition Custom Labels to describe. If you don't specify a value, the response includes descriptions for all the projects in your AWS account.
    */
  var ProjectNames: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectNames] = js.undefined
}
object DescribeProjectsRequest {
  
  inline def apply(): DescribeProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectsRequest]
  }
  
  extension [Self <: DescribeProjectsRequest](x: Self) {
    
    inline def setMaxResults(value: ProjectsPageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectNames(value: ProjectNames): Self = StObject.set(x, "ProjectNames", value.asInstanceOf[js.Any])
    
    inline def setProjectNamesUndefined: Self = StObject.set(x, "ProjectNames", js.undefined)
    
    inline def setProjectNamesVarargs(value: ProjectName*): Self = StObject.set(x, "ProjectNames", js.Array(value*))
  }
}
