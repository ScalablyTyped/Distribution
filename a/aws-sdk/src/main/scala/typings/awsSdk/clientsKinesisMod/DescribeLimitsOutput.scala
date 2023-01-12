package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLimitsOutput extends StObject {
  
  /**
    *  Indicates the number of data streams with the on-demand capacity mode.
    */
  var OnDemandStreamCount: OnDemandStreamCountObject
  
  /**
    *  The maximum number of data streams with the on-demand capacity mode. 
    */
  var OnDemandStreamCountLimit: OnDemandStreamCountLimitObject
  
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject
  
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject
}
object DescribeLimitsOutput {
  
  inline def apply(
    OnDemandStreamCount: OnDemandStreamCountObject,
    OnDemandStreamCountLimit: OnDemandStreamCountLimitObject,
    OpenShardCount: ShardCountObject,
    ShardLimit: ShardCountObject
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OnDemandStreamCount = OnDemandStreamCount.asInstanceOf[js.Any], OnDemandStreamCountLimit = OnDemandStreamCountLimit.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    
    inline def setOnDemandStreamCount(value: OnDemandStreamCountObject): Self = StObject.set(x, "OnDemandStreamCount", value.asInstanceOf[js.Any])
    
    inline def setOnDemandStreamCountLimit(value: OnDemandStreamCountLimitObject): Self = StObject.set(x, "OnDemandStreamCountLimit", value.asInstanceOf[js.Any])
    
    inline def setOpenShardCount(value: ShardCountObject): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
    
    inline def setShardLimit(value: ShardCountObject): Self = StObject.set(x, "ShardLimit", value.asInstanceOf[js.Any])
  }
}
