package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveDialerConfig extends StObject {
  
  var bandwidthAllocation: BandwidthAllocation
}
object PredictiveDialerConfig {
  
  inline def apply(bandwidthAllocation: BandwidthAllocation): PredictiveDialerConfig = {
    val __obj = js.Dynamic.literal(bandwidthAllocation = bandwidthAllocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveDialerConfig]
  }
  
  extension [Self <: PredictiveDialerConfig](x: Self) {
    
    inline def setBandwidthAllocation(value: BandwidthAllocation): Self = StObject.set(x, "bandwidthAllocation", value.asInstanceOf[js.Any])
  }
}
