package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedIpPool extends StObject {
  
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typings.awsSdk.clientsSesv2Mod.PoolName
  
  /**
    * The type of the dedicated IP pool.    STANDARD – A dedicated IP pool where the customer can control which IPs are part of the pool.    MANAGED – A dedicated IP pool where the reputation and number of IPs is automatically managed by Amazon SES.  
    */
  var ScalingMode: typings.awsSdk.clientsSesv2Mod.ScalingMode
}
object DedicatedIpPool {
  
  inline def apply(PoolName: PoolName, ScalingMode: ScalingMode): DedicatedIpPool = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any], ScalingMode = ScalingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIpPool]
  }
  
  extension [Self <: DedicatedIpPool](x: Self) {
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setScalingMode(value: ScalingMode): Self = StObject.set(x, "ScalingMode", value.asInstanceOf[js.Any])
  }
}
