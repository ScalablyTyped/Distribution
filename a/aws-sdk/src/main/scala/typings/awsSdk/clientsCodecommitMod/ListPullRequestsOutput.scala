package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPullRequestsOutput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The system-generated IDs of the pull requests.
    */
  var pullRequestIds: PullRequestIdList
}
object ListPullRequestsOutput {
  
  inline def apply(pullRequestIds: PullRequestIdList): ListPullRequestsOutput = {
    val __obj = js.Dynamic.literal(pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsOutput]
  }
  
  extension [Self <: ListPullRequestsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPullRequestIds(value: PullRequestIdList): Self = StObject.set(x, "pullRequestIds", value.asInstanceOf[js.Any])
    
    inline def setPullRequestIdsVarargs(value: PullRequestId*): Self = StObject.set(x, "pullRequestIds", js.Array(value*))
  }
}
