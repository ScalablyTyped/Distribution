package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformResponse extends js.Object {
  /**
    * The date and time when the transform was created.
    */
  var CreatedOn: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the transform.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The latest evaluation metrics.
    */
  var EvaluationMetrics: js.UndefOr[typings.awsDashSdk.clientsGlueMod.EvaluationMetrics] = js.native
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * A list of AWS Glue table definitions used by the transform.
    */
  var InputRecordTables: js.UndefOr[GlueTables] = js.native
  /**
    * The number of labels available for this transform.
    */
  var LabelCount: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LabelCount] = js.native
  /**
    * The date and time when the transform was last modified.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.native
  /**
    * The unique name given to the transform when it was created.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The configuration parameters that are specific to the algorithm used.
    */
  var Parameters: js.UndefOr[TransformParameters] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
    */
  var Role: js.UndefOr[RoleString] = js.native
  /**
    * The Map&lt;Column, Type&gt; object that represents the schema that this transform accepts. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.native
  /**
    * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.native
  /**
    * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.native
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: js.UndefOr[HashString] = js.native
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.native
}

object GetMLTransformResponse {
  @scala.inline
  def apply(
    CreatedOn: Timestamp = null,
    Description: DescriptionString = null,
    EvaluationMetrics: EvaluationMetrics = null,
    GlueVersion: GlueVersionString = null,
    InputRecordTables: GlueTables = null,
    LabelCount: Int | Double = null,
    LastModifiedOn: Timestamp = null,
    MaxCapacity: Int | Double = null,
    MaxRetries: Int | Double = null,
    Name: NameString = null,
    NumberOfWorkers: Int | Double = null,
    Parameters: TransformParameters = null,
    Role: RoleString = null,
    Schema: TransformSchema = null,
    Status: TransformStatusType = null,
    Timeout: Int | Double = null,
    TransformId: HashString = null,
    WorkerType: WorkerType = null
  ): GetMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedOn != null) __obj.updateDynamic("CreatedOn")(CreatedOn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (InputRecordTables != null) __obj.updateDynamic("InputRecordTables")(InputRecordTables.asInstanceOf[js.Any])
    if (LabelCount != null) __obj.updateDynamic("LabelCount")(LabelCount.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (MaxRetries != null) __obj.updateDynamic("MaxRetries")(MaxRetries.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformResponse]
  }
}

