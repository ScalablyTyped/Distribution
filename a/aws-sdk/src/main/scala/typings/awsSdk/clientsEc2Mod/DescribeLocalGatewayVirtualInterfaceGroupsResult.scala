package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayVirtualInterfaceGroupsResult extends StObject {
  
  /**
    * The virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroups: js.UndefOr[LocalGatewayVirtualInterfaceGroupSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayVirtualInterfaceGroupsResult {
  
  inline def apply(): DescribeLocalGatewayVirtualInterfaceGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsResult]
  }
  
  extension [Self <: DescribeLocalGatewayVirtualInterfaceGroupsResult](x: Self) {
    
    inline def setLocalGatewayVirtualInterfaceGroups(value: LocalGatewayVirtualInterfaceGroupSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupsUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", js.undefined)
    
    inline def setLocalGatewayVirtualInterfaceGroupsVarargs(value: LocalGatewayVirtualInterfaceGroup*): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
