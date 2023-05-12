package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBandwidthRateLimitScheduleOutput extends StObject {
  
  /**
    * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals have been scheduled, the array is empty.
    */
  var BandwidthRateLimitIntervals: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.BandwidthRateLimitIntervals] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the  ListGateways  operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.GatewayArn] = js.undefined
}
object GetBandwidthRateLimitScheduleOutput {
  
  inline def apply(): GetBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBandwidthRateLimitScheduleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBandwidthRateLimitScheduleOutput] (val x: Self) extends AnyVal {
    
    inline def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    inline def setBandwidthRateLimitIntervalsUndefined: Self = StObject.set(x, "BandwidthRateLimitIntervals", js.undefined)
    
    inline def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value*))
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
