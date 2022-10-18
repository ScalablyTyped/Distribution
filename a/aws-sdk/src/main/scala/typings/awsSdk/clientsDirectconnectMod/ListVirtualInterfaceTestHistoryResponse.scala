package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualInterfaceTestHistoryResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceTestHistory: js.UndefOr[VirtualInterfaceTestHistoryList] = js.undefined
}
object ListVirtualInterfaceTestHistoryResponse {
  
  inline def apply(): ListVirtualInterfaceTestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryResponse]
  }
  
  extension [Self <: ListVirtualInterfaceTestHistoryResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVirtualInterfaceTestHistory(value: VirtualInterfaceTestHistoryList): Self = StObject.set(x, "virtualInterfaceTestHistory", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceTestHistoryUndefined: Self = StObject.set(x, "virtualInterfaceTestHistory", js.undefined)
    
    inline def setVirtualInterfaceTestHistoryVarargs(value: VirtualInterfaceTestHistory*): Self = StObject.set(x, "virtualInterfaceTestHistory", js.Array(value*))
  }
}
