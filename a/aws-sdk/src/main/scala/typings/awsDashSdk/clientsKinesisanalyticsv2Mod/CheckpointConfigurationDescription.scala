package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfigurationDescription extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CheckpointInterval] = js.native
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType] = js.native
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.native
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
    if (!js.isUndefined(CheckpointingEnabled)) __obj.updateDynamic("CheckpointingEnabled")(CheckpointingEnabled.asInstanceOf[js.Any])
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (MinPauseBetweenCheckpoints != null) __obj.updateDynamic("MinPauseBetweenCheckpoints")(MinPauseBetweenCheckpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfigurationDescription]
  }
}

