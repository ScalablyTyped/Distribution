package typings.awsSdk.clientsHealthlakeMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthLake extends Service {
  
  @JSName("config")
  var config_HealthLake: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Data Store that can ingest and export FHIR formatted data.
    */
  def createFHIRDatastore(): Request[CreateFHIRDatastoreResponse, AWSError] = js.native
  def createFHIRDatastore(callback: js.Function2[/* err */ AWSError, /* data */ CreateFHIRDatastoreResponse, Unit]): Request[CreateFHIRDatastoreResponse, AWSError] = js.native
  /**
    * Creates a Data Store that can ingest and export FHIR formatted data.
    */
  def createFHIRDatastore(params: CreateFHIRDatastoreRequest): Request[CreateFHIRDatastoreResponse, AWSError] = js.native
  def createFHIRDatastore(
    params: CreateFHIRDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFHIRDatastoreResponse, Unit]
  ): Request[CreateFHIRDatastoreResponse, AWSError] = js.native
  
  /**
    * Deletes a Data Store. 
    */
  def deleteFHIRDatastore(): Request[DeleteFHIRDatastoreResponse, AWSError] = js.native
  def deleteFHIRDatastore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFHIRDatastoreResponse, Unit]): Request[DeleteFHIRDatastoreResponse, AWSError] = js.native
  /**
    * Deletes a Data Store. 
    */
  def deleteFHIRDatastore(params: DeleteFHIRDatastoreRequest): Request[DeleteFHIRDatastoreResponse, AWSError] = js.native
  def deleteFHIRDatastore(
    params: DeleteFHIRDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFHIRDatastoreResponse, Unit]
  ): Request[DeleteFHIRDatastoreResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data Store status, created at, Data Store type version, and Data Store endpoint.
    */
  def describeFHIRDatastore(): Request[DescribeFHIRDatastoreResponse, AWSError] = js.native
  def describeFHIRDatastore(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRDatastoreResponse, Unit]): Request[DescribeFHIRDatastoreResponse, AWSError] = js.native
  /**
    * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data Store status, created at, Data Store type version, and Data Store endpoint.
    */
  def describeFHIRDatastore(params: DescribeFHIRDatastoreRequest): Request[DescribeFHIRDatastoreResponse, AWSError] = js.native
  def describeFHIRDatastore(
    params: DescribeFHIRDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRDatastoreResponse, Unit]
  ): Request[DescribeFHIRDatastoreResponse, AWSError] = js.native
  
  /**
    * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
    */
  def describeFHIRExportJob(): Request[DescribeFHIRExportJobResponse, AWSError] = js.native
  def describeFHIRExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRExportJobResponse, Unit]): Request[DescribeFHIRExportJobResponse, AWSError] = js.native
  /**
    * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
    */
  def describeFHIRExportJob(params: DescribeFHIRExportJobRequest): Request[DescribeFHIRExportJobResponse, AWSError] = js.native
  def describeFHIRExportJob(
    params: DescribeFHIRExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRExportJobResponse, Unit]
  ): Request[DescribeFHIRExportJobResponse, AWSError] = js.native
  
  /**
    * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job. 
    */
  def describeFHIRImportJob(): Request[DescribeFHIRImportJobResponse, AWSError] = js.native
  def describeFHIRImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRImportJobResponse, Unit]): Request[DescribeFHIRImportJobResponse, AWSError] = js.native
  /**
    * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job. 
    */
  def describeFHIRImportJob(params: DescribeFHIRImportJobRequest): Request[DescribeFHIRImportJobResponse, AWSError] = js.native
  def describeFHIRImportJob(
    params: DescribeFHIRImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFHIRImportJobResponse, Unit]
  ): Request[DescribeFHIRImportJobResponse, AWSError] = js.native
  
  /**
    * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
    */
  def listFHIRDatastores(): Request[ListFHIRDatastoresResponse, AWSError] = js.native
  def listFHIRDatastores(callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRDatastoresResponse, Unit]): Request[ListFHIRDatastoresResponse, AWSError] = js.native
  /**
    * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
    */
  def listFHIRDatastores(params: ListFHIRDatastoresRequest): Request[ListFHIRDatastoresResponse, AWSError] = js.native
  def listFHIRDatastores(
    params: ListFHIRDatastoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRDatastoresResponse, Unit]
  ): Request[ListFHIRDatastoresResponse, AWSError] = js.native
  
  /**
    *  Lists all FHIR export jobs associated with an account and their statuses. 
    */
  def listFHIRExportJobs(): Request[ListFHIRExportJobsResponse, AWSError] = js.native
  def listFHIRExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRExportJobsResponse, Unit]): Request[ListFHIRExportJobsResponse, AWSError] = js.native
  /**
    *  Lists all FHIR export jobs associated with an account and their statuses. 
    */
  def listFHIRExportJobs(params: ListFHIRExportJobsRequest): Request[ListFHIRExportJobsResponse, AWSError] = js.native
  def listFHIRExportJobs(
    params: ListFHIRExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRExportJobsResponse, Unit]
  ): Request[ListFHIRExportJobsResponse, AWSError] = js.native
  
  /**
    *  Lists all FHIR import jobs associated with an account and their statuses. 
    */
  def listFHIRImportJobs(): Request[ListFHIRImportJobsResponse, AWSError] = js.native
  def listFHIRImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRImportJobsResponse, Unit]): Request[ListFHIRImportJobsResponse, AWSError] = js.native
  /**
    *  Lists all FHIR import jobs associated with an account and their statuses. 
    */
  def listFHIRImportJobs(params: ListFHIRImportJobsRequest): Request[ListFHIRImportJobsResponse, AWSError] = js.native
  def listFHIRImportJobs(
    params: ListFHIRImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFHIRImportJobsResponse, Unit]
  ): Request[ListFHIRImportJobsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of all existing tags associated with a Data Store. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns a list of all existing tags associated with a Data Store. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Begins a FHIR export job.
    */
  def startFHIRExportJob(): Request[StartFHIRExportJobResponse, AWSError] = js.native
  def startFHIRExportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartFHIRExportJobResponse, Unit]): Request[StartFHIRExportJobResponse, AWSError] = js.native
  /**
    * Begins a FHIR export job.
    */
  def startFHIRExportJob(params: StartFHIRExportJobRequest): Request[StartFHIRExportJobResponse, AWSError] = js.native
  def startFHIRExportJob(
    params: StartFHIRExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFHIRExportJobResponse, Unit]
  ): Request[StartFHIRExportJobResponse, AWSError] = js.native
  
  /**
    * Begins a FHIR Import job.
    */
  def startFHIRImportJob(): Request[StartFHIRImportJobResponse, AWSError] = js.native
  def startFHIRImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartFHIRImportJobResponse, Unit]): Request[StartFHIRImportJobResponse, AWSError] = js.native
  /**
    * Begins a FHIR Import job.
    */
  def startFHIRImportJob(params: StartFHIRImportJobRequest): Request[StartFHIRImportJobResponse, AWSError] = js.native
  def startFHIRImportJob(
    params: StartFHIRImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFHIRImportJobResponse, Unit]
  ): Request[StartFHIRImportJobResponse, AWSError] = js.native
  
  /**
    *  Adds a user specifed key and value tag to a Data Store. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Adds a user specifed key and value tag to a Data Store. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Removes tags from a Data Store. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes tags from a Data Store. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
