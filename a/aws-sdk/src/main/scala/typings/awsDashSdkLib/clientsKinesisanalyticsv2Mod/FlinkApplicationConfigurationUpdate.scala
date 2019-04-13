package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlinkApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationUpdate: js.UndefOr[CheckpointConfigurationUpdate] = js.undefined
  /**
    * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[MonitoringConfigurationUpdate] = js.undefined
  /**
    * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate] = js.undefined
}

object FlinkApplicationConfigurationUpdate {
  @scala.inline
  def apply(
    CheckpointConfigurationUpdate: CheckpointConfigurationUpdate = null,
    MonitoringConfigurationUpdate: MonitoringConfigurationUpdate = null,
    ParallelismConfigurationUpdate: ParallelismConfigurationUpdate = null
  ): FlinkApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfigurationUpdate != null) __obj.updateDynamic("CheckpointConfigurationUpdate")(CheckpointConfigurationUpdate)
    if (MonitoringConfigurationUpdate != null) __obj.updateDynamic("MonitoringConfigurationUpdate")(MonitoringConfigurationUpdate)
    if (ParallelismConfigurationUpdate != null) __obj.updateDynamic("ParallelismConfigurationUpdate")(ParallelismConfigurationUpdate)
    __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
  }
}

