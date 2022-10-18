package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentsForComparedCommitOutput extends StObject {
  
  /**
    * A list of comment objects on the compared commit.
    */
  var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.undefined
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetCommentsForComparedCommitOutput {
  
  inline def apply(): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
  
  extension [Self <: GetCommentsForComparedCommitOutput](x: Self) {
    
    inline def setCommentsForComparedCommitData(value: CommentsForComparedCommitData): Self = StObject.set(x, "commentsForComparedCommitData", value.asInstanceOf[js.Any])
    
    inline def setCommentsForComparedCommitDataUndefined: Self = StObject.set(x, "commentsForComparedCommitData", js.undefined)
    
    inline def setCommentsForComparedCommitDataVarargs(value: CommentsForComparedCommit*): Self = StObject.set(x, "commentsForComparedCommitData", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
