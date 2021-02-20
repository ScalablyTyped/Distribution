package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSkillGroupsResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.native
  
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}
object SearchSkillGroupsResponse {
  
  @scala.inline
  def apply(): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
  
  @scala.inline
  implicit class SearchSkillGroupsResponseMutableBuilder[Self <: SearchSkillGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSkillGroups(value: SkillGroupDataList): Self = StObject.set(x, "SkillGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupsUndefined: Self = StObject.set(x, "SkillGroups", js.undefined)
    
    @scala.inline
    def setSkillGroupsVarargs(value: SkillGroupData*): Self = StObject.set(x, "SkillGroups", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
