package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/importexport", "ImportExport")
@js.native
object ImportExportNs extends js.Object {
  trait Artifact extends js.Object {
    var Description: js.UndefOr[Description] = js.undefined
    var URL: js.UndefOr[URL] = js.undefined
  }
  
  trait CancelJobInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var JobId: awsDashSdkLib.clientsImportexportMod.ImportExportNs.JobId
  }
  
  trait CancelJobOutput extends js.Object {
    var Success: js.UndefOr[Success] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateJobInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var JobType: awsDashSdkLib.clientsImportexportMod.ImportExportNs.JobType
    var Manifest: awsDashSdkLib.clientsImportexportMod.ImportExportNs.Manifest
    var ManifestAddendum: js.UndefOr[ManifestAddendum] = js.undefined
    var ValidateOnly: awsDashSdkLib.clientsImportexportMod.ImportExportNs.ValidateOnly
  }
  
  trait CreateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList] = js.undefined
    var JobId: js.UndefOr[JobId] = js.undefined
    var JobType: js.UndefOr[JobType] = js.undefined
    var Signature: js.UndefOr[Signature] = js.undefined
    var SignatureFileContents: js.UndefOr[SignatureFileContents] = js.undefined
    var WarningMessage: js.UndefOr[WarningMessage] = js.undefined
  }
  
  trait GetShippingLabelInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var city: js.UndefOr[city] = js.undefined
    var company: js.UndefOr[company] = js.undefined
    var country: js.UndefOr[country] = js.undefined
    var jobIds: JobIdList
    var name: js.UndefOr[name] = js.undefined
    var phoneNumber: js.UndefOr[phoneNumber] = js.undefined
    var postalCode: js.UndefOr[postalCode] = js.undefined
    var stateOrProvince: js.UndefOr[stateOrProvince] = js.undefined
    var street1: js.UndefOr[street1] = js.undefined
    var street2: js.UndefOr[street2] = js.undefined
    var street3: js.UndefOr[street3] = js.undefined
  }
  
  trait GetShippingLabelOutput extends js.Object {
    var ShippingLabelURL: js.UndefOr[GenericString] = js.undefined
    var Warning: js.UndefOr[GenericString] = js.undefined
  }
  
  trait GetStatusInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var JobId: awsDashSdkLib.clientsImportexportMod.ImportExportNs.JobId
  }
  
  trait GetStatusOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList] = js.undefined
    var Carrier: js.UndefOr[Carrier] = js.undefined
    var CreationDate: js.UndefOr[CreationDate] = js.undefined
    var CurrentManifest: js.UndefOr[CurrentManifest] = js.undefined
    var ErrorCount: js.UndefOr[ErrorCount] = js.undefined
    var JobId: js.UndefOr[JobId] = js.undefined
    var JobType: js.UndefOr[JobType] = js.undefined
    var LocationCode: js.UndefOr[LocationCode] = js.undefined
    var LocationMessage: js.UndefOr[LocationMessage] = js.undefined
    var LogBucket: js.UndefOr[LogBucket] = js.undefined
    var LogKey: js.UndefOr[LogKey] = js.undefined
    var ProgressCode: js.UndefOr[ProgressCode] = js.undefined
    var ProgressMessage: js.UndefOr[ProgressMessage] = js.undefined
    var Signature: js.UndefOr[Signature] = js.undefined
    var SignatureFileContents: js.UndefOr[Signature] = js.undefined
    var TrackingNumber: js.UndefOr[TrackingNumber] = js.undefined
  }
  
  trait Job extends js.Object {
    var CreationDate: js.UndefOr[CreationDate] = js.undefined
    var IsCanceled: js.UndefOr[IsCanceled] = js.undefined
    var JobId: js.UndefOr[JobId] = js.undefined
    var JobType: js.UndefOr[JobType] = js.undefined
  }
  
  trait ListJobsInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var Marker: js.UndefOr[Marker] = js.undefined
    var MaxJobs: js.UndefOr[MaxJobs] = js.undefined
  }
  
  trait ListJobsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    var Jobs: js.UndefOr[JobsList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
      */
    def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
      */
    def cancelJob(params: CancelJobInput): awsDashSdkLib.libRequestMod.Request[CancelJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      params: CancelJobInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
      */
    def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
      */
    def createJob(params: CreateJobInput): awsDashSdkLib.libRequestMod.Request[CreateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJob(
      params: CreateJobInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
      */
    def getShippingLabel(): awsDashSdkLib.libRequestMod.Request[GetShippingLabelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getShippingLabel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShippingLabelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShippingLabelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
      */
    def getShippingLabel(params: GetShippingLabelInput): awsDashSdkLib.libRequestMod.Request[GetShippingLabelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getShippingLabel(
      params: GetShippingLabelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShippingLabelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShippingLabelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
      */
    def getStatus(): awsDashSdkLib.libRequestMod.Request[GetStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStatus(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetStatusOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
      */
    def getStatus(params: GetStatusInput): awsDashSdkLib.libRequestMod.Request[GetStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStatus(
      params: GetStatusInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetStatusOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
      */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
      */
    def listJobs(params: ListJobsInput): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      params: ListJobsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
      */
    def updateJob(): awsDashSdkLib.libRequestMod.Request[UpdateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
      */
    def updateJob(params: UpdateJobInput): awsDashSdkLib.libRequestMod.Request[UpdateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJob(
      params: UpdateJobInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateJobInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion] = js.undefined
    var JobId: awsDashSdkLib.clientsImportexportMod.ImportExportNs.JobId
    var JobType: awsDashSdkLib.clientsImportexportMod.ImportExportNs.JobType
    var Manifest: awsDashSdkLib.clientsImportexportMod.ImportExportNs.Manifest
    var ValidateOnly: awsDashSdkLib.clientsImportexportMod.ImportExportNs.ValidateOnly
  }
  
  trait UpdateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList] = js.undefined
    var Success: js.UndefOr[Success] = js.undefined
    var WarningMessage: js.UndefOr[WarningMessage] = js.undefined
  }
  
  trait _JobType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type APIVersion = java.lang.String
  type ArtifactList = js.Array[Artifact]
  type Carrier = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreationDate = stdLib.Date
  type CurrentManifest = java.lang.String
  type Description = java.lang.String
  type ErrorCount = scala.Double
  type GenericString = java.lang.String
  type IsCanceled = scala.Boolean
  type IsTruncated = scala.Boolean
  type JobId = java.lang.String
  type JobIdList = js.Array[GenericString]
  type JobType = _JobType | java.lang.String
  type JobsList = js.Array[Job]
  type LocationCode = java.lang.String
  type LocationMessage = java.lang.String
  type LogBucket = java.lang.String
  type LogKey = java.lang.String
  type Manifest = java.lang.String
  type ManifestAddendum = java.lang.String
  type Marker = java.lang.String
  type MaxJobs = scala.Double
  type ProgressCode = java.lang.String
  type ProgressMessage = java.lang.String
  type Signature = java.lang.String
  type SignatureFileContents = java.lang.String
  type Success = scala.Boolean
  type TrackingNumber = java.lang.String
  type URL = java.lang.String
  type ValidateOnly = scala.Boolean
  type WarningMessage = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
  type city = java.lang.String
  type company = java.lang.String
  type country = java.lang.String
  type name = java.lang.String
  type phoneNumber = java.lang.String
  type postalCode = java.lang.String
  type stateOrProvince = java.lang.String
  type street1 = java.lang.String
  type street2 = java.lang.String
  type street3 = java.lang.String
}

