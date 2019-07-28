package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelismConfiguration extends js.Object {
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
    */
  var ConfigurationType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType
  /**
    * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. The Kinesis Data Analytics service can increase this number automatically if ParallelismConfiguration$AutoScalingEnabled is set to true.
    */
  var Parallelism: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.Parallelism] = js.undefined
  /**
    * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see Amazon Kinesis Data Analytics Pricing.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ParallelismPerKPU] = js.undefined
}

object ParallelismConfiguration {
  @scala.inline
  def apply(
    ConfigurationType: ConfigurationType,
    AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
    Parallelism: js.UndefOr[Parallelism] = js.undefined,
    ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
  ): ParallelismConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoScalingEnabled)) __obj.updateDynamic("AutoScalingEnabled")(AutoScalingEnabled)
    if (!js.isUndefined(Parallelism)) __obj.updateDynamic("Parallelism")(Parallelism)
    if (!js.isUndefined(ParallelismPerKPU)) __obj.updateDynamic("ParallelismPerKPU")(ParallelismPerKPU)
    __obj.asInstanceOf[ParallelismConfiguration]
  }
}

