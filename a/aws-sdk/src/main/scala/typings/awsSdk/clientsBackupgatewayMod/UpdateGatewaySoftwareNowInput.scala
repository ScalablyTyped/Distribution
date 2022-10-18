package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewaySoftwareNowInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to be updated.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
}
object UpdateGatewaySoftwareNowInput {
  
  inline def apply(GatewayArn: GatewayArn): UpdateGatewaySoftwareNowInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewaySoftwareNowInput]
  }
  
  extension [Self <: UpdateGatewaySoftwareNowInput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
