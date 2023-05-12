package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBandwidthRateLimitScheduleInput extends StObject {
  
  /**
    * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals have been scheduled, the array is empty.
    */
  var BandwidthRateLimitIntervals: typings.awsSdk.clientsBackupgatewayMod.BandwidthRateLimitIntervals
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the  ListGateways  operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
}
object PutBandwidthRateLimitScheduleInput {
  
  inline def apply(BandwidthRateLimitIntervals: BandwidthRateLimitIntervals, GatewayArn: GatewayArn): PutBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(BandwidthRateLimitIntervals = BandwidthRateLimitIntervals.asInstanceOf[js.Any], GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBandwidthRateLimitScheduleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutBandwidthRateLimitScheduleInput] (val x: Self) extends AnyVal {
    
    inline def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    inline def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value*))
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
