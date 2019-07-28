package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobRequest extends js.Object {
  /**
    * This parameter is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) to allocate to this Job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
  /**
    * The JobCommand that executes this job.
    */
  var Command: JobCommand
  /**
    * The connections used for this job.
    */
  var Connections: js.UndefOr[ConnectionsList] = js.undefined
  /**
    * The default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var DefaultArguments: js.UndefOr[GenericMap] = js.undefined
  /**
    * Description of the job being defined.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
    */
  var ExecutionProperty: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ExecutionProperty] = js.undefined
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  /**
    * This field is reserved for future use.
    */
  var LogUri: js.UndefOr[UriString] = js.undefined
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The maximum number of times to retry this job if it fails.
    */
  var MaxRetries: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MaxRetries] = js.undefined
  /**
    * The name you assign to this job definition. It must be unique in your account.
    */
  var Name: NameString
  /**
    * Specifies configuration properties of a job notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsDashSdk.clientsGlueMod.NotificationProperty] = js.undefined
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
    */
  var Role: RoleString
  /**
    * The name of the SecurityConfiguration structure to be used with this job.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  /**
    * The tags to use with this job. You may use tags to limit access to the job. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.undefined
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.  
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.undefined
}

object CreateJobRequest {
  @scala.inline
  def apply(
    Command: JobCommand,
    Name: NameString,
    Role: RoleString,
    AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
    Connections: ConnectionsList = null,
    DefaultArguments: GenericMap = null,
    Description: DescriptionString = null,
    ExecutionProperty: ExecutionProperty = null,
    GlueVersion: GlueVersionString = null,
    LogUri: UriString = null,
    MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
    MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
    NotificationProperty: NotificationProperty = null,
    NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
    SecurityConfiguration: NameString = null,
    Tags: TagsMap = null,
    Timeout: js.UndefOr[Timeout] = js.undefined,
    WorkerType: WorkerType = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Command = Command, Name = Name, Role = Role)
    if (!js.isUndefined(AllocatedCapacity)) __obj.updateDynamic("AllocatedCapacity")(AllocatedCapacity)
    if (Connections != null) __obj.updateDynamic("Connections")(Connections)
    if (DefaultArguments != null) __obj.updateDynamic("DefaultArguments")(DefaultArguments)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionProperty != null) __obj.updateDynamic("ExecutionProperty")(ExecutionProperty)
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion)
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri)
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MaxRetries)) __obj.updateDynamic("MaxRetries")(MaxRetries)
    if (NotificationProperty != null) __obj.updateDynamic("NotificationProperty")(NotificationProperty)
    if (!js.isUndefined(NumberOfWorkers)) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers)
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout)
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

