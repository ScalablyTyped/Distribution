package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBridgeOutputResponse extends StObject {
  
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  var OutputName: js.UndefOr[string] = js.undefined
}
object RemoveBridgeOutputResponse {
  
  inline def apply(): RemoveBridgeOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveBridgeOutputResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBridgeOutputResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setOutputName(value: string): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
    
    inline def setOutputNameUndefined: Self = StObject.set(x, "OutputName", js.undefined)
  }
}
