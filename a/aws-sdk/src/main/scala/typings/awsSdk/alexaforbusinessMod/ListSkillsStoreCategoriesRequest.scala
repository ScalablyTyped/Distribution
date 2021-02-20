package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsStoreCategoriesRequest extends StObject {
  
  /**
    * The maximum number of categories returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}
object ListSkillsStoreCategoriesRequest {
  
  @scala.inline
  def apply(): ListSkillsStoreCategoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreCategoriesRequest]
  }
  
  @scala.inline
  implicit class ListSkillsStoreCategoriesRequestMutableBuilder[Self <: ListSkillsStoreCategoriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
