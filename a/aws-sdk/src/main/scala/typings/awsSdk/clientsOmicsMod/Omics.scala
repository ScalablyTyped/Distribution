package typings.awsSdk.clientsOmicsMod

import typings.awsSdk.anon.GetAnnotationImportReques
import typings.awsSdk.anon.GetReadSetActivationJobRe
import typings.awsSdk.anon.GetReadSetExportJobReques
import typings.awsSdk.anon.GetReadSetImportJobReques
import typings.awsSdk.anon.GetReferenceImportJobRequ
import typings.awsSdk.anon.GetRunRequestwaiterWaiter
import typings.awsSdk.anon.GetRunTaskRequestwaiterWa
import typings.awsSdk.anon.GetVariantImportRequestwa
import typings.awsSdk.anon.GetVariantStoreRequestwai
import typings.awsSdk.anon.GetWorkflowRequestwaiterW
import typings.awsSdk.awsSdkStrings.annotationImportJobCreated
import typings.awsSdk.awsSdkStrings.annotationStoreCreated
import typings.awsSdk.awsSdkStrings.annotationStoreDeleted
import typings.awsSdk.awsSdkStrings.readSetActivationJobCompleted
import typings.awsSdk.awsSdkStrings.readSetExportJobCompleted
import typings.awsSdk.awsSdkStrings.readSetImportJobCompleted
import typings.awsSdk.awsSdkStrings.referenceImportJobCompleted
import typings.awsSdk.awsSdkStrings.runCompleted
import typings.awsSdk.awsSdkStrings.runRunning
import typings.awsSdk.awsSdkStrings.taskCompleted
import typings.awsSdk.awsSdkStrings.taskRunning
import typings.awsSdk.awsSdkStrings.variantImportJobCreated
import typings.awsSdk.awsSdkStrings.variantStoreCreated
import typings.awsSdk.awsSdkStrings.variantStoreDeleted
import typings.awsSdk.awsSdkStrings.workflowActive
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Omics extends Service {
  
  /**
    *  Stops a multipart upload. 
    */
  def abortMultipartReadSetUpload(): Request[AbortMultipartReadSetUploadResponse, AWSError] = js.native
  def abortMultipartReadSetUpload(callback: js.Function2[/* err */ AWSError, /* data */ AbortMultipartReadSetUploadResponse, Unit]): Request[AbortMultipartReadSetUploadResponse, AWSError] = js.native
  /**
    *  Stops a multipart upload. 
    */
  def abortMultipartReadSetUpload(params: AbortMultipartReadSetUploadRequest): Request[AbortMultipartReadSetUploadResponse, AWSError] = js.native
  def abortMultipartReadSetUpload(
    params: AbortMultipartReadSetUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AbortMultipartReadSetUploadResponse, Unit]
  ): Request[AbortMultipartReadSetUploadResponse, AWSError] = js.native
  
  /**
    * Deletes one or more read sets.
    */
  def batchDeleteReadSet(): Request[BatchDeleteReadSetResponse, AWSError] = js.native
  def batchDeleteReadSet(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteReadSetResponse, Unit]): Request[BatchDeleteReadSetResponse, AWSError] = js.native
  /**
    * Deletes one or more read sets.
    */
  def batchDeleteReadSet(params: BatchDeleteReadSetRequest): Request[BatchDeleteReadSetResponse, AWSError] = js.native
  def batchDeleteReadSet(
    params: BatchDeleteReadSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteReadSetResponse, Unit]
  ): Request[BatchDeleteReadSetResponse, AWSError] = js.native
  
  /**
    * Cancels an annotation import job.
    */
  def cancelAnnotationImportJob(): Request[CancelAnnotationImportResponse, AWSError] = js.native
  def cancelAnnotationImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelAnnotationImportResponse, Unit]): Request[CancelAnnotationImportResponse, AWSError] = js.native
  /**
    * Cancels an annotation import job.
    */
  def cancelAnnotationImportJob(params: CancelAnnotationImportRequest): Request[CancelAnnotationImportResponse, AWSError] = js.native
  def cancelAnnotationImportJob(
    params: CancelAnnotationImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelAnnotationImportResponse, Unit]
  ): Request[CancelAnnotationImportResponse, AWSError] = js.native
  
  /**
    * Cancels a run.
    */
  def cancelRun(): Request[js.Object, AWSError] = js.native
  def cancelRun(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels a run.
    */
  def cancelRun(params: CancelRunRequest): Request[js.Object, AWSError] = js.native
  def cancelRun(params: CancelRunRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Cancels a variant import job.
    */
  def cancelVariantImportJob(): Request[CancelVariantImportResponse, AWSError] = js.native
  def cancelVariantImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelVariantImportResponse, Unit]): Request[CancelVariantImportResponse, AWSError] = js.native
  /**
    * Cancels a variant import job.
    */
  def cancelVariantImportJob(params: CancelVariantImportRequest): Request[CancelVariantImportResponse, AWSError] = js.native
  def cancelVariantImportJob(
    params: CancelVariantImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelVariantImportResponse, Unit]
  ): Request[CancelVariantImportResponse, AWSError] = js.native
  
  /**
    *  Concludes a multipart upload once you have uploaded all the components. 
    */
  def completeMultipartReadSetUpload(): Request[CompleteMultipartReadSetUploadResponse, AWSError] = js.native
  def completeMultipartReadSetUpload(
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteMultipartReadSetUploadResponse, Unit]
  ): Request[CompleteMultipartReadSetUploadResponse, AWSError] = js.native
  /**
    *  Concludes a multipart upload once you have uploaded all the components. 
    */
  def completeMultipartReadSetUpload(params: CompleteMultipartReadSetUploadRequest): Request[CompleteMultipartReadSetUploadResponse, AWSError] = js.native
  def completeMultipartReadSetUpload(
    params: CompleteMultipartReadSetUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteMultipartReadSetUploadResponse, Unit]
  ): Request[CompleteMultipartReadSetUploadResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Omics: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an annotation store.
    */
  def createAnnotationStore(): Request[CreateAnnotationStoreResponse, AWSError] = js.native
  def createAnnotationStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnnotationStoreResponse, Unit]): Request[CreateAnnotationStoreResponse, AWSError] = js.native
  /**
    * Creates an annotation store.
    */
  def createAnnotationStore(params: CreateAnnotationStoreRequest): Request[CreateAnnotationStoreResponse, AWSError] = js.native
  def createAnnotationStore(
    params: CreateAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnnotationStoreResponse, Unit]
  ): Request[CreateAnnotationStoreResponse, AWSError] = js.native
  
  /**
    *  Begins a multipart read set upload. 
    */
  def createMultipartReadSetUpload(): Request[CreateMultipartReadSetUploadResponse, AWSError] = js.native
  def createMultipartReadSetUpload(callback: js.Function2[/* err */ AWSError, /* data */ CreateMultipartReadSetUploadResponse, Unit]): Request[CreateMultipartReadSetUploadResponse, AWSError] = js.native
  /**
    *  Begins a multipart read set upload. 
    */
  def createMultipartReadSetUpload(params: CreateMultipartReadSetUploadRequest): Request[CreateMultipartReadSetUploadResponse, AWSError] = js.native
  def createMultipartReadSetUpload(
    params: CreateMultipartReadSetUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMultipartReadSetUploadResponse, Unit]
  ): Request[CreateMultipartReadSetUploadResponse, AWSError] = js.native
  
  /**
    * Creates a reference store.
    */
  def createReferenceStore(): Request[CreateReferenceStoreResponse, AWSError] = js.native
  def createReferenceStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateReferenceStoreResponse, Unit]): Request[CreateReferenceStoreResponse, AWSError] = js.native
  /**
    * Creates a reference store.
    */
  def createReferenceStore(params: CreateReferenceStoreRequest): Request[CreateReferenceStoreResponse, AWSError] = js.native
  def createReferenceStore(
    params: CreateReferenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReferenceStoreResponse, Unit]
  ): Request[CreateReferenceStoreResponse, AWSError] = js.native
  
  /**
    * Creates a run group.
    */
  def createRunGroup(): Request[CreateRunGroupResponse, AWSError] = js.native
  def createRunGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRunGroupResponse, Unit]): Request[CreateRunGroupResponse, AWSError] = js.native
  /**
    * Creates a run group.
    */
  def createRunGroup(params: CreateRunGroupRequest): Request[CreateRunGroupResponse, AWSError] = js.native
  def createRunGroup(
    params: CreateRunGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRunGroupResponse, Unit]
  ): Request[CreateRunGroupResponse, AWSError] = js.native
  
  /**
    * Creates a sequence store.
    */
  def createSequenceStore(): Request[CreateSequenceStoreResponse, AWSError] = js.native
  def createSequenceStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateSequenceStoreResponse, Unit]): Request[CreateSequenceStoreResponse, AWSError] = js.native
  /**
    * Creates a sequence store.
    */
  def createSequenceStore(params: CreateSequenceStoreRequest): Request[CreateSequenceStoreResponse, AWSError] = js.native
  def createSequenceStore(
    params: CreateSequenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSequenceStoreResponse, Unit]
  ): Request[CreateSequenceStoreResponse, AWSError] = js.native
  
  /**
    * Creates a variant store.
    */
  def createVariantStore(): Request[CreateVariantStoreResponse, AWSError] = js.native
  def createVariantStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateVariantStoreResponse, Unit]): Request[CreateVariantStoreResponse, AWSError] = js.native
  /**
    * Creates a variant store.
    */
  def createVariantStore(params: CreateVariantStoreRequest): Request[CreateVariantStoreResponse, AWSError] = js.native
  def createVariantStore(
    params: CreateVariantStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVariantStoreResponse, Unit]
  ): Request[CreateVariantStoreResponse, AWSError] = js.native
  
  /**
    * Creates a workflow.
    */
  def createWorkflow(): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]): Request[CreateWorkflowResponse, AWSError] = js.native
  /**
    * Creates a workflow.
    */
  def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(
    params: CreateWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]
  ): Request[CreateWorkflowResponse, AWSError] = js.native
  
  /**
    * Deletes an annotation store.
    */
  def deleteAnnotationStore(): Request[DeleteAnnotationStoreResponse, AWSError] = js.native
  def deleteAnnotationStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnnotationStoreResponse, Unit]): Request[DeleteAnnotationStoreResponse, AWSError] = js.native
  /**
    * Deletes an annotation store.
    */
  def deleteAnnotationStore(params: DeleteAnnotationStoreRequest): Request[DeleteAnnotationStoreResponse, AWSError] = js.native
  def deleteAnnotationStore(
    params: DeleteAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnnotationStoreResponse, Unit]
  ): Request[DeleteAnnotationStoreResponse, AWSError] = js.native
  
  /**
    * Deletes a genome reference.
    */
  def deleteReference(): Request[DeleteReferenceResponse, AWSError] = js.native
  def deleteReference(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReferenceResponse, Unit]): Request[DeleteReferenceResponse, AWSError] = js.native
  /**
    * Deletes a genome reference.
    */
  def deleteReference(params: DeleteReferenceRequest): Request[DeleteReferenceResponse, AWSError] = js.native
  def deleteReference(
    params: DeleteReferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReferenceResponse, Unit]
  ): Request[DeleteReferenceResponse, AWSError] = js.native
  
  /**
    * Deletes a genome reference store.
    */
  def deleteReferenceStore(): Request[DeleteReferenceStoreResponse, AWSError] = js.native
  def deleteReferenceStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReferenceStoreResponse, Unit]): Request[DeleteReferenceStoreResponse, AWSError] = js.native
  /**
    * Deletes a genome reference store.
    */
  def deleteReferenceStore(params: DeleteReferenceStoreRequest): Request[DeleteReferenceStoreResponse, AWSError] = js.native
  def deleteReferenceStore(
    params: DeleteReferenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReferenceStoreResponse, Unit]
  ): Request[DeleteReferenceStoreResponse, AWSError] = js.native
  
  /**
    * Deletes a workflow run.
    */
  def deleteRun(): Request[js.Object, AWSError] = js.native
  def deleteRun(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a workflow run.
    */
  def deleteRun(params: DeleteRunRequest): Request[js.Object, AWSError] = js.native
  def deleteRun(params: DeleteRunRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a workflow run group.
    */
  def deleteRunGroup(): Request[js.Object, AWSError] = js.native
  def deleteRunGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a workflow run group.
    */
  def deleteRunGroup(params: DeleteRunGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteRunGroup(
    params: DeleteRunGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a sequence store.
    */
  def deleteSequenceStore(): Request[DeleteSequenceStoreResponse, AWSError] = js.native
  def deleteSequenceStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSequenceStoreResponse, Unit]): Request[DeleteSequenceStoreResponse, AWSError] = js.native
  /**
    * Deletes a sequence store.
    */
  def deleteSequenceStore(params: DeleteSequenceStoreRequest): Request[DeleteSequenceStoreResponse, AWSError] = js.native
  def deleteSequenceStore(
    params: DeleteSequenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSequenceStoreResponse, Unit]
  ): Request[DeleteSequenceStoreResponse, AWSError] = js.native
  
  /**
    * Deletes a variant store.
    */
  def deleteVariantStore(): Request[DeleteVariantStoreResponse, AWSError] = js.native
  def deleteVariantStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVariantStoreResponse, Unit]): Request[DeleteVariantStoreResponse, AWSError] = js.native
  /**
    * Deletes a variant store.
    */
  def deleteVariantStore(params: DeleteVariantStoreRequest): Request[DeleteVariantStoreResponse, AWSError] = js.native
  def deleteVariantStore(
    params: DeleteVariantStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVariantStoreResponse, Unit]
  ): Request[DeleteVariantStoreResponse, AWSError] = js.native
  
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(): Request[js.Object, AWSError] = js.native
  def deleteWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(params: DeleteWorkflowRequest): Request[js.Object, AWSError] = js.native
  def deleteWorkflow(
    params: DeleteWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about an annotation import job.
    */
  def getAnnotationImportJob(): Request[GetAnnotationImportResponse, AWSError] = js.native
  def getAnnotationImportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationImportResponse, Unit]): Request[GetAnnotationImportResponse, AWSError] = js.native
  /**
    * Gets information about an annotation import job.
    */
  def getAnnotationImportJob(params: GetAnnotationImportRequest): Request[GetAnnotationImportResponse, AWSError] = js.native
  def getAnnotationImportJob(
    params: GetAnnotationImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationImportResponse, Unit]
  ): Request[GetAnnotationImportResponse, AWSError] = js.native
  
  /**
    * Gets information about an annotation store.
    */
  def getAnnotationStore(): Request[GetAnnotationStoreResponse, AWSError] = js.native
  def getAnnotationStore(callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]): Request[GetAnnotationStoreResponse, AWSError] = js.native
  /**
    * Gets information about an annotation store.
    */
  def getAnnotationStore(params: GetAnnotationStoreRequest): Request[GetAnnotationStoreResponse, AWSError] = js.native
  def getAnnotationStore(
    params: GetAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]
  ): Request[GetAnnotationStoreResponse, AWSError] = js.native
  
  /**
    * Gets a file from a read set.
    */
  def getReadSet(): Request[GetReadSetResponse, AWSError] = js.native
  def getReadSet(callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetResponse, Unit]): Request[GetReadSetResponse, AWSError] = js.native
  /**
    * Gets a file from a read set.
    */
  def getReadSet(params: GetReadSetRequest): Request[GetReadSetResponse, AWSError] = js.native
  def getReadSet(
    params: GetReadSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetResponse, Unit]
  ): Request[GetReadSetResponse, AWSError] = js.native
  
  /**
    * Gets information about a read set activation job.
    */
  def getReadSetActivationJob(): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  def getReadSetActivationJob(callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetActivationJobResponse, Unit]): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  /**
    * Gets information about a read set activation job.
    */
  def getReadSetActivationJob(params: GetReadSetActivationJobRequest): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  def getReadSetActivationJob(
    params: GetReadSetActivationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetActivationJobResponse, Unit]
  ): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  
  /**
    * Gets information about a read set export job.
    */
  def getReadSetExportJob(): Request[GetReadSetExportJobResponse, AWSError] = js.native
  def getReadSetExportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetExportJobResponse, Unit]): Request[GetReadSetExportJobResponse, AWSError] = js.native
  /**
    * Gets information about a read set export job.
    */
  def getReadSetExportJob(params: GetReadSetExportJobRequest): Request[GetReadSetExportJobResponse, AWSError] = js.native
  def getReadSetExportJob(
    params: GetReadSetExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetExportJobResponse, Unit]
  ): Request[GetReadSetExportJobResponse, AWSError] = js.native
  
  /**
    * Gets information about a read set import job.
    */
  def getReadSetImportJob(): Request[GetReadSetImportJobResponse, AWSError] = js.native
  def getReadSetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetImportJobResponse, Unit]): Request[GetReadSetImportJobResponse, AWSError] = js.native
  /**
    * Gets information about a read set import job.
    */
  def getReadSetImportJob(params: GetReadSetImportJobRequest): Request[GetReadSetImportJobResponse, AWSError] = js.native
  def getReadSetImportJob(
    params: GetReadSetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetImportJobResponse, Unit]
  ): Request[GetReadSetImportJobResponse, AWSError] = js.native
  
  /**
    * Gets details about a read set.
    */
  def getReadSetMetadata(): Request[GetReadSetMetadataResponse, AWSError] = js.native
  def getReadSetMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetMetadataResponse, Unit]): Request[GetReadSetMetadataResponse, AWSError] = js.native
  /**
    * Gets details about a read set.
    */
  def getReadSetMetadata(params: GetReadSetMetadataRequest): Request[GetReadSetMetadataResponse, AWSError] = js.native
  def getReadSetMetadata(
    params: GetReadSetMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetMetadataResponse, Unit]
  ): Request[GetReadSetMetadataResponse, AWSError] = js.native
  
  /**
    * Gets a reference file.
    */
  def getReference(): Request[GetReferenceResponse, AWSError] = js.native
  def getReference(callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceResponse, Unit]): Request[GetReferenceResponse, AWSError] = js.native
  /**
    * Gets a reference file.
    */
  def getReference(params: GetReferenceRequest): Request[GetReferenceResponse, AWSError] = js.native
  def getReference(
    params: GetReferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceResponse, Unit]
  ): Request[GetReferenceResponse, AWSError] = js.native
  
  /**
    * Gets information about a reference import job.
    */
  def getReferenceImportJob(): Request[GetReferenceImportJobResponse, AWSError] = js.native
  def getReferenceImportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceImportJobResponse, Unit]): Request[GetReferenceImportJobResponse, AWSError] = js.native
  /**
    * Gets information about a reference import job.
    */
  def getReferenceImportJob(params: GetReferenceImportJobRequest): Request[GetReferenceImportJobResponse, AWSError] = js.native
  def getReferenceImportJob(
    params: GetReferenceImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceImportJobResponse, Unit]
  ): Request[GetReferenceImportJobResponse, AWSError] = js.native
  
  /**
    * Gets information about a genome reference's metadata.
    */
  def getReferenceMetadata(): Request[GetReferenceMetadataResponse, AWSError] = js.native
  def getReferenceMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceMetadataResponse, Unit]): Request[GetReferenceMetadataResponse, AWSError] = js.native
  /**
    * Gets information about a genome reference's metadata.
    */
  def getReferenceMetadata(params: GetReferenceMetadataRequest): Request[GetReferenceMetadataResponse, AWSError] = js.native
  def getReferenceMetadata(
    params: GetReferenceMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceMetadataResponse, Unit]
  ): Request[GetReferenceMetadataResponse, AWSError] = js.native
  
  /**
    * Gets information about a reference store.
    */
  def getReferenceStore(): Request[GetReferenceStoreResponse, AWSError] = js.native
  def getReferenceStore(callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceStoreResponse, Unit]): Request[GetReferenceStoreResponse, AWSError] = js.native
  /**
    * Gets information about a reference store.
    */
  def getReferenceStore(params: GetReferenceStoreRequest): Request[GetReferenceStoreResponse, AWSError] = js.native
  def getReferenceStore(
    params: GetReferenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceStoreResponse, Unit]
  ): Request[GetReferenceStoreResponse, AWSError] = js.native
  
  /**
    * Gets information about a workflow run.
    */
  def getRun(): Request[GetRunResponse, AWSError] = js.native
  def getRun(callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]): Request[GetRunResponse, AWSError] = js.native
  /**
    * Gets information about a workflow run.
    */
  def getRun(params: GetRunRequest): Request[GetRunResponse, AWSError] = js.native
  def getRun(params: GetRunRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]): Request[GetRunResponse, AWSError] = js.native
  
  /**
    * Gets information about a workflow run group.
    */
  def getRunGroup(): Request[GetRunGroupResponse, AWSError] = js.native
  def getRunGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetRunGroupResponse, Unit]): Request[GetRunGroupResponse, AWSError] = js.native
  /**
    * Gets information about a workflow run group.
    */
  def getRunGroup(params: GetRunGroupRequest): Request[GetRunGroupResponse, AWSError] = js.native
  def getRunGroup(
    params: GetRunGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunGroupResponse, Unit]
  ): Request[GetRunGroupResponse, AWSError] = js.native
  
  /**
    * Gets information about a workflow run task.
    */
  def getRunTask(): Request[GetRunTaskResponse, AWSError] = js.native
  def getRunTask(callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]): Request[GetRunTaskResponse, AWSError] = js.native
  /**
    * Gets information about a workflow run task.
    */
  def getRunTask(params: GetRunTaskRequest): Request[GetRunTaskResponse, AWSError] = js.native
  def getRunTask(
    params: GetRunTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]
  ): Request[GetRunTaskResponse, AWSError] = js.native
  
  /**
    * Gets information about a sequence store.
    */
  def getSequenceStore(): Request[GetSequenceStoreResponse, AWSError] = js.native
  def getSequenceStore(callback: js.Function2[/* err */ AWSError, /* data */ GetSequenceStoreResponse, Unit]): Request[GetSequenceStoreResponse, AWSError] = js.native
  /**
    * Gets information about a sequence store.
    */
  def getSequenceStore(params: GetSequenceStoreRequest): Request[GetSequenceStoreResponse, AWSError] = js.native
  def getSequenceStore(
    params: GetSequenceStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSequenceStoreResponse, Unit]
  ): Request[GetSequenceStoreResponse, AWSError] = js.native
  
  /**
    * Gets information about a variant import job.
    */
  def getVariantImportJob(): Request[GetVariantImportResponse, AWSError] = js.native
  def getVariantImportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetVariantImportResponse, Unit]): Request[GetVariantImportResponse, AWSError] = js.native
  /**
    * Gets information about a variant import job.
    */
  def getVariantImportJob(params: GetVariantImportRequest): Request[GetVariantImportResponse, AWSError] = js.native
  def getVariantImportJob(
    params: GetVariantImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantImportResponse, Unit]
  ): Request[GetVariantImportResponse, AWSError] = js.native
  
  /**
    * Gets information about a variant store.
    */
  def getVariantStore(): Request[GetVariantStoreResponse, AWSError] = js.native
  def getVariantStore(callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]): Request[GetVariantStoreResponse, AWSError] = js.native
  /**
    * Gets information about a variant store.
    */
  def getVariantStore(params: GetVariantStoreRequest): Request[GetVariantStoreResponse, AWSError] = js.native
  def getVariantStore(
    params: GetVariantStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]
  ): Request[GetVariantStoreResponse, AWSError] = js.native
  
  /**
    * Gets information about a workflow.
    */
  def getWorkflow(): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]): Request[GetWorkflowResponse, AWSError] = js.native
  /**
    * Gets information about a workflow.
    */
  def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(
    params: GetWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]
  ): Request[GetWorkflowResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of annotation import jobs.
    */
  def listAnnotationImportJobs(): Request[ListAnnotationImportJobsResponse, AWSError] = js.native
  def listAnnotationImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListAnnotationImportJobsResponse, Unit]): Request[ListAnnotationImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of annotation import jobs.
    */
  def listAnnotationImportJobs(params: ListAnnotationImportJobsRequest): Request[ListAnnotationImportJobsResponse, AWSError] = js.native
  def listAnnotationImportJobs(
    params: ListAnnotationImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnnotationImportJobsResponse, Unit]
  ): Request[ListAnnotationImportJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of annotation stores.
    */
  def listAnnotationStores(): Request[ListAnnotationStoresResponse, AWSError] = js.native
  def listAnnotationStores(callback: js.Function2[/* err */ AWSError, /* data */ ListAnnotationStoresResponse, Unit]): Request[ListAnnotationStoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of annotation stores.
    */
  def listAnnotationStores(params: ListAnnotationStoresRequest): Request[ListAnnotationStoresResponse, AWSError] = js.native
  def listAnnotationStores(
    params: ListAnnotationStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnnotationStoresResponse, Unit]
  ): Request[ListAnnotationStoresResponse, AWSError] = js.native
  
  /**
    *  Lists all multipart read set uploads and their statuses. 
    */
  def listMultipartReadSetUploads(): Request[ListMultipartReadSetUploadsResponse, AWSError] = js.native
  def listMultipartReadSetUploads(callback: js.Function2[/* err */ AWSError, /* data */ ListMultipartReadSetUploadsResponse, Unit]): Request[ListMultipartReadSetUploadsResponse, AWSError] = js.native
  /**
    *  Lists all multipart read set uploads and their statuses. 
    */
  def listMultipartReadSetUploads(params: ListMultipartReadSetUploadsRequest): Request[ListMultipartReadSetUploadsResponse, AWSError] = js.native
  def listMultipartReadSetUploads(
    params: ListMultipartReadSetUploadsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMultipartReadSetUploadsResponse, Unit]
  ): Request[ListMultipartReadSetUploadsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of read set activation jobs.
    */
  def listReadSetActivationJobs(): Request[ListReadSetActivationJobsResponse, AWSError] = js.native
  def listReadSetActivationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetActivationJobsResponse, Unit]): Request[ListReadSetActivationJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of read set activation jobs.
    */
  def listReadSetActivationJobs(params: ListReadSetActivationJobsRequest): Request[ListReadSetActivationJobsResponse, AWSError] = js.native
  def listReadSetActivationJobs(
    params: ListReadSetActivationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetActivationJobsResponse, Unit]
  ): Request[ListReadSetActivationJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of read set export jobs.
    */
  def listReadSetExportJobs(): Request[ListReadSetExportJobsResponse, AWSError] = js.native
  def listReadSetExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetExportJobsResponse, Unit]): Request[ListReadSetExportJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of read set export jobs.
    */
  def listReadSetExportJobs(params: ListReadSetExportJobsRequest): Request[ListReadSetExportJobsResponse, AWSError] = js.native
  def listReadSetExportJobs(
    params: ListReadSetExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetExportJobsResponse, Unit]
  ): Request[ListReadSetExportJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of read set import jobs.
    */
  def listReadSetImportJobs(): Request[ListReadSetImportJobsResponse, AWSError] = js.native
  def listReadSetImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetImportJobsResponse, Unit]): Request[ListReadSetImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of read set import jobs.
    */
  def listReadSetImportJobs(params: ListReadSetImportJobsRequest): Request[ListReadSetImportJobsResponse, AWSError] = js.native
  def listReadSetImportJobs(
    params: ListReadSetImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetImportJobsResponse, Unit]
  ): Request[ListReadSetImportJobsResponse, AWSError] = js.native
  
  /**
    *  This operation will list all parts in a requested multipart upload for a sequence store. 
    */
  def listReadSetUploadParts(): Request[ListReadSetUploadPartsResponse, AWSError] = js.native
  def listReadSetUploadParts(callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetUploadPartsResponse, Unit]): Request[ListReadSetUploadPartsResponse, AWSError] = js.native
  /**
    *  This operation will list all parts in a requested multipart upload for a sequence store. 
    */
  def listReadSetUploadParts(params: ListReadSetUploadPartsRequest): Request[ListReadSetUploadPartsResponse, AWSError] = js.native
  def listReadSetUploadParts(
    params: ListReadSetUploadPartsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetUploadPartsResponse, Unit]
  ): Request[ListReadSetUploadPartsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of read sets.
    */
  def listReadSets(): Request[ListReadSetsResponse, AWSError] = js.native
  def listReadSets(callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetsResponse, Unit]): Request[ListReadSetsResponse, AWSError] = js.native
  /**
    * Retrieves a list of read sets.
    */
  def listReadSets(params: ListReadSetsRequest): Request[ListReadSetsResponse, AWSError] = js.native
  def listReadSets(
    params: ListReadSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadSetsResponse, Unit]
  ): Request[ListReadSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of reference import jobs.
    */
  def listReferenceImportJobs(): Request[ListReferenceImportJobsResponse, AWSError] = js.native
  def listReferenceImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListReferenceImportJobsResponse, Unit]): Request[ListReferenceImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of reference import jobs.
    */
  def listReferenceImportJobs(params: ListReferenceImportJobsRequest): Request[ListReferenceImportJobsResponse, AWSError] = js.native
  def listReferenceImportJobs(
    params: ListReferenceImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReferenceImportJobsResponse, Unit]
  ): Request[ListReferenceImportJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of reference stores.
    */
  def listReferenceStores(): Request[ListReferenceStoresResponse, AWSError] = js.native
  def listReferenceStores(callback: js.Function2[/* err */ AWSError, /* data */ ListReferenceStoresResponse, Unit]): Request[ListReferenceStoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of reference stores.
    */
  def listReferenceStores(params: ListReferenceStoresRequest): Request[ListReferenceStoresResponse, AWSError] = js.native
  def listReferenceStores(
    params: ListReferenceStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReferenceStoresResponse, Unit]
  ): Request[ListReferenceStoresResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of references.
    */
  def listReferences(): Request[ListReferencesResponse, AWSError] = js.native
  def listReferences(callback: js.Function2[/* err */ AWSError, /* data */ ListReferencesResponse, Unit]): Request[ListReferencesResponse, AWSError] = js.native
  /**
    * Retrieves a list of references.
    */
  def listReferences(params: ListReferencesRequest): Request[ListReferencesResponse, AWSError] = js.native
  def listReferences(
    params: ListReferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReferencesResponse, Unit]
  ): Request[ListReferencesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of run groups.
    */
  def listRunGroups(): Request[ListRunGroupsResponse, AWSError] = js.native
  def listRunGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRunGroupsResponse, Unit]): Request[ListRunGroupsResponse, AWSError] = js.native
  /**
    * Retrieves a list of run groups.
    */
  def listRunGroups(params: ListRunGroupsRequest): Request[ListRunGroupsResponse, AWSError] = js.native
  def listRunGroups(
    params: ListRunGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRunGroupsResponse, Unit]
  ): Request[ListRunGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of tasks for a run.
    */
  def listRunTasks(): Request[ListRunTasksResponse, AWSError] = js.native
  def listRunTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListRunTasksResponse, Unit]): Request[ListRunTasksResponse, AWSError] = js.native
  /**
    * Retrieves a list of tasks for a run.
    */
  def listRunTasks(params: ListRunTasksRequest): Request[ListRunTasksResponse, AWSError] = js.native
  def listRunTasks(
    params: ListRunTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRunTasksResponse, Unit]
  ): Request[ListRunTasksResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of runs.
    */
  def listRuns(): Request[ListRunsResponse, AWSError] = js.native
  def listRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListRunsResponse, Unit]): Request[ListRunsResponse, AWSError] = js.native
  /**
    * Retrieves a list of runs.
    */
  def listRuns(params: ListRunsRequest): Request[ListRunsResponse, AWSError] = js.native
  def listRuns(
    params: ListRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRunsResponse, Unit]
  ): Request[ListRunsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of sequence stores.
    */
  def listSequenceStores(): Request[ListSequenceStoresResponse, AWSError] = js.native
  def listSequenceStores(callback: js.Function2[/* err */ AWSError, /* data */ ListSequenceStoresResponse, Unit]): Request[ListSequenceStoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of sequence stores.
    */
  def listSequenceStores(params: ListSequenceStoresRequest): Request[ListSequenceStoresResponse, AWSError] = js.native
  def listSequenceStores(
    params: ListSequenceStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSequenceStoresResponse, Unit]
  ): Request[ListSequenceStoresResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves a list of tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of variant import jobs.
    */
  def listVariantImportJobs(): Request[ListVariantImportJobsResponse, AWSError] = js.native
  def listVariantImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListVariantImportJobsResponse, Unit]): Request[ListVariantImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves a list of variant import jobs.
    */
  def listVariantImportJobs(params: ListVariantImportJobsRequest): Request[ListVariantImportJobsResponse, AWSError] = js.native
  def listVariantImportJobs(
    params: ListVariantImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVariantImportJobsResponse, Unit]
  ): Request[ListVariantImportJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of variant stores.
    */
  def listVariantStores(): Request[ListVariantStoresResponse, AWSError] = js.native
  def listVariantStores(callback: js.Function2[/* err */ AWSError, /* data */ ListVariantStoresResponse, Unit]): Request[ListVariantStoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of variant stores.
    */
  def listVariantStores(params: ListVariantStoresRequest): Request[ListVariantStoresResponse, AWSError] = js.native
  def listVariantStores(
    params: ListVariantStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVariantStoresResponse, Unit]
  ): Request[ListVariantStoresResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of workflows.
    */
  def listWorkflows(): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]): Request[ListWorkflowsResponse, AWSError] = js.native
  /**
    * Retrieves a list of workflows.
    */
  def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(
    params: ListWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]
  ): Request[ListWorkflowsResponse, AWSError] = js.native
  
  /**
    * Starts an annotation import job.
    */
  def startAnnotationImportJob(): Request[StartAnnotationImportResponse, AWSError] = js.native
  def startAnnotationImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartAnnotationImportResponse, Unit]): Request[StartAnnotationImportResponse, AWSError] = js.native
  /**
    * Starts an annotation import job.
    */
  def startAnnotationImportJob(params: StartAnnotationImportRequest): Request[StartAnnotationImportResponse, AWSError] = js.native
  def startAnnotationImportJob(
    params: StartAnnotationImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAnnotationImportResponse, Unit]
  ): Request[StartAnnotationImportResponse, AWSError] = js.native
  
  /**
    * Activates an archived read set. To reduce storage charges, Amazon Omics archives unused read sets after 30 days.
    */
  def startReadSetActivationJob(): Request[StartReadSetActivationJobResponse, AWSError] = js.native
  def startReadSetActivationJob(callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetActivationJobResponse, Unit]): Request[StartReadSetActivationJobResponse, AWSError] = js.native
  /**
    * Activates an archived read set. To reduce storage charges, Amazon Omics archives unused read sets after 30 days.
    */
  def startReadSetActivationJob(params: StartReadSetActivationJobRequest): Request[StartReadSetActivationJobResponse, AWSError] = js.native
  def startReadSetActivationJob(
    params: StartReadSetActivationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetActivationJobResponse, Unit]
  ): Request[StartReadSetActivationJobResponse, AWSError] = js.native
  
  /**
    * Exports a read set to Amazon S3.
    */
  def startReadSetExportJob(): Request[StartReadSetExportJobResponse, AWSError] = js.native
  def startReadSetExportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetExportJobResponse, Unit]): Request[StartReadSetExportJobResponse, AWSError] = js.native
  /**
    * Exports a read set to Amazon S3.
    */
  def startReadSetExportJob(params: StartReadSetExportJobRequest): Request[StartReadSetExportJobResponse, AWSError] = js.native
  def startReadSetExportJob(
    params: StartReadSetExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetExportJobResponse, Unit]
  ): Request[StartReadSetExportJobResponse, AWSError] = js.native
  
  /**
    * Starts a read set import job.
    */
  def startReadSetImportJob(): Request[StartReadSetImportJobResponse, AWSError] = js.native
  def startReadSetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetImportJobResponse, Unit]): Request[StartReadSetImportJobResponse, AWSError] = js.native
  /**
    * Starts a read set import job.
    */
  def startReadSetImportJob(params: StartReadSetImportJobRequest): Request[StartReadSetImportJobResponse, AWSError] = js.native
  def startReadSetImportJob(
    params: StartReadSetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReadSetImportJobResponse, Unit]
  ): Request[StartReadSetImportJobResponse, AWSError] = js.native
  
  /**
    * Starts a reference import job.
    */
  def startReferenceImportJob(): Request[StartReferenceImportJobResponse, AWSError] = js.native
  def startReferenceImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartReferenceImportJobResponse, Unit]): Request[StartReferenceImportJobResponse, AWSError] = js.native
  /**
    * Starts a reference import job.
    */
  def startReferenceImportJob(params: StartReferenceImportJobRequest): Request[StartReferenceImportJobResponse, AWSError] = js.native
  def startReferenceImportJob(
    params: StartReferenceImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReferenceImportJobResponse, Unit]
  ): Request[StartReferenceImportJobResponse, AWSError] = js.native
  
  /**
    * Starts a run.
    */
  def startRun(): Request[StartRunResponse, AWSError] = js.native
  def startRun(callback: js.Function2[/* err */ AWSError, /* data */ StartRunResponse, Unit]): Request[StartRunResponse, AWSError] = js.native
  /**
    * Starts a run.
    */
  def startRun(params: StartRunRequest): Request[StartRunResponse, AWSError] = js.native
  def startRun(
    params: StartRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRunResponse, Unit]
  ): Request[StartRunResponse, AWSError] = js.native
  
  /**
    * Starts a variant import job.
    */
  def startVariantImportJob(): Request[StartVariantImportResponse, AWSError] = js.native
  def startVariantImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartVariantImportResponse, Unit]): Request[StartVariantImportResponse, AWSError] = js.native
  /**
    * Starts a variant import job.
    */
  def startVariantImportJob(params: StartVariantImportRequest): Request[StartVariantImportResponse, AWSError] = js.native
  def startVariantImportJob(
    params: StartVariantImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartVariantImportResponse, Unit]
  ): Request[StartVariantImportResponse, AWSError] = js.native
  
  /**
    * Tags a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an annotation store.
    */
  def updateAnnotationStore(): Request[UpdateAnnotationStoreResponse, AWSError] = js.native
  def updateAnnotationStore(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnnotationStoreResponse, Unit]): Request[UpdateAnnotationStoreResponse, AWSError] = js.native
  /**
    * Updates an annotation store.
    */
  def updateAnnotationStore(params: UpdateAnnotationStoreRequest): Request[UpdateAnnotationStoreResponse, AWSError] = js.native
  def updateAnnotationStore(
    params: UpdateAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnnotationStoreResponse, Unit]
  ): Request[UpdateAnnotationStoreResponse, AWSError] = js.native
  
  /**
    * Updates a run group.
    */
  def updateRunGroup(): Request[js.Object, AWSError] = js.native
  def updateRunGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a run group.
    */
  def updateRunGroup(params: UpdateRunGroupRequest): Request[js.Object, AWSError] = js.native
  def updateRunGroup(
    params: UpdateRunGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a variant store.
    */
  def updateVariantStore(): Request[UpdateVariantStoreResponse, AWSError] = js.native
  def updateVariantStore(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVariantStoreResponse, Unit]): Request[UpdateVariantStoreResponse, AWSError] = js.native
  /**
    * Updates a variant store.
    */
  def updateVariantStore(params: UpdateVariantStoreRequest): Request[UpdateVariantStoreResponse, AWSError] = js.native
  def updateVariantStore(
    params: UpdateVariantStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVariantStoreResponse, Unit]
  ): Request[UpdateVariantStoreResponse, AWSError] = js.native
  
  /**
    * Updates a workflow.
    */
  def updateWorkflow(): Request[js.Object, AWSError] = js.native
  def updateWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a workflow.
    */
  def updateWorkflow(params: UpdateWorkflowRequest): Request[js.Object, AWSError] = js.native
  def updateWorkflow(
    params: UpdateWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This operation uploads a specific part of a read set. If you upload a new part using a previously used part number, the previously uploaded part will be overwritten. 
    */
  def uploadReadSetPart(): Request[UploadReadSetPartResponse, AWSError] = js.native
  def uploadReadSetPart(callback: js.Function2[/* err */ AWSError, /* data */ UploadReadSetPartResponse, Unit]): Request[UploadReadSetPartResponse, AWSError] = js.native
  /**
    *  This operation uploads a specific part of a read set. If you upload a new part using a previously used part number, the previously uploaded part will be overwritten. 
    */
  def uploadReadSetPart(params: UploadReadSetPartRequest): Request[UploadReadSetPartResponse, AWSError] = js.native
  def uploadReadSetPart(
    params: UploadReadSetPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadReadSetPartResponse, Unit]
  ): Request[UploadReadSetPartResponse, AWSError] = js.native
  
  /**
    * Waits for the annotationImportJobCreated state by periodically calling the underlying Omics.getAnnotationImportJoboperation every 30 seconds (at most 20 times). Wait until an annotation import is completed
    */
  @JSName("waitFor")
  def waitFor_annotationImportJobCreated(state: annotationImportJobCreated): Request[GetAnnotationImportResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationImportJobCreated(
    state: annotationImportJobCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationImportResponse, Unit]
  ): Request[GetAnnotationImportResponse, AWSError] = js.native
  /**
    * Waits for the annotationImportJobCreated state by periodically calling the underlying Omics.getAnnotationImportJoboperation every 30 seconds (at most 20 times). Wait until an annotation import is completed
    */
  @JSName("waitFor")
  def waitFor_annotationImportJobCreated(state: annotationImportJobCreated, params: GetAnnotationImportReques): Request[GetAnnotationImportResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationImportJobCreated(
    state: annotationImportJobCreated,
    params: GetAnnotationImportReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationImportResponse, Unit]
  ): Request[GetAnnotationImportResponse, AWSError] = js.native
  /**
    * Waits for the annotationStoreCreated state by periodically calling the underlying Omics.getAnnotationStoreoperation every 30 seconds (at most 20 times). Wait until an annotation store is created
    */
  @JSName("waitFor")
  def waitFor_annotationStoreCreated(state: annotationStoreCreated): Request[GetAnnotationStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationStoreCreated(
    state: annotationStoreCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]
  ): Request[GetAnnotationStoreResponse, AWSError] = js.native
  /**
    * Waits for the annotationStoreCreated state by periodically calling the underlying Omics.getAnnotationStoreoperation every 30 seconds (at most 20 times). Wait until an annotation store is created
    */
  @JSName("waitFor")
  def waitFor_annotationStoreCreated(state: annotationStoreCreated, params: typings.awsSdk.anon.GetAnnotationStoreRequest): Request[GetAnnotationStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationStoreCreated(
    state: annotationStoreCreated,
    params: typings.awsSdk.anon.GetAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]
  ): Request[GetAnnotationStoreResponse, AWSError] = js.native
  /**
    * Waits for the annotationStoreDeleted state by periodically calling the underlying Omics.getAnnotationStoreoperation every 30 seconds (at most 20 times). Wait until an annotation store is deleted.
    */
  @JSName("waitFor")
  def waitFor_annotationStoreDeleted(state: annotationStoreDeleted): Request[GetAnnotationStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationStoreDeleted(
    state: annotationStoreDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]
  ): Request[GetAnnotationStoreResponse, AWSError] = js.native
  /**
    * Waits for the annotationStoreDeleted state by periodically calling the underlying Omics.getAnnotationStoreoperation every 30 seconds (at most 20 times). Wait until an annotation store is deleted.
    */
  @JSName("waitFor")
  def waitFor_annotationStoreDeleted(state: annotationStoreDeleted, params: typings.awsSdk.anon.GetAnnotationStoreRequest): Request[GetAnnotationStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_annotationStoreDeleted(
    state: annotationStoreDeleted,
    params: typings.awsSdk.anon.GetAnnotationStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnnotationStoreResponse, Unit]
  ): Request[GetAnnotationStoreResponse, AWSError] = js.native
  /**
    * Waits for the readSetActivationJobCompleted state by periodically calling the underlying Omics.getReadSetActivationJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetActivationJobCompleted(state: readSetActivationJobCompleted): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetActivationJobCompleted(
    state: readSetActivationJobCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetActivationJobResponse, Unit]
  ): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  /**
    * Waits for the readSetActivationJobCompleted state by periodically calling the underlying Omics.getReadSetActivationJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetActivationJobCompleted(state: readSetActivationJobCompleted, params: GetReadSetActivationJobRe): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetActivationJobCompleted(
    state: readSetActivationJobCompleted,
    params: GetReadSetActivationJobRe,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetActivationJobResponse, Unit]
  ): Request[GetReadSetActivationJobResponse, AWSError] = js.native
  /**
    * Waits for the readSetExportJobCompleted state by periodically calling the underlying Omics.getReadSetExportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetExportJobCompleted(state: readSetExportJobCompleted): Request[GetReadSetExportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetExportJobCompleted(
    state: readSetExportJobCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetExportJobResponse, Unit]
  ): Request[GetReadSetExportJobResponse, AWSError] = js.native
  /**
    * Waits for the readSetExportJobCompleted state by periodically calling the underlying Omics.getReadSetExportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetExportJobCompleted(state: readSetExportJobCompleted, params: GetReadSetExportJobReques): Request[GetReadSetExportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetExportJobCompleted(
    state: readSetExportJobCompleted,
    params: GetReadSetExportJobReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetExportJobResponse, Unit]
  ): Request[GetReadSetExportJobResponse, AWSError] = js.native
  /**
    * Waits for the readSetImportJobCompleted state by periodically calling the underlying Omics.getReadSetImportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetImportJobCompleted(state: readSetImportJobCompleted): Request[GetReadSetImportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetImportJobCompleted(
    state: readSetImportJobCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetImportJobResponse, Unit]
  ): Request[GetReadSetImportJobResponse, AWSError] = js.native
  /**
    * Waits for the readSetImportJobCompleted state by periodically calling the underlying Omics.getReadSetImportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_readSetImportJobCompleted(state: readSetImportJobCompleted, params: GetReadSetImportJobReques): Request[GetReadSetImportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_readSetImportJobCompleted(
    state: readSetImportJobCompleted,
    params: GetReadSetImportJobReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadSetImportJobResponse, Unit]
  ): Request[GetReadSetImportJobResponse, AWSError] = js.native
  /**
    * Waits for the referenceImportJobCompleted state by periodically calling the underlying Omics.getReferenceImportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_referenceImportJobCompleted(state: referenceImportJobCompleted): Request[GetReferenceImportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_referenceImportJobCompleted(
    state: referenceImportJobCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceImportJobResponse, Unit]
  ): Request[GetReferenceImportJobResponse, AWSError] = js.native
  /**
    * Waits for the referenceImportJobCompleted state by periodically calling the underlying Omics.getReferenceImportJoboperation every 30 seconds (at most 20 times). Wait until a job is completed.
    */
  @JSName("waitFor")
  def waitFor_referenceImportJobCompleted(state: referenceImportJobCompleted, params: GetReferenceImportJobRequ): Request[GetReferenceImportJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_referenceImportJobCompleted(
    state: referenceImportJobCompleted,
    params: GetReferenceImportJobRequ,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReferenceImportJobResponse, Unit]
  ): Request[GetReferenceImportJobResponse, AWSError] = js.native
  /**
    * Waits for the runCompleted state by periodically calling the underlying Omics.getRunoperation every 30 seconds (at most 20 times). Wait until a run is completed.
    */
  @JSName("waitFor")
  def waitFor_runCompleted(state: runCompleted): Request[GetRunResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_runCompleted(state: runCompleted, callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]): Request[GetRunResponse, AWSError] = js.native
  /**
    * Waits for the runCompleted state by periodically calling the underlying Omics.getRunoperation every 30 seconds (at most 20 times). Wait until a run is completed.
    */
  @JSName("waitFor")
  def waitFor_runCompleted(state: runCompleted, params: GetRunRequestwaiterWaiter): Request[GetRunResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_runCompleted(
    state: runCompleted,
    params: GetRunRequestwaiterWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]
  ): Request[GetRunResponse, AWSError] = js.native
  /**
    * Waits for the runRunning state by periodically calling the underlying Omics.getRunoperation every 30 seconds (at most 20 times). Wait until a run is running.
    */
  @JSName("waitFor")
  def waitFor_runRunning(state: runRunning): Request[GetRunResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_runRunning(state: runRunning, callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]): Request[GetRunResponse, AWSError] = js.native
  /**
    * Waits for the runRunning state by periodically calling the underlying Omics.getRunoperation every 30 seconds (at most 20 times). Wait until a run is running.
    */
  @JSName("waitFor")
  def waitFor_runRunning(state: runRunning, params: GetRunRequestwaiterWaiter): Request[GetRunResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_runRunning(
    state: runRunning,
    params: GetRunRequestwaiterWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunResponse, Unit]
  ): Request[GetRunResponse, AWSError] = js.native
  /**
    * Waits for the taskCompleted state by periodically calling the underlying Omics.getRunTaskoperation every 30 seconds (at most 20 times). Wait until a task is completed.
    */
  @JSName("waitFor")
  def waitFor_taskCompleted(state: taskCompleted): Request[GetRunTaskResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_taskCompleted(
    state: taskCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]
  ): Request[GetRunTaskResponse, AWSError] = js.native
  /**
    * Waits for the taskCompleted state by periodically calling the underlying Omics.getRunTaskoperation every 30 seconds (at most 20 times). Wait until a task is completed.
    */
  @JSName("waitFor")
  def waitFor_taskCompleted(state: taskCompleted, params: GetRunTaskRequestwaiterWa): Request[GetRunTaskResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_taskCompleted(
    state: taskCompleted,
    params: GetRunTaskRequestwaiterWa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]
  ): Request[GetRunTaskResponse, AWSError] = js.native
  /**
    * Waits for the taskRunning state by periodically calling the underlying Omics.getRunTaskoperation every 30 seconds (at most 20 times). Wait until a task is running.
    */
  @JSName("waitFor")
  def waitFor_taskRunning(state: taskRunning): Request[GetRunTaskResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_taskRunning(
    state: taskRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]
  ): Request[GetRunTaskResponse, AWSError] = js.native
  /**
    * Waits for the taskRunning state by periodically calling the underlying Omics.getRunTaskoperation every 30 seconds (at most 20 times). Wait until a task is running.
    */
  @JSName("waitFor")
  def waitFor_taskRunning(state: taskRunning, params: GetRunTaskRequestwaiterWa): Request[GetRunTaskResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_taskRunning(
    state: taskRunning,
    params: GetRunTaskRequestwaiterWa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRunTaskResponse, Unit]
  ): Request[GetRunTaskResponse, AWSError] = js.native
  /**
    * Waits for the variantImportJobCreated state by periodically calling the underlying Omics.getVariantImportJoboperation every 30 seconds (at most 20 times). Wait until variant import is completed
    */
  @JSName("waitFor")
  def waitFor_variantImportJobCreated(state: variantImportJobCreated): Request[GetVariantImportResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantImportJobCreated(
    state: variantImportJobCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantImportResponse, Unit]
  ): Request[GetVariantImportResponse, AWSError] = js.native
  /**
    * Waits for the variantImportJobCreated state by periodically calling the underlying Omics.getVariantImportJoboperation every 30 seconds (at most 20 times). Wait until variant import is completed
    */
  @JSName("waitFor")
  def waitFor_variantImportJobCreated(state: variantImportJobCreated, params: GetVariantImportRequestwa): Request[GetVariantImportResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantImportJobCreated(
    state: variantImportJobCreated,
    params: GetVariantImportRequestwa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantImportResponse, Unit]
  ): Request[GetVariantImportResponse, AWSError] = js.native
  /**
    * Waits for the variantStoreCreated state by periodically calling the underlying Omics.getVariantStoreoperation every 30 seconds (at most 20 times). Wait until a variant store is created
    */
  @JSName("waitFor")
  def waitFor_variantStoreCreated(state: variantStoreCreated): Request[GetVariantStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantStoreCreated(
    state: variantStoreCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]
  ): Request[GetVariantStoreResponse, AWSError] = js.native
  /**
    * Waits for the variantStoreCreated state by periodically calling the underlying Omics.getVariantStoreoperation every 30 seconds (at most 20 times). Wait until a variant store is created
    */
  @JSName("waitFor")
  def waitFor_variantStoreCreated(state: variantStoreCreated, params: GetVariantStoreRequestwai): Request[GetVariantStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantStoreCreated(
    state: variantStoreCreated,
    params: GetVariantStoreRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]
  ): Request[GetVariantStoreResponse, AWSError] = js.native
  /**
    * Waits for the variantStoreDeleted state by periodically calling the underlying Omics.getVariantStoreoperation every 30 seconds (at most 20 times). Wait until a variant store is deleted.
    */
  @JSName("waitFor")
  def waitFor_variantStoreDeleted(state: variantStoreDeleted): Request[GetVariantStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantStoreDeleted(
    state: variantStoreDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]
  ): Request[GetVariantStoreResponse, AWSError] = js.native
  /**
    * Waits for the variantStoreDeleted state by periodically calling the underlying Omics.getVariantStoreoperation every 30 seconds (at most 20 times). Wait until a variant store is deleted.
    */
  @JSName("waitFor")
  def waitFor_variantStoreDeleted(state: variantStoreDeleted, params: GetVariantStoreRequestwai): Request[GetVariantStoreResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_variantStoreDeleted(
    state: variantStoreDeleted,
    params: GetVariantStoreRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariantStoreResponse, Unit]
  ): Request[GetVariantStoreResponse, AWSError] = js.native
  /**
    * Waits for the workflowActive state by periodically calling the underlying Omics.getWorkflowoperation every 3 seconds (at most 10 times). Wait until a workflow is active.
    */
  @JSName("waitFor")
  def waitFor_workflowActive(state: workflowActive): Request[GetWorkflowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workflowActive(
    state: workflowActive,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]
  ): Request[GetWorkflowResponse, AWSError] = js.native
  /**
    * Waits for the workflowActive state by periodically calling the underlying Omics.getWorkflowoperation every 3 seconds (at most 10 times). Wait until a workflow is active.
    */
  @JSName("waitFor")
  def waitFor_workflowActive(state: workflowActive, params: GetWorkflowRequestwaiterW): Request[GetWorkflowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workflowActive(
    state: workflowActive,
    params: GetWorkflowRequestwaiterW,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]
  ): Request[GetWorkflowResponse, AWSError] = js.native
}
