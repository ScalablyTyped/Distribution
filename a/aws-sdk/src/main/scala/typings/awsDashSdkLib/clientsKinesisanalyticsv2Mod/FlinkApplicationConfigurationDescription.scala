package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlinkApplicationConfigurationDescription extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription] = js.undefined
  /**
    * The job plan for an application. For more information about the job plan, see Jobs and Scheduling in the Apache Flink Documentation. To retrieve the job plan for the application, use the DescribeApplicationRequest$IncludeAdditionalDetails parameter of the DescribeApplication operation.
    */
  var JobPlanDescription: js.UndefOr[JobPlanDescription] = js.undefined
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription] = js.undefined
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription] = js.undefined
}

object FlinkApplicationConfigurationDescription {
  @scala.inline
  def apply(
    CheckpointConfigurationDescription: CheckpointConfigurationDescription = null,
    JobPlanDescription: JobPlanDescription = null,
    MonitoringConfigurationDescription: MonitoringConfigurationDescription = null,
    ParallelismConfigurationDescription: ParallelismConfigurationDescription = null
  ): FlinkApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfigurationDescription != null) __obj.updateDynamic("CheckpointConfigurationDescription")(CheckpointConfigurationDescription)
    if (JobPlanDescription != null) __obj.updateDynamic("JobPlanDescription")(JobPlanDescription)
    if (MonitoringConfigurationDescription != null) __obj.updateDynamic("MonitoringConfigurationDescription")(MonitoringConfigurationDescription)
    if (ParallelismConfigurationDescription != null) __obj.updateDynamic("ParallelismConfigurationDescription")(ParallelismConfigurationDescription)
    __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
  }
}

