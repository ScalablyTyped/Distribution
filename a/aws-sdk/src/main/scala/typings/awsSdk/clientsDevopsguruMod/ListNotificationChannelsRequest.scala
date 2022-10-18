package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationChannelsRequest extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListNotificationChannelsRequest {
  
  inline def apply(): ListNotificationChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationChannelsRequest]
  }
  
  extension [Self <: ListNotificationChannelsRequest](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
