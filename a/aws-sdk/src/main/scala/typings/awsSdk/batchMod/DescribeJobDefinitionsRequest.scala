package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobDefinitionsRequest extends StObject {
  
  /**
    * The name of the job definition to describe.
    */
  var jobDefinitionName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of up to 100 job definitions. Each entry in the list can either be an ARN in the format arn:aws:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision} or a short version using the form ${JobDefinitionName}:${Revision}.
    */
  var jobDefinitions: js.UndefOr[StringList] = js.undefined
  
  /**
    * The maximum number of results returned by DescribeJobDefinitions in paginated output. When this parameter is used, DescribeJobDefinitions only returns maxResults results in a single page and a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobDefinitions request with the returned nextToken value. This value can be between 1 and 100. If this parameter isn't used, then DescribeJobDefinitions returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeJobDefinitions request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that's only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The status used to filter job definitions.
    */
  var status: js.UndefOr[String] = js.undefined
}
object DescribeJobDefinitionsRequest {
  
  inline def apply(): DescribeJobDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobDefinitionsRequest]
  }
  
  extension [Self <: DescribeJobDefinitionsRequest](x: Self) {
    
    inline def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionNameUndefined: Self = StObject.set(x, "jobDefinitionName", js.undefined)
    
    inline def setJobDefinitions(value: StringList): Self = StObject.set(x, "jobDefinitions", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionsUndefined: Self = StObject.set(x, "jobDefinitions", js.undefined)
    
    inline def setJobDefinitionsVarargs(value: String*): Self = StObject.set(x, "jobDefinitions", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
