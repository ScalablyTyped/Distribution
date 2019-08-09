package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTransformResponse extends js.Object {
  /**
    * The date and time when the transform was created.
    */
  var CreatedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the transform.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The latest evaluation metrics.
    */
  var EvaluationMetrics: js.UndefOr[typings.awsDashSdk.clientsGlueMod.EvaluationMetrics] = js.undefined
  /**
    * A list of AWS Glue table definitions used by the transform.
    */
  var InputRecordTables: js.UndefOr[GlueTables] = js.undefined
  /**
    * The number of labels available for this transform.
    */
  var LabelCount: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LabelCount] = js.undefined
  /**
    * The date and time when the transform was last modified.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The unique name given to the transform when it was created.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The configuration parameters that are specific to the algorithm used.
    */
  var Parameters: js.UndefOr[TransformParameters] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
    */
  var Role: js.UndefOr[RoleString] = js.undefined
  /**
    * The Map&lt;Column, Type&gt; object that represents the schema that this transform accepts. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.undefined
  /**
    * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.undefined
  /**
    * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.undefined
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.undefined
}

object GetMLTransformResponse {
  @scala.inline
  def apply(
    CreatedOn: Timestamp = null,
    Description: DescriptionString = null,
    EvaluationMetrics: EvaluationMetrics = null,
    InputRecordTables: GlueTables = null,
    LabelCount: js.UndefOr[LabelCount] = js.undefined,
    LastModifiedOn: Timestamp = null,
    MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
    MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
    Name: NameString = null,
    NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
    Parameters: TransformParameters = null,
    Role: RoleString = null,
    Schema: TransformSchema = null,
    Status: TransformStatusType = null,
    Timeout: js.UndefOr[Timeout] = js.undefined,
    TransformId: HashString = null,
    WorkerType: WorkerType = null
  ): GetMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedOn != null) __obj.updateDynamic("CreatedOn")(CreatedOn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics)
    if (InputRecordTables != null) __obj.updateDynamic("InputRecordTables")(InputRecordTables)
    if (!js.isUndefined(LabelCount)) __obj.updateDynamic("LabelCount")(LabelCount)
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn)
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MaxRetries)) __obj.updateDynamic("MaxRetries")(MaxRetries)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(NumberOfWorkers)) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout)
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId)
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformResponse]
  }
}

