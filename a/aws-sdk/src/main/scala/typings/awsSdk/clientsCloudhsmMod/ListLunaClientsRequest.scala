package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLunaClientsRequest extends StObject {
  
  /**
    * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListLunaClientsRequest {
  
  inline def apply(): ListLunaClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLunaClientsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLunaClientsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
