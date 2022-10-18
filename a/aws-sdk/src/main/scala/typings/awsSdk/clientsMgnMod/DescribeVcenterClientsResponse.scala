package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVcenterClientsResponse extends StObject {
  
  /**
    * List of items returned by DescribeVcenterClients.
    */
  var items: js.UndefOr[VcenterClientList] = js.undefined
  
  /**
    * Next pagination token returned from DescribeVcenterClients.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeVcenterClientsResponse {
  
  inline def apply(): DescribeVcenterClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVcenterClientsResponse]
  }
  
  extension [Self <: DescribeVcenterClientsResponse](x: Self) {
    
    inline def setItems(value: VcenterClientList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: VcenterClient*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
