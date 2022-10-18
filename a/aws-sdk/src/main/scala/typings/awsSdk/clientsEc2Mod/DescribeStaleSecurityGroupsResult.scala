package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStaleSecurityGroupsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the stale security groups.
    */
  var StaleSecurityGroupSet: js.UndefOr[typings.awsSdk.clientsEc2Mod.StaleSecurityGroupSet] = js.undefined
}
object DescribeStaleSecurityGroupsResult {
  
  inline def apply(): DescribeStaleSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStaleSecurityGroupsResult]
  }
  
  extension [Self <: DescribeStaleSecurityGroupsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStaleSecurityGroupSet(value: StaleSecurityGroupSet): Self = StObject.set(x, "StaleSecurityGroupSet", value.asInstanceOf[js.Any])
    
    inline def setStaleSecurityGroupSetUndefined: Self = StObject.set(x, "StaleSecurityGroupSet", js.undefined)
    
    inline def setStaleSecurityGroupSetVarargs(value: StaleSecurityGroup*): Self = StObject.set(x, "StaleSecurityGroupSet", js.Array(value*))
  }
}
