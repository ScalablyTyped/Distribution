package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointConfigurationDescription extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations.
    */
  var CheckpointInterval: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CheckpointInterval] = js.undefined
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
    */
  var ConfigurationType: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType] = js.undefined
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.undefined
}

object CheckpointConfigurationDescription {
  @scala.inline
  def apply(
    CheckpointInterval: Int | Double = null,
    CheckpointingEnabled: js.UndefOr[Boolean] = js.undefined,
    ConfigurationType: ConfigurationType = null,
    MinPauseBetweenCheckpoints: Int | Double = null
  ): CheckpointConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (CheckpointInterval != null) __obj.updateDynamic("CheckpointInterval")(CheckpointInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(CheckpointingEnabled)) __obj.updateDynamic("CheckpointingEnabled")(CheckpointingEnabled)
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (MinPauseBetweenCheckpoints != null) __obj.updateDynamic("MinPauseBetweenCheckpoints")(MinPauseBetweenCheckpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfigurationDescription]
  }
}

