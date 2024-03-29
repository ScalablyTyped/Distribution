package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableGatewayInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object DisableGatewayInput {
  
  inline def apply(GatewayARN: GatewayARN): DisableGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableGatewayInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableGatewayInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
