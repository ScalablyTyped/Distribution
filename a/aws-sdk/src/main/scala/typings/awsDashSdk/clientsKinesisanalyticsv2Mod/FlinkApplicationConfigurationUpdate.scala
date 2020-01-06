package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CheckpointConfigurationUpdate] = js.native
  /**
    * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MonitoringConfigurationUpdate] = js.native
  /**
    * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ParallelismConfigurationUpdate] = js.native
}

object FlinkApplicationConfigurationUpdate {
  @scala.inline
  def apply(
    CheckpointConfigurationUpdate: CheckpointConfigurationUpdate = null,
    MonitoringConfigurationUpdate: MonitoringConfigurationUpdate = null,
    ParallelismConfigurationUpdate: ParallelismConfigurationUpdate = null
  ): FlinkApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfigurationUpdate != null) __obj.updateDynamic("CheckpointConfigurationUpdate")(CheckpointConfigurationUpdate.asInstanceOf[js.Any])
    if (MonitoringConfigurationUpdate != null) __obj.updateDynamic("MonitoringConfigurationUpdate")(MonitoringConfigurationUpdate.asInstanceOf[js.Any])
    if (ParallelismConfigurationUpdate != null) __obj.updateDynamic("ParallelismConfigurationUpdate")(ParallelismConfigurationUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
  }
}

