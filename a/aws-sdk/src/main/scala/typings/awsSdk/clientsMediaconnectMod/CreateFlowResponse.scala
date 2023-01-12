package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Flow] = js.undefined
}
object CreateFlowResponse {
  
  inline def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
