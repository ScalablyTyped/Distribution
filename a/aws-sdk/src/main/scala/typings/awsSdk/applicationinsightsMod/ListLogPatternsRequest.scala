package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogPatternsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
}
object ListLogPatternsRequest {
  
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): ListLogPatternsRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogPatternsRequest]
  }
  
  @scala.inline
  implicit class ListLogPatternsRequestMutableBuilder[Self <: ListLogPatternsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxEntities): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetNameUndefined: Self = StObject.set(x, "PatternSetName", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
