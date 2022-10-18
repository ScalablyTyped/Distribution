package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubnetGroupsResponse extends StObject {
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of subnet groups. Each element in the list contains detailed information about one group.
    */
  var SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined
}
object DescribeSubnetGroupsResponse {
  
  inline def apply(): DescribeSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetGroupsResponse]
  }
  
  extension [Self <: DescribeSubnetGroupsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubnetGroups(value: SubnetGroupList): Self = StObject.set(x, "SubnetGroups", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupsUndefined: Self = StObject.set(x, "SubnetGroups", js.undefined)
    
    inline def setSubnetGroupsVarargs(value: SubnetGroup*): Self = StObject.set(x, "SubnetGroups", js.Array(value*))
  }
}
