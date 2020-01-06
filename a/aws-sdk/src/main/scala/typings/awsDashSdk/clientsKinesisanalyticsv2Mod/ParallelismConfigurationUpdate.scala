package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelismConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service, or if a custom parallelism is used. You must set this property to CUSTOM in order to change your application's AutoScalingEnabled, Parallelism, or ParallelismPerKPU properties.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.native
  /**
    * Describes updates to the initial number of parallel tasks an application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service will reduce CurrentParallelism down to the Parallelism setting.
    */
  var ParallelismUpdate: js.UndefOr[Parallelism] = js.native
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
    if (!js.isUndefined(AutoScalingEnabledUpdate)) __obj.updateDynamic("AutoScalingEnabledUpdate")(AutoScalingEnabledUpdate.asInstanceOf[js.Any])
    if (ConfigurationTypeUpdate != null) __obj.updateDynamic("ConfigurationTypeUpdate")(ConfigurationTypeUpdate.asInstanceOf[js.Any])
    if (ParallelismPerKPUUpdate != null) __obj.updateDynamic("ParallelismPerKPUUpdate")(ParallelismPerKPUUpdate.asInstanceOf[js.Any])
    if (ParallelismUpdate != null) __obj.updateDynamic("ParallelismUpdate")(ParallelismUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfigurationUpdate]
  }
}

