package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeParameterGroupsResponse extends StObject {
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of parameter groups. Each element in the list contains detailed information about one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
}
object DescribeParameterGroupsResponse {
  
  inline def apply(): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
  
  extension [Self <: DescribeParameterGroupsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameterGroups(value: ParameterGroupList): Self = StObject.set(x, "ParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupsUndefined: Self = StObject.set(x, "ParameterGroups", js.undefined)
    
    inline def setParameterGroupsVarargs(value: ParameterGroup*): Self = StObject.set(x, "ParameterGroups", js.Array(value*))
  }
}
