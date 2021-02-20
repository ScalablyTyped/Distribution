package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobDefinitionsRequest extends StObject {
  
  /**
    * The name of the job definition to describe.
    */
  var jobDefinitionName: js.UndefOr[String] = js.native
  
  /**
    * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
    */
  var jobDefinitions: js.UndefOr[StringList] = js.native
  
  /**
    * The maximum number of results returned by DescribeJobDefinitions in paginated output. When this parameter is used, DescribeJobDefinitions only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobDefinitions request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeJobDefinitions returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The nextToken value returned from a previous paginated DescribeJobDefinitions request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The status with which to filter job definitions.
    */
  var status: js.UndefOr[String] = js.native
}
object DescribeJobDefinitionsRequest {
  
  @scala.inline
  def apply(): DescribeJobDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobDefinitionsRequest]
  }
  
  @scala.inline
  implicit class DescribeJobDefinitionsRequestMutableBuilder[Self <: DescribeJobDefinitionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDefinitionNameUndefined: Self = StObject.set(x, "jobDefinitionName", js.undefined)
    
    @scala.inline
    def setJobDefinitions(value: StringList): Self = StObject.set(x, "jobDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDefinitionsUndefined: Self = StObject.set(x, "jobDefinitions", js.undefined)
    
    @scala.inline
    def setJobDefinitionsVarargs(value: String*): Self = StObject.set(x, "jobDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
