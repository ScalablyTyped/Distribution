package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedIp extends StObject {
  
  /**
    * An IP address that is reserved for use by your Amazon Pinpoint account.
    */
  var Ip: typings.awsSdk.clientsPinpointemailMod.Ip
  
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.PoolName] = js.undefined
  
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper
  
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: typings.awsSdk.clientsPinpointemailMod.WarmupStatus
}
object DedicatedIp {
  
  inline def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper, WarmupStatus: WarmupStatus): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any], WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DedicatedIp] (val x: Self) extends AnyVal {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "PoolName", js.undefined)
    
    inline def setWarmupPercentage(value: Percentage100Wrapper): Self = StObject.set(x, "WarmupPercentage", value.asInstanceOf[js.Any])
    
    inline def setWarmupStatus(value: WarmupStatus): Self = StObject.set(x, "WarmupStatus", value.asInstanceOf[js.Any])
  }
}
