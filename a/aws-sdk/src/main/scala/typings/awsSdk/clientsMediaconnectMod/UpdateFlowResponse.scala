package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Flow] = js.undefined
}
object UpdateFlowResponse {
  
  inline def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  
  extension [Self <: UpdateFlowResponse](x: Self) {
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
