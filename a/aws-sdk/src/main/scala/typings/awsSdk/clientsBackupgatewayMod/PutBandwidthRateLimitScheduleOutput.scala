package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBandwidthRateLimitScheduleOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the  ListGateways  operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.GatewayArn] = js.undefined
}
object PutBandwidthRateLimitScheduleOutput {
  
  inline def apply(): PutBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutBandwidthRateLimitScheduleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutBandwidthRateLimitScheduleOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
