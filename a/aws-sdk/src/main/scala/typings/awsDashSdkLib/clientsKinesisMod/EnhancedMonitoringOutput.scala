package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedMonitoringOutput extends js.Object {
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[StreamName] = js.undefined
}

object EnhancedMonitoringOutput {
  @scala.inline
  def apply(
    CurrentShardLevelMetrics: MetricsNameList = null,
    DesiredShardLevelMetrics: MetricsNameList = null,
    StreamName: StreamName = null
  ): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    if (CurrentShardLevelMetrics != null) __obj.updateDynamic("CurrentShardLevelMetrics")(CurrentShardLevelMetrics)
    if (DesiredShardLevelMetrics != null) __obj.updateDynamic("DesiredShardLevelMetrics")(DesiredShardLevelMetrics)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
}

