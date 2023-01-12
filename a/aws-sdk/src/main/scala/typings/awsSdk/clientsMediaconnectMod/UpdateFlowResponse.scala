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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
