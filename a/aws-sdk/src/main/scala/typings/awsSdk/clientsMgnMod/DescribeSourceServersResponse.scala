package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceServersResponse extends StObject {
  
  /**
    * Request to filter Source Servers list by item.
    */
  var items: js.UndefOr[SourceServersList] = js.undefined
  
  /**
    * Request to filter Source Servers next token.
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
