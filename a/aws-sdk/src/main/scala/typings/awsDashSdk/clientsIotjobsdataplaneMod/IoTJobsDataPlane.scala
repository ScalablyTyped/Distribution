package typings.awsDashSdk.clientsIotjobsdataplaneMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTJobsDataPlane extends Service {
  @JSName("config")
  var config_IoTJobsDataPlane: ConfigBase with ClientConfiguration = js.native
  /**
    * Gets details of a job execution.
    */
  def describeJobExecution(): Request[DescribeJobExecutionResponse, AWSError] = js.native
  def describeJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobExecutionResponse, Unit]): Request[DescribeJobExecutionResponse, AWSError] = js.native
  /**
    * Gets details of a job execution.
    */
  def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse, AWSError] = js.native
  def describeJobExecution(
    params: DescribeJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobExecutionResponse, Unit]
  ): Request[DescribeJobExecutionResponse, AWSError] = js.native
  /**
    * Gets the list of all jobs for a thing that are not in a terminal status.
    */
  def getPendingJobExecutions(): Request[GetPendingJobExecutionsResponse, AWSError] = js.native
  def getPendingJobExecutions(callback: js.Function2[/* err */ AWSError, /* data */ GetPendingJobExecutionsResponse, Unit]): Request[GetPendingJobExecutionsResponse, AWSError] = js.native
  /**
    * Gets the list of all jobs for a thing that are not in a terminal status.
    */
  def getPendingJobExecutions(params: GetPendingJobExecutionsRequest): Request[GetPendingJobExecutionsResponse, AWSError] = js.native
  def getPendingJobExecutions(
    params: GetPendingJobExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPendingJobExecutionsResponse, Unit]
  ): Request[GetPendingJobExecutionsResponse, AWSError] = js.native
  /**
    * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
    */
  def startNextPendingJobExecution(): Request[StartNextPendingJobExecutionResponse, AWSError] = js.native
  def startNextPendingJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartNextPendingJobExecutionResponse, Unit]): Request[StartNextPendingJobExecutionResponse, AWSError] = js.native
  /**
    * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
    */
  def startNextPendingJobExecution(params: StartNextPendingJobExecutionRequest): Request[StartNextPendingJobExecutionResponse, AWSError] = js.native
  def startNextPendingJobExecution(
    params: StartNextPendingJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartNextPendingJobExecutionResponse, Unit]
  ): Request[StartNextPendingJobExecutionResponse, AWSError] = js.native
  /**
    * Updates the status of a job execution.
    */
  def updateJobExecution(): Request[UpdateJobExecutionResponse, AWSError] = js.native
  def updateJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobExecutionResponse, Unit]): Request[UpdateJobExecutionResponse, AWSError] = js.native
  /**
    * Updates the status of a job execution.
    */
  def updateJobExecution(params: UpdateJobExecutionRequest): Request[UpdateJobExecutionResponse, AWSError] = js.native
  def updateJobExecution(
    params: UpdateJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobExecutionResponse, Unit]
  ): Request[UpdateJobExecutionResponse, AWSError] = js.native
}

