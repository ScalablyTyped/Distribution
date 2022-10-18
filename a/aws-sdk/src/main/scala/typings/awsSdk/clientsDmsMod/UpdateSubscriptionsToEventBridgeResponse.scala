package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriptionsToEventBridgeResponse extends StObject {
  
  /**
    * A string that indicates how many event subscriptions were migrated and how many remain to be migrated.
    */
  var Result: js.UndefOr[String] = js.undefined
}
object UpdateSubscriptionsToEventBridgeResponse {
  
  inline def apply(): UpdateSubscriptionsToEventBridgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionsToEventBridgeResponse]
  }
  
  extension [Self <: UpdateSubscriptionsToEventBridgeResponse](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
