package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProblemsResponse extends StObject {
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of problems. 
    */
  var ProblemList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ProblemList] = js.undefined
  
  /**
    *  The name of the resource group. 
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.undefined
}
object ListProblemsResponse {
  
  inline def apply(): ListProblemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProblemsResponse]
  }
  
  extension [Self <: ListProblemsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProblemList(value: ProblemList): Self = StObject.set(x, "ProblemList", value.asInstanceOf[js.Any])
    
    inline def setProblemListUndefined: Self = StObject.set(x, "ProblemList", js.undefined)
    
    inline def setProblemListVarargs(value: Problem*): Self = StObject.set(x, "ProblemList", js.Array(value*))
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
