package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMatchesResponse extends StObject {
  
  /**
    * The timestamp this version of Match Result generated.
    */
  var MatchGenerationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The list of matched profiles for this instance.
    */
  var Matches: js.UndefOr[MatchesList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * The number of potential matches found.
    */
  var PotentialMatches: js.UndefOr[matchesNumber] = js.undefined
}
object GetMatchesResponse {
  
  inline def apply(): GetMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMatchesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMatchesResponse] (val x: Self) extends AnyVal {
    
    inline def setMatchGenerationDate(value: js.Date): Self = StObject.set(x, "MatchGenerationDate", value.asInstanceOf[js.Any])
    
    inline def setMatchGenerationDateUndefined: Self = StObject.set(x, "MatchGenerationDate", js.undefined)
    
    inline def setMatches(value: MatchesList): Self = StObject.set(x, "Matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "Matches", js.undefined)
    
    inline def setMatchesVarargs(value: MatchItem*): Self = StObject.set(x, "Matches", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPotentialMatches(value: matchesNumber): Self = StObject.set(x, "PotentialMatches", value.asInstanceOf[js.Any])
    
    inline def setPotentialMatchesUndefined: Self = StObject.set(x, "PotentialMatches", js.undefined)
  }
}
