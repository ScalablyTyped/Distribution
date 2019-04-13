package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointConfigurationDescription extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations.
    */
  var CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
    */
  var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
}

object CheckpointConfigurationDescription {
  @scala.inline
  def apply(
    CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined,
    CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined,
    ConfigurationType: ConfigurationType = null,
    MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
  ): CheckpointConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CheckpointInterval)) __obj.updateDynamic("CheckpointInterval")(CheckpointInterval)
    if (!js.isUndefined(CheckpointingEnabled)) __obj.updateDynamic("CheckpointingEnabled")(CheckpointingEnabled)
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (!js.isUndefined(MinPauseBetweenCheckpoints)) __obj.updateDynamic("MinPauseBetweenCheckpoints")(MinPauseBetweenCheckpoints)
    __obj.asInstanceOf[CheckpointConfigurationDescription]
  }
}

