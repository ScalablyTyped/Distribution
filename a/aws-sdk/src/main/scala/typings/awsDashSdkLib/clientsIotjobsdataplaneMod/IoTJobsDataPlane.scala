package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTJobsDataPlane
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTJobsDataPlane: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.ClientConfiguration = js.native
  /**
    * Gets details of a job execution.
    */
  def describeJobExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets details of a job execution.
    */
  def describeJobExecution(params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobExecution(
    params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the list of all jobs for a thing that are not in a terminal status.
    */
  def getPendingJobExecutions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPendingJobExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the list of all jobs for a thing that are not in a terminal status.
    */
  def getPendingJobExecutions(params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPendingJobExecutions(
    params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.GetPendingJobExecutionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
    */
  def startNextPendingJobExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startNextPendingJobExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
    */
  def startNextPendingJobExecution(
    params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startNextPendingJobExecution(
    params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.StartNextPendingJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the status of a job execution.
    */
  def updateJobExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the status of a job execution.
    */
  def updateJobExecution(params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobExecution(
    params: awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotjobsdataplaneMod.IoTJobsDataPlaneNs.UpdateJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

