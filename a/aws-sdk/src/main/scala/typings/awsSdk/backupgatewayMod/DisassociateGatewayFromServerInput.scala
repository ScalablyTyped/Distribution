package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateGatewayFromServerInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to disassociate.
    */
  var GatewayArn: typings.awsSdk.backupgatewayMod.GatewayArn
}
object DisassociateGatewayFromServerInput {
  
  inline def apply(GatewayArn: GatewayArn): DisassociateGatewayFromServerInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateGatewayFromServerInput]
  }
  
  extension [Self <: DisassociateGatewayFromServerInput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
