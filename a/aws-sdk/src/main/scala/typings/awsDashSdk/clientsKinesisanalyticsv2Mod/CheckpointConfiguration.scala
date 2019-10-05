package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointConfiguration extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations. 
    */
  var CheckpointInterval: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CheckpointInterval] = js.undefined
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes whether the application uses Amazon Kinesis Data Analytics' default checkpointing behavior. 
    */
  var ConfigurationType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start. If a checkpoint operation takes longer than the CheckpointInterval, the application otherwise performs continual checkpoint operations. For more information, see  Tuning Checkpointing in the Apache Flink Documentation.
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.undefined
}

object CheckpointConfiguration {
  @scala.inline
  def apply(
    ConfigurationType: ConfigurationType,
    CheckpointInterval: Int | Double = null,
    CheckpointingEnabled: js.UndefOr[Boolean] = js.undefined,
    MinPauseBetweenCheckpoints: Int | Double = null
  ): CheckpointConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    if (CheckpointInterval != null) __obj.updateDynamic("CheckpointInterval")(CheckpointInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(CheckpointingEnabled)) __obj.updateDynamic("CheckpointingEnabled")(CheckpointingEnabled)
    if (MinPauseBetweenCheckpoints != null) __obj.updateDynamic("MinPauseBetweenCheckpoints")(MinPauseBetweenCheckpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfiguration]
  }
}

