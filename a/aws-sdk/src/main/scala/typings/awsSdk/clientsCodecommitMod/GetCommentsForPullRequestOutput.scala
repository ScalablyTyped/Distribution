package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentsForPullRequestOutput extends StObject {
  
  /**
    * An array of comment objects on the pull request.
    */
  var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.undefined
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetCommentsForPullRequestOutput {
  
  inline def apply(): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
  
  extension [Self <: GetCommentsForPullRequestOutput](x: Self) {
    
    inline def setCommentsForPullRequestData(value: CommentsForPullRequestData): Self = StObject.set(x, "commentsForPullRequestData", value.asInstanceOf[js.Any])
    
    inline def setCommentsForPullRequestDataUndefined: Self = StObject.set(x, "commentsForPullRequestData", js.undefined)
    
    inline def setCommentsForPullRequestDataVarargs(value: CommentsForPullRequest*): Self = StObject.set(x, "commentsForPullRequestData", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
