package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProblemsRequest extends StObject {
  
  /**
    * The time when the problem ended, in epoch seconds. If not specified, problems within the past seven days are returned.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.undefined
  
  /**
    * The time when the problem was detected, in epoch seconds. If you don't specify a time frame for the request, problems within the past seven days are returned.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.undefined
}
object ListProblemsRequest {
  
  inline def apply(): ListProblemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProblemsRequest]
  }
  
  extension [Self <: ListProblemsRequest](x: Self) {
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: MaxEntities): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
