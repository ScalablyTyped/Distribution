package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iotjobsdataplane", "IoTJobsDataPlane")
@js.native
object IoTJobsDataPlaneNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DescribeJobExecutionRequest extends js.Object {
    /**
      * Optional. A number that identifies a particular job execution on a particular device. If not specified, the latest job execution is returned.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * Optional. When set to true, the response contains the job document. The default is false.
      */
    var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
    /**
      * The unique identifier assigned to this job when it was created.
      */
    var jobId: DescribeJobExecutionJobId
    /**
      * The thing name associated with the device the job execution is running on.
      */
    var thingName: ThingName
  }
  
  trait DescribeJobExecutionResponse extends js.Object {
    /**
      * Contains data about a job execution.
      */
    var execution: js.UndefOr[JobExecution] = js.undefined
  }
  
  trait DetailsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DetailsValue]
  
  trait GetPendingJobExecutionsRequest extends js.Object {
    /**
      * The name of the thing that is executing the job.
      */
    var thingName: ThingName
  }
  
  trait GetPendingJobExecutionsResponse extends js.Object {
    /**
      * A list of JobExecutionSummary objects with status IN_PROGRESS.
      */
    var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
    /**
      * A list of JobExecutionSummary objects with status QUEUED.
      */
    var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
  }
  
  trait JobExecution extends js.Object {
    /**
      * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
      */
    var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined
    /**
      * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * The content of the job document.
      */
    var jobDocument: js.UndefOr[JobDocument] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution was last updated. 
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution was enqueued.
      */
    var queuedAt: js.UndefOr[QueuedAt] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution was started.
      */
    var startedAt: js.UndefOr[StartedAt] = js.undefined
    /**
      * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
    /**
      * A collection of name/value pairs that describe the status of the job execution.
      */
    var statusDetails: js.UndefOr[DetailsMap] = js.undefined
    /**
      * The name of the thing that is executing the job.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
      */
    var versionNumber: js.UndefOr[VersionNumber] = js.undefined
  }
  
  trait JobExecutionState extends js.Object {
    /**
      * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
    /**
      * A collection of name/value pairs that describe the status of the job execution.
      */
    var statusDetails: js.UndefOr[DetailsMap] = js.undefined
    /**
      * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
      */
    var versionNumber: js.UndefOr[VersionNumber] = js.undefined
  }
  
  trait JobExecutionSummary extends js.Object {
    /**
      * A number that identifies a particular job execution on a particular device.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution was enqueued.
      */
    var queuedAt: js.UndefOr[QueuedAt] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the job execution started.
      */
    var startedAt: js.UndefOr[StartedAt] = js.undefined
    /**
      * The version of the job execution. Job execution versions are incremented each time AWS IoT Jobs receives an update from a device.
      */
    var versionNumber: js.UndefOr[VersionNumber] = js.undefined
  }
  
  trait StartNextPendingJobExecutionRequest extends js.Object {
    /**
      * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
      */
    var statusDetails: js.UndefOr[DetailsMap] = js.undefined
    /**
      * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in field stepTimeoutInMinutes) the job execution status will be automatically set to TIMED_OUT. Note that setting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
      */
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
    /**
      * The name of the thing associated with the device.
      */
    var thingName: ThingName
  }
  
  trait StartNextPendingJobExecutionResponse extends js.Object {
    /**
      * A JobExecution object.
      */
    var execution: js.UndefOr[JobExecution] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Gets details of a job execution.
      */
    def describeJobExecution(): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details of a job execution.
      */
    def describeJobExecution(params: DescribeJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobExecution(
      params: DescribeJobExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the list of all jobs for a thing that are not in a terminal status.
      */
    def getPendingJobExecutions(): awsDashSdkLib.libRequestMod.Request[GetPendingJobExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPendingJobExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPendingJobExecutionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPendingJobExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the list of all jobs for a thing that are not in a terminal status.
      */
    def getPendingJobExecutions(params: GetPendingJobExecutionsRequest): awsDashSdkLib.libRequestMod.Request[GetPendingJobExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPendingJobExecutions(
      params: GetPendingJobExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPendingJobExecutionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPendingJobExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
      */
    def startNextPendingJobExecution(): awsDashSdkLib.libRequestMod.Request[StartNextPendingJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startNextPendingJobExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartNextPendingJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartNextPendingJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
      */
    def startNextPendingJobExecution(params: StartNextPendingJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[StartNextPendingJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startNextPendingJobExecution(
      params: StartNextPendingJobExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartNextPendingJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartNextPendingJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of a job execution.
      */
    def updateJobExecution(): awsDashSdkLib.libRequestMod.Request[UpdateJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJobExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of a job execution.
      */
    def updateJobExecution(params: UpdateJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJobExecution(
      params: UpdateJobExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateJobExecutionRequest extends js.Object {
    /**
      * Optional. A number that identifies a particular job execution on a particular device.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * Optional. The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
      */
    var expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined
    /**
      * Optional. When set to true, the response contains the job document. The default is false.
      */
    var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
    /**
      * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
      */
    var includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined
    /**
      * The unique identifier assigned to this job when it was created.
      */
    var jobId: JobId
    /**
      * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every update.
      */
    var status: JobExecutionStatus
    /**
      *  Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
      */
    var statusDetails: js.UndefOr[DetailsMap] = js.undefined
    /**
      * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by again calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in this field) the job execution status will be automatically set to TIMED_OUT. Note that setting or resetting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
      */
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
    /**
      * The name of the thing associated with the device.
      */
    var thingName: ThingName
  }
  
  trait UpdateJobExecutionResponse extends js.Object {
    /**
      * A JobExecutionState object.
      */
    var executionState: js.UndefOr[JobExecutionState] = js.undefined
    /**
      * The contents of the Job Documents.
      */
    var jobDocument: js.UndefOr[JobDocument] = js.undefined
  }
  
  trait _JobExecutionStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeJobExecutionJobId = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsValue = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type IncludeExecutionState = scala.Boolean
  type IncludeJobDocument = scala.Boolean
  type JobDocument = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = _JobExecutionStatus | java.lang.String
  type JobExecutionSummaryList = js.Array[JobExecutionSummary]
  type JobId = java.lang.String
  type LastUpdatedAt = scala.Double
  type QueuedAt = scala.Double
  type StartedAt = scala.Double
  type StepTimeoutInMinutes = scala.Double
  type ThingName = java.lang.String
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-29`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

