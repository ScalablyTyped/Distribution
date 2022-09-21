package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to delete.
    */
  var GatewayArn: typings.awsSdk.backupgatewayMod.GatewayArn
}
object DeleteGatewayInput {
  
  inline def apply(GatewayArn: GatewayArn): DeleteGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayInput]
  }
  
  extension [Self <: DeleteGatewayInput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
