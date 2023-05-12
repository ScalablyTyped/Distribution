package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscribersRequest extends StObject {
  
  /**
    * The maximum number of accounts for which the configuration is displayed.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. You can repeat the call using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListSubscribersRequest {
  
  inline def apply(): ListSubscribersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscribersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubscribersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
