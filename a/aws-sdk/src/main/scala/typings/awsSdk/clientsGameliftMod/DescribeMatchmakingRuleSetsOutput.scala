package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMatchmakingRuleSetsOutput extends StObject {
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A collection of requested matchmaking rule set objects. 
    */
  var RuleSets: MatchmakingRuleSetList
}
object DescribeMatchmakingRuleSetsOutput {
  
  inline def apply(RuleSets: MatchmakingRuleSetList): DescribeMatchmakingRuleSetsOutput = {
    val __obj = js.Dynamic.literal(RuleSets = RuleSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
  }
  
  extension [Self <: DescribeMatchmakingRuleSetsOutput](x: Self) {
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuleSets(value: MatchmakingRuleSetList): Self = StObject.set(x, "RuleSets", value.asInstanceOf[js.Any])
    
    inline def setRuleSetsVarargs(value: MatchmakingRuleSet*): Self = StObject.set(x, "RuleSets", js.Array(value*))
  }
}
