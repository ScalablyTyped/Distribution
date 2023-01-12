package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewaySoftwareNowOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway you updated.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.GatewayArn] = js.undefined
}
object UpdateGatewaySoftwareNowOutput {
  
  inline def apply(): UpdateGatewaySoftwareNowOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGatewaySoftwareNowOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
