package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSkillGroupsResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined
  
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}
object SearchSkillGroupsResponse {
  
  inline def apply(): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
  
  extension [Self <: SearchSkillGroupsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSkillGroups(value: SkillGroupDataList): Self = StObject.set(x, "SkillGroups", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupsUndefined: Self = StObject.set(x, "SkillGroups", js.undefined)
    
    inline def setSkillGroupsVarargs(value: SkillGroupData*): Self = StObject.set(x, "SkillGroups", js.Array(value*))
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
