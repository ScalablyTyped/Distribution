package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobLogItemsRequest extends StObject {
  
  /**
    * Request to describe Job log job ID.
    */
  var jobID: JobID
  
  /**
    * Request to describe Job log item maximum results.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Request to describe Job log next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeJobLogItemsRequest {
  
  inline def apply(jobID: JobID): DescribeJobLogItemsRequest = {
    val __obj = js.Dynamic.literal(jobID = jobID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobLogItemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobLogItemsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
