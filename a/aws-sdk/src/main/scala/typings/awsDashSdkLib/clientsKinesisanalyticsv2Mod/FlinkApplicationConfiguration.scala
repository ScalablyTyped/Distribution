package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlinkApplicationConfiguration extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see  Checkpoints for Fault Tolerance in the Apache Flink Documentation. 
    */
  var CheckpointConfiguration: js.UndefOr[CheckpointConfiguration] = js.undefined
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfiguration: js.UndefOr[ParallelismConfiguration] = js.undefined
}

object FlinkApplicationConfiguration {
  @scala.inline
  def apply(
    CheckpointConfiguration: CheckpointConfiguration = null,
    MonitoringConfiguration: MonitoringConfiguration = null,
    ParallelismConfiguration: ParallelismConfiguration = null
  ): FlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfiguration != null) __obj.updateDynamic("CheckpointConfiguration")(CheckpointConfiguration)
    if (MonitoringConfiguration != null) __obj.updateDynamic("MonitoringConfiguration")(MonitoringConfiguration)
    if (ParallelismConfiguration != null) __obj.updateDynamic("ParallelismConfiguration")(ParallelismConfiguration)
    __obj.asInstanceOf[FlinkApplicationConfiguration]
  }
}

