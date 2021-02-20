package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLogPatternsResponse extends StObject {
  
  /**
    * The list of log patterns.
    */
  var LogPatterns: js.UndefOr[LogPatternList] = js.native
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}
object ListLogPatternsResponse {
  
  @scala.inline
  def apply(): ListLogPatternsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogPatternsResponse]
  }
  
  @scala.inline
  implicit class ListLogPatternsResponseMutableBuilder[Self <: ListLogPatternsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogPatterns(value: LogPatternList): Self = StObject.set(x, "LogPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPatternsUndefined: Self = StObject.set(x, "LogPatterns", js.undefined)
    
    @scala.inline
    def setLogPatternsVarargs(value: LogPattern*): Self = StObject.set(x, "LogPatterns", js.Array(value :_*))
    
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
