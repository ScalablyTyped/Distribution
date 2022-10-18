package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceServersResponse extends StObject {
  
  /**
    * An array of Source Servers.
    */
  var items: js.UndefOr[SourceServersList] = js.undefined
  
  /**
    * The token of the next Source Server to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeSourceServersResponse {
  
  inline def apply(): DescribeSourceServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSourceServersResponse]
  }
  
  extension [Self <: DescribeSourceServersResponse](x: Self) {
    
    inline def setItems(value: SourceServersList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SourceServer*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
