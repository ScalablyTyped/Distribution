package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkillsResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The list of enabled skills requested. Required.
    */
  var SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined
}
object ListSkillsResponse {
  
  inline def apply(): ListSkillsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsResponse]
  }
  
  extension [Self <: ListSkillsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSkillSummaries(value: SkillSummaryList): Self = StObject.set(x, "SkillSummaries", value.asInstanceOf[js.Any])
    
    inline def setSkillSummariesUndefined: Self = StObject.set(x, "SkillSummaries", js.undefined)
    
    inline def setSkillSummariesVarargs(value: SkillSummary*): Self = StObject.set(x, "SkillSummaries", js.Array(value :_*))
  }
}
