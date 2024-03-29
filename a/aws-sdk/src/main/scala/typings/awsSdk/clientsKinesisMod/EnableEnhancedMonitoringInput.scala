package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableEnhancedMonitoringInput extends StObject {
  
  /**
    * List of shard-level metrics to enable. The following are the valid shard-level metrics. The value "ALL" enables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: MetricsNameList
  
  /**
    * The ARN of the stream.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamARN] = js.undefined
  
  /**
    * The name of the stream for which to enable enhanced monitoring.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamName] = js.undefined
}
object EnableEnhancedMonitoringInput {
  
  inline def apply(ShardLevelMetrics: MetricsNameList): EnableEnhancedMonitoringInput = {
    val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableEnhancedMonitoringInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableEnhancedMonitoringInput] (val x: Self) extends AnyVal {
    
    inline def setShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "ShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "ShardLevelMetrics", js.Array(value*))
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
