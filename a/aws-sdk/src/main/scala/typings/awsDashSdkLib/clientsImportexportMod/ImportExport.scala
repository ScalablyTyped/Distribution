package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportExport
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ImportExport: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsImportexportMod.ImportExportNs.ClientConfiguration = js.native
  /**
    * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
    */
  def cancelJob(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CancelJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
    */
  def createJob(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.CreateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
    */
  def getShippingLabel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getShippingLabel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
    */
  def getShippingLabel(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getShippingLabel(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetShippingLabelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
    */
  def getStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
    */
  def getStatus(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStatus(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.GetStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
    */
  def listJobs(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.ListJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
    */
  def updateJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
    */
  def updateJob(params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJob(
    params: awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsImportexportMod.ImportExportNs.UpdateJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

