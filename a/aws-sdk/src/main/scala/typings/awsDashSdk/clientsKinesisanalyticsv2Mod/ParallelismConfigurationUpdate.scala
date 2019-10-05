package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelismConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service, or if a custom parallelism is used.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
  /**
    * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.undefined
  /**
    * Describes updates to the initial number of parallel tasks an application can perform.
    */
  var ParallelismUpdate: js.UndefOr[Parallelism] = js.undefined
}

object ParallelismConfigurationUpdate {
  @scala.inline
  def apply(
    AutoScalingEnabledUpdate: js.UndefOr[Boolean] = js.undefined,
    ConfigurationTypeUpdate: ConfigurationType = null,
    ParallelismPerKPUUpdate: Int | Double = null,
    ParallelismUpdate: Int | Double = null
  ): ParallelismConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingEnabledUpdate)) __obj.updateDynamic("AutoScalingEnabledUpdate")(AutoScalingEnabledUpdate)
    if (ConfigurationTypeUpdate != null) __obj.updateDynamic("ConfigurationTypeUpdate")(ConfigurationTypeUpdate.asInstanceOf[js.Any])
    if (ParallelismPerKPUUpdate != null) __obj.updateDynamic("ParallelismPerKPUUpdate")(ParallelismPerKPUUpdate.asInstanceOf[js.Any])
    if (ParallelismUpdate != null) __obj.updateDynamic("ParallelismUpdate")(ParallelismUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfigurationUpdate]
  }
}

