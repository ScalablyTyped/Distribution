package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogPatternSetsResponse extends StObject {
  
  /**
    * The list of log pattern sets.
    */
  var LogPatternSets: js.UndefOr[LogPatternSetList] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}
object ListLogPatternSetsResponse {
  
  inline def apply(): ListLogPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogPatternSetsResponse]
  }
  
  extension [Self <: ListLogPatternSetsResponse](x: Self) {
    
    inline def setLogPatternSets(value: LogPatternSetList): Self = StObject.set(x, "LogPatternSets", value.asInstanceOf[js.Any])
    
    inline def setLogPatternSetsUndefined: Self = StObject.set(x, "LogPatternSets", js.undefined)
    
    inline def setLogPatternSetsVarargs(value: LogPatternSetName*): Self = StObject.set(x, "LogPatternSets", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
