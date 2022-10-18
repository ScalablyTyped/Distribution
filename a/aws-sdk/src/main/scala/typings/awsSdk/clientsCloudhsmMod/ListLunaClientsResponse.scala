package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLunaClientsResponse extends StObject {
  
  /**
    * The list of clients.
    */
  var ClientList: typings.awsSdk.clientsCloudhsmMod.ClientList
  
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListLunaClientsResponse {
  
  inline def apply(ClientList: ClientList): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
  
  extension [Self <: ListLunaClientsResponse](x: Self) {
    
    inline def setClientList(value: ClientList): Self = StObject.set(x, "ClientList", value.asInstanceOf[js.Any])
    
    inline def setClientListVarargs(value: ClientArn*): Self = StObject.set(x, "ClientList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
