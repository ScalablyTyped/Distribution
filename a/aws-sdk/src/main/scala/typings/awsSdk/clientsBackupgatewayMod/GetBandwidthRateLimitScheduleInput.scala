package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBandwidthRateLimitScheduleInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the  ListGateways  operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
}
object GetBandwidthRateLimitScheduleInput {
  
  inline def apply(GatewayArn: GatewayArn): GetBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBandwidthRateLimitScheduleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBandwidthRateLimitScheduleInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
