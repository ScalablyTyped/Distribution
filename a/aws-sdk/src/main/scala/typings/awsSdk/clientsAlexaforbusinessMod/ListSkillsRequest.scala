package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkillsRequest extends StObject {
  
  /**
    * Whether the skill is enabled under the user's account.
    */
  var EnablementType: js.UndefOr[EnablementTypeFilter] = js.undefined
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The ARN of the skill group for which to list enabled skills.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillTypeFilter] = js.undefined
}
object ListSkillsRequest {
  
  inline def apply(): ListSkillsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsRequest]
  }
  
  extension [Self <: ListSkillsRequest](x: Self) {
    
    inline def setEnablementType(value: EnablementTypeFilter): Self = StObject.set(x, "EnablementType", value.asInstanceOf[js.Any])
    
    inline def setEnablementTypeUndefined: Self = StObject.set(x, "EnablementType", js.undefined)
    
    inline def setMaxResults(value: SkillListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    inline def setSkillType(value: SkillTypeFilter): Self = StObject.set(x, "SkillType", value.asInstanceOf[js.Any])
    
    inline def setSkillTypeUndefined: Self = StObject.set(x, "SkillType", js.undefined)
  }
}
