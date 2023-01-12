package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuickConnectResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the quick connect. 
    */
  var QuickConnectARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the quick connect. 
    */
  var QuickConnectId: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectId] = js.undefined
}
object CreateQuickConnectResponse {
  
  inline def apply(): CreateQuickConnectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQuickConnectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQuickConnectResponse] (val x: Self) extends AnyVal {
    
    inline def setQuickConnectARN(value: ARN): Self = StObject.set(x, "QuickConnectARN", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectARNUndefined: Self = StObject.set(x, "QuickConnectARN", js.undefined)
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdUndefined: Self = StObject.set(x, "QuickConnectId", js.undefined)
  }
}
