package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayRouteTablesResult extends StObject {
  
  /**
    * Information about the local gateway route tables.
    */
  var LocalGatewayRouteTables: js.UndefOr[LocalGatewayRouteTableSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayRouteTablesResult {
  
  inline def apply(): DescribeLocalGatewayRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTablesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocalGatewayRouteTablesResult] (val x: Self) extends AnyVal {
    
    inline def setLocalGatewayRouteTables(value: LocalGatewayRouteTableSet): Self = StObject.set(x, "LocalGatewayRouteTables", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTablesUndefined: Self = StObject.set(x, "LocalGatewayRouteTables", js.undefined)
    
    inline def setLocalGatewayRouteTablesVarargs(value: LocalGatewayRouteTable*): Self = StObject.set(x, "LocalGatewayRouteTables", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
