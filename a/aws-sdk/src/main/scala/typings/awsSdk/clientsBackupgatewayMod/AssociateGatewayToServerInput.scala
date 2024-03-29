package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateGatewayToServerInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
  
  /**
    * The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
    */
  var ServerArn: typings.awsSdk.clientsBackupgatewayMod.ServerArn
}
object AssociateGatewayToServerInput {
  
  inline def apply(GatewayArn: GatewayArn, ServerArn: ServerArn): AssociateGatewayToServerInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any], ServerArn = ServerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateGatewayToServerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateGatewayToServerInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setServerArn(value: ServerArn): Self = StObject.set(x, "ServerArn", value.asInstanceOf[js.Any])
  }
}
