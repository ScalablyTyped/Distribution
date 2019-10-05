package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMLTransformRequest extends js.Object {
  /**
    * A description of the transform. The default is an empty string.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The unique name that you gave the transform when you created it.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on the transform type.
    */
  var Parameters: js.UndefOr[TransformParameters] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
    */
  var Role: js.UndefOr[RoleString] = js.undefined
  /**
    * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.undefined
  /**
    * A unique identifier that was generated when the transform was created.
    */
  var TransformId: HashString
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.undefined
}

object UpdateMLTransformRequest {
  @scala.inline
  def apply(
    TransformId: HashString,
    Description: DescriptionString = null,
    MaxCapacity: Int | Double = null,
    MaxRetries: Int | Double = null,
    Name: NameString = null,
    NumberOfWorkers: Int | Double = null,
    Parameters: TransformParameters = null,
    Role: RoleString = null,
    Timeout: Int | Double = null,
    WorkerType: WorkerType = null
  ): UpdateMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (MaxRetries != null) __obj.updateDynamic("MaxRetries")(MaxRetries.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLTransformRequest]
  }
}

