package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouteTablesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more route tables.
    */
  var RouteTables: js.UndefOr[RouteTableList] = js.undefined
}
object DescribeRouteTablesResult {
  
  inline def apply(): DescribeRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRouteTablesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRouteTablesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRouteTables(value: RouteTableList): Self = StObject.set(x, "RouteTables", value.asInstanceOf[js.Any])
    
    inline def setRouteTablesUndefined: Self = StObject.set(x, "RouteTables", js.undefined)
    
    inline def setRouteTablesVarargs(value: RouteTable*): Self = StObject.set(x, "RouteTables", js.Array(value*))
  }
}
