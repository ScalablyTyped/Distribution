package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedGateway extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  var GatewayArn: string
  
  var GatewayState: typings.awsSdk.clientsMediaconnectMod.GatewayState
  
  /**
    * The name of the gateway.
    */
  var Name: string
}
object ListedGateway {
  
  inline def apply(GatewayArn: string, GatewayState: GatewayState, Name: string): ListedGateway = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any], GatewayState = GatewayState.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListedGateway] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: string): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayState(value: GatewayState): Self = StObject.set(x, "GatewayState", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
