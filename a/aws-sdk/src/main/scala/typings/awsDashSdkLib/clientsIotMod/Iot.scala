package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iot
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Iot: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIotMod.IotNs.ClientConfiguration = js.native
  /**
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
     */
  def acceptCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
     */
  def acceptCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
     */
  def acceptCertificateTransfer(params: awsDashSdkLib.clientsIotMod.IotNs.AcceptCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
     */
  def acceptCertificateTransfer(
    params: awsDashSdkLib.clientsIotMod.IotNs.AcceptCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a thing to a thing group.
     */
  def addThingToThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a thing to a thing group.
     */
  def addThingToThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a thing to a thing group.
     */
  def addThingToThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a thing to a thing group.
     */
  def addThingToThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AddThingToThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
     */
  def associateTargetsWithJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
     */
  def associateTargetsWithJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
     */
  def associateTargetsWithJob(params: awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
     */
  def associateTargetsWithJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AssociateTargetsWithJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a policy to the specified target.
     */
  def attachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a policy to the specified target.
     */
  def attachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a policy to the specified target.
     */
  def attachPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a policy to the specified target.
     */
  def attachPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.AttachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
     */
  def attachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
     */
  def attachPrincipalPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
     */
  def attachPrincipalPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.AttachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
     */
  def attachPrincipalPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.AttachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
     */
  def attachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
     */
  def attachSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
     */
  def attachSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
     */
  def attachSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified principal to the specified thing.
     */
  def attachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified principal to the specified thing.
     */
  def attachThingPrincipal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified principal to the specified thing.
     */
  def attachThingPrincipal(params: awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified principal to the specified thing.
     */
  def attachThingPrincipal(
    params: awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.AttachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
     */
  def cancelAuditTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
     */
  def cancelAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
     */
  def cancelAuditTask(params: awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
     */
  def cancelAuditTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
     */
  def cancelCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
     */
  def cancelCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
     */
  def cancelCertificateTransfer(params: awsDashSdkLib.clientsIotMod.IotNs.CancelCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
     */
  def cancelCertificateTransfer(
    params: awsDashSdkLib.clientsIotMod.IotNs.CancelCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels a job.
     */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a job.
     */
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a job.
     */
  def cancelJob(params: awsDashSdkLib.clientsIotMod.IotNs.CancelJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a job.
     */
  def cancelJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the execution of a job for a given thing.
     */
  def cancelJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the execution of a job for a given thing.
     */
  def cancelJobExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the execution of a job for a given thing.
     */
  def cancelJobExecution(params: awsDashSdkLib.clientsIotMod.IotNs.CancelJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the execution of a job for a given thing.
     */
  def cancelJobExecution(
    params: awsDashSdkLib.clientsIotMod.IotNs.CancelJobExecutionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Clears the default authorizer.
     */
  def clearDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Clears the default authorizer.
     */
  def clearDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Clears the default authorizer.
     */
  def clearDefaultAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Clears the default authorizer.
     */
  def clearDefaultAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ClearDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an authorizer.
     */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an authorizer.
     */
  def createAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an authorizer.
     */
  def createAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an authorizer.
     */
  def createAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     */
  def createCertificateFromCsr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     */
  def createCertificateFromCsr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     */
  def createCertificateFromCsr(params: awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     */
  def createCertificateFromCsr(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateCertificateFromCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job.
     */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job.
     */
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job.
     */
  def createJob(params: awsDashSdkLib.clientsIotMod.IotNs.CreateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job.
     */
  def createJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
     */
  def createKeysAndCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
     */
  def createKeysAndCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
     */
  def createKeysAndCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
     */
  def createKeysAndCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateKeysAndCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     */
  def createOTAUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     */
  def createOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     */
  def createOTAUpdate(params: awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     */
  def createOTAUpdate(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
     */
  def createPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
     */
  def createPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
     */
  def createPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
     */
  def createPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
     */
  def createPolicyVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
     */
  def createPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
     */
  def createPolicyVersion(params: awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
     */
  def createPolicyVersion(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a role alias.
     */
  def createRoleAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a role alias.
     */
  def createRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a role alias.
     */
  def createRoleAlias(params: awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a role alias.
     */
  def createRoleAlias(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scheduled audit that is run at a specified time interval.
     */
  def createScheduledAudit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scheduled audit that is run at a specified time interval.
     */
  def createScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scheduled audit that is run at a specified time interval.
     */
  def createScheduledAudit(params: awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scheduled audit that is run at a specified time interval.
     */
  def createScheduledAudit(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Device Defender security profile.
     */
  def createSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Device Defender security profile.
     */
  def createSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Device Defender security profile.
     */
  def createSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Device Defender security profile.
     */
  def createSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     */
  def createStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     */
  def createStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     */
  def createStream(params: awsDashSdkLib.clientsIotMod.IotNs.CreateStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     */
  def createStream(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThing(params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
     */
  def createThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new thing type.
     */
  def createThingType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new thing type.
     */
  def createThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new thing type.
     */
  def createThingType(params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new thing type.
     */
  def createThingType(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.CreateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def createTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def createTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def createTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.CreateTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def createTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.CreateTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
     */
  def deleteAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
     */
  def deleteAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
     */
  def deleteAccountAuditConfiguration(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
     */
  def deleteAccountAuditConfiguration(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an authorizer.
     */
  def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an authorizer.
     */
  def deleteAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an authorizer.
     */
  def deleteAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an authorizer.
     */
  def deleteAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a registered CA certificate.
     */
  def deleteCACertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a registered CA certificate.
     */
  def deleteCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a registered CA certificate.
     */
  def deleteCACertificate(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a registered CA certificate.
     */
  def deleteCACertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
     */
  def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
     */
  def deleteCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
     */
  def deleteCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
     */
  def deleteCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     */
  def deleteJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     */
  def deleteJob(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     */
  def deleteJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job execution.
     */
  def deleteJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job execution.
     */
  def deleteJobExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job execution.
     */
  def deleteJobExecution(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a job execution.
     */
  def deleteJobExecution(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteJobExecutionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete an OTA update.
     */
  def deleteOTAUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an OTA update.
     */
  def deleteOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an OTA update.
     */
  def deleteOTAUpdate(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an OTA update.
     */
  def deleteOTAUpdate(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
     */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
     */
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
     */
  def deletePolicy(params: awsDashSdkLib.clientsIotMod.IotNs.DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
     */
  def deletePolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeletePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
     */
  def deletePolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
     */
  def deletePolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
     */
  def deletePolicyVersion(params: awsDashSdkLib.clientsIotMod.IotNs.DeletePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
     */
  def deletePolicyVersion(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeletePolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a CA certificate registration code.
     */
  def deleteRegistrationCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a CA certificate registration code.
     */
  def deleteRegistrationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a CA certificate registration code.
     */
  def deleteRegistrationCode(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a CA certificate registration code.
     */
  def deleteRegistrationCode(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a role alias
     */
  def deleteRoleAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a role alias
     */
  def deleteRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a role alias
     */
  def deleteRoleAlias(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a role alias
     */
  def deleteRoleAlias(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a scheduled audit.
     */
  def deleteScheduledAudit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a scheduled audit.
     */
  def deleteScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a scheduled audit.
     */
  def deleteScheduledAudit(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a scheduled audit.
     */
  def deleteScheduledAudit(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Device Defender security profile.
     */
  def deleteSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Device Defender security profile.
     */
  def deleteSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Device Defender security profile.
     */
  def deleteSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Device Defender security profile.
     */
  def deleteSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a stream.
     */
  def deleteStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a stream.
     */
  def deleteStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a stream.
     */
  def deleteStream(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a stream.
     */
  def deleteStream(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing.
     */
  def deleteThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing.
     */
  def deleteThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing.
     */
  def deleteThing(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing.
     */
  def deleteThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a thing group.
     */
  def deleteThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a thing group.
     */
  def deleteThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a thing group.
     */
  def deleteThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a thing group.
     */
  def deleteThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
     */
  def deleteThingType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
     */
  def deleteThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
     */
  def deleteThingType(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
     */
  def deleteThingType(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeleteThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the rule.
     */
  def deleteTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the rule.
     */
  def deleteTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the rule.
     */
  def deleteTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the rule.
     */
  def deleteTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a logging level.
     */
  def deleteV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a logging level.
     */
  def deleteV2LoggingLevel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a logging level.
     */
  def deleteV2LoggingLevel(params: awsDashSdkLib.clientsIotMod.IotNs.DeleteV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a logging level.
     */
  def deleteV2LoggingLevel(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeleteV2LoggingLevelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     */
  def deprecateThingType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     */
  def deprecateThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     */
  def deprecateThingType(params: awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     */
  def deprecateThingType(
    params: awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DeprecateThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def describeAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def describeAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def describeAccountAuditConfiguration(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def describeAccountAuditConfiguration(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender audit.
     */
  def describeAuditTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender audit.
     */
  def describeAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender audit.
     */
  def describeAuditTask(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender audit.
     */
  def describeAuditTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an authorizer.
     */
  def describeAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an authorizer.
     */
  def describeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an authorizer.
     */
  def describeAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an authorizer.
     */
  def describeAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a registered CA certificate.
     */
  def describeCACertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a registered CA certificate.
     */
  def describeCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a registered CA certificate.
     */
  def describeCACertificate(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a registered CA certificate.
     */
  def describeCACertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified certificate.
     */
  def describeCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified certificate.
     */
  def describeCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified certificate.
     */
  def describeCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified certificate.
     */
  def describeCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the default authorizer.
     */
  def describeDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the default authorizer.
     */
  def describeDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the default authorizer.
     */
  def describeDefaultAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the default authorizer.
     */
  def describeDefaultAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a unique endpoint specific to the AWS account making the call.
     */
  def describeEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a unique endpoint specific to the AWS account making the call.
     */
  def describeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a unique endpoint specific to the AWS account making the call.
     */
  def describeEndpoint(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a unique endpoint specific to the AWS account making the call.
     */
  def describeEndpoint(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes event configurations.
     */
  def describeEventConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes event configurations.
     */
  def describeEventConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes event configurations.
     */
  def describeEventConfigurations(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes event configurations.
     */
  def describeEventConfigurations(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a search index.
     */
  def describeIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a search index.
     */
  def describeIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a search index.
     */
  def describeIndex(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a search index.
     */
  def describeIndex(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job.
     */
  def describeJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job.
     */
  def describeJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job.
     */
  def describeJob(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job.
     */
  def describeJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job execution.
     */
  def describeJobExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job execution.
     */
  def describeJobExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job execution.
     */
  def describeJobExecution(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a job execution.
     */
  def describeJobExecution(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeJobExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a role alias.
     */
  def describeRoleAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a role alias.
     */
  def describeRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a role alias.
     */
  def describeRoleAlias(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a role alias.
     */
  def describeRoleAlias(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a scheduled audit.
     */
  def describeScheduledAudit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a scheduled audit.
     */
  def describeScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a scheduled audit.
     */
  def describeScheduledAudit(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a scheduled audit.
     */
  def describeScheduledAudit(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender security profile.
     */
  def describeSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender security profile.
     */
  def describeSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender security profile.
     */
  def describeSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a Device Defender security profile.
     */
  def describeSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a stream.
     */
  def describeStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a stream.
     */
  def describeStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a stream.
     */
  def describeStream(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a stream.
     */
  def describeStream(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing.
     */
  def describeThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing.
     */
  def describeThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing.
     */
  def describeThing(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing.
     */
  def describeThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a thing group.
     */
  def describeThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a thing group.
     */
  def describeThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a thing group.
     */
  def describeThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a thing group.
     */
  def describeThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a bulk thing provisioning task.
     */
  def describeThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a bulk thing provisioning task.
     */
  def describeThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a bulk thing provisioning task.
     */
  def describeThingRegistrationTask(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a bulk thing provisioning task.
     */
  def describeThingRegistrationTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing type.
     */
  def describeThingType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing type.
     */
  def describeThingType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing type.
     */
  def describeThingType(params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified thing type.
     */
  def describeThingType(
    params: awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DescribeThingTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a policy from the specified target.
     */
  def detachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a policy from the specified target.
     */
  def detachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a policy from the specified target.
     */
  def detachPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a policy from the specified target.
     */
  def detachPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.DetachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
     */
  def detachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
     */
  def detachPrincipalPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
     */
  def detachPrincipalPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.DetachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
     */
  def detachPrincipalPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.DetachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates a Device Defender security profile from a thing group or from this account.
     */
  def detachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a Device Defender security profile from a thing group or from this account.
     */
  def detachSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a Device Defender security profile from a thing group or from this account.
     */
  def detachSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a Device Defender security profile from a thing group or from this account.
     */
  def detachSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified principal from the specified thing.
     */
  def detachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified principal from the specified thing.
     */
  def detachThingPrincipal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified principal from the specified thing.
     */
  def detachThingPrincipal(params: awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified principal from the specified thing.
     */
  def detachThingPrincipal(
    params: awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.DetachThingPrincipalResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the rule.
     */
  def disableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the rule.
     */
  def disableTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the rule.
     */
  def disableTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.DisableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the rule.
     */
  def disableTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.DisableTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the rule.
     */
  def enableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the rule.
     */
  def enableTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the rule.
     */
  def enableTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.EnableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the rule.
     */
  def enableTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.EnableTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
     */
  def getEffectivePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
     */
  def getEffectivePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
     */
  def getEffectivePolicies(params: awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
     */
  def getEffectivePolicies(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetEffectivePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the search configuration.
     */
  def getIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the search configuration.
     */
  def getIndexingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the search configuration.
     */
  def getIndexingConfiguration(params: awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the search configuration.
     */
  def getIndexingConfiguration(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a job document.
     */
  def getJobDocument(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a job document.
     */
  def getJobDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a job document.
     */
  def getJobDocument(params: awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a job document.
     */
  def getJobDocument(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetJobDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
     */
  def getLoggingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
     */
  def getLoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
     */
  def getLoggingOptions(params: awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
     */
  def getLoggingOptions(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OTA update.
     */
  def getOTAUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OTA update.
     */
  def getOTAUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OTA update.
     */
  def getOTAUpdate(params: awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OTA update.
     */
  def getOTAUpdate(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetOTAUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy with the policy document of the default version.
     */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy with the policy document of the default version.
     */
  def getPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy with the policy document of the default version.
     */
  def getPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy with the policy document of the default version.
     */
  def getPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy version.
     */
  def getPolicyVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy version.
     */
  def getPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy version.
     */
  def getPolicyVersion(params: awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified policy version.
     */
  def getPolicyVersion(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
     */
  def getRegistrationCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
     */
  def getRegistrationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
     */
  def getRegistrationCode(params: awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
     */
  def getRegistrationCode(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetRegistrationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the rule.
     */
  def getTopicRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the rule.
     */
  def getTopicRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the rule.
     */
  def getTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the rule.
     */
  def getTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetTopicRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the fine grained logging options.
     */
  def getV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the fine grained logging options.
     */
  def getV2LoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the fine grained logging options.
     */
  def getV2LoggingOptions(params: awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the fine grained logging options.
     */
  def getV2LoggingOptions(
    params: awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.GetV2LoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the active violations for a given Device Defender security profile.
     */
  def listActiveViolations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the active violations for a given Device Defender security profile.
     */
  def listActiveViolations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the active violations for a given Device Defender security profile.
     */
  def listActiveViolations(params: awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the active violations for a given Device Defender security profile.
     */
  def listActiveViolations(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListActiveViolationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified thing group.
     */
  def listAttachedPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified thing group.
     */
  def listAttachedPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified thing group.
     */
  def listAttachedPolicies(params: awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified thing group.
     */
  def listAttachedPolicies(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAttachedPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
     */
  def listAuditFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
     */
  def listAuditFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
     */
  def listAuditFindings(params: awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
     */
  def listAuditFindings(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender audits that have been performed during a given time period.
     */
  def listAuditTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender audits that have been performed during a given time period.
     */
  def listAuditTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender audits that have been performed during a given time period.
     */
  def listAuditTasks(params: awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender audits that have been performed during a given time period.
     */
  def listAuditTasks(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuditTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the authorizers registered in your account.
     */
  def listAuthorizers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the authorizers registered in your account.
     */
  def listAuthorizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the authorizers registered in your account.
     */
  def listAuthorizers(params: awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the authorizers registered in your account.
     */
  def listAuthorizers(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCACertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCACertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCACertificates(params: awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCACertificates(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCACertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCertificates(params: awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
     */
  def listCertificates(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the device certificates signed by the specified CA certificate.
     */
  def listCertificatesByCA(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the device certificates signed by the specified CA certificate.
     */
  def listCertificatesByCA(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the device certificates signed by the specified CA certificate.
     */
  def listCertificatesByCA(params: awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCARequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the device certificates signed by the specified CA certificate.
     */
  def listCertificatesByCA(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCARequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListCertificatesByCAResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the search indices.
     */
  def listIndices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the search indices.
     */
  def listIndices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the search indices.
     */
  def listIndices(params: awsDashSdkLib.clientsIotMod.IotNs.ListIndicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the search indices.
     */
  def listIndices(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListIndicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for a job.
     */
  def listJobExecutionsForJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for a job.
     */
  def listJobExecutionsForJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for a job.
     */
  def listJobExecutionsForJob(params: awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for a job.
     */
  def listJobExecutionsForJob(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for the specified thing.
     */
  def listJobExecutionsForThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for the specified thing.
     */
  def listJobExecutionsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for the specified thing.
     */
  def listJobExecutionsForThing(params: awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the job executions for the specified thing.
     */
  def listJobExecutionsForThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobExecutionsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists jobs.
     */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists jobs.
     */
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists jobs.
     */
  def listJobs(params: awsDashSdkLib.clientsIotMod.IotNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists jobs.
     */
  def listJobs(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists OTA updates.
     */
  def listOTAUpdates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists OTA updates.
     */
  def listOTAUpdates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists OTA updates.
     */
  def listOTAUpdates(params: awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists OTA updates.
     */
  def listOTAUpdates(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOTAUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists certificates that are being transferred but not yet accepted.
     */
  def listOutgoingCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists certificates that are being transferred but not yet accepted.
     */
  def listOutgoingCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists certificates that are being transferred but not yet accepted.
     */
  def listOutgoingCertificates(params: awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists certificates that are being transferred but not yet accepted.
     */
  def listOutgoingCertificates(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListOutgoingCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your policies.
     */
  def listPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your policies.
     */
  def listPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your policies.
     */
  def listPolicies(params: awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your policies.
     */
  def listPolicies(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
     */
  def listPolicyPrincipals(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
     */
  def listPolicyPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
     */
  def listPolicyPrincipals(params: awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
     */
  def listPolicyPrincipals(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of the specified policy and identifies the default version.
     */
  def listPolicyVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of the specified policy and identifies the default version.
     */
  def listPolicyVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of the specified policy and identifies the default version.
     */
  def listPolicyVersions(params: awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of the specified policy and identifies the default version.
     */
  def listPolicyVersions(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
     */
  def listPrincipalPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
     */
  def listPrincipalPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
     */
  def listPrincipalPolicies(params: awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
     */
  def listPrincipalPolicies(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things associated with the specified principal.
     */
  def listPrincipalThings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things associated with the specified principal.
     */
  def listPrincipalThings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things associated with the specified principal.
     */
  def listPrincipalThings(params: awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things associated with the specified principal.
     */
  def listPrincipalThings(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListPrincipalThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the role aliases registered in your account.
     */
  def listRoleAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the role aliases registered in your account.
     */
  def listRoleAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the role aliases registered in your account.
     */
  def listRoleAliases(params: awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the role aliases registered in your account.
     */
  def listRoleAliases(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListRoleAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of your scheduled audits.
     */
  def listScheduledAudits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of your scheduled audits.
     */
  def listScheduledAudits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of your scheduled audits.
     */
  def listScheduledAudits(params: awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of your scheduled audits.
     */
  def listScheduledAudits(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListScheduledAuditsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
     */
  def listSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
     */
  def listSecurityProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
     */
  def listSecurityProfiles(params: awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
     */
  def listSecurityProfiles(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles attached to a target (thing group).
     */
  def listSecurityProfilesForTarget(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles attached to a target (thing group).
     */
  def listSecurityProfilesForTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles attached to a target (thing group).
     */
  def listSecurityProfilesForTarget(params: awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profiles attached to a target (thing group).
     */
  def listSecurityProfilesForTarget(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListSecurityProfilesForTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the streams in your AWS account.
     */
  def listStreams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the streams in your AWS account.
     */
  def listStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the streams in your AWS account.
     */
  def listStreams(params: awsDashSdkLib.clientsIotMod.IotNs.ListStreamsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the streams in your AWS account.
     */
  def listStreams(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List targets for the specified policy.
     */
  def listTargetsForPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List targets for the specified policy.
     */
  def listTargetsForPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List targets for the specified policy.
     */
  def listTargetsForPolicy(params: awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List targets for the specified policy.
     */
  def listTargetsForPolicy(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     */
  def listTargetsForSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     */
  def listTargetsForSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     */
  def listTargetsForSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     */
  def listTargetsForSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTargetsForSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups in your account.
     */
  def listThingGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups in your account.
     */
  def listThingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups in your account.
     */
  def listThingGroups(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups in your account.
     */
  def listThingGroups(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups to which the specified thing belongs.
     */
  def listThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups to which the specified thing belongs.
     */
  def listThingGroupsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups to which the specified thing belongs.
     */
  def listThingGroupsForThing(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the thing groups to which the specified thing belongs.
     */
  def listThingGroupsForThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified thing.
     */
  def listThingPrincipals(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified thing.
     */
  def listThingPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified thing.
     */
  def listThingPrincipals(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals associated with the specified thing.
     */
  def listThingPrincipals(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Information about the thing registration tasks.
     */
  def listThingRegistrationTaskReports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Information about the thing registration tasks.
     */
  def listThingRegistrationTaskReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Information about the thing registration tasks.
     */
  def listThingRegistrationTaskReports(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Information about the thing registration tasks.
     */
  def listThingRegistrationTaskReports(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTaskReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List bulk thing provisioning tasks.
     */
  def listThingRegistrationTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List bulk thing provisioning tasks.
     */
  def listThingRegistrationTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List bulk thing provisioning tasks.
     */
  def listThingRegistrationTasks(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List bulk thing provisioning tasks.
     */
  def listThingRegistrationTasks(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingRegistrationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing thing types.
     */
  def listThingTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing thing types.
     */
  def listThingTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing thing types.
     */
  def listThingTypes(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing thing types.
     */
  def listThingTypes(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
     */
  def listThings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
     */
  def listThings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
     */
  def listThings(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
     */
  def listThings(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things in the specified group.
     */
  def listThingsInThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things in the specified group.
     */
  def listThingsInThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things in the specified group.
     */
  def listThingsInThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the things in the specified group.
     */
  def listThingsInThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListThingsInThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specific topic.
     */
  def listTopicRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specific topic.
     */
  def listTopicRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specific topic.
     */
  def listTopicRules(params: awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specific topic.
     */
  def listTopicRules(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListTopicRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists logging levels.
     */
  def listV2LoggingLevels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists logging levels.
     */
  def listV2LoggingLevels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists logging levels.
     */
  def listV2LoggingLevels(params: awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists logging levels.
     */
  def listV2LoggingLevels(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListV2LoggingLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
     */
  def listViolationEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
     */
  def listViolationEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
     */
  def listViolationEvents(params: awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
     */
  def listViolationEvents(
    params: awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ListViolationEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
     */
  def registerCACertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
     */
  def registerCACertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
     */
  def registerCACertificate(params: awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
     */
  def registerCACertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCACertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
     */
  def registerCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
     */
  def registerCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
     */
  def registerCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
     */
  def registerCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a thing.
     */
  def registerThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a thing.
     */
  def registerThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a thing.
     */
  def registerThing(params: awsDashSdkLib.clientsIotMod.IotNs.RegisterThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a thing.
     */
  def registerThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.RegisterThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RegisterThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
     */
  def rejectCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
     */
  def rejectCertificateTransfer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
     */
  def rejectCertificateTransfer(params: awsDashSdkLib.clientsIotMod.IotNs.RejectCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
     */
  def rejectCertificateTransfer(
    params: awsDashSdkLib.clientsIotMod.IotNs.RejectCertificateTransferRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove the specified thing from the specified group.
     */
  def removeThingFromThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Remove the specified thing from the specified group.
     */
  def removeThingFromThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Remove the specified thing from the specified group.
     */
  def removeThingFromThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Remove the specified thing from the specified group.
     */
  def removeThingFromThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.RemoveThingFromThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def replaceTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def replaceTopicRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def replaceTopicRule(params: awsDashSdkLib.clientsIotMod.IotNs.ReplaceTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
     */
  def replaceTopicRule(
    params: awsDashSdkLib.clientsIotMod.IotNs.ReplaceTopicRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * The query search index.
     */
  def searchIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The query search index.
     */
  def searchIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The query search index.
     */
  def searchIndex(params: awsDashSdkLib.clientsIotMod.IotNs.SearchIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The query search index.
     */
  def searchIndex(
    params: awsDashSdkLib.clientsIotMod.IotNs.SearchIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SearchIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
     */
  def setDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
     */
  def setDefaultAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
     */
  def setDefaultAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
     */
  def setDefaultAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.SetDefaultAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
     */
  def setDefaultPolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
     */
  def setDefaultPolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
     */
  def setDefaultPolicyVersion(params: awsDashSdkLib.clientsIotMod.IotNs.SetDefaultPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
     */
  def setDefaultPolicyVersion(
    params: awsDashSdkLib.clientsIotMod.IotNs.SetDefaultPolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
     */
  def setLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
     */
  def setLoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
     */
  def setLoggingOptions(params: awsDashSdkLib.clientsIotMod.IotNs.SetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
     */
  def setLoggingOptions(
    params: awsDashSdkLib.clientsIotMod.IotNs.SetLoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging level.
     */
  def setV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging level.
     */
  def setV2LoggingLevel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging level.
     */
  def setV2LoggingLevel(params: awsDashSdkLib.clientsIotMod.IotNs.SetV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging level.
     */
  def setV2LoggingLevel(
    params: awsDashSdkLib.clientsIotMod.IotNs.SetV2LoggingLevelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options for the V2 logging service.
     */
  def setV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options for the V2 logging service.
     */
  def setV2LoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options for the V2 logging service.
     */
  def setV2LoggingOptions(params: awsDashSdkLib.clientsIotMod.IotNs.SetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the logging options for the V2 logging service.
     */
  def setV2LoggingOptions(
    params: awsDashSdkLib.clientsIotMod.IotNs.SetV2LoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts an on-demand Device Defender audit.
     */
  def startOnDemandAuditTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an on-demand Device Defender audit.
     */
  def startOnDemandAuditTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an on-demand Device Defender audit.
     */
  def startOnDemandAuditTask(params: awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an on-demand Device Defender audit.
     */
  def startOnDemandAuditTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartOnDemandAuditTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a bulk thing provisioning task.
     */
  def startThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a bulk thing provisioning task.
     */
  def startThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a bulk thing provisioning task.
     */
  def startThingRegistrationTask(params: awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a bulk thing provisioning task.
     */
  def startThingRegistrationTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StartThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a bulk thing provisioning task.
     */
  def stopThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a bulk thing provisioning task.
     */
  def stopThingRegistrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a bulk thing provisioning task.
     */
  def stopThingRegistrationTask(params: awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a bulk thing provisioning task.
     */
  def stopThingRegistrationTask(
    params: awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.StopThingRegistrationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testAuthorization(params: awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testAuthorization(
    params: awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testInvokeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testInvokeAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
     */
  def testInvokeAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
     */
  def transferCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
     */
  def transferCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
     */
  def transferCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
     */
  def transferCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.TransferCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def updateAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def updateAccountAuditConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def updateAccountAuditConfiguration(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
     */
  def updateAccountAuditConfiguration(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAccountAuditConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an authorizer.
     */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an authorizer.
     */
  def updateAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an authorizer.
     */
  def updateAuthorizer(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an authorizer.
     */
  def updateAuthorizer(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a registered CA certificate.
     */
  def updateCACertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered CA certificate.
     */
  def updateCACertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered CA certificate.
     */
  def updateCACertificate(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateCACertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered CA certificate.
     */
  def updateCACertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateCACertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     */
  def updateCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     */
  def updateCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     */
  def updateCertificate(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     */
  def updateCertificate(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the event configurations.
     */
  def updateEventConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the event configurations.
     */
  def updateEventConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the event configurations.
     */
  def updateEventConfigurations(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the event configurations.
     */
  def updateEventConfigurations(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateEventConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the search configuration.
     */
  def updateIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the search configuration.
     */
  def updateIndexingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the search configuration.
     */
  def updateIndexingConfiguration(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the search configuration.
     */
  def updateIndexingConfiguration(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateIndexingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a role alias.
     */
  def updateRoleAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a role alias.
     */
  def updateRoleAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a role alias.
     */
  def updateRoleAlias(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a role alias.
     */
  def updateRoleAlias(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateRoleAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     */
  def updateScheduledAudit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     */
  def updateScheduledAudit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     */
  def updateScheduledAudit(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     */
  def updateScheduledAudit(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateScheduledAuditResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Device Defender security profile.
     */
  def updateSecurityProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Device Defender security profile.
     */
  def updateSecurityProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Device Defender security profile.
     */
  def updateSecurityProfile(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Device Defender security profile.
     */
  def updateSecurityProfile(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateSecurityProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing stream. The stream version will be incremented by one.
     */
  def updateStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing stream. The stream version will be incremented by one.
     */
  def updateStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing stream. The stream version will be incremented by one.
     */
  def updateStream(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing stream. The stream version will be incremented by one.
     */
  def updateStream(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the data for a thing.
     */
  def updateThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the data for a thing.
     */
  def updateThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the data for a thing.
     */
  def updateThing(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the data for a thing.
     */
  def updateThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a thing group.
     */
  def updateThingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a thing group.
     */
  def updateThingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a thing group.
     */
  def updateThingGroup(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a thing group.
     */
  def updateThingGroup(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the groups to which the thing belongs.
     */
  def updateThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the groups to which the thing belongs.
     */
  def updateThingGroupsForThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the groups to which the thing belongs.
     */
  def updateThingGroupsForThing(params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the groups to which the thing belongs.
     */
  def updateThingGroupsForThing(
    params: awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.UpdateThingGroupsForThingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Validates a Device Defender security profile behaviors specification.
     */
  def validateSecurityProfileBehaviors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Validates a Device Defender security profile behaviors specification.
     */
  def validateSecurityProfileBehaviors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Validates a Device Defender security profile behaviors specification.
     */
  def validateSecurityProfileBehaviors(params: awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Validates a Device Defender security profile behaviors specification.
     */
  def validateSecurityProfileBehaviors(
    params: awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotMod.IotNs.ValidateSecurityProfileBehaviorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

