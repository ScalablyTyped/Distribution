package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMLTransformRequest extends js.Object {
  /**
    * A description of the machine learning transform that is being defined. The default is an empty string.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * A list of AWS Glue table definitions used by the transform.
    */
  var InputRecordTables: GlueTables
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The unique name that you give the transform when you create it.
    */
  var Name: NameString
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type.
    */
  var Parameters: TransformParameters
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions. Ensure that this role has permission to your Amazon Simple Storage Service (Amazon S3) sources, targets, temporary directory, scripts, and any libraries that are used by the task run for this transform.
    */
  var Role: RoleString
  /**
    * The timeout of the task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.undefined
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.undefined
}

object CreateMLTransformRequest {
  @scala.inline
  def apply(
    InputRecordTables: GlueTables,
    Name: NameString,
    Parameters: TransformParameters,
    Role: RoleString,
    Description: DescriptionString = null,
    MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
    MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
    NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
    Timeout: js.UndefOr[Timeout] = js.undefined,
    WorkerType: WorkerType = null
  ): CreateMLTransformRequest = {
    val __obj = js.Dynamic.literal(InputRecordTables = InputRecordTables, Name = Name, Parameters = Parameters, Role = Role)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MaxRetries)) __obj.updateDynamic("MaxRetries")(MaxRetries)
    if (!js.isUndefined(NumberOfWorkers)) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers)
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout)
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMLTransformRequest]
  }
}

