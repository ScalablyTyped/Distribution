package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCandidatesForAutoMLJobResponse extends StObject {
  
  /**
    * Summaries about the AutoMLCandidates.
    */
  var Candidates: AutoMLCandidates
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListCandidatesForAutoMLJobResponse {
  
  inline def apply(Candidates: AutoMLCandidates): ListCandidatesForAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(Candidates = Candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCandidatesForAutoMLJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: AutoMLCandidates): Self = StObject.set(x, "Candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: AutoMLCandidate*): Self = StObject.set(x, "Candidates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
