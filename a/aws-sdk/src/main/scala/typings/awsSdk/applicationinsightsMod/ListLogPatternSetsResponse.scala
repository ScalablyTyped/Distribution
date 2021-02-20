package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLogPatternSetsResponse extends StObject {
  
  /**
    * The list of log pattern sets.
    */
  var LogPatternSets: js.UndefOr[LogPatternSetList] = js.native
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}
object ListLogPatternSetsResponse {
  
  @scala.inline
  def apply(): ListLogPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogPatternSetsResponse]
  }
  
  @scala.inline
  implicit class ListLogPatternSetsResponseMutableBuilder[Self <: ListLogPatternSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogPatternSets(value: LogPatternSetList): Self = StObject.set(x, "LogPatternSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPatternSetsUndefined: Self = StObject.set(x, "LogPatternSets", js.undefined)
    
    @scala.inline
    def setLogPatternSetsVarargs(value: LogPatternSetName*): Self = StObject.set(x, "LogPatternSets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
