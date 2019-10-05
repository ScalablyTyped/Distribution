package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelismConfigurationDescription extends js.Object {
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. 
    */
  var ConfigurationType: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType] = js.undefined
  /**
    * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.undefined
  /**
    * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. 
    */
  var Parallelism: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.Parallelism] = js.undefined
  /**
    * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ParallelismPerKPU] = js.undefined
}

object ParallelismConfigurationDescription {
  @scala.inline
  def apply(
    AutoScalingEnabled: js.UndefOr[Boolean] = js.undefined,
    ConfigurationType: ConfigurationType = null,
    CurrentParallelism: Int | Double = null,
    Parallelism: Int | Double = null,
    ParallelismPerKPU: Int | Double = null
  ): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingEnabled)) __obj.updateDynamic("AutoScalingEnabled")(AutoScalingEnabled)
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (CurrentParallelism != null) __obj.updateDynamic("CurrentParallelism")(CurrentParallelism.asInstanceOf[js.Any])
    if (Parallelism != null) __obj.updateDynamic("Parallelism")(Parallelism.asInstanceOf[js.Any])
    if (ParallelismPerKPU != null) __obj.updateDynamic("ParallelismPerKPU")(ParallelismPerKPU.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
}

