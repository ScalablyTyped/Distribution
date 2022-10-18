package typings.awsSdk.clientsAuditmanagerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditManager extends Service {
  
  /**
    *  Associates an evidence folder to an assessment report in a Audit Manager assessment. 
    */
  def associateAssessmentReportEvidenceFolder(): Request[AssociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  def associateAssessmentReportEvidenceFolder(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAssessmentReportEvidenceFolderResponse, Unit]
  ): Request[AssociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  /**
    *  Associates an evidence folder to an assessment report in a Audit Manager assessment. 
    */
  def associateAssessmentReportEvidenceFolder(params: AssociateAssessmentReportEvidenceFolderRequest): Request[AssociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  def associateAssessmentReportEvidenceFolder(
    params: AssociateAssessmentReportEvidenceFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAssessmentReportEvidenceFolderResponse, Unit]
  ): Request[AssociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  
  /**
    *  Associates a list of evidence to an assessment report in an Audit Manager assessment. 
    */
  def batchAssociateAssessmentReportEvidence(): Request[BatchAssociateAssessmentReportEvidenceResponse, AWSError] = js.native
  def batchAssociateAssessmentReportEvidence(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateAssessmentReportEvidenceResponse, Unit]
  ): Request[BatchAssociateAssessmentReportEvidenceResponse, AWSError] = js.native
  /**
    *  Associates a list of evidence to an assessment report in an Audit Manager assessment. 
    */
  def batchAssociateAssessmentReportEvidence(params: BatchAssociateAssessmentReportEvidenceRequest): Request[BatchAssociateAssessmentReportEvidenceResponse, AWSError] = js.native
  def batchAssociateAssessmentReportEvidence(
    params: BatchAssociateAssessmentReportEvidenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateAssessmentReportEvidenceResponse, Unit]
  ): Request[BatchAssociateAssessmentReportEvidenceResponse, AWSError] = js.native
  
  /**
    *  Creates a batch of delegations for an assessment in Audit Manager. 
    */
  def batchCreateDelegationByAssessment(): Request[BatchCreateDelegationByAssessmentResponse, AWSError] = js.native
  def batchCreateDelegationByAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateDelegationByAssessmentResponse, Unit]
  ): Request[BatchCreateDelegationByAssessmentResponse, AWSError] = js.native
  /**
    *  Creates a batch of delegations for an assessment in Audit Manager. 
    */
  def batchCreateDelegationByAssessment(params: BatchCreateDelegationByAssessmentRequest): Request[BatchCreateDelegationByAssessmentResponse, AWSError] = js.native
  def batchCreateDelegationByAssessment(
    params: BatchCreateDelegationByAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateDelegationByAssessmentResponse, Unit]
  ): Request[BatchCreateDelegationByAssessmentResponse, AWSError] = js.native
  
  /**
    *  Deletes a batch of delegations for an assessment in Audit Manager. 
    */
  def batchDeleteDelegationByAssessment(): Request[BatchDeleteDelegationByAssessmentResponse, AWSError] = js.native
  def batchDeleteDelegationByAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDelegationByAssessmentResponse, Unit]
  ): Request[BatchDeleteDelegationByAssessmentResponse, AWSError] = js.native
  /**
    *  Deletes a batch of delegations for an assessment in Audit Manager. 
    */
  def batchDeleteDelegationByAssessment(params: BatchDeleteDelegationByAssessmentRequest): Request[BatchDeleteDelegationByAssessmentResponse, AWSError] = js.native
  def batchDeleteDelegationByAssessment(
    params: BatchDeleteDelegationByAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDelegationByAssessmentResponse, Unit]
  ): Request[BatchDeleteDelegationByAssessmentResponse, AWSError] = js.native
  
  /**
    *  Disassociates a list of evidence from an assessment report in Audit Manager. 
    */
  def batchDisassociateAssessmentReportEvidence(): Request[BatchDisassociateAssessmentReportEvidenceResponse, AWSError] = js.native
  def batchDisassociateAssessmentReportEvidence(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateAssessmentReportEvidenceResponse, 
      Unit
    ]
  ): Request[BatchDisassociateAssessmentReportEvidenceResponse, AWSError] = js.native
  /**
    *  Disassociates a list of evidence from an assessment report in Audit Manager. 
    */
  def batchDisassociateAssessmentReportEvidence(params: BatchDisassociateAssessmentReportEvidenceRequest): Request[BatchDisassociateAssessmentReportEvidenceResponse, AWSError] = js.native
  def batchDisassociateAssessmentReportEvidence(
    params: BatchDisassociateAssessmentReportEvidenceRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateAssessmentReportEvidenceResponse, 
      Unit
    ]
  ): Request[BatchDisassociateAssessmentReportEvidenceResponse, AWSError] = js.native
  
  /**
    *  Uploads one or more pieces of evidence to a control in an Audit Manager assessment. 
    */
  def batchImportEvidenceToAssessmentControl(): Request[BatchImportEvidenceToAssessmentControlResponse, AWSError] = js.native
  def batchImportEvidenceToAssessmentControl(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchImportEvidenceToAssessmentControlResponse, Unit]
  ): Request[BatchImportEvidenceToAssessmentControlResponse, AWSError] = js.native
  /**
    *  Uploads one or more pieces of evidence to a control in an Audit Manager assessment. 
    */
  def batchImportEvidenceToAssessmentControl(params: BatchImportEvidenceToAssessmentControlRequest): Request[BatchImportEvidenceToAssessmentControlResponse, AWSError] = js.native
  def batchImportEvidenceToAssessmentControl(
    params: BatchImportEvidenceToAssessmentControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchImportEvidenceToAssessmentControlResponse, Unit]
  ): Request[BatchImportEvidenceToAssessmentControlResponse, AWSError] = js.native
  
  @JSName("config")
  var config_AuditManager: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Creates an assessment in Audit Manager. 
    */
  def createAssessment(): Request[CreateAssessmentResponse, AWSError] = js.native
  def createAssessment(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentResponse, Unit]): Request[CreateAssessmentResponse, AWSError] = js.native
  /**
    *  Creates an assessment in Audit Manager. 
    */
  def createAssessment(params: CreateAssessmentRequest): Request[CreateAssessmentResponse, AWSError] = js.native
  def createAssessment(
    params: CreateAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentResponse, Unit]
  ): Request[CreateAssessmentResponse, AWSError] = js.native
  
  /**
    *  Creates a custom framework in Audit Manager. 
    */
  def createAssessmentFramework(): Request[CreateAssessmentFrameworkResponse, AWSError] = js.native
  def createAssessmentFramework(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentFrameworkResponse, Unit]): Request[CreateAssessmentFrameworkResponse, AWSError] = js.native
  /**
    *  Creates a custom framework in Audit Manager. 
    */
  def createAssessmentFramework(params: CreateAssessmentFrameworkRequest): Request[CreateAssessmentFrameworkResponse, AWSError] = js.native
  def createAssessmentFramework(
    params: CreateAssessmentFrameworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentFrameworkResponse, Unit]
  ): Request[CreateAssessmentFrameworkResponse, AWSError] = js.native
  
  /**
    *  Creates an assessment report for the specified assessment. 
    */
  def createAssessmentReport(): Request[CreateAssessmentReportResponse, AWSError] = js.native
  def createAssessmentReport(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentReportResponse, Unit]): Request[CreateAssessmentReportResponse, AWSError] = js.native
  /**
    *  Creates an assessment report for the specified assessment. 
    */
  def createAssessmentReport(params: CreateAssessmentReportRequest): Request[CreateAssessmentReportResponse, AWSError] = js.native
  def createAssessmentReport(
    params: CreateAssessmentReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentReportResponse, Unit]
  ): Request[CreateAssessmentReportResponse, AWSError] = js.native
  
  /**
    *  Creates a new custom control in Audit Manager. 
    */
  def createControl(): Request[CreateControlResponse, AWSError] = js.native
  def createControl(callback: js.Function2[/* err */ AWSError, /* data */ CreateControlResponse, Unit]): Request[CreateControlResponse, AWSError] = js.native
  /**
    *  Creates a new custom control in Audit Manager. 
    */
  def createControl(params: CreateControlRequest): Request[CreateControlResponse, AWSError] = js.native
  def createControl(
    params: CreateControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateControlResponse, Unit]
  ): Request[CreateControlResponse, AWSError] = js.native
  
  /**
    *  Deletes an assessment in Audit Manager. 
    */
  def deleteAssessment(): Request[DeleteAssessmentResponse, AWSError] = js.native
  def deleteAssessment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentResponse, Unit]): Request[DeleteAssessmentResponse, AWSError] = js.native
  /**
    *  Deletes an assessment in Audit Manager. 
    */
  def deleteAssessment(params: DeleteAssessmentRequest): Request[DeleteAssessmentResponse, AWSError] = js.native
  def deleteAssessment(
    params: DeleteAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentResponse, Unit]
  ): Request[DeleteAssessmentResponse, AWSError] = js.native
  
  /**
    *  Deletes a custom framework in Audit Manager. 
    */
  def deleteAssessmentFramework(): Request[DeleteAssessmentFrameworkResponse, AWSError] = js.native
  def deleteAssessmentFramework(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentFrameworkResponse, Unit]): Request[DeleteAssessmentFrameworkResponse, AWSError] = js.native
  /**
    *  Deletes a custom framework in Audit Manager. 
    */
  def deleteAssessmentFramework(params: DeleteAssessmentFrameworkRequest): Request[DeleteAssessmentFrameworkResponse, AWSError] = js.native
  def deleteAssessmentFramework(
    params: DeleteAssessmentFrameworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentFrameworkResponse, Unit]
  ): Request[DeleteAssessmentFrameworkResponse, AWSError] = js.native
  
  /**
    *  Deletes a share request for a custom framework in Audit Manager. 
    */
  def deleteAssessmentFrameworkShare(): Request[DeleteAssessmentFrameworkShareResponse, AWSError] = js.native
  def deleteAssessmentFrameworkShare(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentFrameworkShareResponse, Unit]
  ): Request[DeleteAssessmentFrameworkShareResponse, AWSError] = js.native
  /**
    *  Deletes a share request for a custom framework in Audit Manager. 
    */
  def deleteAssessmentFrameworkShare(params: DeleteAssessmentFrameworkShareRequest): Request[DeleteAssessmentFrameworkShareResponse, AWSError] = js.native
  def deleteAssessmentFrameworkShare(
    params: DeleteAssessmentFrameworkShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentFrameworkShareResponse, Unit]
  ): Request[DeleteAssessmentFrameworkShareResponse, AWSError] = js.native
  
  /**
    * Deletes an assessment report in Audit Manager.  When you run the DeleteAssessmentReport operation, Audit Manager attempts to delete the following data:   The specified assessment report that’s stored in your S3 bucket   The associated metadata that’s stored in Audit Manager   If Audit Manager can’t access the assessment report in your S3 bucket, the report isn’t deleted. In this event, the DeleteAssessmentReport operation doesn’t fail. Instead, it proceeds to delete the associated metadata only. You must then delete the assessment report from the S3 bucket yourself.  This scenario happens when Audit Manager receives a 403 (Forbidden) or 404 (Not Found) error from Amazon S3. To avoid this, make sure that your S3 bucket is available, and that you configured the correct permissions for Audit Manager to delete resources in your S3 bucket. For an example permissions policy that you can use, see Assessment report destination permissions in the Audit Manager User Guide. For information about the issues that could cause a 403 (Forbidden) or 404 (Not Found) error from Amazon S3, see List of Error Codes in the Amazon Simple Storage Service API Reference. 
    */
  def deleteAssessmentReport(): Request[DeleteAssessmentReportResponse, AWSError] = js.native
  def deleteAssessmentReport(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentReportResponse, Unit]): Request[DeleteAssessmentReportResponse, AWSError] = js.native
  /**
    * Deletes an assessment report in Audit Manager.  When you run the DeleteAssessmentReport operation, Audit Manager attempts to delete the following data:   The specified assessment report that’s stored in your S3 bucket   The associated metadata that’s stored in Audit Manager   If Audit Manager can’t access the assessment report in your S3 bucket, the report isn’t deleted. In this event, the DeleteAssessmentReport operation doesn’t fail. Instead, it proceeds to delete the associated metadata only. You must then delete the assessment report from the S3 bucket yourself.  This scenario happens when Audit Manager receives a 403 (Forbidden) or 404 (Not Found) error from Amazon S3. To avoid this, make sure that your S3 bucket is available, and that you configured the correct permissions for Audit Manager to delete resources in your S3 bucket. For an example permissions policy that you can use, see Assessment report destination permissions in the Audit Manager User Guide. For information about the issues that could cause a 403 (Forbidden) or 404 (Not Found) error from Amazon S3, see List of Error Codes in the Amazon Simple Storage Service API Reference. 
    */
  def deleteAssessmentReport(params: DeleteAssessmentReportRequest): Request[DeleteAssessmentReportResponse, AWSError] = js.native
  def deleteAssessmentReport(
    params: DeleteAssessmentReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssessmentReportResponse, Unit]
  ): Request[DeleteAssessmentReportResponse, AWSError] = js.native
  
  /**
    *  Deletes a custom control in Audit Manager. 
    */
  def deleteControl(): Request[DeleteControlResponse, AWSError] = js.native
  def deleteControl(callback: js.Function2[/* err */ AWSError, /* data */ DeleteControlResponse, Unit]): Request[DeleteControlResponse, AWSError] = js.native
  /**
    *  Deletes a custom control in Audit Manager. 
    */
  def deleteControl(params: DeleteControlRequest): Request[DeleteControlResponse, AWSError] = js.native
  def deleteControl(
    params: DeleteControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteControlResponse, Unit]
  ): Request[DeleteControlResponse, AWSError] = js.native
  
  /**
    *  Deregisters an account in Audit Manager.   When you deregister your account from Audit Manager, your data isn’t deleted. If you want to delete your resource data, you must perform that task separately before you deregister your account. Either, you can do this in the Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.  To delete your Audit Manager resource data, see the following instructions:     DeleteAssessment (see also: Deleting an assessment in the Audit Manager User Guide)    DeleteAssessmentFramework (see also: Deleting a custom framework in the Audit Manager User Guide)    DeleteAssessmentFrameworkShare (see also: Deleting a share request in the Audit Manager User Guide)    DeleteAssessmentReport (see also: Deleting an assessment report in the Audit Manager User Guide)    DeleteControl (see also: Deleting a custom control in the Audit Manager User Guide)   At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are listed above. 
    */
  def deregisterAccount(): Request[DeregisterAccountResponse, AWSError] = js.native
  def deregisterAccount(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterAccountResponse, Unit]): Request[DeregisterAccountResponse, AWSError] = js.native
  /**
    *  Deregisters an account in Audit Manager.   When you deregister your account from Audit Manager, your data isn’t deleted. If you want to delete your resource data, you must perform that task separately before you deregister your account. Either, you can do this in the Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.  To delete your Audit Manager resource data, see the following instructions:     DeleteAssessment (see also: Deleting an assessment in the Audit Manager User Guide)    DeleteAssessmentFramework (see also: Deleting a custom framework in the Audit Manager User Guide)    DeleteAssessmentFrameworkShare (see also: Deleting a share request in the Audit Manager User Guide)    DeleteAssessmentReport (see also: Deleting an assessment report in the Audit Manager User Guide)    DeleteControl (see also: Deleting a custom control in the Audit Manager User Guide)   At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are listed above. 
    */
  def deregisterAccount(params: DeregisterAccountRequest): Request[DeregisterAccountResponse, AWSError] = js.native
  def deregisterAccount(
    params: DeregisterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterAccountResponse, Unit]
  ): Request[DeregisterAccountResponse, AWSError] = js.native
  
  /**
    * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.   When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the evidence that you previously collected under that account. This is also the case when you deregister a delegated administrator from Organizations. However, Audit Manager will stop collecting and attaching evidence to that delegated administrator account moving forward.   When you deregister a delegated administrator account for Audit Manager, the data for that account isn’t deleted. If you want to delete resource data for a delegated administrator account, you must perform that task separately before you deregister the account. Either, you can do this in the Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.  To delete your Audit Manager resource data, see the following instructions:     DeleteAssessment (see also: Deleting an assessment in the Audit Manager User Guide)    DeleteAssessmentFramework (see also: Deleting a custom framework in the Audit Manager User Guide)    DeleteAssessmentFrameworkShare (see also: Deleting a share request in the Audit Manager User Guide)    DeleteAssessmentReport (see also: Deleting an assessment report in the Audit Manager User Guide)    DeleteControl (see also: Deleting a custom control in the Audit Manager User Guide)   At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are listed above. 
    */
  def deregisterOrganizationAdminAccount(): Request[DeregisterOrganizationAdminAccountResponse, AWSError] = js.native
  def deregisterOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterOrganizationAdminAccountResponse, Unit]
  ): Request[DeregisterOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.   When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the evidence that you previously collected under that account. This is also the case when you deregister a delegated administrator from Organizations. However, Audit Manager will stop collecting and attaching evidence to that delegated administrator account moving forward.   When you deregister a delegated administrator account for Audit Manager, the data for that account isn’t deleted. If you want to delete resource data for a delegated administrator account, you must perform that task separately before you deregister the account. Either, you can do this in the Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.  To delete your Audit Manager resource data, see the following instructions:     DeleteAssessment (see also: Deleting an assessment in the Audit Manager User Guide)    DeleteAssessmentFramework (see also: Deleting a custom framework in the Audit Manager User Guide)    DeleteAssessmentFrameworkShare (see also: Deleting a share request in the Audit Manager User Guide)    DeleteAssessmentReport (see also: Deleting an assessment report in the Audit Manager User Guide)    DeleteControl (see also: Deleting a custom control in the Audit Manager User Guide)   At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are listed above. 
    */
  def deregisterOrganizationAdminAccount(params: DeregisterOrganizationAdminAccountRequest): Request[DeregisterOrganizationAdminAccountResponse, AWSError] = js.native
  def deregisterOrganizationAdminAccount(
    params: DeregisterOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterOrganizationAdminAccountResponse, Unit]
  ): Request[DeregisterOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    *  Disassociates an evidence folder from the specified assessment report in Audit Manager. 
    */
  def disassociateAssessmentReportEvidenceFolder(): Request[DisassociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  def disassociateAssessmentReportEvidenceFolder(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateAssessmentReportEvidenceFolderResponse, 
      Unit
    ]
  ): Request[DisassociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  /**
    *  Disassociates an evidence folder from the specified assessment report in Audit Manager. 
    */
  def disassociateAssessmentReportEvidenceFolder(params: DisassociateAssessmentReportEvidenceFolderRequest): Request[DisassociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  def disassociateAssessmentReportEvidenceFolder(
    params: DisassociateAssessmentReportEvidenceFolderRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateAssessmentReportEvidenceFolderResponse, 
      Unit
    ]
  ): Request[DisassociateAssessmentReportEvidenceFolderResponse, AWSError] = js.native
  
  /**
    *  Returns the registration status of an account in Audit Manager. 
    */
  def getAccountStatus(): Request[GetAccountStatusResponse, AWSError] = js.native
  def getAccountStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountStatusResponse, Unit]): Request[GetAccountStatusResponse, AWSError] = js.native
  /**
    *  Returns the registration status of an account in Audit Manager. 
    */
  def getAccountStatus(params: GetAccountStatusRequest): Request[GetAccountStatusResponse, AWSError] = js.native
  def getAccountStatus(
    params: GetAccountStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountStatusResponse, Unit]
  ): Request[GetAccountStatusResponse, AWSError] = js.native
  
  /**
    * Returns an assessment from Audit Manager. 
    */
  def getAssessment(): Request[GetAssessmentResponse, AWSError] = js.native
  def getAssessment(callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentResponse, Unit]): Request[GetAssessmentResponse, AWSError] = js.native
  /**
    * Returns an assessment from Audit Manager. 
    */
  def getAssessment(params: GetAssessmentRequest): Request[GetAssessmentResponse, AWSError] = js.native
  def getAssessment(
    params: GetAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentResponse, Unit]
  ): Request[GetAssessmentResponse, AWSError] = js.native
  
  /**
    * Returns a framework from Audit Manager. 
    */
  def getAssessmentFramework(): Request[GetAssessmentFrameworkResponse, AWSError] = js.native
  def getAssessmentFramework(callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentFrameworkResponse, Unit]): Request[GetAssessmentFrameworkResponse, AWSError] = js.native
  /**
    * Returns a framework from Audit Manager. 
    */
  def getAssessmentFramework(params: GetAssessmentFrameworkRequest): Request[GetAssessmentFrameworkResponse, AWSError] = js.native
  def getAssessmentFramework(
    params: GetAssessmentFrameworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentFrameworkResponse, Unit]
  ): Request[GetAssessmentFrameworkResponse, AWSError] = js.native
  
  /**
    *  Returns the URL of an assessment report in Audit Manager. 
    */
  def getAssessmentReportUrl(): Request[GetAssessmentReportUrlResponse, AWSError] = js.native
  def getAssessmentReportUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentReportUrlResponse, Unit]): Request[GetAssessmentReportUrlResponse, AWSError] = js.native
  /**
    *  Returns the URL of an assessment report in Audit Manager. 
    */
  def getAssessmentReportUrl(params: GetAssessmentReportUrlRequest): Request[GetAssessmentReportUrlResponse, AWSError] = js.native
  def getAssessmentReportUrl(
    params: GetAssessmentReportUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentReportUrlResponse, Unit]
  ): Request[GetAssessmentReportUrlResponse, AWSError] = js.native
  
  /**
    *  Returns a list of changelogs from Audit Manager. 
    */
  def getChangeLogs(): Request[GetChangeLogsResponse, AWSError] = js.native
  def getChangeLogs(callback: js.Function2[/* err */ AWSError, /* data */ GetChangeLogsResponse, Unit]): Request[GetChangeLogsResponse, AWSError] = js.native
  /**
    *  Returns a list of changelogs from Audit Manager. 
    */
  def getChangeLogs(params: GetChangeLogsRequest): Request[GetChangeLogsResponse, AWSError] = js.native
  def getChangeLogs(
    params: GetChangeLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeLogsResponse, Unit]
  ): Request[GetChangeLogsResponse, AWSError] = js.native
  
  /**
    *  Returns a control from Audit Manager. 
    */
  def getControl(): Request[GetControlResponse, AWSError] = js.native
  def getControl(callback: js.Function2[/* err */ AWSError, /* data */ GetControlResponse, Unit]): Request[GetControlResponse, AWSError] = js.native
  /**
    *  Returns a control from Audit Manager. 
    */
  def getControl(params: GetControlRequest): Request[GetControlResponse, AWSError] = js.native
  def getControl(
    params: GetControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetControlResponse, Unit]
  ): Request[GetControlResponse, AWSError] = js.native
  
  /**
    *  Returns a list of delegations from an audit owner to a delegate. 
    */
  def getDelegations(): Request[GetDelegationsResponse, AWSError] = js.native
  def getDelegations(callback: js.Function2[/* err */ AWSError, /* data */ GetDelegationsResponse, Unit]): Request[GetDelegationsResponse, AWSError] = js.native
  /**
    *  Returns a list of delegations from an audit owner to a delegate. 
    */
  def getDelegations(params: GetDelegationsRequest): Request[GetDelegationsResponse, AWSError] = js.native
  def getDelegations(
    params: GetDelegationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDelegationsResponse, Unit]
  ): Request[GetDelegationsResponse, AWSError] = js.native
  
  /**
    *  Returns evidence from Audit Manager. 
    */
  def getEvidence(): Request[GetEvidenceResponse, AWSError] = js.native
  def getEvidence(callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceResponse, Unit]): Request[GetEvidenceResponse, AWSError] = js.native
  /**
    *  Returns evidence from Audit Manager. 
    */
  def getEvidence(params: GetEvidenceRequest): Request[GetEvidenceResponse, AWSError] = js.native
  def getEvidence(
    params: GetEvidenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceResponse, Unit]
  ): Request[GetEvidenceResponse, AWSError] = js.native
  
  /**
    *  Returns all evidence from a specified evidence folder in Audit Manager. 
    */
  def getEvidenceByEvidenceFolder(): Request[GetEvidenceByEvidenceFolderResponse, AWSError] = js.native
  def getEvidenceByEvidenceFolder(callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceByEvidenceFolderResponse, Unit]): Request[GetEvidenceByEvidenceFolderResponse, AWSError] = js.native
  /**
    *  Returns all evidence from a specified evidence folder in Audit Manager. 
    */
  def getEvidenceByEvidenceFolder(params: GetEvidenceByEvidenceFolderRequest): Request[GetEvidenceByEvidenceFolderResponse, AWSError] = js.native
  def getEvidenceByEvidenceFolder(
    params: GetEvidenceByEvidenceFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceByEvidenceFolderResponse, Unit]
  ): Request[GetEvidenceByEvidenceFolderResponse, AWSError] = js.native
  
  /**
    *  Returns an evidence folder from the specified assessment in Audit Manager. 
    */
  def getEvidenceFolder(): Request[GetEvidenceFolderResponse, AWSError] = js.native
  def getEvidenceFolder(callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFolderResponse, Unit]): Request[GetEvidenceFolderResponse, AWSError] = js.native
  /**
    *  Returns an evidence folder from the specified assessment in Audit Manager. 
    */
  def getEvidenceFolder(params: GetEvidenceFolderRequest): Request[GetEvidenceFolderResponse, AWSError] = js.native
  def getEvidenceFolder(
    params: GetEvidenceFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFolderResponse, Unit]
  ): Request[GetEvidenceFolderResponse, AWSError] = js.native
  
  /**
    *  Returns the evidence folders from a specified assessment in Audit Manager. 
    */
  def getEvidenceFoldersByAssessment(): Request[GetEvidenceFoldersByAssessmentResponse, AWSError] = js.native
  def getEvidenceFoldersByAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFoldersByAssessmentResponse, Unit]
  ): Request[GetEvidenceFoldersByAssessmentResponse, AWSError] = js.native
  /**
    *  Returns the evidence folders from a specified assessment in Audit Manager. 
    */
  def getEvidenceFoldersByAssessment(params: GetEvidenceFoldersByAssessmentRequest): Request[GetEvidenceFoldersByAssessmentResponse, AWSError] = js.native
  def getEvidenceFoldersByAssessment(
    params: GetEvidenceFoldersByAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFoldersByAssessmentResponse, Unit]
  ): Request[GetEvidenceFoldersByAssessmentResponse, AWSError] = js.native
  
  /**
    *  Returns a list of evidence folders that are associated with a specified control of an assessment in Audit Manager. 
    */
  def getEvidenceFoldersByAssessmentControl(): Request[GetEvidenceFoldersByAssessmentControlResponse, AWSError] = js.native
  def getEvidenceFoldersByAssessmentControl(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFoldersByAssessmentControlResponse, Unit]
  ): Request[GetEvidenceFoldersByAssessmentControlResponse, AWSError] = js.native
  /**
    *  Returns a list of evidence folders that are associated with a specified control of an assessment in Audit Manager. 
    */
  def getEvidenceFoldersByAssessmentControl(params: GetEvidenceFoldersByAssessmentControlRequest): Request[GetEvidenceFoldersByAssessmentControlResponse, AWSError] = js.native
  def getEvidenceFoldersByAssessmentControl(
    params: GetEvidenceFoldersByAssessmentControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvidenceFoldersByAssessmentControlResponse, Unit]
  ): Request[GetEvidenceFoldersByAssessmentControlResponse, AWSError] = js.native
  
  /**
    * Gets the latest analytics data for all your current active assessments. 
    */
  def getInsights(): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]): Request[GetInsightsResponse, AWSError] = js.native
  /**
    * Gets the latest analytics data for all your current active assessments. 
    */
  def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(
    params: GetInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]
  ): Request[GetInsightsResponse, AWSError] = js.native
  
  /**
    * Gets the latest analytics data for a specific active assessment. 
    */
  def getInsightsByAssessment(): Request[GetInsightsByAssessmentResponse, AWSError] = js.native
  def getInsightsByAssessment(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsByAssessmentResponse, Unit]): Request[GetInsightsByAssessmentResponse, AWSError] = js.native
  /**
    * Gets the latest analytics data for a specific active assessment. 
    */
  def getInsightsByAssessment(params: GetInsightsByAssessmentRequest): Request[GetInsightsByAssessmentResponse, AWSError] = js.native
  def getInsightsByAssessment(
    params: GetInsightsByAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsByAssessmentResponse, Unit]
  ): Request[GetInsightsByAssessmentResponse, AWSError] = js.native
  
  /**
    *  Returns the name of the delegated Amazon Web Services administrator account for the organization. 
    */
  def getOrganizationAdminAccount(): Request[GetOrganizationAdminAccountResponse, AWSError] = js.native
  def getOrganizationAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationAdminAccountResponse, Unit]): Request[GetOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    *  Returns the name of the delegated Amazon Web Services administrator account for the organization. 
    */
  def getOrganizationAdminAccount(params: GetOrganizationAdminAccountRequest): Request[GetOrganizationAdminAccountResponse, AWSError] = js.native
  def getOrganizationAdminAccount(
    params: GetOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationAdminAccountResponse, Unit]
  ): Request[GetOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    *  Returns a list of the in-scope Amazon Web Services for the specified assessment. 
    */
  def getServicesInScope(): Request[GetServicesInScopeResponse, AWSError] = js.native
  def getServicesInScope(callback: js.Function2[/* err */ AWSError, /* data */ GetServicesInScopeResponse, Unit]): Request[GetServicesInScopeResponse, AWSError] = js.native
  /**
    *  Returns a list of the in-scope Amazon Web Services for the specified assessment. 
    */
  def getServicesInScope(params: GetServicesInScopeRequest): Request[GetServicesInScopeResponse, AWSError] = js.native
  def getServicesInScope(
    params: GetServicesInScopeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServicesInScopeResponse, Unit]
  ): Request[GetServicesInScopeResponse, AWSError] = js.native
  
  /**
    *  Returns the settings for the specified Amazon Web Services account. 
    */
  def getSettings(): Request[GetSettingsResponse, AWSError] = js.native
  def getSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetSettingsResponse, Unit]): Request[GetSettingsResponse, AWSError] = js.native
  /**
    *  Returns the settings for the specified Amazon Web Services account. 
    */
  def getSettings(params: GetSettingsRequest): Request[GetSettingsResponse, AWSError] = js.native
  def getSettings(
    params: GetSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSettingsResponse, Unit]
  ): Request[GetSettingsResponse, AWSError] = js.native
  
  /**
    * Lists the latest analytics data for controls within a specific control domain and a specific active assessment.  Control insights are listed only if the control belongs to the control domain and assessment that was specified. Moreover, the control must have collected evidence on the lastUpdated date of controlInsightsByAssessment. If neither of these conditions are met, no data is listed for that control.  
    */
  def listAssessmentControlInsightsByControlDomain(): Request[ListAssessmentControlInsightsByControlDomainResponse, AWSError] = js.native
  def listAssessmentControlInsightsByControlDomain(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListAssessmentControlInsightsByControlDomainResponse, 
      Unit
    ]
  ): Request[ListAssessmentControlInsightsByControlDomainResponse, AWSError] = js.native
  /**
    * Lists the latest analytics data for controls within a specific control domain and a specific active assessment.  Control insights are listed only if the control belongs to the control domain and assessment that was specified. Moreover, the control must have collected evidence on the lastUpdated date of controlInsightsByAssessment. If neither of these conditions are met, no data is listed for that control.  
    */
  def listAssessmentControlInsightsByControlDomain(params: ListAssessmentControlInsightsByControlDomainRequest): Request[ListAssessmentControlInsightsByControlDomainResponse, AWSError] = js.native
  def listAssessmentControlInsightsByControlDomain(
    params: ListAssessmentControlInsightsByControlDomainRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListAssessmentControlInsightsByControlDomainResponse, 
      Unit
    ]
  ): Request[ListAssessmentControlInsightsByControlDomainResponse, AWSError] = js.native
  
  /**
    *  Returns a list of sent or received share requests for custom frameworks in Audit Manager. 
    */
  def listAssessmentFrameworkShareRequests(): Request[ListAssessmentFrameworkShareRequestsResponse, AWSError] = js.native
  def listAssessmentFrameworkShareRequests(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentFrameworkShareRequestsResponse, Unit]
  ): Request[ListAssessmentFrameworkShareRequestsResponse, AWSError] = js.native
  /**
    *  Returns a list of sent or received share requests for custom frameworks in Audit Manager. 
    */
  def listAssessmentFrameworkShareRequests(params: ListAssessmentFrameworkShareRequestsRequest): Request[ListAssessmentFrameworkShareRequestsResponse, AWSError] = js.native
  def listAssessmentFrameworkShareRequests(
    params: ListAssessmentFrameworkShareRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentFrameworkShareRequestsResponse, Unit]
  ): Request[ListAssessmentFrameworkShareRequestsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of the frameworks that are available in the Audit Manager framework library. 
    */
  def listAssessmentFrameworks(): Request[ListAssessmentFrameworksResponse, AWSError] = js.native
  def listAssessmentFrameworks(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentFrameworksResponse, Unit]): Request[ListAssessmentFrameworksResponse, AWSError] = js.native
  /**
    *  Returns a list of the frameworks that are available in the Audit Manager framework library. 
    */
  def listAssessmentFrameworks(params: ListAssessmentFrameworksRequest): Request[ListAssessmentFrameworksResponse, AWSError] = js.native
  def listAssessmentFrameworks(
    params: ListAssessmentFrameworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentFrameworksResponse, Unit]
  ): Request[ListAssessmentFrameworksResponse, AWSError] = js.native
  
  /**
    *  Returns a list of assessment reports created in Audit Manager. 
    */
  def listAssessmentReports(): Request[ListAssessmentReportsResponse, AWSError] = js.native
  def listAssessmentReports(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentReportsResponse, Unit]): Request[ListAssessmentReportsResponse, AWSError] = js.native
  /**
    *  Returns a list of assessment reports created in Audit Manager. 
    */
  def listAssessmentReports(params: ListAssessmentReportsRequest): Request[ListAssessmentReportsResponse, AWSError] = js.native
  def listAssessmentReports(
    params: ListAssessmentReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentReportsResponse, Unit]
  ): Request[ListAssessmentReportsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of current and past assessments from Audit Manager. 
    */
  def listAssessments(): Request[ListAssessmentsResponse, AWSError] = js.native
  def listAssessments(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentsResponse, Unit]): Request[ListAssessmentsResponse, AWSError] = js.native
  /**
    *  Returns a list of current and past assessments from Audit Manager. 
    */
  def listAssessments(params: ListAssessmentsRequest): Request[ListAssessmentsResponse, AWSError] = js.native
  def listAssessments(
    params: ListAssessmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentsResponse, Unit]
  ): Request[ListAssessmentsResponse, AWSError] = js.native
  
  /**
    * Lists the latest analytics data for control domains across all of your active assessments.   A control domain is listed only if at least one of the controls within that domain collected evidence on the lastUpdated date of controlDomainInsights. If this condition isn’t met, no data is listed for that control domain. 
    */
  def listControlDomainInsights(): Request[ListControlDomainInsightsResponse, AWSError] = js.native
  def listControlDomainInsights(callback: js.Function2[/* err */ AWSError, /* data */ ListControlDomainInsightsResponse, Unit]): Request[ListControlDomainInsightsResponse, AWSError] = js.native
  /**
    * Lists the latest analytics data for control domains across all of your active assessments.   A control domain is listed only if at least one of the controls within that domain collected evidence on the lastUpdated date of controlDomainInsights. If this condition isn’t met, no data is listed for that control domain. 
    */
  def listControlDomainInsights(params: ListControlDomainInsightsRequest): Request[ListControlDomainInsightsResponse, AWSError] = js.native
  def listControlDomainInsights(
    params: ListControlDomainInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlDomainInsightsResponse, Unit]
  ): Request[ListControlDomainInsightsResponse, AWSError] = js.native
  
  /**
    * Lists analytics data for control domains within a specified active assessment.  A control domain is listed only if at least one of the controls within that domain collected evidence on the lastUpdated date of controlDomainInsights. If this condition isn’t met, no data is listed for that domain. 
    */
  def listControlDomainInsightsByAssessment(): Request[ListControlDomainInsightsByAssessmentResponse, AWSError] = js.native
  def listControlDomainInsightsByAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlDomainInsightsByAssessmentResponse, Unit]
  ): Request[ListControlDomainInsightsByAssessmentResponse, AWSError] = js.native
  /**
    * Lists analytics data for control domains within a specified active assessment.  A control domain is listed only if at least one of the controls within that domain collected evidence on the lastUpdated date of controlDomainInsights. If this condition isn’t met, no data is listed for that domain. 
    */
  def listControlDomainInsightsByAssessment(params: ListControlDomainInsightsByAssessmentRequest): Request[ListControlDomainInsightsByAssessmentResponse, AWSError] = js.native
  def listControlDomainInsightsByAssessment(
    params: ListControlDomainInsightsByAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlDomainInsightsByAssessmentResponse, Unit]
  ): Request[ListControlDomainInsightsByAssessmentResponse, AWSError] = js.native
  
  /**
    * Lists the latest analytics data for controls within a specific control domain across all active assessments.  Control insights are listed only if the control belongs to the control domain that was specified and the control collected evidence on the lastUpdated date of controlInsightsMetadata. If neither of these conditions are met, no data is listed for that control.  
    */
  def listControlInsightsByControlDomain(): Request[ListControlInsightsByControlDomainResponse, AWSError] = js.native
  def listControlInsightsByControlDomain(
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlInsightsByControlDomainResponse, Unit]
  ): Request[ListControlInsightsByControlDomainResponse, AWSError] = js.native
  /**
    * Lists the latest analytics data for controls within a specific control domain across all active assessments.  Control insights are listed only if the control belongs to the control domain that was specified and the control collected evidence on the lastUpdated date of controlInsightsMetadata. If neither of these conditions are met, no data is listed for that control.  
    */
  def listControlInsightsByControlDomain(params: ListControlInsightsByControlDomainRequest): Request[ListControlInsightsByControlDomainResponse, AWSError] = js.native
  def listControlInsightsByControlDomain(
    params: ListControlInsightsByControlDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlInsightsByControlDomainResponse, Unit]
  ): Request[ListControlInsightsByControlDomainResponse, AWSError] = js.native
  
  /**
    *  Returns a list of controls from Audit Manager. 
    */
  def listControls(): Request[ListControlsResponse, AWSError] = js.native
  def listControls(callback: js.Function2[/* err */ AWSError, /* data */ ListControlsResponse, Unit]): Request[ListControlsResponse, AWSError] = js.native
  /**
    *  Returns a list of controls from Audit Manager. 
    */
  def listControls(params: ListControlsRequest): Request[ListControlsResponse, AWSError] = js.native
  def listControls(
    params: ListControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlsResponse, Unit]
  ): Request[ListControlsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of keywords that are pre-mapped to the specified control data source. 
    */
  def listKeywordsForDataSource(): Request[ListKeywordsForDataSourceResponse, AWSError] = js.native
  def listKeywordsForDataSource(callback: js.Function2[/* err */ AWSError, /* data */ ListKeywordsForDataSourceResponse, Unit]): Request[ListKeywordsForDataSourceResponse, AWSError] = js.native
  /**
    *  Returns a list of keywords that are pre-mapped to the specified control data source. 
    */
  def listKeywordsForDataSource(params: ListKeywordsForDataSourceRequest): Request[ListKeywordsForDataSourceResponse, AWSError] = js.native
  def listKeywordsForDataSource(
    params: ListKeywordsForDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKeywordsForDataSourceResponse, Unit]
  ): Request[ListKeywordsForDataSourceResponse, AWSError] = js.native
  
  /**
    *  Returns a list of all Audit Manager notifications. 
    */
  def listNotifications(): Request[ListNotificationsResponse, AWSError] = js.native
  def listNotifications(callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationsResponse, Unit]): Request[ListNotificationsResponse, AWSError] = js.native
  /**
    *  Returns a list of all Audit Manager notifications. 
    */
  def listNotifications(params: ListNotificationsRequest): Request[ListNotificationsResponse, AWSError] = js.native
  def listNotifications(
    params: ListNotificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationsResponse, Unit]
  ): Request[ListNotificationsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of tags for the specified resource in Audit Manager. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns a list of tags for the specified resource in Audit Manager. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Enables Audit Manager for the specified Amazon Web Services account. 
    */
  def registerAccount(): Request[RegisterAccountResponse, AWSError] = js.native
  def registerAccount(callback: js.Function2[/* err */ AWSError, /* data */ RegisterAccountResponse, Unit]): Request[RegisterAccountResponse, AWSError] = js.native
  /**
    *  Enables Audit Manager for the specified Amazon Web Services account. 
    */
  def registerAccount(params: RegisterAccountRequest): Request[RegisterAccountResponse, AWSError] = js.native
  def registerAccount(
    params: RegisterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterAccountResponse, Unit]
  ): Request[RegisterAccountResponse, AWSError] = js.native
  
  /**
    *  Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager. 
    */
  def registerOrganizationAdminAccount(): Request[RegisterOrganizationAdminAccountResponse, AWSError] = js.native
  def registerOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterOrganizationAdminAccountResponse, Unit]
  ): Request[RegisterOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    *  Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager. 
    */
  def registerOrganizationAdminAccount(params: RegisterOrganizationAdminAccountRequest): Request[RegisterOrganizationAdminAccountResponse, AWSError] = js.native
  def registerOrganizationAdminAccount(
    params: RegisterOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterOrganizationAdminAccountResponse, Unit]
  ): Request[RegisterOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    *  Creates a share request for a custom framework in Audit Manager.  The share request specifies a recipient and notifies them that a custom framework is available. Recipients have 120 days to accept or decline the request. If no action is taken, the share request expires. When you create a share request, Audit Manager stores a snapshot of your custom framework in the US East (N. Virginia) Amazon Web Services Region. Audit Manager also stores a backup of the same snapshot in the US West (Oregon) Amazon Web Services Region. Audit Manager deletes the snapshot and the backup snapshot when one of the following events occurs:   The sender revokes the share request.   The recipient declines the share request.   The recipient encounters an error and doesn't successfully accept the share request.   The share request expires before the recipient responds to the request.   When a sender resends a share request, the snapshot is replaced with an updated version that corresponds with the latest version of the custom framework.  When a recipient accepts a share request, the snapshot is replicated into their Amazon Web Services account under the Amazon Web Services Region that was specified in the share request.   When you invoke the StartAssessmentFrameworkShare API, you are about to share a custom framework with another Amazon Web Services account. You may not share a custom framework that is derived from a standard framework if the standard framework is designated as not eligible for sharing by Amazon Web Services, unless you have obtained permission to do so from the owner of the standard framework. To learn more about which standard frameworks are eligible for sharing, see Framework sharing eligibility in the Audit Manager User Guide. 
    */
  def startAssessmentFrameworkShare(): Request[StartAssessmentFrameworkShareResponse, AWSError] = js.native
  def startAssessmentFrameworkShare(callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentFrameworkShareResponse, Unit]): Request[StartAssessmentFrameworkShareResponse, AWSError] = js.native
  /**
    *  Creates a share request for a custom framework in Audit Manager.  The share request specifies a recipient and notifies them that a custom framework is available. Recipients have 120 days to accept or decline the request. If no action is taken, the share request expires. When you create a share request, Audit Manager stores a snapshot of your custom framework in the US East (N. Virginia) Amazon Web Services Region. Audit Manager also stores a backup of the same snapshot in the US West (Oregon) Amazon Web Services Region. Audit Manager deletes the snapshot and the backup snapshot when one of the following events occurs:   The sender revokes the share request.   The recipient declines the share request.   The recipient encounters an error and doesn't successfully accept the share request.   The share request expires before the recipient responds to the request.   When a sender resends a share request, the snapshot is replaced with an updated version that corresponds with the latest version of the custom framework.  When a recipient accepts a share request, the snapshot is replicated into their Amazon Web Services account under the Amazon Web Services Region that was specified in the share request.   When you invoke the StartAssessmentFrameworkShare API, you are about to share a custom framework with another Amazon Web Services account. You may not share a custom framework that is derived from a standard framework if the standard framework is designated as not eligible for sharing by Amazon Web Services, unless you have obtained permission to do so from the owner of the standard framework. To learn more about which standard frameworks are eligible for sharing, see Framework sharing eligibility in the Audit Manager User Guide. 
    */
  def startAssessmentFrameworkShare(params: StartAssessmentFrameworkShareRequest): Request[StartAssessmentFrameworkShareResponse, AWSError] = js.native
  def startAssessmentFrameworkShare(
    params: StartAssessmentFrameworkShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentFrameworkShareResponse, Unit]
  ): Request[StartAssessmentFrameworkShareResponse, AWSError] = js.native
  
  /**
    *  Tags the specified resource in Audit Manager. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Tags the specified resource in Audit Manager. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Removes a tag from a resource in Audit Manager. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes a tag from a resource in Audit Manager. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Edits an Audit Manager assessment. 
    */
  def updateAssessment(): Request[UpdateAssessmentResponse, AWSError] = js.native
  def updateAssessment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentResponse, Unit]): Request[UpdateAssessmentResponse, AWSError] = js.native
  /**
    *  Edits an Audit Manager assessment. 
    */
  def updateAssessment(params: UpdateAssessmentRequest): Request[UpdateAssessmentResponse, AWSError] = js.native
  def updateAssessment(
    params: UpdateAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentResponse, Unit]
  ): Request[UpdateAssessmentResponse, AWSError] = js.native
  
  /**
    *  Updates a control within an assessment in Audit Manager. 
    */
  def updateAssessmentControl(): Request[UpdateAssessmentControlResponse, AWSError] = js.native
  def updateAssessmentControl(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentControlResponse, Unit]): Request[UpdateAssessmentControlResponse, AWSError] = js.native
  /**
    *  Updates a control within an assessment in Audit Manager. 
    */
  def updateAssessmentControl(params: UpdateAssessmentControlRequest): Request[UpdateAssessmentControlResponse, AWSError] = js.native
  def updateAssessmentControl(
    params: UpdateAssessmentControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentControlResponse, Unit]
  ): Request[UpdateAssessmentControlResponse, AWSError] = js.native
  
  /**
    *  Updates the status of a control set in an Audit Manager assessment. 
    */
  def updateAssessmentControlSetStatus(): Request[UpdateAssessmentControlSetStatusResponse, AWSError] = js.native
  def updateAssessmentControlSetStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentControlSetStatusResponse, Unit]
  ): Request[UpdateAssessmentControlSetStatusResponse, AWSError] = js.native
  /**
    *  Updates the status of a control set in an Audit Manager assessment. 
    */
  def updateAssessmentControlSetStatus(params: UpdateAssessmentControlSetStatusRequest): Request[UpdateAssessmentControlSetStatusResponse, AWSError] = js.native
  def updateAssessmentControlSetStatus(
    params: UpdateAssessmentControlSetStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentControlSetStatusResponse, Unit]
  ): Request[UpdateAssessmentControlSetStatusResponse, AWSError] = js.native
  
  /**
    *  Updates a custom framework in Audit Manager. 
    */
  def updateAssessmentFramework(): Request[UpdateAssessmentFrameworkResponse, AWSError] = js.native
  def updateAssessmentFramework(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentFrameworkResponse, Unit]): Request[UpdateAssessmentFrameworkResponse, AWSError] = js.native
  /**
    *  Updates a custom framework in Audit Manager. 
    */
  def updateAssessmentFramework(params: UpdateAssessmentFrameworkRequest): Request[UpdateAssessmentFrameworkResponse, AWSError] = js.native
  def updateAssessmentFramework(
    params: UpdateAssessmentFrameworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentFrameworkResponse, Unit]
  ): Request[UpdateAssessmentFrameworkResponse, AWSError] = js.native
  
  /**
    *  Updates a share request for a custom framework in Audit Manager. 
    */
  def updateAssessmentFrameworkShare(): Request[UpdateAssessmentFrameworkShareResponse, AWSError] = js.native
  def updateAssessmentFrameworkShare(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentFrameworkShareResponse, Unit]
  ): Request[UpdateAssessmentFrameworkShareResponse, AWSError] = js.native
  /**
    *  Updates a share request for a custom framework in Audit Manager. 
    */
  def updateAssessmentFrameworkShare(params: UpdateAssessmentFrameworkShareRequest): Request[UpdateAssessmentFrameworkShareResponse, AWSError] = js.native
  def updateAssessmentFrameworkShare(
    params: UpdateAssessmentFrameworkShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentFrameworkShareResponse, Unit]
  ): Request[UpdateAssessmentFrameworkShareResponse, AWSError] = js.native
  
  /**
    *  Updates the status of an assessment in Audit Manager. 
    */
  def updateAssessmentStatus(): Request[UpdateAssessmentStatusResponse, AWSError] = js.native
  def updateAssessmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentStatusResponse, Unit]): Request[UpdateAssessmentStatusResponse, AWSError] = js.native
  /**
    *  Updates the status of an assessment in Audit Manager. 
    */
  def updateAssessmentStatus(params: UpdateAssessmentStatusRequest): Request[UpdateAssessmentStatusResponse, AWSError] = js.native
  def updateAssessmentStatus(
    params: UpdateAssessmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssessmentStatusResponse, Unit]
  ): Request[UpdateAssessmentStatusResponse, AWSError] = js.native
  
  /**
    *  Updates a custom control in Audit Manager. 
    */
  def updateControl(): Request[UpdateControlResponse, AWSError] = js.native
  def updateControl(callback: js.Function2[/* err */ AWSError, /* data */ UpdateControlResponse, Unit]): Request[UpdateControlResponse, AWSError] = js.native
  /**
    *  Updates a custom control in Audit Manager. 
    */
  def updateControl(params: UpdateControlRequest): Request[UpdateControlResponse, AWSError] = js.native
  def updateControl(
    params: UpdateControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateControlResponse, Unit]
  ): Request[UpdateControlResponse, AWSError] = js.native
  
  /**
    *  Updates Audit Manager settings for the current user account. 
    */
  def updateSettings(): Request[UpdateSettingsResponse, AWSError] = js.native
  def updateSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSettingsResponse, Unit]): Request[UpdateSettingsResponse, AWSError] = js.native
  /**
    *  Updates Audit Manager settings for the current user account. 
    */
  def updateSettings(params: UpdateSettingsRequest): Request[UpdateSettingsResponse, AWSError] = js.native
  def updateSettings(
    params: UpdateSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSettingsResponse, Unit]
  ): Request[UpdateSettingsResponse, AWSError] = js.native
  
  /**
    *  Validates the integrity of an assessment report in Audit Manager. 
    */
  def validateAssessmentReportIntegrity(): Request[ValidateAssessmentReportIntegrityResponse, AWSError] = js.native
  def validateAssessmentReportIntegrity(
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateAssessmentReportIntegrityResponse, Unit]
  ): Request[ValidateAssessmentReportIntegrityResponse, AWSError] = js.native
  /**
    *  Validates the integrity of an assessment report in Audit Manager. 
    */
  def validateAssessmentReportIntegrity(params: ValidateAssessmentReportIntegrityRequest): Request[ValidateAssessmentReportIntegrityResponse, AWSError] = js.native
  def validateAssessmentReportIntegrity(
    params: ValidateAssessmentReportIntegrityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateAssessmentReportIntegrityResponse, Unit]
  ): Request[ValidateAssessmentReportIntegrityResponse, AWSError] = js.native
}
