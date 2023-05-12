package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterGatewayInstanceRequest extends StObject {
  
  /**
    * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on it.
    */
  var Force: js.UndefOr[boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
    */
  var GatewayInstanceArn: string
}
object DeregisterGatewayInstanceRequest {
  
  inline def apply(GatewayInstanceArn: string): DeregisterGatewayInstanceRequest = {
    val __obj = js.Dynamic.literal(GatewayInstanceArn = GatewayInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterGatewayInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterGatewayInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setForce(value: boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setGatewayInstanceArn(value: string): Self = StObject.set(x, "GatewayInstanceArn", value.asInstanceOf[js.Any])
  }
}
