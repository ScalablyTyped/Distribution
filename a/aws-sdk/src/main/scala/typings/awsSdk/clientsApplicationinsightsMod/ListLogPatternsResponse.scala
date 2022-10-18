package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogPatternsResponse extends StObject {
  
  /**
    * The list of log patterns.
    */
  var LogPatterns: js.UndefOr[LogPatternList] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}
object ListLogPatternsResponse {
  
  inline def apply(): ListLogPatternsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogPatternsResponse]
  }
  
  extension [Self <: ListLogPatternsResponse](x: Self) {
    
    inline def setLogPatterns(value: LogPatternList): Self = StObject.set(x, "LogPatterns", value.asInstanceOf[js.Any])
    
    inline def setLogPatternsUndefined: Self = StObject.set(x, "LogPatterns", js.undefined)
    
    inline def setLogPatternsVarargs(value: LogPattern*): Self = StObject.set(x, "LogPatterns", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
