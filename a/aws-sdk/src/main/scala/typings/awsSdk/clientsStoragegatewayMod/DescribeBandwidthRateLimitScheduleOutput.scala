package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBandwidthRateLimitScheduleOutput extends StObject {
  
  /**
    *  An array that contains the bandwidth rate limit intervals for a tape or volume gateway. 
    */
  var BandwidthRateLimitIntervals: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.BandwidthRateLimitIntervals] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object DescribeBandwidthRateLimitScheduleOutput {
  
  inline def apply(): DescribeBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBandwidthRateLimitScheduleOutput]
  }
  
  extension [Self <: DescribeBandwidthRateLimitScheduleOutput](x: Self) {
    
    inline def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    inline def setBandwidthRateLimitIntervalsUndefined: Self = StObject.set(x, "BandwidthRateLimitIntervals", js.undefined)
    
    inline def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
