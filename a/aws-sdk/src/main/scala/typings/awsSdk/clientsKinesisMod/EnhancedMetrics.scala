package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedMetrics extends StObject {
  
  /**
    * List of shard-level metrics. The following are the valid shard-level metrics. The value "ALL" enhances every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
}
object EnhancedMetrics {
  
  inline def apply(): EnhancedMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnhancedMetrics] (val x: Self) extends AnyVal {
    
    inline def setShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "ShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setShardLevelMetricsUndefined: Self = StObject.set(x, "ShardLevelMetrics", js.undefined)
    
    inline def setShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "ShardLevelMetrics", js.Array(value*))
  }
}
