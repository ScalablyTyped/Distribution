package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTJobsDataPlane
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTJobsDataPlane: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

