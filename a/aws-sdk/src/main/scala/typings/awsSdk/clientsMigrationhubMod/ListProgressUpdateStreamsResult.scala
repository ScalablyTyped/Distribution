package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProgressUpdateStreamsResult extends StObject {
  
  /**
    * If there are more streams created than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * List of progress update streams up to the max number of results passed in the input.
    */
  var ProgressUpdateStreamSummaryList: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ProgressUpdateStreamSummaryList] = js.undefined
}
object ListProgressUpdateStreamsResult {
  
  inline def apply(): ListProgressUpdateStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProgressUpdateStreamsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProgressUpdateStreamsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProgressUpdateStreamSummaryList(value: ProgressUpdateStreamSummaryList): Self = StObject.set(x, "ProgressUpdateStreamSummaryList", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStreamSummaryListUndefined: Self = StObject.set(x, "ProgressUpdateStreamSummaryList", js.undefined)
    
    inline def setProgressUpdateStreamSummaryListVarargs(value: ProgressUpdateStreamSummary*): Self = StObject.set(x, "ProgressUpdateStreamSummaryList", js.Array(value*))
  }
}
