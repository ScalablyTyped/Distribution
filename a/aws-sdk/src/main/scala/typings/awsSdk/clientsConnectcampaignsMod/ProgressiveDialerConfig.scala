package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressiveDialerConfig extends StObject {
  
  var bandwidthAllocation: BandwidthAllocation
}
object ProgressiveDialerConfig {
  
  inline def apply(bandwidthAllocation: BandwidthAllocation): ProgressiveDialerConfig = {
    val __obj = js.Dynamic.literal(bandwidthAllocation = bandwidthAllocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressiveDialerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressiveDialerConfig] (val x: Self) extends AnyVal {
    
    inline def setBandwidthAllocation(value: BandwidthAllocation): Self = StObject.set(x, "bandwidthAllocation", value.asInstanceOf[js.Any])
  }
}
