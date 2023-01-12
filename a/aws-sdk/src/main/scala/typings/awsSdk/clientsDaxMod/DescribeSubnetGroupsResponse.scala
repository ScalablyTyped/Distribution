package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubnetGroupsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of subnet groups. Each element in the array represents a single subnet group.
    */
  var SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined
}
object DescribeSubnetGroupsResponse {
  
  inline def apply(): DescribeSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSubnetGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubnetGroups(value: SubnetGroupList): Self = StObject.set(x, "SubnetGroups", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupsUndefined: Self = StObject.set(x, "SubnetGroups", js.undefined)
    
    inline def setSubnetGroupsVarargs(value: SubnetGroup*): Self = StObject.set(x, "SubnetGroups", js.Array(value*))
  }
}
