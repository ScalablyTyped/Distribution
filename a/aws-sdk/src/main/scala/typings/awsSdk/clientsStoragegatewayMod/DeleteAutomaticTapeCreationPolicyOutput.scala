package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAutomaticTapeCreationPolicyOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object DeleteAutomaticTapeCreationPolicyOutput {
  
  inline def apply(): DeleteAutomaticTapeCreationPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAutomaticTapeCreationPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAutomaticTapeCreationPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
