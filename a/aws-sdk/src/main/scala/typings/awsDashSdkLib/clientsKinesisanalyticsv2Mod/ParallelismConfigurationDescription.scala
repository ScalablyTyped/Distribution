package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

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
  var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
  /**
    * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.undefined
  /**
    * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. 
    */
  var Parallelism: js.UndefOr[Parallelism] = js.undefined
  /**
    * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
}

object ParallelismConfigurationDescription {
  @scala.inline
  def apply(
    AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
    ConfigurationType: ConfigurationType = null,
    CurrentParallelism: js.UndefOr[Parallelism] = js.undefined,
    Parallelism: js.UndefOr[Parallelism] = js.undefined,
    ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
  ): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingEnabled)) __obj.updateDynamic("AutoScalingEnabled")(AutoScalingEnabled)
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentParallelism)) __obj.updateDynamic("CurrentParallelism")(CurrentParallelism)
    if (!js.isUndefined(Parallelism)) __obj.updateDynamic("Parallelism")(Parallelism)
    if (!js.isUndefined(ParallelismPerKPU)) __obj.updateDynamic("ParallelismPerKPU")(ParallelismPerKPU)
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
}

