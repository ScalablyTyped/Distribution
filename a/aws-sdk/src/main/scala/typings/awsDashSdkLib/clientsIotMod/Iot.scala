package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iot
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Iot: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
    */
  def acceptCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
    */
  def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptCertificateTransfer(
    params: AcceptCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a thing to a billing group.
    */
  def addThingToBillingGroup(): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addThingToBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddThingToBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a thing to a billing group.
    */
  def addThingToBillingGroup(params: AddThingToBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addThingToBillingGroup(
    params: AddThingToBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddThingToBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a thing to a thing group.
    */
  def addThingToThingGroup(): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addThingToThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddThingToThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a thing to a thing group.
    */
  def addThingToThingGroup(params: AddThingToThingGroupRequest): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addThingToThingGroup(
    params: AddThingToThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddThingToThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
    */
  def associateTargetsWithJob(): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateTargetsWithJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateTargetsWithJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
    */
  def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateTargetsWithJob(
    params: AssociateTargetsWithJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateTargetsWithJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a policy to the specified target.
    */
  def attachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a policy to the specified target.
    */
  def attachPolicy(params: AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPolicy(
    params: AttachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
    */
  def attachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPrincipalPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
    */
  def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPrincipalPolicy(
    params: AttachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
    */
  def attachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
    */
  def attachSecurityProfile(params: AttachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachSecurityProfile(
    params: AttachSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
    */
  def attachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachThingPrincipal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
    */
  def attachThingPrincipal(params: AttachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachThingPrincipal(
    params: AttachThingPrincipalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
    */
  def cancelAuditTask(): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
    */
  def cancelAuditTask(params: CancelAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelAuditTask(
    params: CancelAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
    */
  def cancelCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
    */
  def cancelCertificateTransfer(params: CancelCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelCertificateTransfer(
    params: CancelCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a job.
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a job.
    */
  def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the execution of a job for a given thing.
    */
  def cancelJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJobExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the execution of a job for a given thing.
    */
  def cancelJobExecution(params: CancelJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJobExecution(
    params: CancelJobExecutionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Clears the default authorizer.
    */
  def clearDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def clearDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClearDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Clears the default authorizer.
    */
  def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def clearDefaultAuthorizer(
    params: ClearDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClearDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an authorizer.
    */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an authorizer.
    */
  def createAuthorizer(params: CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a billing group.
    */
  def createBillingGroup(): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a billing group.
    */
  def createBillingGroup(params: CreateBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBillingGroup(
    params: CreateBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
    */
  def createCertificateFromCsr(): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCertificateFromCsr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCertificateFromCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
    */
  def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCertificateFromCsr(
    params: CreateCertificateFromCsrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCertificateFromCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a dynamic thing group.
    */
  def createDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDynamicThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a dynamic thing group.
    */
  def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDynamicThingGroup(
    params: CreateDynamicThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job.
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job.
    */
  def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
    */
  def createKeysAndCertificate(): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeysAndCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateKeysAndCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
    */
  def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeysAndCertificate(
    params: CreateKeysAndCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateKeysAndCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS IoT OTAUpdate on a target group of things or groups.
    */
  def createOTAUpdate(): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS IoT OTAUpdate on a target group of things or groups.
    */
  def createOTAUpdate(params: CreateOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOTAUpdate(
    params: CreateOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
    */
  def createPolicy(): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
    */
  def createPolicy(params: CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicy(
    params: CreatePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  def createPolicyVersion(): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  def createPolicyVersion(params: CreatePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicyVersion(
    params: CreatePolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a role alias.
    */
  def createRoleAlias(): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a role alias.
    */
  def createRoleAlias(params: CreateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRoleAlias(
    params: CreateRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a scheduled audit that is run at a specified time interval.
    */
  def createScheduledAudit(): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a scheduled audit that is run at a specified time interval.
    */
  def createScheduledAudit(params: CreateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createScheduledAudit(
    params: CreateScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Device Defender security profile.
    */
  def createSecurityProfile(): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Device Defender security profile.
    */
  def createSecurityProfile(params: CreateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSecurityProfile(
    params: CreateSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
    */
  def createStream(): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
    */
  def createStream(params: CreateStreamRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStream(
    params: CreateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a thing record in the registry. If this call is made multiple times using the same thing name and configuration, the call will succeed. If this call is made with the same thing name but different configuration a ResourceAlreadyExistsException is thrown.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
    */
  def createThing(): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a thing record in the registry. If this call is made multiple times using the same thing name and configuration, the call will succeed. If this call is made with the same thing name but different configuration a ResourceAlreadyExistsException is thrown.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
    */
  def createThing(params: CreateThingRequest): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThing(
    params: CreateThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
    */
  def createThingGroup(): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
    */
  def createThingGroup(params: CreateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThingGroup(
    params: CreateThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new thing type.
    */
  def createThingType(): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new thing type.
    */
  def createThingType(params: CreateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThingType(
    params: CreateThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
    */
  def createTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
    */
  def createTopicRule(params: CreateTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTopicRule(
    params: CreateTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
    */
  def deleteAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
    */
  def deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccountAuditConfiguration(
    params: DeleteAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an authorizer.
    */
  def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an authorizer.
    */
  def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the billing group.
    */
  def deleteBillingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the billing group.
    */
  def deleteBillingGroup(params: DeleteBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBillingGroup(
    params: DeleteBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a registered CA certificate.
    */
  def deleteCACertificate(): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a registered CA certificate.
    */
  def deleteCACertificate(params: DeleteCACertificateRequest): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCACertificate(
    params: DeleteCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
    */
  def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
    */
  def deleteCertificate(params: DeleteCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dynamic thing group.
    */
  def deleteDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDynamicThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dynamic thing group.
    */
  def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDynamicThingGroup(
    params: DeleteDynamicThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
    */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
    */
  def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a job execution.
    */
  def deleteJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJobExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a job execution.
    */
  def deleteJobExecution(params: DeleteJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJobExecution(
    params: DeleteJobExecutionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an OTA update.
    */
  def deleteOTAUpdate(): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an OTA update.
    */
  def deleteOTAUpdate(params: DeleteOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOTAUpdate(
    params: DeleteOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
    */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
    */
  def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
    */
  def deletePolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
    */
  def deletePolicyVersion(params: DeletePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicyVersion(
    params: DeletePolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a CA certificate registration code.
    */
  def deleteRegistrationCode(): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRegistrationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a CA certificate registration code.
    */
  def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRegistrationCode(
    params: DeleteRegistrationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a role alias
    */
  def deleteRoleAlias(): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a role alias
    */
  def deleteRoleAlias(params: DeleteRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoleAlias(
    params: DeleteRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a scheduled audit.
    */
  def deleteScheduledAudit(): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a scheduled audit.
    */
  def deleteScheduledAudit(params: DeleteScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAudit(
    params: DeleteScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Device Defender security profile.
    */
  def deleteSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Device Defender security profile.
    */
  def deleteSecurityProfile(params: DeleteSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityProfile(
    params: DeleteSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a stream.
    */
  def deleteStream(): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a stream.
    */
  def deleteStream(params: DeleteStreamRequest): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStream(
    params: DeleteStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist.
    */
  def deleteThing(): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist.
    */
  def deleteThing(params: DeleteThingRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThing(
    params: DeleteThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a thing group.
    */
  def deleteThingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a thing group.
    */
  def deleteThingGroup(params: DeleteThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThingGroup(
    params: DeleteThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
    */
  def deleteThingType(): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
    */
  def deleteThingType(params: DeleteThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThingType(
    params: DeleteThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the rule.
    */
  def deleteTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the rule.
    */
  def deleteTopicRule(params: DeleteTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTopicRule(
    params: DeleteTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a logging level.
    */
  def deleteV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteV2LoggingLevel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a logging level.
    */
  def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteV2LoggingLevel(
    params: DeleteV2LoggingLevelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates a thing type. You can not associate new things with deprecated thing type.
    */
  def deprecateThingType(): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates a thing type. You can not associate new things with deprecated thing type.
    */
  def deprecateThingType(params: DeprecateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateThingType(
    params: DeprecateThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
    */
  def describeAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
    */
  def describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAuditConfiguration(
    params: DescribeAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Device Defender audit.
    */
  def describeAuditTask(): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Device Defender audit.
    */
  def describeAuditTask(params: DescribeAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuditTask(
    params: DescribeAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an authorizer.
    */
  def describeAuthorizer(): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an authorizer.
    */
  def describeAuthorizer(params: DescribeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuthorizer(
    params: DescribeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a billing group.
    */
  def describeBillingGroup(): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a billing group.
    */
  def describeBillingGroup(params: DescribeBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBillingGroup(
    params: DescribeBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a registered CA certificate.
    */
  def describeCACertificate(): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a registered CA certificate.
    */
  def describeCACertificate(params: DescribeCACertificateRequest): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCACertificate(
    params: DescribeCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified certificate.
    */
  def describeCertificate(): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified certificate.
    */
  def describeCertificate(params: DescribeCertificateRequest): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificate(
    params: DescribeCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the default authorizer.
    */
  def describeDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the default authorizer.
    */
  def describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDefaultAuthorizer(
    params: DescribeDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a unique endpoint specific to the AWS account making the call.
    */
  def describeEndpoint(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a unique endpoint specific to the AWS account making the call.
    */
  def describeEndpoint(params: DescribeEndpointRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes event configurations.
    */
  def describeEventConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes event configurations.
    */
  def describeEventConfigurations(params: DescribeEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventConfigurations(
    params: DescribeEventConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a search index.
    */
  def describeIndex(): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a search index.
    */
  def describeIndex(params: DescribeIndexRequest): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIndex(
    params: DescribeIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a job.
    */
  def describeJob(): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a job.
    */
  def describeJob(params: DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a job execution.
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
    * Describes a job execution.
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
    * Describes a role alias.
    */
  def describeRoleAlias(): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a role alias.
    */
  def describeRoleAlias(params: DescribeRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRoleAlias(
    params: DescribeRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a scheduled audit.
    */
  def describeScheduledAudit(): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a scheduled audit.
    */
  def describeScheduledAudit(params: DescribeScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledAudit(
    params: DescribeScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Device Defender security profile.
    */
  def describeSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Device Defender security profile.
    */
  def describeSecurityProfile(params: DescribeSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSecurityProfile(
    params: DescribeSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a stream.
    */
  def describeStream(): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a stream.
    */
  def describeStream(params: DescribeStreamRequest): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStream(
    params: DescribeStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified thing.
    */
  def describeThing(): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified thing.
    */
  def describeThing(params: DescribeThingRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThing(
    params: DescribeThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a thing group.
    */
  def describeThingGroup(): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a thing group.
    */
  def describeThingGroup(params: DescribeThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingGroup(
    params: DescribeThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a bulk thing provisioning task.
    */
  def describeThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a bulk thing provisioning task.
    */
  def describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingRegistrationTask(
    params: DescribeThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified thing type.
    */
  def describeThingType(): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified thing type.
    */
  def describeThingType(params: DescribeThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeThingType(
    params: DescribeThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a policy from the specified target.
    */
  def detachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a policy from the specified target.
    */
  def detachPolicy(params: DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPolicy(
    params: DetachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
    */
  def detachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPrincipalPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
    */
  def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPrincipalPolicy(
    params: DetachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a Device Defender security profile from a thing group or from this account.
    */
  def detachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a Device Defender security profile from a thing group or from this account.
    */
  def detachSecurityProfile(params: DetachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachSecurityProfile(
    params: DetachSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
    */
  def detachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachThingPrincipal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
    */
  def detachThingPrincipal(params: DetachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachThingPrincipal(
    params: DetachThingPrincipalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the rule.
    */
  def disableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the rule.
    */
  def disableTopicRule(params: DisableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableTopicRule(
    params: DisableTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the rule.
    */
  def enableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the rule.
    */
  def enableTopicRule(params: EnableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableTopicRule(
    params: EnableTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
    */
  def getEffectivePolicies(): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEffectivePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEffectivePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
    */
  def getEffectivePolicies(params: GetEffectivePoliciesRequest): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEffectivePolicies(
    params: GetEffectivePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEffectivePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the search configuration.
    */
  def getIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIndexingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the search configuration.
    */
  def getIndexingConfiguration(params: GetIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIndexingConfiguration(
    params: GetIndexingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a job document.
    */
  def getJobDocument(): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a job document.
    */
  def getJobDocument(params: GetJobDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobDocument(
    params: GetJobDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
    */
  def getLoggingOptions(): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
    */
  def getLoggingOptions(params: GetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggingOptions(
    params: GetLoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an OTA update.
    */
  def getOTAUpdate(): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an OTA update.
    */
  def getOTAUpdate(params: GetOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOTAUpdate(
    params: GetOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified policy with the policy document of the default version.
    */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified policy with the policy document of the default version.
    */
  def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified policy version.
    */
  def getPolicyVersion(): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified policy version.
    */
  def getPolicyVersion(params: GetPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPolicyVersion(
    params: GetPolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a registration code used to register a CA certificate with AWS IoT.
    */
  def getRegistrationCode(): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRegistrationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a registration code used to register a CA certificate with AWS IoT.
    */
  def getRegistrationCode(params: GetRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRegistrationCode(
    params: GetRegistrationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets statistics about things that match the specified query.
    */
  def getStatistics(): awsDashSdkLib.libRequestMod.Request[GetStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets statistics about things that match the specified query.
    */
  def getStatistics(params: GetStatisticsRequest): awsDashSdkLib.libRequestMod.Request[GetStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStatistics(
    params: GetStatisticsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the rule.
    */
  def getTopicRule(): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTopicRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTopicRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the rule.
    */
  def getTopicRule(params: GetTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTopicRule(
    params: GetTopicRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTopicRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the fine grained logging options.
    */
  def getV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getV2LoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetV2LoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the fine grained logging options.
    */
  def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getV2LoggingOptions(
    params: GetV2LoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetV2LoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the active violations for a given Device Defender security profile.
    */
  def listActiveViolations(): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listActiveViolations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListActiveViolationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the active violations for a given Device Defender security profile.
    */
  def listActiveViolations(params: ListActiveViolationsRequest): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listActiveViolations(
    params: ListActiveViolationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListActiveViolationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies attached to the specified thing group.
    */
  def listAttachedPolicies(): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAttachedPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAttachedPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies attached to the specified thing group.
    */
  def listAttachedPolicies(params: ListAttachedPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAttachedPolicies(
    params: ListAttachedPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAttachedPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
    */
  def listAuditFindings(): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuditFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuditFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
    */
  def listAuditFindings(params: ListAuditFindingsRequest): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuditFindings(
    params: ListAuditFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuditFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender audits that have been performed during a given time period.
    */
  def listAuditTasks(): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuditTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuditTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender audits that have been performed during a given time period.
    */
  def listAuditTasks(params: ListAuditTasksRequest): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuditTasks(
    params: ListAuditTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuditTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the authorizers registered in your account.
    */
  def listAuthorizers(): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuthorizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the authorizers registered in your account.
    */
  def listAuthorizers(params: ListAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAuthorizers(
    params: ListAuthorizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the billing groups you have created.
    */
  def listBillingGroups(): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBillingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBillingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the billing groups you have created.
    */
  def listBillingGroups(params: ListBillingGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBillingGroups(
    params: ListBillingGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBillingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
    */
  def listCACertificates(): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCACertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCACertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
    */
  def listCACertificates(params: ListCACertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCACertificates(
    params: ListCACertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCACertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
    */
  def listCertificates(): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
    */
  def listCertificates(params: ListCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCertificates(
    params: ListCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the device certificates signed by the specified CA certificate.
    */
  def listCertificatesByCA(): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCertificatesByCA(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCertificatesByCAResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the device certificates signed by the specified CA certificate.
    */
  def listCertificatesByCA(params: ListCertificatesByCARequest): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCertificatesByCA(
    params: ListCertificatesByCARequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCertificatesByCAResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the search indices.
    */
  def listIndices(): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIndices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the search indices.
    */
  def listIndices(params: ListIndicesRequest): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIndices(
    params: ListIndicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the job executions for a job.
    */
  def listJobExecutionsForJob(): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobExecutionsForJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobExecutionsForJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the job executions for a job.
    */
  def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobExecutionsForJob(
    params: ListJobExecutionsForJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobExecutionsForJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the job executions for the specified thing.
    */
  def listJobExecutionsForThing(): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobExecutionsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobExecutionsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the job executions for the specified thing.
    */
  def listJobExecutionsForThing(params: ListJobExecutionsForThingRequest): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobExecutionsForThing(
    params: ListJobExecutionsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobExecutionsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists jobs.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists jobs.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists OTA updates.
    */
  def listOTAUpdates(): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOTAUpdates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOTAUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists OTA updates.
    */
  def listOTAUpdates(params: ListOTAUpdatesRequest): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOTAUpdates(
    params: ListOTAUpdatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOTAUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists certificates that are being transferred but not yet accepted.
    */
  def listOutgoingCertificates(): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOutgoingCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOutgoingCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists certificates that are being transferred but not yet accepted.
    */
  def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOutgoingCertificates(
    params: ListOutgoingCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOutgoingCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your policies.
    */
  def listPolicies(): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your policies.
    */
  def listPolicies(params: ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
    */
  def listPolicyPrincipals(): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicyPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPolicyPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
    */
  def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicyPrincipals(
    params: ListPolicyPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPolicyPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of the specified policy and identifies the default version.
    */
  def listPolicyVersions(): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicyVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of the specified policy and identifies the default version.
    */
  def listPolicyVersions(params: ListPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicyVersions(
    params: ListPolicyVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
    */
  def listPrincipalPolicies(): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
    */
  def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalPolicies(
    params: ListPrincipalPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. 
    */
  def listPrincipalThings(): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalThings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. 
    */
  def listPrincipalThings(params: ListPrincipalThingsRequest): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalThings(
    params: ListPrincipalThingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the role aliases registered in your account.
    */
  def listRoleAliases(): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoleAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRoleAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the role aliases registered in your account.
    */
  def listRoleAliases(params: ListRoleAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoleAliases(
    params: ListRoleAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRoleAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of your scheduled audits.
    */
  def listScheduledAudits(): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listScheduledAudits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListScheduledAuditsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of your scheduled audits.
    */
  def listScheduledAudits(params: ListScheduledAuditsRequest): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listScheduledAudits(
    params: ListScheduledAuditsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListScheduledAuditsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
    */
  def listSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profiles attached to a target (thing group).
    */
  def listSecurityProfilesForTarget(): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfilesForTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profiles attached to a target (thing group).
    */
  def listSecurityProfilesForTarget(params: ListSecurityProfilesForTargetRequest): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfilesForTarget(
    params: ListSecurityProfilesForTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the streams in your AWS account.
    */
  def listStreams(): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the streams in your AWS account.
    */
  def listStreams(params: ListStreamsRequest): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreams(
    params: ListStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List targets for the specified policy.
    */
  def listTargetsForPolicy(): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List targets for the specified policy.
    */
  def listTargetsForPolicy(params: ListTargetsForPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForPolicy(
    params: ListTargetsForPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the targets (thing groups) associated with a given Device Defender security profile.
    */
  def listTargetsForSecurityProfile(): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the targets (thing groups) associated with a given Device Defender security profile.
    */
  def listTargetsForSecurityProfile(params: ListTargetsForSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForSecurityProfile(
    params: ListTargetsForSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the thing groups in your account.
    */
  def listThingGroups(): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the thing groups in your account.
    */
  def listThingGroups(params: ListThingGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingGroups(
    params: ListThingGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the thing groups to which the specified thing belongs.
    */
  def listThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingGroupsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the thing groups to which the specified thing belongs.
    */
  def listThingGroupsForThing(params: ListThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingGroupsForThing(
    params: ListThingGroupsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
    */
  def listThingPrincipals(): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
    */
  def listThingPrincipals(params: ListThingPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingPrincipals(
    params: ListThingPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Information about the thing registration tasks.
    */
  def listThingRegistrationTaskReports(): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingRegistrationTaskReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingRegistrationTaskReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Information about the thing registration tasks.
    */
  def listThingRegistrationTaskReports(params: ListThingRegistrationTaskReportsRequest): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingRegistrationTaskReports(
    params: ListThingRegistrationTaskReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingRegistrationTaskReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List bulk thing provisioning tasks.
    */
  def listThingRegistrationTasks(): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingRegistrationTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingRegistrationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List bulk thing provisioning tasks.
    */
  def listThingRegistrationTasks(params: ListThingRegistrationTasksRequest): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingRegistrationTasks(
    params: ListThingRegistrationTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingRegistrationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the existing thing types.
    */
  def listThingTypes(): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the existing thing types.
    */
  def listThingTypes(params: ListThingTypesRequest): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingTypes(
    params: ListThingTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
    */
  def listThings(): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
    */
  def listThings(params: ListThingsRequest): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThings(
    params: ListThingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things you have added to the given billing group.
    */
  def listThingsInBillingGroup(): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingsInBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsInBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things you have added to the given billing group.
    */
  def listThingsInBillingGroup(params: ListThingsInBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingsInBillingGroup(
    params: ListThingsInBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsInBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things in the specified group.
    */
  def listThingsInThingGroup(): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingsInThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsInThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the things in the specified group.
    */
  def listThingsInThingGroup(params: ListThingsInThingGroupRequest): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThingsInThingGroup(
    params: ListThingsInThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThingsInThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the rules for the specific topic.
    */
  def listTopicRules(): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTopicRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTopicRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the rules for the specific topic.
    */
  def listTopicRules(params: ListTopicRulesRequest): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTopicRules(
    params: ListTopicRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTopicRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists logging levels.
    */
  def listV2LoggingLevels(): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listV2LoggingLevels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListV2LoggingLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists logging levels.
    */
  def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listV2LoggingLevels(
    params: ListV2LoggingLevelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListV2LoggingLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
    */
  def listViolationEvents(): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listViolationEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListViolationEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
    */
  def listViolationEvents(params: ListViolationEventsRequest): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listViolationEvents(
    params: ListViolationEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListViolationEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
    */
  def registerCACertificate(): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
    */
  def registerCACertificate(params: RegisterCACertificateRequest): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerCACertificate(
    params: RegisterCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
    */
  def registerCertificate(): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
    */
  def registerCertificate(params: RegisterCertificateRequest): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerCertificate(
    params: RegisterCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a thing.
    */
  def registerThing(): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a thing.
    */
  def registerThing(params: RegisterThingRequest): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerThing(
    params: RegisterThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
    */
  def rejectCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
    */
  def rejectCertificateTransfer(params: RejectCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectCertificateTransfer(
    params: RejectCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given thing from the billing group.
    */
  def removeThingFromBillingGroup(): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeThingFromBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveThingFromBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given thing from the billing group.
    */
  def removeThingFromBillingGroup(params: RemoveThingFromBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeThingFromBillingGroup(
    params: RemoveThingFromBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveThingFromBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove the specified thing from the specified group.
    */
  def removeThingFromThingGroup(): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeThingFromThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveThingFromThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove the specified thing from the specified group.
    */
  def removeThingFromThingGroup(params: RemoveThingFromThingGroupRequest): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeThingFromThingGroup(
    params: RemoveThingFromThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveThingFromThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
    */
  def replaceTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
    */
  def replaceTopicRule(params: ReplaceTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceTopicRule(
    params: ReplaceTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The query search index.
    */
  def searchIndex(): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The query search index.
    */
  def searchIndex(params: SearchIndexRequest): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchIndex(
    params: SearchIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
    */
  def setDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
    */
  def setDefaultAuthorizer(params: SetDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDefaultAuthorizer(
    params: SetDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
    */
  def setDefaultPolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDefaultPolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
    */
  def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDefaultPolicyVersion(
    params: SetDefaultPolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
    */
  def setLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
    */
  def setLoggingOptions(params: SetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoggingOptions(
    params: SetLoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging level.
    */
  def setV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setV2LoggingLevel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging level.
    */
  def setV2LoggingLevel(params: SetV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setV2LoggingLevel(
    params: SetV2LoggingLevelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging options for the V2 logging service.
    */
  def setV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setV2LoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the logging options for the V2 logging service.
    */
  def setV2LoggingOptions(params: SetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setV2LoggingOptions(
    params: SetV2LoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an on-demand Device Defender audit.
    */
  def startOnDemandAuditTask(): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOnDemandAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOnDemandAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an on-demand Device Defender audit.
    */
  def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOnDemandAuditTask(
    params: StartOnDemandAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOnDemandAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a bulk thing provisioning task.
    */
  def startThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a bulk thing provisioning task.
    */
  def startThingRegistrationTask(params: StartThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startThingRegistrationTask(
    params: StartThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a bulk thing provisioning task.
    */
  def stopThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a bulk thing provisioning task.
    */
  def stopThingRegistrationTask(params: StopThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopThingRegistrationTask(
    params: StopThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
    */
  def testAuthorization(): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
    */
  def testAuthorization(params: TestAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testAuthorization(
    params: TestAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
    */
  def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
    */
  def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeAuthorizer(
    params: TestInvokeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
    */
  def transferCertificate(): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def transferCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TransferCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
    */
  def transferCertificate(params: TransferCertificateRequest): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def transferCertificate(
    params: TransferCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TransferCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
    */
  def updateAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
    */
  def updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountAuditConfiguration(
    params: UpdateAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an authorizer.
    */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an authorizer.
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about the billing group.
    */
  def updateBillingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBillingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about the billing group.
    */
  def updateBillingGroup(params: UpdateBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBillingGroup(
    params: UpdateBillingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBillingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a registered CA certificate.
    */
  def updateCACertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCACertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a registered CA certificate.
    */
  def updateCACertificate(params: UpdateCACertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCACertificate(
    params: UpdateCACertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
    */
  def updateCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
    */
  def updateCertificate(params: UpdateCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCertificate(
    params: UpdateCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a dynamic thing group.
    */
  def updateDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDynamicThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a dynamic thing group.
    */
  def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDynamicThingGroup(
    params: UpdateDynamicThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDynamicThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the event configurations.
    */
  def updateEventConfigurations(): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEventConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the event configurations.
    */
  def updateEventConfigurations(params: UpdateEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEventConfigurations(
    params: UpdateEventConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the search configuration.
    */
  def updateIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIndexingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the search configuration.
    */
  def updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIndexingConfiguration(
    params: UpdateIndexingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates supported fields of the specified job.
    */
  def updateJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates supported fields of the specified job.
    */
  def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJob(
    params: UpdateJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a role alias.
    */
  def updateRoleAlias(): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a role alias.
    */
  def updateRoleAlias(params: UpdateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRoleAlias(
    params: UpdateRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
    */
  def updateScheduledAudit(): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
    */
  def updateScheduledAudit(params: UpdateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateScheduledAudit(
    params: UpdateScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Device Defender security profile.
    */
  def updateSecurityProfile(): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Device Defender security profile.
    */
  def updateSecurityProfile(params: UpdateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSecurityProfile(
    params: UpdateSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing stream. The stream version will be incremented by one.
    */
  def updateStream(): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing stream. The stream version will be incremented by one.
    */
  def updateStream(params: UpdateStreamRequest): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStream(
    params: UpdateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the data for a thing.
    */
  def updateThing(): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the data for a thing.
    */
  def updateThing(params: UpdateThingRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThing(
    params: UpdateThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a thing group.
    */
  def updateThingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a thing group.
    */
  def updateThingGroup(params: UpdateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThingGroup(
    params: UpdateThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the groups to which the thing belongs.
    */
  def updateThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThingGroupsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the groups to which the thing belongs.
    */
  def updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThingGroupsForThing(
    params: UpdateThingGroupsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Validates a Device Defender security profile behaviors specification.
    */
  def validateSecurityProfileBehaviors(): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def validateSecurityProfileBehaviors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ValidateSecurityProfileBehaviorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Validates a Device Defender security profile behaviors specification.
    */
  def validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def validateSecurityProfileBehaviors(
    params: ValidateSecurityProfileBehaviorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ValidateSecurityProfileBehaviorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

