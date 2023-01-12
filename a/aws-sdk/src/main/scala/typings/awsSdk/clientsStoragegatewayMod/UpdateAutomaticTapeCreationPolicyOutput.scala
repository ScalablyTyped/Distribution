package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAutomaticTapeCreationPolicyOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object UpdateAutomaticTapeCreationPolicyOutput {
  
  inline def apply(): UpdateAutomaticTapeCreationPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAutomaticTapeCreationPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAutomaticTapeCreationPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
