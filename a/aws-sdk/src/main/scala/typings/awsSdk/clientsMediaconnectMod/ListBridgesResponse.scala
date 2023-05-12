package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBridgesResponse extends StObject {
  
  /**
    * A list of bridge summaries.
    */
  var Bridges: js.UndefOr[listOfListedBridge] = js.undefined
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListBridges request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListBridges request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListBridgesResponse {
  
  inline def apply(): ListBridgesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBridgesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBridgesResponse] (val x: Self) extends AnyVal {
    
    inline def setBridges(value: listOfListedBridge): Self = StObject.set(x, "Bridges", value.asInstanceOf[js.Any])
    
    inline def setBridgesUndefined: Self = StObject.set(x, "Bridges", js.undefined)
    
    inline def setBridgesVarargs(value: ListedBridge*): Self = StObject.set(x, "Bridges", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
