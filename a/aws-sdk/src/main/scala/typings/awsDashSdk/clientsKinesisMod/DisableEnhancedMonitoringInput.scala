package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableEnhancedMonitoringInput extends js.Object {
  /**
    * List of shard-level metrics to disable. The following are the valid shard-level metrics. The value "ALL" disables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: MetricsNameList
  /**
    * The name of the Kinesis data stream for which to disable enhanced monitoring.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object DisableEnhancedMonitoringInput {
  @scala.inline
  def apply(ShardLevelMetrics: MetricsNameList, StreamName: StreamName): DisableEnhancedMonitoringInput = {
    val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics, StreamName = StreamName)
  
    __obj.asInstanceOf[DisableEnhancedMonitoringInput]
  }
}

