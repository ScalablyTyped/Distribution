package typings.awsSdk.clientsIotMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iot extends Service {
  
  /**
    * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. Requires permission to access the AcceptCertificateTransfer action.
    */
  def acceptCertificateTransfer(): Request[js.Object, AWSError] = js.native
  def acceptCertificateTransfer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. Requires permission to access the AcceptCertificateTransfer action.
    */
  def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): Request[js.Object, AWSError] = js.native
  def acceptCertificateTransfer(
    params: AcceptCertificateTransferRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds a thing to a billing group. Requires permission to access the AddThingToBillingGroup action.
    */
  def addThingToBillingGroup(): Request[AddThingToBillingGroupResponse, AWSError] = js.native
  def addThingToBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ AddThingToBillingGroupResponse, Unit]): Request[AddThingToBillingGroupResponse, AWSError] = js.native
  /**
    * Adds a thing to a billing group. Requires permission to access the AddThingToBillingGroup action.
    */
  def addThingToBillingGroup(params: AddThingToBillingGroupRequest): Request[AddThingToBillingGroupResponse, AWSError] = js.native
  def addThingToBillingGroup(
    params: AddThingToBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddThingToBillingGroupResponse, Unit]
  ): Request[AddThingToBillingGroupResponse, AWSError] = js.native
  
  /**
    * Adds a thing to a thing group. Requires permission to access the AddThingToThingGroup action.
    */
  def addThingToThingGroup(): Request[AddThingToThingGroupResponse, AWSError] = js.native
  def addThingToThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ AddThingToThingGroupResponse, Unit]): Request[AddThingToThingGroupResponse, AWSError] = js.native
  /**
    * Adds a thing to a thing group. Requires permission to access the AddThingToThingGroup action.
    */
  def addThingToThingGroup(params: AddThingToThingGroupRequest): Request[AddThingToThingGroupResponse, AWSError] = js.native
  def addThingToThingGroup(
    params: AddThingToThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddThingToThingGroupResponse, Unit]
  ): Request[AddThingToThingGroupResponse, AWSError] = js.native
  
  /**
    * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.   Requires permission to access the AssociateTargetsWithJob action.
    */
  def associateTargetsWithJob(): Request[AssociateTargetsWithJobResponse, AWSError] = js.native
  def associateTargetsWithJob(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTargetsWithJobResponse, Unit]): Request[AssociateTargetsWithJobResponse, AWSError] = js.native
  /**
    * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.   Requires permission to access the AssociateTargetsWithJob action.
    */
  def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): Request[AssociateTargetsWithJobResponse, AWSError] = js.native
  def associateTargetsWithJob(
    params: AssociateTargetsWithJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTargetsWithJobResponse, Unit]
  ): Request[AssociateTargetsWithJobResponse, AWSError] = js.native
  
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential). Requires permission to access the AttachPolicy action.
    */
  def attachPolicy(): Request[js.Object, AWSError] = js.native
  def attachPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential). Requires permission to access the AttachPolicy action.
    */
  def attachPolicy(params: AttachPolicyRequest): Request[js.Object, AWSError] = js.native
  def attachPolicy(
    params: AttachPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use AttachPolicy instead. Requires permission to access the AttachPrincipalPolicy action.
    */
  def attachPrincipalPolicy(): Request[js.Object, AWSError] = js.native
  def attachPrincipalPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use AttachPolicy instead. Requires permission to access the AttachPrincipalPolicy action.
    */
  def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): Request[js.Object, AWSError] = js.native
  def attachPrincipalPolicy(
    params: AttachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a Device Defender security profile with a thing group or this account. Each thing group or account can have up to five security profiles associated with it. Requires permission to access the AttachSecurityProfile action.
    */
  def attachSecurityProfile(): Request[AttachSecurityProfileResponse, AWSError] = js.native
  def attachSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ AttachSecurityProfileResponse, Unit]): Request[AttachSecurityProfileResponse, AWSError] = js.native
  /**
    * Associates a Device Defender security profile with a thing group or this account. Each thing group or account can have up to five security profiles associated with it. Requires permission to access the AttachSecurityProfile action.
    */
  def attachSecurityProfile(params: AttachSecurityProfileRequest): Request[AttachSecurityProfileResponse, AWSError] = js.native
  def attachSecurityProfile(
    params: AttachSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachSecurityProfileResponse, Unit]
  ): Request[AttachSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. Requires permission to access the AttachThingPrincipal action.
    */
  def attachThingPrincipal(): Request[AttachThingPrincipalResponse, AWSError] = js.native
  def attachThingPrincipal(callback: js.Function2[/* err */ AWSError, /* data */ AttachThingPrincipalResponse, Unit]): Request[AttachThingPrincipalResponse, AWSError] = js.native
  /**
    * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. Requires permission to access the AttachThingPrincipal action.
    */
  def attachThingPrincipal(params: AttachThingPrincipalRequest): Request[AttachThingPrincipalResponse, AWSError] = js.native
  def attachThingPrincipal(
    params: AttachThingPrincipalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachThingPrincipalResponse, Unit]
  ): Request[AttachThingPrincipalResponse, AWSError] = js.native
  
  /**
    * Cancels a mitigation action task that is in progress. If the task is not in progress, an InvalidRequestException occurs. Requires permission to access the CancelAuditMitigationActionsTask action.
    */
  def cancelAuditMitigationActionsTask(): Request[CancelAuditMitigationActionsTaskResponse, AWSError] = js.native
  def cancelAuditMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ CancelAuditMitigationActionsTaskResponse, Unit]
  ): Request[CancelAuditMitigationActionsTaskResponse, AWSError] = js.native
  /**
    * Cancels a mitigation action task that is in progress. If the task is not in progress, an InvalidRequestException occurs. Requires permission to access the CancelAuditMitigationActionsTask action.
    */
  def cancelAuditMitigationActionsTask(params: CancelAuditMitigationActionsTaskRequest): Request[CancelAuditMitigationActionsTaskResponse, AWSError] = js.native
  def cancelAuditMitigationActionsTask(
    params: CancelAuditMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelAuditMitigationActionsTaskResponse, Unit]
  ): Request[CancelAuditMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    * Cancels an audit that is in progress. The audit can be either scheduled or on demand. If the audit isn't in progress, an "InvalidRequestException" occurs. Requires permission to access the CancelAuditTask action.
    */
  def cancelAuditTask(): Request[CancelAuditTaskResponse, AWSError] = js.native
  def cancelAuditTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelAuditTaskResponse, Unit]): Request[CancelAuditTaskResponse, AWSError] = js.native
  /**
    * Cancels an audit that is in progress. The audit can be either scheduled or on demand. If the audit isn't in progress, an "InvalidRequestException" occurs. Requires permission to access the CancelAuditTask action.
    */
  def cancelAuditTask(params: CancelAuditTaskRequest): Request[CancelAuditTaskResponse, AWSError] = js.native
  def cancelAuditTask(
    params: CancelAuditTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelAuditTaskResponse, Unit]
  ): Request[CancelAuditTaskResponse, AWSError] = js.native
  
  /**
    * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE. Requires permission to access the CancelCertificateTransfer action.
    */
  def cancelCertificateTransfer(): Request[js.Object, AWSError] = js.native
  def cancelCertificateTransfer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE. Requires permission to access the CancelCertificateTransfer action.
    */
  def cancelCertificateTransfer(params: CancelCertificateTransferRequest): Request[js.Object, AWSError] = js.native
  def cancelCertificateTransfer(
    params: CancelCertificateTransferRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Cancels a Device Defender ML Detect mitigation action.  Requires permission to access the CancelDetectMitigationActionsTask action.
    */
  def cancelDetectMitigationActionsTask(): Request[CancelDetectMitigationActionsTaskResponse, AWSError] = js.native
  def cancelDetectMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ CancelDetectMitigationActionsTaskResponse, Unit]
  ): Request[CancelDetectMitigationActionsTaskResponse, AWSError] = js.native
  /**
    *  Cancels a Device Defender ML Detect mitigation action.  Requires permission to access the CancelDetectMitigationActionsTask action.
    */
  def cancelDetectMitigationActionsTask(params: CancelDetectMitigationActionsTaskRequest): Request[CancelDetectMitigationActionsTaskResponse, AWSError] = js.native
  def cancelDetectMitigationActionsTask(
    params: CancelDetectMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelDetectMitigationActionsTaskResponse, Unit]
  ): Request[CancelDetectMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    * Cancels a job. Requires permission to access the CancelJob action.
    */
  def cancelJob(): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Cancels a job. Requires permission to access the CancelJob action.
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]
  ): Request[CancelJobResponse, AWSError] = js.native
  
  /**
    * Cancels the execution of a job for a given thing. Requires permission to access the CancelJobExecution action.
    */
  def cancelJobExecution(): Request[js.Object, AWSError] = js.native
  def cancelJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels the execution of a job for a given thing. Requires permission to access the CancelJobExecution action.
    */
  def cancelJobExecution(params: CancelJobExecutionRequest): Request[js.Object, AWSError] = js.native
  def cancelJobExecution(
    params: CancelJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Clears the default authorizer. Requires permission to access the ClearDefaultAuthorizer action.
    */
  def clearDefaultAuthorizer(): Request[ClearDefaultAuthorizerResponse, AWSError] = js.native
  def clearDefaultAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ ClearDefaultAuthorizerResponse, Unit]): Request[ClearDefaultAuthorizerResponse, AWSError] = js.native
  /**
    * Clears the default authorizer. Requires permission to access the ClearDefaultAuthorizer action.
    */
  def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): Request[ClearDefaultAuthorizerResponse, AWSError] = js.native
  def clearDefaultAuthorizer(
    params: ClearDefaultAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClearDefaultAuthorizerResponse, Unit]
  ): Request[ClearDefaultAuthorizerResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Iot: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Confirms a topic rule destination. When you create a rule requiring a destination, IoT sends a confirmation message to the endpoint or base address you specify. The message includes a token which you pass back when calling ConfirmTopicRuleDestination to confirm that you own or have access to the endpoint. Requires permission to access the ConfirmTopicRuleDestination action.
    */
  def confirmTopicRuleDestination(): Request[ConfirmTopicRuleDestinationResponse, AWSError] = js.native
  def confirmTopicRuleDestination(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmTopicRuleDestinationResponse, Unit]): Request[ConfirmTopicRuleDestinationResponse, AWSError] = js.native
  /**
    * Confirms a topic rule destination. When you create a rule requiring a destination, IoT sends a confirmation message to the endpoint or base address you specify. The message includes a token which you pass back when calling ConfirmTopicRuleDestination to confirm that you own or have access to the endpoint. Requires permission to access the ConfirmTopicRuleDestination action.
    */
  def confirmTopicRuleDestination(params: ConfirmTopicRuleDestinationRequest): Request[ConfirmTopicRuleDestinationResponse, AWSError] = js.native
  def confirmTopicRuleDestination(
    params: ConfirmTopicRuleDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmTopicRuleDestinationResponse, Unit]
  ): Request[ConfirmTopicRuleDestinationResponse, AWSError] = js.native
  
  /**
    *  Creates a Device Defender audit suppression.  Requires permission to access the CreateAuditSuppression action.
    */
  def createAuditSuppression(): Request[CreateAuditSuppressionResponse, AWSError] = js.native
  def createAuditSuppression(callback: js.Function2[/* err */ AWSError, /* data */ CreateAuditSuppressionResponse, Unit]): Request[CreateAuditSuppressionResponse, AWSError] = js.native
  /**
    *  Creates a Device Defender audit suppression.  Requires permission to access the CreateAuditSuppression action.
    */
  def createAuditSuppression(params: CreateAuditSuppressionRequest): Request[CreateAuditSuppressionResponse, AWSError] = js.native
  def createAuditSuppression(
    params: CreateAuditSuppressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAuditSuppressionResponse, Unit]
  ): Request[CreateAuditSuppressionResponse, AWSError] = js.native
  
  /**
    * Creates an authorizer. Requires permission to access the CreateAuthorizer action.
    */
  def createAuthorizer(): Request[CreateAuthorizerResponse, AWSError] = js.native
  def createAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ CreateAuthorizerResponse, Unit]): Request[CreateAuthorizerResponse, AWSError] = js.native
  /**
    * Creates an authorizer. Requires permission to access the CreateAuthorizer action.
    */
  def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse, AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAuthorizerResponse, Unit]
  ): Request[CreateAuthorizerResponse, AWSError] = js.native
  
  /**
    * Creates a billing group. Requires permission to access the CreateBillingGroup action.
    */
  def createBillingGroup(): Request[CreateBillingGroupResponse, AWSError] = js.native
  def createBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateBillingGroupResponse, Unit]): Request[CreateBillingGroupResponse, AWSError] = js.native
  /**
    * Creates a billing group. Requires permission to access the CreateBillingGroup action.
    */
  def createBillingGroup(params: CreateBillingGroupRequest): Request[CreateBillingGroupResponse, AWSError] = js.native
  def createBillingGroup(
    params: CreateBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBillingGroupResponse, Unit]
  ): Request[CreateBillingGroupResponse, AWSError] = js.native
  
  /**
    * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256, NIST P-384, or NIST P-512 curves. For supported certificates, consult  Certificate signing algorithms supported by IoT.  Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. Requires permission to access the CreateCertificateFromCsr action. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr Amazon Web Services CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
    */
  def createCertificateFromCsr(): Request[CreateCertificateFromCsrResponse, AWSError] = js.native
  def createCertificateFromCsr(callback: js.Function2[/* err */ AWSError, /* data */ CreateCertificateFromCsrResponse, Unit]): Request[CreateCertificateFromCsrResponse, AWSError] = js.native
  /**
    * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256, NIST P-384, or NIST P-512 curves. For supported certificates, consult  Certificate signing algorithms supported by IoT.  Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. Requires permission to access the CreateCertificateFromCsr action. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr Amazon Web Services CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
    */
  def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): Request[CreateCertificateFromCsrResponse, AWSError] = js.native
  def createCertificateFromCsr(
    params: CreateCertificateFromCsrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCertificateFromCsrResponse, Unit]
  ): Request[CreateCertificateFromCsrResponse, AWSError] = js.native
  
  /**
    *  Use this API to define a Custom Metric published by your devices to Device Defender.  Requires permission to access the CreateCustomMetric action.
    */
  def createCustomMetric(): Request[CreateCustomMetricResponse, AWSError] = js.native
  def createCustomMetric(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomMetricResponse, Unit]): Request[CreateCustomMetricResponse, AWSError] = js.native
  /**
    *  Use this API to define a Custom Metric published by your devices to Device Defender.  Requires permission to access the CreateCustomMetric action.
    */
  def createCustomMetric(params: CreateCustomMetricRequest): Request[CreateCustomMetricResponse, AWSError] = js.native
  def createCustomMetric(
    params: CreateCustomMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomMetricResponse, Unit]
  ): Request[CreateCustomMetricResponse, AWSError] = js.native
  
  /**
    * Create a dimension that you can use to limit the scope of a metric used in a security profile for IoT Device Defender. For example, using a TOPIC_FILTER dimension, you can narrow down the scope of the metric only to MQTT topics whose name match the pattern specified in the dimension. Requires permission to access the CreateDimension action.
    */
  def createDimension(): Request[CreateDimensionResponse, AWSError] = js.native
  def createDimension(callback: js.Function2[/* err */ AWSError, /* data */ CreateDimensionResponse, Unit]): Request[CreateDimensionResponse, AWSError] = js.native
  /**
    * Create a dimension that you can use to limit the scope of a metric used in a security profile for IoT Device Defender. For example, using a TOPIC_FILTER dimension, you can narrow down the scope of the metric only to MQTT topics whose name match the pattern specified in the dimension. Requires permission to access the CreateDimension action.
    */
  def createDimension(params: CreateDimensionRequest): Request[CreateDimensionResponse, AWSError] = js.native
  def createDimension(
    params: CreateDimensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDimensionResponse, Unit]
  ): Request[CreateDimensionResponse, AWSError] = js.native
  
  /**
    * Creates a domain configuration. Requires permission to access the CreateDomainConfiguration action.
    */
  def createDomainConfiguration(): Request[CreateDomainConfigurationResponse, AWSError] = js.native
  def createDomainConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainConfigurationResponse, Unit]): Request[CreateDomainConfigurationResponse, AWSError] = js.native
  /**
    * Creates a domain configuration. Requires permission to access the CreateDomainConfiguration action.
    */
  def createDomainConfiguration(params: CreateDomainConfigurationRequest): Request[CreateDomainConfigurationResponse, AWSError] = js.native
  def createDomainConfiguration(
    params: CreateDomainConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainConfigurationResponse, Unit]
  ): Request[CreateDomainConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a dynamic thing group. Requires permission to access the CreateDynamicThingGroup action.
    */
  def createDynamicThingGroup(): Request[CreateDynamicThingGroupResponse, AWSError] = js.native
  def createDynamicThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDynamicThingGroupResponse, Unit]): Request[CreateDynamicThingGroupResponse, AWSError] = js.native
  /**
    * Creates a dynamic thing group. Requires permission to access the CreateDynamicThingGroup action.
    */
  def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): Request[CreateDynamicThingGroupResponse, AWSError] = js.native
  def createDynamicThingGroup(
    params: CreateDynamicThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDynamicThingGroupResponse, Unit]
  ): Request[CreateDynamicThingGroupResponse, AWSError] = js.native
  
  /**
    * Creates a fleet metric. Requires permission to access the CreateFleetMetric action.
    */
  def createFleetMetric(): Request[CreateFleetMetricResponse, AWSError] = js.native
  def createFleetMetric(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetMetricResponse, Unit]): Request[CreateFleetMetricResponse, AWSError] = js.native
  /**
    * Creates a fleet metric. Requires permission to access the CreateFleetMetric action.
    */
  def createFleetMetric(params: CreateFleetMetricRequest): Request[CreateFleetMetricResponse, AWSError] = js.native
  def createFleetMetric(
    params: CreateFleetMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetMetricResponse, Unit]
  ): Request[CreateFleetMetricResponse, AWSError] = js.native
  
  /**
    * Creates a job. Requires permission to access the CreateJob action.
    */
  def createJob(): Request[CreateJobResponse, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]): Request[CreateJobResponse, AWSError] = js.native
  /**
    * Creates a job. Requires permission to access the CreateJob action.
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResponse, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]
  ): Request[CreateJobResponse, AWSError] = js.native
  
  /**
    * Creates a job template. Requires permission to access the CreateJobTemplate action.
    */
  def createJobTemplate(): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]): Request[CreateJobTemplateResponse, AWSError] = js.native
  /**
    * Creates a job template. Requires permission to access the CreateJobTemplate action.
    */
  def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(
    params: CreateJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]
  ): Request[CreateJobTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key. You can also call CreateKeysAndCertificate over MQTT from a device, for more information, see Provisioning MQTT API.  Note This is the only time IoT issues the private key for this certificate, so it is important to keep it in a secure location. Requires permission to access the CreateKeysAndCertificate action.
    */
  def createKeysAndCertificate(): Request[CreateKeysAndCertificateResponse, AWSError] = js.native
  def createKeysAndCertificate(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeysAndCertificateResponse, Unit]): Request[CreateKeysAndCertificateResponse, AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key. You can also call CreateKeysAndCertificate over MQTT from a device, for more information, see Provisioning MQTT API.  Note This is the only time IoT issues the private key for this certificate, so it is important to keep it in a secure location. Requires permission to access the CreateKeysAndCertificate action.
    */
  def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): Request[CreateKeysAndCertificateResponse, AWSError] = js.native
  def createKeysAndCertificate(
    params: CreateKeysAndCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeysAndCertificateResponse, Unit]
  ): Request[CreateKeysAndCertificateResponse, AWSError] = js.native
  
  /**
    * Defines an action that can be applied to audit findings by using StartAuditMitigationActionsTask. Only certain types of mitigation actions can be applied to specific check names. For more information, see Mitigation actions. Each mitigation action can apply only one type of change. Requires permission to access the CreateMitigationAction action.
    */
  def createMitigationAction(): Request[CreateMitigationActionResponse, AWSError] = js.native
  def createMitigationAction(callback: js.Function2[/* err */ AWSError, /* data */ CreateMitigationActionResponse, Unit]): Request[CreateMitigationActionResponse, AWSError] = js.native
  /**
    * Defines an action that can be applied to audit findings by using StartAuditMitigationActionsTask. Only certain types of mitigation actions can be applied to specific check names. For more information, see Mitigation actions. Each mitigation action can apply only one type of change. Requires permission to access the CreateMitigationAction action.
    */
  def createMitigationAction(params: CreateMitigationActionRequest): Request[CreateMitigationActionResponse, AWSError] = js.native
  def createMitigationAction(
    params: CreateMitigationActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMitigationActionResponse, Unit]
  ): Request[CreateMitigationActionResponse, AWSError] = js.native
  
  /**
    * Creates an IoT OTA update on a target group of things or groups. Requires permission to access the CreateOTAUpdate action.
    */
  def createOTAUpdate(): Request[CreateOTAUpdateResponse, AWSError] = js.native
  def createOTAUpdate(callback: js.Function2[/* err */ AWSError, /* data */ CreateOTAUpdateResponse, Unit]): Request[CreateOTAUpdateResponse, AWSError] = js.native
  /**
    * Creates an IoT OTA update on a target group of things or groups. Requires permission to access the CreateOTAUpdate action.
    */
  def createOTAUpdate(params: CreateOTAUpdateRequest): Request[CreateOTAUpdateResponse, AWSError] = js.native
  def createOTAUpdate(
    params: CreateOTAUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOTAUpdateResponse, Unit]
  ): Request[CreateOTAUpdateResponse, AWSError] = js.native
  
  /**
    * Creates an IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version. Requires permission to access the CreatePolicy action.
    */
  def createPolicy(): Request[CreatePolicyResponse, AWSError] = js.native
  def createPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyResponse, Unit]): Request[CreatePolicyResponse, AWSError] = js.native
  /**
    * Creates an IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version. Requires permission to access the CreatePolicy action.
    */
  def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse, AWSError] = js.native
  def createPolicy(
    params: CreatePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyResponse, Unit]
  ): Request[CreatePolicyResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the specified IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached). Requires permission to access the CreatePolicyVersion action.
    */
  def createPolicyVersion(): Request[CreatePolicyVersionResponse, AWSError] = js.native
  def createPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyVersionResponse, Unit]): Request[CreatePolicyVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the specified IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached). Requires permission to access the CreatePolicyVersion action.
    */
  def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse, AWSError] = js.native
  def createPolicyVersion(
    params: CreatePolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyVersionResponse, Unit]
  ): Request[CreatePolicyVersionResponse, AWSError] = js.native
  
  /**
    * Creates a provisioning claim. Requires permission to access the CreateProvisioningClaim action.
    */
  def createProvisioningClaim(): Request[CreateProvisioningClaimResponse, AWSError] = js.native
  def createProvisioningClaim(callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningClaimResponse, Unit]): Request[CreateProvisioningClaimResponse, AWSError] = js.native
  /**
    * Creates a provisioning claim. Requires permission to access the CreateProvisioningClaim action.
    */
  def createProvisioningClaim(params: CreateProvisioningClaimRequest): Request[CreateProvisioningClaimResponse, AWSError] = js.native
  def createProvisioningClaim(
    params: CreateProvisioningClaimRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningClaimResponse, Unit]
  ): Request[CreateProvisioningClaimResponse, AWSError] = js.native
  
  /**
    * Creates a provisioning template. Requires permission to access the CreateProvisioningTemplate action.
    */
  def createProvisioningTemplate(): Request[CreateProvisioningTemplateResponse, AWSError] = js.native
  def createProvisioningTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningTemplateResponse, Unit]): Request[CreateProvisioningTemplateResponse, AWSError] = js.native
  /**
    * Creates a provisioning template. Requires permission to access the CreateProvisioningTemplate action.
    */
  def createProvisioningTemplate(params: CreateProvisioningTemplateRequest): Request[CreateProvisioningTemplateResponse, AWSError] = js.native
  def createProvisioningTemplate(
    params: CreateProvisioningTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningTemplateResponse, Unit]
  ): Request[CreateProvisioningTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a new version of a provisioning template. Requires permission to access the CreateProvisioningTemplateVersion action.
    */
  def createProvisioningTemplateVersion(): Request[CreateProvisioningTemplateVersionResponse, AWSError] = js.native
  def createProvisioningTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningTemplateVersionResponse, Unit]
  ): Request[CreateProvisioningTemplateVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of a provisioning template. Requires permission to access the CreateProvisioningTemplateVersion action.
    */
  def createProvisioningTemplateVersion(params: CreateProvisioningTemplateVersionRequest): Request[CreateProvisioningTemplateVersionResponse, AWSError] = js.native
  def createProvisioningTemplateVersion(
    params: CreateProvisioningTemplateVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningTemplateVersionResponse, Unit]
  ): Request[CreateProvisioningTemplateVersionResponse, AWSError] = js.native
  
  /**
    * Creates a role alias. Requires permission to access the CreateRoleAlias action.
    */
  def createRoleAlias(): Request[CreateRoleAliasResponse, AWSError] = js.native
  def createRoleAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoleAliasResponse, Unit]): Request[CreateRoleAliasResponse, AWSError] = js.native
  /**
    * Creates a role alias. Requires permission to access the CreateRoleAlias action.
    */
  def createRoleAlias(params: CreateRoleAliasRequest): Request[CreateRoleAliasResponse, AWSError] = js.native
  def createRoleAlias(
    params: CreateRoleAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoleAliasResponse, Unit]
  ): Request[CreateRoleAliasResponse, AWSError] = js.native
  
  /**
    * Creates a scheduled audit that is run at a specified time interval. Requires permission to access the CreateScheduledAudit action.
    */
  def createScheduledAudit(): Request[CreateScheduledAuditResponse, AWSError] = js.native
  def createScheduledAudit(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduledAuditResponse, Unit]): Request[CreateScheduledAuditResponse, AWSError] = js.native
  /**
    * Creates a scheduled audit that is run at a specified time interval. Requires permission to access the CreateScheduledAudit action.
    */
  def createScheduledAudit(params: CreateScheduledAuditRequest): Request[CreateScheduledAuditResponse, AWSError] = js.native
  def createScheduledAudit(
    params: CreateScheduledAuditRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduledAuditResponse, Unit]
  ): Request[CreateScheduledAuditResponse, AWSError] = js.native
  
  /**
    * Creates a Device Defender security profile. Requires permission to access the CreateSecurityProfile action.
    */
  def createSecurityProfile(): Request[CreateSecurityProfileResponse, AWSError] = js.native
  def createSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityProfileResponse, Unit]): Request[CreateSecurityProfileResponse, AWSError] = js.native
  /**
    * Creates a Device Defender security profile. Requires permission to access the CreateSecurityProfile action.
    */
  def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse, AWSError] = js.native
  def createSecurityProfile(
    params: CreateSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityProfileResponse, Unit]
  ): Request[CreateSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. Requires permission to access the CreateStream action.
    */
  def createStream(): Request[CreateStreamResponse, AWSError] = js.native
  def createStream(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamResponse, Unit]): Request[CreateStreamResponse, AWSError] = js.native
  /**
    * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. Requires permission to access the CreateStream action.
    */
  def createStream(params: CreateStreamRequest): Request[CreateStreamResponse, AWSError] = js.native
  def createStream(
    params: CreateStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamResponse, Unit]
  ): Request[CreateStreamResponse, AWSError] = js.native
  
  /**
    * Creates a thing record in the registry. If this call is made multiple times using the same thing name and configuration, the call will succeed. If this call is made with the same thing name but different configuration a ResourceAlreadyExistsException is thrown.  This is a control plane operation. See Authorization for information about authorizing control plane actions.  Requires permission to access the CreateThing action.
    */
  def createThing(): Request[CreateThingResponse, AWSError] = js.native
  def createThing(callback: js.Function2[/* err */ AWSError, /* data */ CreateThingResponse, Unit]): Request[CreateThingResponse, AWSError] = js.native
  /**
    * Creates a thing record in the registry. If this call is made multiple times using the same thing name and configuration, the call will succeed. If this call is made with the same thing name but different configuration a ResourceAlreadyExistsException is thrown.  This is a control plane operation. See Authorization for information about authorizing control plane actions.  Requires permission to access the CreateThing action.
    */
  def createThing(params: CreateThingRequest): Request[CreateThingResponse, AWSError] = js.native
  def createThing(
    params: CreateThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThingResponse, Unit]
  ): Request[CreateThingResponse, AWSError] = js.native
  
  /**
    * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions.  Requires permission to access the CreateThingGroup action.
    */
  def createThingGroup(): Request[CreateThingGroupResponse, AWSError] = js.native
  def createThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateThingGroupResponse, Unit]): Request[CreateThingGroupResponse, AWSError] = js.native
  /**
    * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions.  Requires permission to access the CreateThingGroup action.
    */
  def createThingGroup(params: CreateThingGroupRequest): Request[CreateThingGroupResponse, AWSError] = js.native
  def createThingGroup(
    params: CreateThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThingGroupResponse, Unit]
  ): Request[CreateThingGroupResponse, AWSError] = js.native
  
  /**
    * Creates a new thing type. Requires permission to access the CreateThingType action.
    */
  def createThingType(): Request[CreateThingTypeResponse, AWSError] = js.native
  def createThingType(callback: js.Function2[/* err */ AWSError, /* data */ CreateThingTypeResponse, Unit]): Request[CreateThingTypeResponse, AWSError] = js.native
  /**
    * Creates a new thing type. Requires permission to access the CreateThingType action.
    */
  def createThingType(params: CreateThingTypeRequest): Request[CreateThingTypeResponse, AWSError] = js.native
  def createThingType(
    params: CreateThingTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThingTypeResponse, Unit]
  ): Request[CreateThingTypeResponse, AWSError] = js.native
  
  /**
    * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule. Requires permission to access the CreateTopicRule action.
    */
  def createTopicRule(): Request[js.Object, AWSError] = js.native
  def createTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule. Requires permission to access the CreateTopicRule action.
    */
  def createTopicRule(params: CreateTopicRuleRequest): Request[js.Object, AWSError] = js.native
  def createTopicRule(
    params: CreateTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a topic rule destination. The destination must be confirmed prior to use. Requires permission to access the CreateTopicRuleDestination action.
    */
  def createTopicRuleDestination(): Request[CreateTopicRuleDestinationResponse, AWSError] = js.native
  def createTopicRuleDestination(callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicRuleDestinationResponse, Unit]): Request[CreateTopicRuleDestinationResponse, AWSError] = js.native
  /**
    * Creates a topic rule destination. The destination must be confirmed prior to use. Requires permission to access the CreateTopicRuleDestination action.
    */
  def createTopicRuleDestination(params: CreateTopicRuleDestinationRequest): Request[CreateTopicRuleDestinationResponse, AWSError] = js.native
  def createTopicRuleDestination(
    params: CreateTopicRuleDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicRuleDestinationResponse, Unit]
  ): Request[CreateTopicRuleDestinationResponse, AWSError] = js.native
  
  /**
    * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled.  Requires permission to access the DeleteAccountAuditConfiguration action.
    */
  def deleteAccountAuditConfiguration(): Request[DeleteAccountAuditConfigurationResponse, AWSError] = js.native
  def deleteAccountAuditConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAuditConfigurationResponse, Unit]
  ): Request[DeleteAccountAuditConfigurationResponse, AWSError] = js.native
  /**
    * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled.  Requires permission to access the DeleteAccountAuditConfiguration action.
    */
  def deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest): Request[DeleteAccountAuditConfigurationResponse, AWSError] = js.native
  def deleteAccountAuditConfiguration(
    params: DeleteAccountAuditConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAuditConfigurationResponse, Unit]
  ): Request[DeleteAccountAuditConfigurationResponse, AWSError] = js.native
  
  /**
    *  Deletes a Device Defender audit suppression.  Requires permission to access the DeleteAuditSuppression action.
    */
  def deleteAuditSuppression(): Request[DeleteAuditSuppressionResponse, AWSError] = js.native
  def deleteAuditSuppression(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuditSuppressionResponse, Unit]): Request[DeleteAuditSuppressionResponse, AWSError] = js.native
  /**
    *  Deletes a Device Defender audit suppression.  Requires permission to access the DeleteAuditSuppression action.
    */
  def deleteAuditSuppression(params: DeleteAuditSuppressionRequest): Request[DeleteAuditSuppressionResponse, AWSError] = js.native
  def deleteAuditSuppression(
    params: DeleteAuditSuppressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuditSuppressionResponse, Unit]
  ): Request[DeleteAuditSuppressionResponse, AWSError] = js.native
  
  /**
    * Deletes an authorizer. Requires permission to access the DeleteAuthorizer action.
    */
  def deleteAuthorizer(): Request[DeleteAuthorizerResponse, AWSError] = js.native
  def deleteAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuthorizerResponse, Unit]): Request[DeleteAuthorizerResponse, AWSError] = js.native
  /**
    * Deletes an authorizer. Requires permission to access the DeleteAuthorizer action.
    */
  def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[DeleteAuthorizerResponse, AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuthorizerResponse, Unit]
  ): Request[DeleteAuthorizerResponse, AWSError] = js.native
  
  /**
    * Deletes the billing group. Requires permission to access the DeleteBillingGroup action.
    */
  def deleteBillingGroup(): Request[DeleteBillingGroupResponse, AWSError] = js.native
  def deleteBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBillingGroupResponse, Unit]): Request[DeleteBillingGroupResponse, AWSError] = js.native
  /**
    * Deletes the billing group. Requires permission to access the DeleteBillingGroup action.
    */
  def deleteBillingGroup(params: DeleteBillingGroupRequest): Request[DeleteBillingGroupResponse, AWSError] = js.native
  def deleteBillingGroup(
    params: DeleteBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBillingGroupResponse, Unit]
  ): Request[DeleteBillingGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a registered CA certificate. Requires permission to access the DeleteCACertificate action.
    */
  def deleteCACertificate(): Request[DeleteCACertificateResponse, AWSError] = js.native
  def deleteCACertificate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCACertificateResponse, Unit]): Request[DeleteCACertificateResponse, AWSError] = js.native
  /**
    * Deletes a registered CA certificate. Requires permission to access the DeleteCACertificate action.
    */
  def deleteCACertificate(params: DeleteCACertificateRequest): Request[DeleteCACertificateResponse, AWSError] = js.native
  def deleteCACertificate(
    params: DeleteCACertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCACertificateResponse, Unit]
  ): Request[DeleteCACertificateResponse, AWSError] = js.native
  
  /**
    * Deletes the specified certificate. A certificate cannot be deleted if it has a policy or IoT thing attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPolicy action to detach all policies. Next, use the UpdateCertificate action to set the certificate to the INACTIVE status. Requires permission to access the DeleteCertificate action.
    */
  def deleteCertificate(): Request[js.Object, AWSError] = js.native
  def deleteCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified certificate. A certificate cannot be deleted if it has a policy or IoT thing attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPolicy action to detach all policies. Next, use the UpdateCertificate action to set the certificate to the INACTIVE status. Requires permission to access the DeleteCertificate action.
    */
  def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object, AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes a Device Defender detect custom metric.  Requires permission to access the DeleteCustomMetric action.  Before you can delete a custom metric, you must first remove the custom metric from all security profiles it's a part of. The security profile associated with the custom metric can be found using the ListSecurityProfiles API with metricName set to your custom metric name. 
    */
  def deleteCustomMetric(): Request[DeleteCustomMetricResponse, AWSError] = js.native
  def deleteCustomMetric(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomMetricResponse, Unit]): Request[DeleteCustomMetricResponse, AWSError] = js.native
  /**
    *  Deletes a Device Defender detect custom metric.  Requires permission to access the DeleteCustomMetric action.  Before you can delete a custom metric, you must first remove the custom metric from all security profiles it's a part of. The security profile associated with the custom metric can be found using the ListSecurityProfiles API with metricName set to your custom metric name. 
    */
  def deleteCustomMetric(params: DeleteCustomMetricRequest): Request[DeleteCustomMetricResponse, AWSError] = js.native
  def deleteCustomMetric(
    params: DeleteCustomMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomMetricResponse, Unit]
  ): Request[DeleteCustomMetricResponse, AWSError] = js.native
  
  /**
    * Removes the specified dimension from your Amazon Web Services accounts. Requires permission to access the DeleteDimension action.
    */
  def deleteDimension(): Request[DeleteDimensionResponse, AWSError] = js.native
  def deleteDimension(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDimensionResponse, Unit]): Request[DeleteDimensionResponse, AWSError] = js.native
  /**
    * Removes the specified dimension from your Amazon Web Services accounts. Requires permission to access the DeleteDimension action.
    */
  def deleteDimension(params: DeleteDimensionRequest): Request[DeleteDimensionResponse, AWSError] = js.native
  def deleteDimension(
    params: DeleteDimensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDimensionResponse, Unit]
  ): Request[DeleteDimensionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified domain configuration. Requires permission to access the DeleteDomainConfiguration action.
    */
  def deleteDomainConfiguration(): Request[DeleteDomainConfigurationResponse, AWSError] = js.native
  def deleteDomainConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainConfigurationResponse, Unit]): Request[DeleteDomainConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the specified domain configuration. Requires permission to access the DeleteDomainConfiguration action.
    */
  def deleteDomainConfiguration(params: DeleteDomainConfigurationRequest): Request[DeleteDomainConfigurationResponse, AWSError] = js.native
  def deleteDomainConfiguration(
    params: DeleteDomainConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainConfigurationResponse, Unit]
  ): Request[DeleteDomainConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes a dynamic thing group. Requires permission to access the DeleteDynamicThingGroup action.
    */
  def deleteDynamicThingGroup(): Request[DeleteDynamicThingGroupResponse, AWSError] = js.native
  def deleteDynamicThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDynamicThingGroupResponse, Unit]): Request[DeleteDynamicThingGroupResponse, AWSError] = js.native
  /**
    * Deletes a dynamic thing group. Requires permission to access the DeleteDynamicThingGroup action.
    */
  def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): Request[DeleteDynamicThingGroupResponse, AWSError] = js.native
  def deleteDynamicThingGroup(
    params: DeleteDynamicThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDynamicThingGroupResponse, Unit]
  ): Request[DeleteDynamicThingGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified fleet metric. Returns successfully with no error if the deletion is successful or you specify a fleet metric that doesn't exist. Requires permission to access the DeleteFleetMetric action.
    */
  def deleteFleetMetric(): Request[js.Object, AWSError] = js.native
  def deleteFleetMetric(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified fleet metric. Returns successfully with no error if the deletion is successful or you specify a fleet metric that doesn't exist. Requires permission to access the DeleteFleetMetric action.
    */
  def deleteFleetMetric(params: DeleteFleetMetricRequest): Request[js.Object, AWSError] = js.native
  def deleteFleetMetric(
    params: DeleteFleetMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur. Requires permission to access the DeleteJob action.
    */
  def deleteJob(): Request[js.Object, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur. Requires permission to access the DeleteJob action.
    */
  def deleteJob(params: DeleteJobRequest): Request[js.Object, AWSError] = js.native
  def deleteJob(params: DeleteJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a job execution. Requires permission to access the DeleteJobExecution action.
    */
  def deleteJobExecution(): Request[js.Object, AWSError] = js.native
  def deleteJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a job execution. Requires permission to access the DeleteJobExecution action.
    */
  def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object, AWSError] = js.native
  def deleteJobExecution(
    params: DeleteJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified job template.
    */
  def deleteJobTemplate(): Request[js.Object, AWSError] = js.native
  def deleteJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified job template.
    */
  def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[js.Object, AWSError] = js.native
  def deleteJobTemplate(
    params: DeleteJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a defined mitigation action from your Amazon Web Services accounts. Requires permission to access the DeleteMitigationAction action.
    */
  def deleteMitigationAction(): Request[DeleteMitigationActionResponse, AWSError] = js.native
  def deleteMitigationAction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMitigationActionResponse, Unit]): Request[DeleteMitigationActionResponse, AWSError] = js.native
  /**
    * Deletes a defined mitigation action from your Amazon Web Services accounts. Requires permission to access the DeleteMitigationAction action.
    */
  def deleteMitigationAction(params: DeleteMitigationActionRequest): Request[DeleteMitigationActionResponse, AWSError] = js.native
  def deleteMitigationAction(
    params: DeleteMitigationActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMitigationActionResponse, Unit]
  ): Request[DeleteMitigationActionResponse, AWSError] = js.native
  
  /**
    * Delete an OTA update. Requires permission to access the DeleteOTAUpdate action.
    */
  def deleteOTAUpdate(): Request[DeleteOTAUpdateResponse, AWSError] = js.native
  def deleteOTAUpdate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOTAUpdateResponse, Unit]): Request[DeleteOTAUpdateResponse, AWSError] = js.native
  /**
    * Delete an OTA update. Requires permission to access the DeleteOTAUpdate action.
    */
  def deleteOTAUpdate(params: DeleteOTAUpdateRequest): Request[DeleteOTAUpdateResponse, AWSError] = js.native
  def deleteOTAUpdate(
    params: DeleteOTAUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOTAUpdateResponse, Unit]
  ): Request[DeleteOTAUpdateResponse, AWSError] = js.native
  
  /**
    * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion action to delete all non-default versions of the policy; use the DetachPolicy action to detach the policy from any certificate; and then use the DeletePolicy action to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.  Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is detached before it's ready to be deleted.  Requires permission to access the DeletePolicy action.
    */
  def deletePolicy(): Request[js.Object, AWSError] = js.native
  def deletePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion action to delete all non-default versions of the policy; use the DetachPolicy action to detach the policy from any certificate; and then use the DeletePolicy action to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.  Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is detached before it's ready to be deleted.  Requires permission to access the DeletePolicy action.
    */
  def deletePolicy(params: DeletePolicyRequest): Request[js.Object, AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this action. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. Requires permission to access the DeletePolicyVersion action.
    */
  def deletePolicyVersion(): Request[js.Object, AWSError] = js.native
  def deletePolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this action. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. Requires permission to access the DeletePolicyVersion action.
    */
  def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object, AWSError] = js.native
  def deletePolicyVersion(
    params: DeletePolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a provisioning template. Requires permission to access the DeleteProvisioningTemplate action.
    */
  def deleteProvisioningTemplate(): Request[DeleteProvisioningTemplateResponse, AWSError] = js.native
  def deleteProvisioningTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningTemplateResponse, Unit]): Request[DeleteProvisioningTemplateResponse, AWSError] = js.native
  /**
    * Deletes a provisioning template. Requires permission to access the DeleteProvisioningTemplate action.
    */
  def deleteProvisioningTemplate(params: DeleteProvisioningTemplateRequest): Request[DeleteProvisioningTemplateResponse, AWSError] = js.native
  def deleteProvisioningTemplate(
    params: DeleteProvisioningTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningTemplateResponse, Unit]
  ): Request[DeleteProvisioningTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a provisioning template version. Requires permission to access the DeleteProvisioningTemplateVersion action.
    */
  def deleteProvisioningTemplateVersion(): Request[DeleteProvisioningTemplateVersionResponse, AWSError] = js.native
  def deleteProvisioningTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningTemplateVersionResponse, Unit]
  ): Request[DeleteProvisioningTemplateVersionResponse, AWSError] = js.native
  /**
    * Deletes a provisioning template version. Requires permission to access the DeleteProvisioningTemplateVersion action.
    */
  def deleteProvisioningTemplateVersion(params: DeleteProvisioningTemplateVersionRequest): Request[DeleteProvisioningTemplateVersionResponse, AWSError] = js.native
  def deleteProvisioningTemplateVersion(
    params: DeleteProvisioningTemplateVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningTemplateVersionResponse, Unit]
  ): Request[DeleteProvisioningTemplateVersionResponse, AWSError] = js.native
  
  /**
    * Deletes a CA certificate registration code. Requires permission to access the DeleteRegistrationCode action.
    */
  def deleteRegistrationCode(): Request[DeleteRegistrationCodeResponse, AWSError] = js.native
  def deleteRegistrationCode(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegistrationCodeResponse, Unit]): Request[DeleteRegistrationCodeResponse, AWSError] = js.native
  /**
    * Deletes a CA certificate registration code. Requires permission to access the DeleteRegistrationCode action.
    */
  def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): Request[DeleteRegistrationCodeResponse, AWSError] = js.native
  def deleteRegistrationCode(
    params: DeleteRegistrationCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegistrationCodeResponse, Unit]
  ): Request[DeleteRegistrationCodeResponse, AWSError] = js.native
  
  /**
    * Deletes a role alias Requires permission to access the DeleteRoleAlias action.
    */
  def deleteRoleAlias(): Request[DeleteRoleAliasResponse, AWSError] = js.native
  def deleteRoleAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoleAliasResponse, Unit]): Request[DeleteRoleAliasResponse, AWSError] = js.native
  /**
    * Deletes a role alias Requires permission to access the DeleteRoleAlias action.
    */
  def deleteRoleAlias(params: DeleteRoleAliasRequest): Request[DeleteRoleAliasResponse, AWSError] = js.native
  def deleteRoleAlias(
    params: DeleteRoleAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoleAliasResponse, Unit]
  ): Request[DeleteRoleAliasResponse, AWSError] = js.native
  
  /**
    * Deletes a scheduled audit. Requires permission to access the DeleteScheduledAudit action.
    */
  def deleteScheduledAudit(): Request[DeleteScheduledAuditResponse, AWSError] = js.native
  def deleteScheduledAudit(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduledAuditResponse, Unit]): Request[DeleteScheduledAuditResponse, AWSError] = js.native
  /**
    * Deletes a scheduled audit. Requires permission to access the DeleteScheduledAudit action.
    */
  def deleteScheduledAudit(params: DeleteScheduledAuditRequest): Request[DeleteScheduledAuditResponse, AWSError] = js.native
  def deleteScheduledAudit(
    params: DeleteScheduledAuditRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduledAuditResponse, Unit]
  ): Request[DeleteScheduledAuditResponse, AWSError] = js.native
  
  /**
    * Deletes a Device Defender security profile. Requires permission to access the DeleteSecurityProfile action.
    */
  def deleteSecurityProfile(): Request[DeleteSecurityProfileResponse, AWSError] = js.native
  def deleteSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityProfileResponse, Unit]): Request[DeleteSecurityProfileResponse, AWSError] = js.native
  /**
    * Deletes a Device Defender security profile. Requires permission to access the DeleteSecurityProfile action.
    */
  def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[DeleteSecurityProfileResponse, AWSError] = js.native
  def deleteSecurityProfile(
    params: DeleteSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityProfileResponse, Unit]
  ): Request[DeleteSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a stream. Requires permission to access the DeleteStream action.
    */
  def deleteStream(): Request[DeleteStreamResponse, AWSError] = js.native
  def deleteStream(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamResponse, Unit]): Request[DeleteStreamResponse, AWSError] = js.native
  /**
    * Deletes a stream. Requires permission to access the DeleteStream action.
    */
  def deleteStream(params: DeleteStreamRequest): Request[DeleteStreamResponse, AWSError] = js.native
  def deleteStream(
    params: DeleteStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamResponse, Unit]
  ): Request[DeleteStreamResponse, AWSError] = js.native
  
  /**
    * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist. Requires permission to access the DeleteThing action.
    */
  def deleteThing(): Request[DeleteThingResponse, AWSError] = js.native
  def deleteThing(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingResponse, Unit]): Request[DeleteThingResponse, AWSError] = js.native
  /**
    * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist. Requires permission to access the DeleteThing action.
    */
  def deleteThing(params: DeleteThingRequest): Request[DeleteThingResponse, AWSError] = js.native
  def deleteThing(
    params: DeleteThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingResponse, Unit]
  ): Request[DeleteThingResponse, AWSError] = js.native
  
  /**
    * Deletes a thing group. Requires permission to access the DeleteThingGroup action.
    */
  def deleteThingGroup(): Request[DeleteThingGroupResponse, AWSError] = js.native
  def deleteThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingGroupResponse, Unit]): Request[DeleteThingGroupResponse, AWSError] = js.native
  /**
    * Deletes a thing group. Requires permission to access the DeleteThingGroup action.
    */
  def deleteThingGroup(params: DeleteThingGroupRequest): Request[DeleteThingGroupResponse, AWSError] = js.native
  def deleteThingGroup(
    params: DeleteThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingGroupResponse, Unit]
  ): Request[DeleteThingGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type. Requires permission to access the DeleteThingType action.
    */
  def deleteThingType(): Request[DeleteThingTypeResponse, AWSError] = js.native
  def deleteThingType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingTypeResponse, Unit]): Request[DeleteThingTypeResponse, AWSError] = js.native
  /**
    * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type. Requires permission to access the DeleteThingType action.
    */
  def deleteThingType(params: DeleteThingTypeRequest): Request[DeleteThingTypeResponse, AWSError] = js.native
  def deleteThingType(
    params: DeleteThingTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingTypeResponse, Unit]
  ): Request[DeleteThingTypeResponse, AWSError] = js.native
  
  /**
    * Deletes the rule. Requires permission to access the DeleteTopicRule action.
    */
  def deleteTopicRule(): Request[js.Object, AWSError] = js.native
  def deleteTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the rule. Requires permission to access the DeleteTopicRule action.
    */
  def deleteTopicRule(params: DeleteTopicRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteTopicRule(
    params: DeleteTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a topic rule destination. Requires permission to access the DeleteTopicRuleDestination action.
    */
  def deleteTopicRuleDestination(): Request[DeleteTopicRuleDestinationResponse, AWSError] = js.native
  def deleteTopicRuleDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicRuleDestinationResponse, Unit]): Request[DeleteTopicRuleDestinationResponse, AWSError] = js.native
  /**
    * Deletes a topic rule destination. Requires permission to access the DeleteTopicRuleDestination action.
    */
  def deleteTopicRuleDestination(params: DeleteTopicRuleDestinationRequest): Request[DeleteTopicRuleDestinationResponse, AWSError] = js.native
  def deleteTopicRuleDestination(
    params: DeleteTopicRuleDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicRuleDestinationResponse, Unit]
  ): Request[DeleteTopicRuleDestinationResponse, AWSError] = js.native
  
  /**
    * Deletes a logging level. Requires permission to access the DeleteV2LoggingLevel action.
    */
  def deleteV2LoggingLevel(): Request[js.Object, AWSError] = js.native
  def deleteV2LoggingLevel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a logging level. Requires permission to access the DeleteV2LoggingLevel action.
    */
  def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): Request[js.Object, AWSError] = js.native
  def deleteV2LoggingLevel(
    params: DeleteV2LoggingLevelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deprecates a thing type. You can not associate new things with deprecated thing type. Requires permission to access the DeprecateThingType action.
    */
  def deprecateThingType(): Request[DeprecateThingTypeResponse, AWSError] = js.native
  def deprecateThingType(callback: js.Function2[/* err */ AWSError, /* data */ DeprecateThingTypeResponse, Unit]): Request[DeprecateThingTypeResponse, AWSError] = js.native
  /**
    * Deprecates a thing type. You can not associate new things with deprecated thing type. Requires permission to access the DeprecateThingType action.
    */
  def deprecateThingType(params: DeprecateThingTypeRequest): Request[DeprecateThingTypeResponse, AWSError] = js.native
  def deprecateThingType(
    params: DeprecateThingTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprecateThingTypeResponse, Unit]
  ): Request[DeprecateThingTypeResponse, AWSError] = js.native
  
  /**
    * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled. Requires permission to access the DescribeAccountAuditConfiguration action.
    */
  def describeAccountAuditConfiguration(): Request[DescribeAccountAuditConfigurationResponse, AWSError] = js.native
  def describeAccountAuditConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAuditConfigurationResponse, Unit]
  ): Request[DescribeAccountAuditConfigurationResponse, AWSError] = js.native
  /**
    * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled. Requires permission to access the DescribeAccountAuditConfiguration action.
    */
  def describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest): Request[DescribeAccountAuditConfigurationResponse, AWSError] = js.native
  def describeAccountAuditConfiguration(
    params: DescribeAccountAuditConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAuditConfigurationResponse, Unit]
  ): Request[DescribeAccountAuditConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets information about a single audit finding. Properties include the reason for noncompliance, the severity of the issue, and the start time when the audit that returned the finding. Requires permission to access the DescribeAuditFinding action.
    */
  def describeAuditFinding(): Request[DescribeAuditFindingResponse, AWSError] = js.native
  def describeAuditFinding(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditFindingResponse, Unit]): Request[DescribeAuditFindingResponse, AWSError] = js.native
  /**
    * Gets information about a single audit finding. Properties include the reason for noncompliance, the severity of the issue, and the start time when the audit that returned the finding. Requires permission to access the DescribeAuditFinding action.
    */
  def describeAuditFinding(params: DescribeAuditFindingRequest): Request[DescribeAuditFindingResponse, AWSError] = js.native
  def describeAuditFinding(
    params: DescribeAuditFindingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditFindingResponse, Unit]
  ): Request[DescribeAuditFindingResponse, AWSError] = js.native
  
  /**
    * Gets information about an audit mitigation task that is used to apply mitigation actions to a set of audit findings. Properties include the actions being applied, the audit checks to which they're being applied, the task status, and aggregated task statistics.
    */
  def describeAuditMitigationActionsTask(): Request[DescribeAuditMitigationActionsTaskResponse, AWSError] = js.native
  def describeAuditMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditMitigationActionsTaskResponse, Unit]
  ): Request[DescribeAuditMitigationActionsTaskResponse, AWSError] = js.native
  /**
    * Gets information about an audit mitigation task that is used to apply mitigation actions to a set of audit findings. Properties include the actions being applied, the audit checks to which they're being applied, the task status, and aggregated task statistics.
    */
  def describeAuditMitigationActionsTask(params: DescribeAuditMitigationActionsTaskRequest): Request[DescribeAuditMitigationActionsTaskResponse, AWSError] = js.native
  def describeAuditMitigationActionsTask(
    params: DescribeAuditMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditMitigationActionsTaskResponse, Unit]
  ): Request[DescribeAuditMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    *  Gets information about a Device Defender audit suppression. 
    */
  def describeAuditSuppression(): Request[DescribeAuditSuppressionResponse, AWSError] = js.native
  def describeAuditSuppression(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditSuppressionResponse, Unit]): Request[DescribeAuditSuppressionResponse, AWSError] = js.native
  /**
    *  Gets information about a Device Defender audit suppression. 
    */
  def describeAuditSuppression(params: DescribeAuditSuppressionRequest): Request[DescribeAuditSuppressionResponse, AWSError] = js.native
  def describeAuditSuppression(
    params: DescribeAuditSuppressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditSuppressionResponse, Unit]
  ): Request[DescribeAuditSuppressionResponse, AWSError] = js.native
  
  /**
    * Gets information about a Device Defender audit. Requires permission to access the DescribeAuditTask action.
    */
  def describeAuditTask(): Request[DescribeAuditTaskResponse, AWSError] = js.native
  def describeAuditTask(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditTaskResponse, Unit]): Request[DescribeAuditTaskResponse, AWSError] = js.native
  /**
    * Gets information about a Device Defender audit. Requires permission to access the DescribeAuditTask action.
    */
  def describeAuditTask(params: DescribeAuditTaskRequest): Request[DescribeAuditTaskResponse, AWSError] = js.native
  def describeAuditTask(
    params: DescribeAuditTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditTaskResponse, Unit]
  ): Request[DescribeAuditTaskResponse, AWSError] = js.native
  
  /**
    * Describes an authorizer. Requires permission to access the DescribeAuthorizer action.
    */
  def describeAuthorizer(): Request[DescribeAuthorizerResponse, AWSError] = js.native
  def describeAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuthorizerResponse, Unit]): Request[DescribeAuthorizerResponse, AWSError] = js.native
  /**
    * Describes an authorizer. Requires permission to access the DescribeAuthorizer action.
    */
  def describeAuthorizer(params: DescribeAuthorizerRequest): Request[DescribeAuthorizerResponse, AWSError] = js.native
  def describeAuthorizer(
    params: DescribeAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuthorizerResponse, Unit]
  ): Request[DescribeAuthorizerResponse, AWSError] = js.native
  
  /**
    * Returns information about a billing group. Requires permission to access the DescribeBillingGroup action.
    */
  def describeBillingGroup(): Request[DescribeBillingGroupResponse, AWSError] = js.native
  def describeBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBillingGroupResponse, Unit]): Request[DescribeBillingGroupResponse, AWSError] = js.native
  /**
    * Returns information about a billing group. Requires permission to access the DescribeBillingGroup action.
    */
  def describeBillingGroup(params: DescribeBillingGroupRequest): Request[DescribeBillingGroupResponse, AWSError] = js.native
  def describeBillingGroup(
    params: DescribeBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBillingGroupResponse, Unit]
  ): Request[DescribeBillingGroupResponse, AWSError] = js.native
  
  /**
    * Describes a registered CA certificate. Requires permission to access the DescribeCACertificate action.
    */
  def describeCACertificate(): Request[DescribeCACertificateResponse, AWSError] = js.native
  def describeCACertificate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCACertificateResponse, Unit]): Request[DescribeCACertificateResponse, AWSError] = js.native
  /**
    * Describes a registered CA certificate. Requires permission to access the DescribeCACertificate action.
    */
  def describeCACertificate(params: DescribeCACertificateRequest): Request[DescribeCACertificateResponse, AWSError] = js.native
  def describeCACertificate(
    params: DescribeCACertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCACertificateResponse, Unit]
  ): Request[DescribeCACertificateResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified certificate. Requires permission to access the DescribeCertificate action.
    */
  def describeCertificate(): Request[DescribeCertificateResponse, AWSError] = js.native
  def describeCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResponse, Unit]): Request[DescribeCertificateResponse, AWSError] = js.native
  /**
    * Gets information about the specified certificate. Requires permission to access the DescribeCertificate action.
    */
  def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse, AWSError] = js.native
  def describeCertificate(
    params: DescribeCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResponse, Unit]
  ): Request[DescribeCertificateResponse, AWSError] = js.native
  
  /**
    *  Gets information about a Device Defender detect custom metric.  Requires permission to access the DescribeCustomMetric action.
    */
  def describeCustomMetric(): Request[DescribeCustomMetricResponse, AWSError] = js.native
  def describeCustomMetric(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomMetricResponse, Unit]): Request[DescribeCustomMetricResponse, AWSError] = js.native
  /**
    *  Gets information about a Device Defender detect custom metric.  Requires permission to access the DescribeCustomMetric action.
    */
  def describeCustomMetric(params: DescribeCustomMetricRequest): Request[DescribeCustomMetricResponse, AWSError] = js.native
  def describeCustomMetric(
    params: DescribeCustomMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomMetricResponse, Unit]
  ): Request[DescribeCustomMetricResponse, AWSError] = js.native
  
  /**
    * Describes the default authorizer. Requires permission to access the DescribeDefaultAuthorizer action.
    */
  def describeDefaultAuthorizer(): Request[DescribeDefaultAuthorizerResponse, AWSError] = js.native
  def describeDefaultAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultAuthorizerResponse, Unit]): Request[DescribeDefaultAuthorizerResponse, AWSError] = js.native
  /**
    * Describes the default authorizer. Requires permission to access the DescribeDefaultAuthorizer action.
    */
  def describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest): Request[DescribeDefaultAuthorizerResponse, AWSError] = js.native
  def describeDefaultAuthorizer(
    params: DescribeDefaultAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultAuthorizerResponse, Unit]
  ): Request[DescribeDefaultAuthorizerResponse, AWSError] = js.native
  
  /**
    *  Gets information about a Device Defender ML Detect mitigation action.  Requires permission to access the DescribeDetectMitigationActionsTask action.
    */
  def describeDetectMitigationActionsTask(): Request[DescribeDetectMitigationActionsTaskResponse, AWSError] = js.native
  def describeDetectMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectMitigationActionsTaskResponse, Unit]
  ): Request[DescribeDetectMitigationActionsTaskResponse, AWSError] = js.native
  /**
    *  Gets information about a Device Defender ML Detect mitigation action.  Requires permission to access the DescribeDetectMitigationActionsTask action.
    */
  def describeDetectMitigationActionsTask(params: DescribeDetectMitigationActionsTaskRequest): Request[DescribeDetectMitigationActionsTaskResponse, AWSError] = js.native
  def describeDetectMitigationActionsTask(
    params: DescribeDetectMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectMitigationActionsTaskResponse, Unit]
  ): Request[DescribeDetectMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    * Provides details about a dimension that is defined in your Amazon Web Services accounts. Requires permission to access the DescribeDimension action.
    */
  def describeDimension(): Request[DescribeDimensionResponse, AWSError] = js.native
  def describeDimension(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionResponse, Unit]): Request[DescribeDimensionResponse, AWSError] = js.native
  /**
    * Provides details about a dimension that is defined in your Amazon Web Services accounts. Requires permission to access the DescribeDimension action.
    */
  def describeDimension(params: DescribeDimensionRequest): Request[DescribeDimensionResponse, AWSError] = js.native
  def describeDimension(
    params: DescribeDimensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionResponse, Unit]
  ): Request[DescribeDimensionResponse, AWSError] = js.native
  
  /**
    * Gets summary information about a domain configuration. Requires permission to access the DescribeDomainConfiguration action.
    */
  def describeDomainConfiguration(): Request[DescribeDomainConfigurationResponse, AWSError] = js.native
  def describeDomainConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigurationResponse, Unit]): Request[DescribeDomainConfigurationResponse, AWSError] = js.native
  /**
    * Gets summary information about a domain configuration. Requires permission to access the DescribeDomainConfiguration action.
    */
  def describeDomainConfiguration(params: DescribeDomainConfigurationRequest): Request[DescribeDomainConfigurationResponse, AWSError] = js.native
  def describeDomainConfiguration(
    params: DescribeDomainConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigurationResponse, Unit]
  ): Request[DescribeDomainConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns a unique endpoint specific to the Amazon Web Services account making the call. Requires permission to access the DescribeEndpoint action.
    */
  def describeEndpoint(): Request[DescribeEndpointResponse, AWSError] = js.native
  def describeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointResponse, Unit]): Request[DescribeEndpointResponse, AWSError] = js.native
  /**
    * Returns a unique endpoint specific to the Amazon Web Services account making the call. Requires permission to access the DescribeEndpoint action.
    */
  def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse, AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointResponse, Unit]
  ): Request[DescribeEndpointResponse, AWSError] = js.native
  
  /**
    * Describes event configurations. Requires permission to access the DescribeEventConfigurations action.
    */
  def describeEventConfigurations(): Request[DescribeEventConfigurationsResponse, AWSError] = js.native
  def describeEventConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventConfigurationsResponse, Unit]): Request[DescribeEventConfigurationsResponse, AWSError] = js.native
  /**
    * Describes event configurations. Requires permission to access the DescribeEventConfigurations action.
    */
  def describeEventConfigurations(params: DescribeEventConfigurationsRequest): Request[DescribeEventConfigurationsResponse, AWSError] = js.native
  def describeEventConfigurations(
    params: DescribeEventConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventConfigurationsResponse, Unit]
  ): Request[DescribeEventConfigurationsResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified fleet metric. Requires permission to access the DescribeFleetMetric action.
    */
  def describeFleetMetric(): Request[DescribeFleetMetricResponse, AWSError] = js.native
  def describeFleetMetric(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetMetricResponse, Unit]): Request[DescribeFleetMetricResponse, AWSError] = js.native
  /**
    * Gets information about the specified fleet metric. Requires permission to access the DescribeFleetMetric action.
    */
  def describeFleetMetric(params: DescribeFleetMetricRequest): Request[DescribeFleetMetricResponse, AWSError] = js.native
  def describeFleetMetric(
    params: DescribeFleetMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetMetricResponse, Unit]
  ): Request[DescribeFleetMetricResponse, AWSError] = js.native
  
  /**
    * Describes a search index. Requires permission to access the DescribeIndex action.
    */
  def describeIndex(): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]): Request[DescribeIndexResponse, AWSError] = js.native
  /**
    * Describes a search index. Requires permission to access the DescribeIndex action.
    */
  def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(
    params: DescribeIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]
  ): Request[DescribeIndexResponse, AWSError] = js.native
  
  /**
    * Describes a job. Requires permission to access the DescribeJob action.
    */
  def describeJob(): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]): Request[DescribeJobResponse, AWSError] = js.native
  /**
    * Describes a job. Requires permission to access the DescribeJob action.
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]
  ): Request[DescribeJobResponse, AWSError] = js.native
  
  /**
    * Describes a job execution. Requires permission to access the DescribeJobExecution action.
    */
  def describeJobExecution(): Request[DescribeJobExecutionResponse, AWSError] = js.native
  def describeJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobExecutionResponse, Unit]): Request[DescribeJobExecutionResponse, AWSError] = js.native
  /**
    * Describes a job execution. Requires permission to access the DescribeJobExecution action.
    */
  def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse, AWSError] = js.native
  def describeJobExecution(
    params: DescribeJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobExecutionResponse, Unit]
  ): Request[DescribeJobExecutionResponse, AWSError] = js.native
  
  /**
    * Returns information about a job template.
    */
  def describeJobTemplate(): Request[DescribeJobTemplateResponse, AWSError] = js.native
  def describeJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobTemplateResponse, Unit]): Request[DescribeJobTemplateResponse, AWSError] = js.native
  /**
    * Returns information about a job template.
    */
  def describeJobTemplate(params: DescribeJobTemplateRequest): Request[DescribeJobTemplateResponse, AWSError] = js.native
  def describeJobTemplate(
    params: DescribeJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobTemplateResponse, Unit]
  ): Request[DescribeJobTemplateResponse, AWSError] = js.native
  
  /**
    * View details of a managed job template.
    */
  def describeManagedJobTemplate(): Request[DescribeManagedJobTemplateResponse, AWSError] = js.native
  def describeManagedJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedJobTemplateResponse, Unit]): Request[DescribeManagedJobTemplateResponse, AWSError] = js.native
  /**
    * View details of a managed job template.
    */
  def describeManagedJobTemplate(params: DescribeManagedJobTemplateRequest): Request[DescribeManagedJobTemplateResponse, AWSError] = js.native
  def describeManagedJobTemplate(
    params: DescribeManagedJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedJobTemplateResponse, Unit]
  ): Request[DescribeManagedJobTemplateResponse, AWSError] = js.native
  
  /**
    * Gets information about a mitigation action. Requires permission to access the DescribeMitigationAction action.
    */
  def describeMitigationAction(): Request[DescribeMitigationActionResponse, AWSError] = js.native
  def describeMitigationAction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMitigationActionResponse, Unit]): Request[DescribeMitigationActionResponse, AWSError] = js.native
  /**
    * Gets information about a mitigation action. Requires permission to access the DescribeMitigationAction action.
    */
  def describeMitigationAction(params: DescribeMitigationActionRequest): Request[DescribeMitigationActionResponse, AWSError] = js.native
  def describeMitigationAction(
    params: DescribeMitigationActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMitigationActionResponse, Unit]
  ): Request[DescribeMitigationActionResponse, AWSError] = js.native
  
  /**
    * Returns information about a provisioning template. Requires permission to access the DescribeProvisioningTemplate action.
    */
  def describeProvisioningTemplate(): Request[DescribeProvisioningTemplateResponse, AWSError] = js.native
  def describeProvisioningTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningTemplateResponse, Unit]): Request[DescribeProvisioningTemplateResponse, AWSError] = js.native
  /**
    * Returns information about a provisioning template. Requires permission to access the DescribeProvisioningTemplate action.
    */
  def describeProvisioningTemplate(params: DescribeProvisioningTemplateRequest): Request[DescribeProvisioningTemplateResponse, AWSError] = js.native
  def describeProvisioningTemplate(
    params: DescribeProvisioningTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningTemplateResponse, Unit]
  ): Request[DescribeProvisioningTemplateResponse, AWSError] = js.native
  
  /**
    * Returns information about a provisioning template version. Requires permission to access the DescribeProvisioningTemplateVersion action.
    */
  def describeProvisioningTemplateVersion(): Request[DescribeProvisioningTemplateVersionResponse, AWSError] = js.native
  def describeProvisioningTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningTemplateVersionResponse, Unit]
  ): Request[DescribeProvisioningTemplateVersionResponse, AWSError] = js.native
  /**
    * Returns information about a provisioning template version. Requires permission to access the DescribeProvisioningTemplateVersion action.
    */
  def describeProvisioningTemplateVersion(params: DescribeProvisioningTemplateVersionRequest): Request[DescribeProvisioningTemplateVersionResponse, AWSError] = js.native
  def describeProvisioningTemplateVersion(
    params: DescribeProvisioningTemplateVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningTemplateVersionResponse, Unit]
  ): Request[DescribeProvisioningTemplateVersionResponse, AWSError] = js.native
  
  /**
    * Describes a role alias. Requires permission to access the DescribeRoleAlias action.
    */
  def describeRoleAlias(): Request[DescribeRoleAliasResponse, AWSError] = js.native
  def describeRoleAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoleAliasResponse, Unit]): Request[DescribeRoleAliasResponse, AWSError] = js.native
  /**
    * Describes a role alias. Requires permission to access the DescribeRoleAlias action.
    */
  def describeRoleAlias(params: DescribeRoleAliasRequest): Request[DescribeRoleAliasResponse, AWSError] = js.native
  def describeRoleAlias(
    params: DescribeRoleAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoleAliasResponse, Unit]
  ): Request[DescribeRoleAliasResponse, AWSError] = js.native
  
  /**
    * Gets information about a scheduled audit. Requires permission to access the DescribeScheduledAudit action.
    */
  def describeScheduledAudit(): Request[DescribeScheduledAuditResponse, AWSError] = js.native
  def describeScheduledAudit(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledAuditResponse, Unit]): Request[DescribeScheduledAuditResponse, AWSError] = js.native
  /**
    * Gets information about a scheduled audit. Requires permission to access the DescribeScheduledAudit action.
    */
  def describeScheduledAudit(params: DescribeScheduledAuditRequest): Request[DescribeScheduledAuditResponse, AWSError] = js.native
  def describeScheduledAudit(
    params: DescribeScheduledAuditRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledAuditResponse, Unit]
  ): Request[DescribeScheduledAuditResponse, AWSError] = js.native
  
  /**
    * Gets information about a Device Defender security profile. Requires permission to access the DescribeSecurityProfile action.
    */
  def describeSecurityProfile(): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  def describeSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityProfileResponse, Unit]): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  /**
    * Gets information about a Device Defender security profile. Requires permission to access the DescribeSecurityProfile action.
    */
  def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  def describeSecurityProfile(
    params: DescribeSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityProfileResponse, Unit]
  ): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Gets information about a stream. Requires permission to access the DescribeStream action.
    */
  def describeStream(): Request[DescribeStreamResponse, AWSError] = js.native
  def describeStream(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamResponse, Unit]): Request[DescribeStreamResponse, AWSError] = js.native
  /**
    * Gets information about a stream. Requires permission to access the DescribeStream action.
    */
  def describeStream(params: DescribeStreamRequest): Request[DescribeStreamResponse, AWSError] = js.native
  def describeStream(
    params: DescribeStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamResponse, Unit]
  ): Request[DescribeStreamResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified thing. Requires permission to access the DescribeThing action.
    */
  def describeThing(): Request[DescribeThingResponse, AWSError] = js.native
  def describeThing(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingResponse, Unit]): Request[DescribeThingResponse, AWSError] = js.native
  /**
    * Gets information about the specified thing. Requires permission to access the DescribeThing action.
    */
  def describeThing(params: DescribeThingRequest): Request[DescribeThingResponse, AWSError] = js.native
  def describeThing(
    params: DescribeThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingResponse, Unit]
  ): Request[DescribeThingResponse, AWSError] = js.native
  
  /**
    * Describe a thing group. Requires permission to access the DescribeThingGroup action.
    */
  def describeThingGroup(): Request[DescribeThingGroupResponse, AWSError] = js.native
  def describeThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingGroupResponse, Unit]): Request[DescribeThingGroupResponse, AWSError] = js.native
  /**
    * Describe a thing group. Requires permission to access the DescribeThingGroup action.
    */
  def describeThingGroup(params: DescribeThingGroupRequest): Request[DescribeThingGroupResponse, AWSError] = js.native
  def describeThingGroup(
    params: DescribeThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingGroupResponse, Unit]
  ): Request[DescribeThingGroupResponse, AWSError] = js.native
  
  /**
    * Describes a bulk thing provisioning task. Requires permission to access the DescribeThingRegistrationTask action.
    */
  def describeThingRegistrationTask(): Request[DescribeThingRegistrationTaskResponse, AWSError] = js.native
  def describeThingRegistrationTask(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingRegistrationTaskResponse, Unit]): Request[DescribeThingRegistrationTaskResponse, AWSError] = js.native
  /**
    * Describes a bulk thing provisioning task. Requires permission to access the DescribeThingRegistrationTask action.
    */
  def describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest): Request[DescribeThingRegistrationTaskResponse, AWSError] = js.native
  def describeThingRegistrationTask(
    params: DescribeThingRegistrationTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingRegistrationTaskResponse, Unit]
  ): Request[DescribeThingRegistrationTaskResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified thing type. Requires permission to access the DescribeThingType action.
    */
  def describeThingType(): Request[DescribeThingTypeResponse, AWSError] = js.native
  def describeThingType(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingTypeResponse, Unit]): Request[DescribeThingTypeResponse, AWSError] = js.native
  /**
    * Gets information about the specified thing type. Requires permission to access the DescribeThingType action.
    */
  def describeThingType(params: DescribeThingTypeRequest): Request[DescribeThingTypeResponse, AWSError] = js.native
  def describeThingType(
    params: DescribeThingTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThingTypeResponse, Unit]
  ): Request[DescribeThingTypeResponse, AWSError] = js.native
  
  /**
    * Detaches a policy from the specified target.  Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is detached before it's ready to be deleted.  Requires permission to access the DetachPolicy action.
    */
  def detachPolicy(): Request[js.Object, AWSError] = js.native
  def detachPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a policy from the specified target.  Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is detached before it's ready to be deleted.  Requires permission to access the DetachPolicy action.
    */
  def detachPolicy(params: DetachPolicyRequest): Request[js.Object, AWSError] = js.native
  def detachPolicy(
    params: DetachPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified policy from the specified certificate.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use DetachPolicy instead. Requires permission to access the DetachPrincipalPolicy action.
    */
  def detachPrincipalPolicy(): Request[js.Object, AWSError] = js.native
  def detachPrincipalPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified policy from the specified certificate.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use DetachPolicy instead. Requires permission to access the DetachPrincipalPolicy action.
    */
  def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): Request[js.Object, AWSError] = js.native
  def detachPrincipalPolicy(
    params: DetachPrincipalPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates a Device Defender security profile from a thing group or from this account. Requires permission to access the DetachSecurityProfile action.
    */
  def detachSecurityProfile(): Request[DetachSecurityProfileResponse, AWSError] = js.native
  def detachSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ DetachSecurityProfileResponse, Unit]): Request[DetachSecurityProfileResponse, AWSError] = js.native
  /**
    * Disassociates a Device Defender security profile from a thing group or from this account. Requires permission to access the DetachSecurityProfile action.
    */
  def detachSecurityProfile(params: DetachSecurityProfileRequest): Request[DetachSecurityProfileResponse, AWSError] = js.native
  def detachSecurityProfile(
    params: DetachSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachSecurityProfileResponse, Unit]
  ): Request[DetachSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate.  Requires permission to access the DetachThingPrincipal action.
    */
  def detachThingPrincipal(): Request[DetachThingPrincipalResponse, AWSError] = js.native
  def detachThingPrincipal(callback: js.Function2[/* err */ AWSError, /* data */ DetachThingPrincipalResponse, Unit]): Request[DetachThingPrincipalResponse, AWSError] = js.native
  /**
    * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate.  Requires permission to access the DetachThingPrincipal action.
    */
  def detachThingPrincipal(params: DetachThingPrincipalRequest): Request[DetachThingPrincipalResponse, AWSError] = js.native
  def detachThingPrincipal(
    params: DetachThingPrincipalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachThingPrincipalResponse, Unit]
  ): Request[DetachThingPrincipalResponse, AWSError] = js.native
  
  /**
    * Disables the rule. Requires permission to access the DisableTopicRule action.
    */
  def disableTopicRule(): Request[js.Object, AWSError] = js.native
  def disableTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables the rule. Requires permission to access the DisableTopicRule action.
    */
  def disableTopicRule(params: DisableTopicRuleRequest): Request[js.Object, AWSError] = js.native
  def disableTopicRule(
    params: DisableTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables the rule. Requires permission to access the EnableTopicRule action.
    */
  def enableTopicRule(): Request[js.Object, AWSError] = js.native
  def enableTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables the rule. Requires permission to access the EnableTopicRule action.
    */
  def enableTopicRule(params: EnableTopicRuleRequest): Request[js.Object, AWSError] = js.native
  def enableTopicRule(
    params: EnableTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Returns a Device Defender's ML Detect Security Profile training model's status.  Requires permission to access the GetBehaviorModelTrainingSummaries action.
    */
  def getBehaviorModelTrainingSummaries(): Request[GetBehaviorModelTrainingSummariesResponse, AWSError] = js.native
  def getBehaviorModelTrainingSummaries(
    callback: js.Function2[/* err */ AWSError, /* data */ GetBehaviorModelTrainingSummariesResponse, Unit]
  ): Request[GetBehaviorModelTrainingSummariesResponse, AWSError] = js.native
  /**
    *  Returns a Device Defender's ML Detect Security Profile training model's status.  Requires permission to access the GetBehaviorModelTrainingSummaries action.
    */
  def getBehaviorModelTrainingSummaries(params: GetBehaviorModelTrainingSummariesRequest): Request[GetBehaviorModelTrainingSummariesResponse, AWSError] = js.native
  def getBehaviorModelTrainingSummaries(
    params: GetBehaviorModelTrainingSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBehaviorModelTrainingSummariesResponse, Unit]
  ): Request[GetBehaviorModelTrainingSummariesResponse, AWSError] = js.native
  
  /**
    * Aggregates on indexed data with search queries pertaining to particular fields.  Requires permission to access the GetBucketsAggregation action.
    */
  def getBucketsAggregation(): Request[GetBucketsAggregationResponse, AWSError] = js.native
  def getBucketsAggregation(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketsAggregationResponse, Unit]): Request[GetBucketsAggregationResponse, AWSError] = js.native
  /**
    * Aggregates on indexed data with search queries pertaining to particular fields.  Requires permission to access the GetBucketsAggregation action.
    */
  def getBucketsAggregation(params: GetBucketsAggregationRequest): Request[GetBucketsAggregationResponse, AWSError] = js.native
  def getBucketsAggregation(
    params: GetBucketsAggregationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketsAggregationResponse, Unit]
  ): Request[GetBucketsAggregationResponse, AWSError] = js.native
  
  /**
    * Returns the approximate count of unique values that match the query. Requires permission to access the GetCardinality action.
    */
  def getCardinality(): Request[GetCardinalityResponse, AWSError] = js.native
  def getCardinality(callback: js.Function2[/* err */ AWSError, /* data */ GetCardinalityResponse, Unit]): Request[GetCardinalityResponse, AWSError] = js.native
  /**
    * Returns the approximate count of unique values that match the query. Requires permission to access the GetCardinality action.
    */
  def getCardinality(params: GetCardinalityRequest): Request[GetCardinalityResponse, AWSError] = js.native
  def getCardinality(
    params: GetCardinalityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCardinalityResponse, Unit]
  ): Request[GetCardinalityResponse, AWSError] = js.native
  
  /**
    * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the IoT device gateway. Requires permission to access the GetEffectivePolicies action.
    */
  def getEffectivePolicies(): Request[GetEffectivePoliciesResponse, AWSError] = js.native
  def getEffectivePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePoliciesResponse, Unit]): Request[GetEffectivePoliciesResponse, AWSError] = js.native
  /**
    * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the IoT device gateway. Requires permission to access the GetEffectivePolicies action.
    */
  def getEffectivePolicies(params: GetEffectivePoliciesRequest): Request[GetEffectivePoliciesResponse, AWSError] = js.native
  def getEffectivePolicies(
    params: GetEffectivePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePoliciesResponse, Unit]
  ): Request[GetEffectivePoliciesResponse, AWSError] = js.native
  
  /**
    * Gets the indexing configuration. Requires permission to access the GetIndexingConfiguration action.
    */
  def getIndexingConfiguration(): Request[GetIndexingConfigurationResponse, AWSError] = js.native
  def getIndexingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetIndexingConfigurationResponse, Unit]): Request[GetIndexingConfigurationResponse, AWSError] = js.native
  /**
    * Gets the indexing configuration. Requires permission to access the GetIndexingConfiguration action.
    */
  def getIndexingConfiguration(params: GetIndexingConfigurationRequest): Request[GetIndexingConfigurationResponse, AWSError] = js.native
  def getIndexingConfiguration(
    params: GetIndexingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIndexingConfigurationResponse, Unit]
  ): Request[GetIndexingConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets a job document. Requires permission to access the GetJobDocument action.
    */
  def getJobDocument(): Request[GetJobDocumentResponse, AWSError] = js.native
  def getJobDocument(callback: js.Function2[/* err */ AWSError, /* data */ GetJobDocumentResponse, Unit]): Request[GetJobDocumentResponse, AWSError] = js.native
  /**
    * Gets a job document. Requires permission to access the GetJobDocument action.
    */
  def getJobDocument(params: GetJobDocumentRequest): Request[GetJobDocumentResponse, AWSError] = js.native
  def getJobDocument(
    params: GetJobDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobDocumentResponse, Unit]
  ): Request[GetJobDocumentResponse, AWSError] = js.native
  
  /**
    * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead. Requires permission to access the GetLoggingOptions action.
    */
  def getLoggingOptions(): Request[GetLoggingOptionsResponse, AWSError] = js.native
  def getLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingOptionsResponse, Unit]): Request[GetLoggingOptionsResponse, AWSError] = js.native
  /**
    * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead. Requires permission to access the GetLoggingOptions action.
    */
  def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse, AWSError] = js.native
  def getLoggingOptions(
    params: GetLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingOptionsResponse, Unit]
  ): Request[GetLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Gets an OTA update. Requires permission to access the GetOTAUpdate action.
    */
  def getOTAUpdate(): Request[GetOTAUpdateResponse, AWSError] = js.native
  def getOTAUpdate(callback: js.Function2[/* err */ AWSError, /* data */ GetOTAUpdateResponse, Unit]): Request[GetOTAUpdateResponse, AWSError] = js.native
  /**
    * Gets an OTA update. Requires permission to access the GetOTAUpdate action.
    */
  def getOTAUpdate(params: GetOTAUpdateRequest): Request[GetOTAUpdateResponse, AWSError] = js.native
  def getOTAUpdate(
    params: GetOTAUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOTAUpdateResponse, Unit]
  ): Request[GetOTAUpdateResponse, AWSError] = js.native
  
  /**
    * Groups the aggregated values that match the query into percentile groupings. The default percentile groupings are: 1,5,25,50,75,95,99, although you can specify your own when you call GetPercentiles. This function returns a value for each percentile group specified (or the default percentile groupings). The percentile group "1" contains the aggregated field value that occurs in approximately one percent of the values that match the query. The percentile group "5" contains the aggregated field value that occurs in approximately five percent of the values that match the query, and so on. The result is an approximation, the more values that match the query, the more accurate the percentile values. Requires permission to access the GetPercentiles action.
    */
  def getPercentiles(): Request[GetPercentilesResponse, AWSError] = js.native
  def getPercentiles(callback: js.Function2[/* err */ AWSError, /* data */ GetPercentilesResponse, Unit]): Request[GetPercentilesResponse, AWSError] = js.native
  /**
    * Groups the aggregated values that match the query into percentile groupings. The default percentile groupings are: 1,5,25,50,75,95,99, although you can specify your own when you call GetPercentiles. This function returns a value for each percentile group specified (or the default percentile groupings). The percentile group "1" contains the aggregated field value that occurs in approximately one percent of the values that match the query. The percentile group "5" contains the aggregated field value that occurs in approximately five percent of the values that match the query, and so on. The result is an approximation, the more values that match the query, the more accurate the percentile values. Requires permission to access the GetPercentiles action.
    */
  def getPercentiles(params: GetPercentilesRequest): Request[GetPercentilesResponse, AWSError] = js.native
  def getPercentiles(
    params: GetPercentilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPercentilesResponse, Unit]
  ): Request[GetPercentilesResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified policy with the policy document of the default version. Requires permission to access the GetPolicy action.
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Gets information about the specified policy with the policy document of the default version. Requires permission to access the GetPolicy action.
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified policy version. Requires permission to access the GetPolicyVersion action.
    */
  def getPolicyVersion(): Request[GetPolicyVersionResponse, AWSError] = js.native
  def getPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyVersionResponse, Unit]): Request[GetPolicyVersionResponse, AWSError] = js.native
  /**
    * Gets information about the specified policy version. Requires permission to access the GetPolicyVersion action.
    */
  def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse, AWSError] = js.native
  def getPolicyVersion(
    params: GetPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyVersionResponse, Unit]
  ): Request[GetPolicyVersionResponse, AWSError] = js.native
  
  /**
    * Gets a registration code used to register a CA certificate with IoT. Requires permission to access the GetRegistrationCode action.
    */
  def getRegistrationCode(): Request[GetRegistrationCodeResponse, AWSError] = js.native
  def getRegistrationCode(callback: js.Function2[/* err */ AWSError, /* data */ GetRegistrationCodeResponse, Unit]): Request[GetRegistrationCodeResponse, AWSError] = js.native
  /**
    * Gets a registration code used to register a CA certificate with IoT. Requires permission to access the GetRegistrationCode action.
    */
  def getRegistrationCode(params: GetRegistrationCodeRequest): Request[GetRegistrationCodeResponse, AWSError] = js.native
  def getRegistrationCode(
    params: GetRegistrationCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegistrationCodeResponse, Unit]
  ): Request[GetRegistrationCodeResponse, AWSError] = js.native
  
  /**
    * Returns the count, average, sum, minimum, maximum, sum of squares, variance, and standard deviation for the specified aggregated field. If the aggregation field is of type String, only the count statistic is returned. Requires permission to access the GetStatistics action.
    */
  def getStatistics(): Request[GetStatisticsResponse, AWSError] = js.native
  def getStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetStatisticsResponse, Unit]): Request[GetStatisticsResponse, AWSError] = js.native
  /**
    * Returns the count, average, sum, minimum, maximum, sum of squares, variance, and standard deviation for the specified aggregated field. If the aggregation field is of type String, only the count statistic is returned. Requires permission to access the GetStatistics action.
    */
  def getStatistics(params: GetStatisticsRequest): Request[GetStatisticsResponse, AWSError] = js.native
  def getStatistics(
    params: GetStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStatisticsResponse, Unit]
  ): Request[GetStatisticsResponse, AWSError] = js.native
  
  /**
    * Gets information about the rule. Requires permission to access the GetTopicRule action.
    */
  def getTopicRule(): Request[GetTopicRuleResponse, AWSError] = js.native
  def getTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ GetTopicRuleResponse, Unit]): Request[GetTopicRuleResponse, AWSError] = js.native
  /**
    * Gets information about the rule. Requires permission to access the GetTopicRule action.
    */
  def getTopicRule(params: GetTopicRuleRequest): Request[GetTopicRuleResponse, AWSError] = js.native
  def getTopicRule(
    params: GetTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTopicRuleResponse, Unit]
  ): Request[GetTopicRuleResponse, AWSError] = js.native
  
  /**
    * Gets information about a topic rule destination. Requires permission to access the GetTopicRuleDestination action.
    */
  def getTopicRuleDestination(): Request[GetTopicRuleDestinationResponse, AWSError] = js.native
  def getTopicRuleDestination(callback: js.Function2[/* err */ AWSError, /* data */ GetTopicRuleDestinationResponse, Unit]): Request[GetTopicRuleDestinationResponse, AWSError] = js.native
  /**
    * Gets information about a topic rule destination. Requires permission to access the GetTopicRuleDestination action.
    */
  def getTopicRuleDestination(params: GetTopicRuleDestinationRequest): Request[GetTopicRuleDestinationResponse, AWSError] = js.native
  def getTopicRuleDestination(
    params: GetTopicRuleDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTopicRuleDestinationResponse, Unit]
  ): Request[GetTopicRuleDestinationResponse, AWSError] = js.native
  
  /**
    * Gets the fine grained logging options. Requires permission to access the GetV2LoggingOptions action.
    */
  def getV2LoggingOptions(): Request[GetV2LoggingOptionsResponse, AWSError] = js.native
  def getV2LoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ GetV2LoggingOptionsResponse, Unit]): Request[GetV2LoggingOptionsResponse, AWSError] = js.native
  /**
    * Gets the fine grained logging options. Requires permission to access the GetV2LoggingOptions action.
    */
  def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): Request[GetV2LoggingOptionsResponse, AWSError] = js.native
  def getV2LoggingOptions(
    params: GetV2LoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetV2LoggingOptionsResponse, Unit]
  ): Request[GetV2LoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Lists the active violations for a given Device Defender security profile. Requires permission to access the ListActiveViolations action.
    */
  def listActiveViolations(): Request[ListActiveViolationsResponse, AWSError] = js.native
  def listActiveViolations(callback: js.Function2[/* err */ AWSError, /* data */ ListActiveViolationsResponse, Unit]): Request[ListActiveViolationsResponse, AWSError] = js.native
  /**
    * Lists the active violations for a given Device Defender security profile. Requires permission to access the ListActiveViolations action.
    */
  def listActiveViolations(params: ListActiveViolationsRequest): Request[ListActiveViolationsResponse, AWSError] = js.native
  def listActiveViolations(
    params: ListActiveViolationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActiveViolationsResponse, Unit]
  ): Request[ListActiveViolationsResponse, AWSError] = js.native
  
  /**
    * Lists the policies attached to the specified thing group. Requires permission to access the ListAttachedPolicies action.
    */
  def listAttachedPolicies(): Request[ListAttachedPoliciesResponse, AWSError] = js.native
  def listAttachedPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedPoliciesResponse, Unit]): Request[ListAttachedPoliciesResponse, AWSError] = js.native
  /**
    * Lists the policies attached to the specified thing group. Requires permission to access the ListAttachedPolicies action.
    */
  def listAttachedPolicies(params: ListAttachedPoliciesRequest): Request[ListAttachedPoliciesResponse, AWSError] = js.native
  def listAttachedPolicies(
    params: ListAttachedPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedPoliciesResponse, Unit]
  ): Request[ListAttachedPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 90 days.) Requires permission to access the ListAuditFindings action.
    */
  def listAuditFindings(): Request[ListAuditFindingsResponse, AWSError] = js.native
  def listAuditFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListAuditFindingsResponse, Unit]): Request[ListAuditFindingsResponse, AWSError] = js.native
  /**
    * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 90 days.) Requires permission to access the ListAuditFindings action.
    */
  def listAuditFindings(params: ListAuditFindingsRequest): Request[ListAuditFindingsResponse, AWSError] = js.native
  def listAuditFindings(
    params: ListAuditFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditFindingsResponse, Unit]
  ): Request[ListAuditFindingsResponse, AWSError] = js.native
  
  /**
    * Gets the status of audit mitigation action tasks that were executed. Requires permission to access the ListAuditMitigationActionsExecutions action.
    */
  def listAuditMitigationActionsExecutions(): Request[ListAuditMitigationActionsExecutionsResponse, AWSError] = js.native
  def listAuditMitigationActionsExecutions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditMitigationActionsExecutionsResponse, Unit]
  ): Request[ListAuditMitigationActionsExecutionsResponse, AWSError] = js.native
  /**
    * Gets the status of audit mitigation action tasks that were executed. Requires permission to access the ListAuditMitigationActionsExecutions action.
    */
  def listAuditMitigationActionsExecutions(params: ListAuditMitigationActionsExecutionsRequest): Request[ListAuditMitigationActionsExecutionsResponse, AWSError] = js.native
  def listAuditMitigationActionsExecutions(
    params: ListAuditMitigationActionsExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditMitigationActionsExecutionsResponse, Unit]
  ): Request[ListAuditMitigationActionsExecutionsResponse, AWSError] = js.native
  
  /**
    * Gets a list of audit mitigation action tasks that match the specified filters. Requires permission to access the ListAuditMitigationActionsTasks action.
    */
  def listAuditMitigationActionsTasks(): Request[ListAuditMitigationActionsTasksResponse, AWSError] = js.native
  def listAuditMitigationActionsTasks(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditMitigationActionsTasksResponse, Unit]
  ): Request[ListAuditMitigationActionsTasksResponse, AWSError] = js.native
  /**
    * Gets a list of audit mitigation action tasks that match the specified filters. Requires permission to access the ListAuditMitigationActionsTasks action.
    */
  def listAuditMitigationActionsTasks(params: ListAuditMitigationActionsTasksRequest): Request[ListAuditMitigationActionsTasksResponse, AWSError] = js.native
  def listAuditMitigationActionsTasks(
    params: ListAuditMitigationActionsTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditMitigationActionsTasksResponse, Unit]
  ): Request[ListAuditMitigationActionsTasksResponse, AWSError] = js.native
  
  /**
    *  Lists your Device Defender audit listings.  Requires permission to access the ListAuditSuppressions action.
    */
  def listAuditSuppressions(): Request[ListAuditSuppressionsResponse, AWSError] = js.native
  def listAuditSuppressions(callback: js.Function2[/* err */ AWSError, /* data */ ListAuditSuppressionsResponse, Unit]): Request[ListAuditSuppressionsResponse, AWSError] = js.native
  /**
    *  Lists your Device Defender audit listings.  Requires permission to access the ListAuditSuppressions action.
    */
  def listAuditSuppressions(params: ListAuditSuppressionsRequest): Request[ListAuditSuppressionsResponse, AWSError] = js.native
  def listAuditSuppressions(
    params: ListAuditSuppressionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditSuppressionsResponse, Unit]
  ): Request[ListAuditSuppressionsResponse, AWSError] = js.native
  
  /**
    * Lists the Device Defender audits that have been performed during a given time period. Requires permission to access the ListAuditTasks action.
    */
  def listAuditTasks(): Request[ListAuditTasksResponse, AWSError] = js.native
  def listAuditTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListAuditTasksResponse, Unit]): Request[ListAuditTasksResponse, AWSError] = js.native
  /**
    * Lists the Device Defender audits that have been performed during a given time period. Requires permission to access the ListAuditTasks action.
    */
  def listAuditTasks(params: ListAuditTasksRequest): Request[ListAuditTasksResponse, AWSError] = js.native
  def listAuditTasks(
    params: ListAuditTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuditTasksResponse, Unit]
  ): Request[ListAuditTasksResponse, AWSError] = js.native
  
  /**
    * Lists the authorizers registered in your account. Requires permission to access the ListAuthorizers action.
    */
  def listAuthorizers(): Request[ListAuthorizersResponse, AWSError] = js.native
  def listAuthorizers(callback: js.Function2[/* err */ AWSError, /* data */ ListAuthorizersResponse, Unit]): Request[ListAuthorizersResponse, AWSError] = js.native
  /**
    * Lists the authorizers registered in your account. Requires permission to access the ListAuthorizers action.
    */
  def listAuthorizers(params: ListAuthorizersRequest): Request[ListAuthorizersResponse, AWSError] = js.native
  def listAuthorizers(
    params: ListAuthorizersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAuthorizersResponse, Unit]
  ): Request[ListAuthorizersResponse, AWSError] = js.native
  
  /**
    * Lists the billing groups you have created. Requires permission to access the ListBillingGroups action.
    */
  def listBillingGroups(): Request[ListBillingGroupsResponse, AWSError] = js.native
  def listBillingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupsResponse, Unit]): Request[ListBillingGroupsResponse, AWSError] = js.native
  /**
    * Lists the billing groups you have created. Requires permission to access the ListBillingGroups action.
    */
  def listBillingGroups(params: ListBillingGroupsRequest): Request[ListBillingGroupsResponse, AWSError] = js.native
  def listBillingGroups(
    params: ListBillingGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupsResponse, Unit]
  ): Request[ListBillingGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the CA certificates registered for your Amazon Web Services account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results. Requires permission to access the ListCACertificates action.
    */
  def listCACertificates(): Request[ListCACertificatesResponse, AWSError] = js.native
  def listCACertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListCACertificatesResponse, Unit]): Request[ListCACertificatesResponse, AWSError] = js.native
  /**
    * Lists the CA certificates registered for your Amazon Web Services account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results. Requires permission to access the ListCACertificates action.
    */
  def listCACertificates(params: ListCACertificatesRequest): Request[ListCACertificatesResponse, AWSError] = js.native
  def listCACertificates(
    params: ListCACertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCACertificatesResponse, Unit]
  ): Request[ListCACertificatesResponse, AWSError] = js.native
  
  /**
    * Lists the certificates registered in your Amazon Web Services account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results. Requires permission to access the ListCertificates action.
    */
  def listCertificates(): Request[ListCertificatesResponse, AWSError] = js.native
  def listCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResponse, Unit]): Request[ListCertificatesResponse, AWSError] = js.native
  /**
    * Lists the certificates registered in your Amazon Web Services account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results. Requires permission to access the ListCertificates action.
    */
  def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse, AWSError] = js.native
  def listCertificates(
    params: ListCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResponse, Unit]
  ): Request[ListCertificatesResponse, AWSError] = js.native
  
  /**
    * List the device certificates signed by the specified CA certificate. Requires permission to access the ListCertificatesByCA action.
    */
  def listCertificatesByCA(): Request[ListCertificatesByCAResponse, AWSError] = js.native
  def listCertificatesByCA(callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesByCAResponse, Unit]): Request[ListCertificatesByCAResponse, AWSError] = js.native
  /**
    * List the device certificates signed by the specified CA certificate. Requires permission to access the ListCertificatesByCA action.
    */
  def listCertificatesByCA(params: ListCertificatesByCARequest): Request[ListCertificatesByCAResponse, AWSError] = js.native
  def listCertificatesByCA(
    params: ListCertificatesByCARequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesByCAResponse, Unit]
  ): Request[ListCertificatesByCAResponse, AWSError] = js.native
  
  /**
    *  Lists your Device Defender detect custom metrics.  Requires permission to access the ListCustomMetrics action.
    */
  def listCustomMetrics(): Request[ListCustomMetricsResponse, AWSError] = js.native
  def listCustomMetrics(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomMetricsResponse, Unit]): Request[ListCustomMetricsResponse, AWSError] = js.native
  /**
    *  Lists your Device Defender detect custom metrics.  Requires permission to access the ListCustomMetrics action.
    */
  def listCustomMetrics(params: ListCustomMetricsRequest): Request[ListCustomMetricsResponse, AWSError] = js.native
  def listCustomMetrics(
    params: ListCustomMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomMetricsResponse, Unit]
  ): Request[ListCustomMetricsResponse, AWSError] = js.native
  
  /**
    *  Lists mitigation actions executions for a Device Defender ML Detect Security Profile.  Requires permission to access the ListDetectMitigationActionsExecutions action.
    */
  def listDetectMitigationActionsExecutions(): Request[ListDetectMitigationActionsExecutionsResponse, AWSError] = js.native
  def listDetectMitigationActionsExecutions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectMitigationActionsExecutionsResponse, Unit]
  ): Request[ListDetectMitigationActionsExecutionsResponse, AWSError] = js.native
  /**
    *  Lists mitigation actions executions for a Device Defender ML Detect Security Profile.  Requires permission to access the ListDetectMitigationActionsExecutions action.
    */
  def listDetectMitigationActionsExecutions(params: ListDetectMitigationActionsExecutionsRequest): Request[ListDetectMitigationActionsExecutionsResponse, AWSError] = js.native
  def listDetectMitigationActionsExecutions(
    params: ListDetectMitigationActionsExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectMitigationActionsExecutionsResponse, Unit]
  ): Request[ListDetectMitigationActionsExecutionsResponse, AWSError] = js.native
  
  /**
    *  List of Device Defender ML Detect mitigation actions tasks.  Requires permission to access the ListDetectMitigationActionsTasks action.
    */
  def listDetectMitigationActionsTasks(): Request[ListDetectMitigationActionsTasksResponse, AWSError] = js.native
  def listDetectMitigationActionsTasks(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectMitigationActionsTasksResponse, Unit]
  ): Request[ListDetectMitigationActionsTasksResponse, AWSError] = js.native
  /**
    *  List of Device Defender ML Detect mitigation actions tasks.  Requires permission to access the ListDetectMitigationActionsTasks action.
    */
  def listDetectMitigationActionsTasks(params: ListDetectMitigationActionsTasksRequest): Request[ListDetectMitigationActionsTasksResponse, AWSError] = js.native
  def listDetectMitigationActionsTasks(
    params: ListDetectMitigationActionsTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectMitigationActionsTasksResponse, Unit]
  ): Request[ListDetectMitigationActionsTasksResponse, AWSError] = js.native
  
  /**
    * List the set of dimensions that are defined for your Amazon Web Services accounts. Requires permission to access the ListDimensions action.
    */
  def listDimensions(): Request[ListDimensionsResponse, AWSError] = js.native
  def listDimensions(callback: js.Function2[/* err */ AWSError, /* data */ ListDimensionsResponse, Unit]): Request[ListDimensionsResponse, AWSError] = js.native
  /**
    * List the set of dimensions that are defined for your Amazon Web Services accounts. Requires permission to access the ListDimensions action.
    */
  def listDimensions(params: ListDimensionsRequest): Request[ListDimensionsResponse, AWSError] = js.native
  def listDimensions(
    params: ListDimensionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDimensionsResponse, Unit]
  ): Request[ListDimensionsResponse, AWSError] = js.native
  
  /**
    * Gets a list of domain configurations for the user. This list is sorted alphabetically by domain configuration name. Requires permission to access the ListDomainConfigurations action.
    */
  def listDomainConfigurations(): Request[ListDomainConfigurationsResponse, AWSError] = js.native
  def listDomainConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainConfigurationsResponse, Unit]): Request[ListDomainConfigurationsResponse, AWSError] = js.native
  /**
    * Gets a list of domain configurations for the user. This list is sorted alphabetically by domain configuration name. Requires permission to access the ListDomainConfigurations action.
    */
  def listDomainConfigurations(params: ListDomainConfigurationsRequest): Request[ListDomainConfigurationsResponse, AWSError] = js.native
  def listDomainConfigurations(
    params: ListDomainConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainConfigurationsResponse, Unit]
  ): Request[ListDomainConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists all your fleet metrics.  Requires permission to access the ListFleetMetrics action.
    */
  def listFleetMetrics(): Request[ListFleetMetricsResponse, AWSError] = js.native
  def listFleetMetrics(callback: js.Function2[/* err */ AWSError, /* data */ ListFleetMetricsResponse, Unit]): Request[ListFleetMetricsResponse, AWSError] = js.native
  /**
    * Lists all your fleet metrics.  Requires permission to access the ListFleetMetrics action.
    */
  def listFleetMetrics(params: ListFleetMetricsRequest): Request[ListFleetMetricsResponse, AWSError] = js.native
  def listFleetMetrics(
    params: ListFleetMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFleetMetricsResponse, Unit]
  ): Request[ListFleetMetricsResponse, AWSError] = js.native
  
  /**
    * Lists the search indices. Requires permission to access the ListIndices action.
    */
  def listIndices(): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]): Request[ListIndicesResponse, AWSError] = js.native
  /**
    * Lists the search indices. Requires permission to access the ListIndices action.
    */
  def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(
    params: ListIndicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]
  ): Request[ListIndicesResponse, AWSError] = js.native
  
  /**
    * Lists the job executions for a job. Requires permission to access the ListJobExecutionsForJob action.
    */
  def listJobExecutionsForJob(): Request[ListJobExecutionsForJobResponse, AWSError] = js.native
  def listJobExecutionsForJob(callback: js.Function2[/* err */ AWSError, /* data */ ListJobExecutionsForJobResponse, Unit]): Request[ListJobExecutionsForJobResponse, AWSError] = js.native
  /**
    * Lists the job executions for a job. Requires permission to access the ListJobExecutionsForJob action.
    */
  def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): Request[ListJobExecutionsForJobResponse, AWSError] = js.native
  def listJobExecutionsForJob(
    params: ListJobExecutionsForJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobExecutionsForJobResponse, Unit]
  ): Request[ListJobExecutionsForJobResponse, AWSError] = js.native
  
  /**
    * Lists the job executions for the specified thing. Requires permission to access the ListJobExecutionsForThing action.
    */
  def listJobExecutionsForThing(): Request[ListJobExecutionsForThingResponse, AWSError] = js.native
  def listJobExecutionsForThing(callback: js.Function2[/* err */ AWSError, /* data */ ListJobExecutionsForThingResponse, Unit]): Request[ListJobExecutionsForThingResponse, AWSError] = js.native
  /**
    * Lists the job executions for the specified thing. Requires permission to access the ListJobExecutionsForThing action.
    */
  def listJobExecutionsForThing(params: ListJobExecutionsForThingRequest): Request[ListJobExecutionsForThingResponse, AWSError] = js.native
  def listJobExecutionsForThing(
    params: ListJobExecutionsForThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobExecutionsForThingResponse, Unit]
  ): Request[ListJobExecutionsForThingResponse, AWSError] = js.native
  
  /**
    * Returns a list of job templates. Requires permission to access the ListJobTemplates action.
    */
  def listJobTemplates(): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]): Request[ListJobTemplatesResponse, AWSError] = js.native
  /**
    * Returns a list of job templates. Requires permission to access the ListJobTemplates action.
    */
  def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(
    params: ListJobTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]
  ): Request[ListJobTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists jobs. Requires permission to access the ListJobs action.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Lists jobs. Requires permission to access the ListJobs action.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of managed job templates.
    */
  def listManagedJobTemplates(): Request[ListManagedJobTemplatesResponse, AWSError] = js.native
  def listManagedJobTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListManagedJobTemplatesResponse, Unit]): Request[ListManagedJobTemplatesResponse, AWSError] = js.native
  /**
    * Returns a list of managed job templates.
    */
  def listManagedJobTemplates(params: ListManagedJobTemplatesRequest): Request[ListManagedJobTemplatesResponse, AWSError] = js.native
  def listManagedJobTemplates(
    params: ListManagedJobTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedJobTemplatesResponse, Unit]
  ): Request[ListManagedJobTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists the values reported for an IoT Device Defender metric (device-side metric, cloud-side metric, or custom metric) by the given thing during the specified time period.
    */
  def listMetricValues(): Request[ListMetricValuesResponse, AWSError] = js.native
  def listMetricValues(callback: js.Function2[/* err */ AWSError, /* data */ ListMetricValuesResponse, Unit]): Request[ListMetricValuesResponse, AWSError] = js.native
  /**
    * Lists the values reported for an IoT Device Defender metric (device-side metric, cloud-side metric, or custom metric) by the given thing during the specified time period.
    */
  def listMetricValues(params: ListMetricValuesRequest): Request[ListMetricValuesResponse, AWSError] = js.native
  def listMetricValues(
    params: ListMetricValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMetricValuesResponse, Unit]
  ): Request[ListMetricValuesResponse, AWSError] = js.native
  
  /**
    * Gets a list of all mitigation actions that match the specified filter criteria. Requires permission to access the ListMitigationActions action.
    */
  def listMitigationActions(): Request[ListMitigationActionsResponse, AWSError] = js.native
  def listMitigationActions(callback: js.Function2[/* err */ AWSError, /* data */ ListMitigationActionsResponse, Unit]): Request[ListMitigationActionsResponse, AWSError] = js.native
  /**
    * Gets a list of all mitigation actions that match the specified filter criteria. Requires permission to access the ListMitigationActions action.
    */
  def listMitigationActions(params: ListMitigationActionsRequest): Request[ListMitigationActionsResponse, AWSError] = js.native
  def listMitigationActions(
    params: ListMitigationActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMitigationActionsResponse, Unit]
  ): Request[ListMitigationActionsResponse, AWSError] = js.native
  
  /**
    * Lists OTA updates. Requires permission to access the ListOTAUpdates action.
    */
  def listOTAUpdates(): Request[ListOTAUpdatesResponse, AWSError] = js.native
  def listOTAUpdates(callback: js.Function2[/* err */ AWSError, /* data */ ListOTAUpdatesResponse, Unit]): Request[ListOTAUpdatesResponse, AWSError] = js.native
  /**
    * Lists OTA updates. Requires permission to access the ListOTAUpdates action.
    */
  def listOTAUpdates(params: ListOTAUpdatesRequest): Request[ListOTAUpdatesResponse, AWSError] = js.native
  def listOTAUpdates(
    params: ListOTAUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOTAUpdatesResponse, Unit]
  ): Request[ListOTAUpdatesResponse, AWSError] = js.native
  
  /**
    * Lists certificates that are being transferred but not yet accepted. Requires permission to access the ListOutgoingCertificates action.
    */
  def listOutgoingCertificates(): Request[ListOutgoingCertificatesResponse, AWSError] = js.native
  def listOutgoingCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListOutgoingCertificatesResponse, Unit]): Request[ListOutgoingCertificatesResponse, AWSError] = js.native
  /**
    * Lists certificates that are being transferred but not yet accepted. Requires permission to access the ListOutgoingCertificates action.
    */
  def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): Request[ListOutgoingCertificatesResponse, AWSError] = js.native
  def listOutgoingCertificates(
    params: ListOutgoingCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOutgoingCertificatesResponse, Unit]
  ): Request[ListOutgoingCertificatesResponse, AWSError] = js.native
  
  /**
    * Lists your policies. Requires permission to access the ListPolicies action.
    */
  def listPolicies(): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]): Request[ListPoliciesResponse, AWSError] = js.native
  /**
    * Lists your policies. Requires permission to access the ListPolicies action.
    */
  def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]
  ): Request[ListPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the principals associated with the specified policy.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use ListTargetsForPolicy instead. Requires permission to access the ListPolicyPrincipals action.
    */
  def listPolicyPrincipals(): Request[ListPolicyPrincipalsResponse, AWSError] = js.native
  def listPolicyPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyPrincipalsResponse, Unit]): Request[ListPolicyPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals associated with the specified policy.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use ListTargetsForPolicy instead. Requires permission to access the ListPolicyPrincipals action.
    */
  def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): Request[ListPolicyPrincipalsResponse, AWSError] = js.native
  def listPolicyPrincipals(
    params: ListPolicyPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyPrincipalsResponse, Unit]
  ): Request[ListPolicyPrincipalsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of the specified policy and identifies the default version. Requires permission to access the ListPolicyVersions action.
    */
  def listPolicyVersions(): Request[ListPolicyVersionsResponse, AWSError] = js.native
  def listPolicyVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyVersionsResponse, Unit]): Request[ListPolicyVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of the specified policy and identifies the default version. Requires permission to access the ListPolicyVersions action.
    */
  def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse, AWSError] = js.native
  def listPolicyVersions(
    params: ListPolicyVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyVersionsResponse, Unit]
  ): Request[ListPolicyVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use ListAttachedPolicies instead. Requires permission to access the ListPrincipalPolicies action.
    */
  def listPrincipalPolicies(): Request[ListPrincipalPoliciesResponse, AWSError] = js.native
  def listPrincipalPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalPoliciesResponse, Unit]): Request[ListPrincipalPoliciesResponse, AWSError] = js.native
  /**
    * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This action is deprecated and works as expected for backward compatibility, but we won't add enhancements. Use ListAttachedPolicies instead. Requires permission to access the ListPrincipalPolicies action.
    */
  def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): Request[ListPrincipalPoliciesResponse, AWSError] = js.native
  def listPrincipalPolicies(
    params: ListPrincipalPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalPoliciesResponse, Unit]
  ): Request[ListPrincipalPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  Requires permission to access the ListPrincipalThings action.
    */
  def listPrincipalThings(): Request[ListPrincipalThingsResponse, AWSError] = js.native
  def listPrincipalThings(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalThingsResponse, Unit]): Request[ListPrincipalThingsResponse, AWSError] = js.native
  /**
    * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  Requires permission to access the ListPrincipalThings action.
    */
  def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse, AWSError] = js.native
  def listPrincipalThings(
    params: ListPrincipalThingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalThingsResponse, Unit]
  ): Request[ListPrincipalThingsResponse, AWSError] = js.native
  
  /**
    * A list of provisioning template versions. Requires permission to access the ListProvisioningTemplateVersions action.
    */
  def listProvisioningTemplateVersions(): Request[ListProvisioningTemplateVersionsResponse, AWSError] = js.native
  def listProvisioningTemplateVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningTemplateVersionsResponse, Unit]
  ): Request[ListProvisioningTemplateVersionsResponse, AWSError] = js.native
  /**
    * A list of provisioning template versions. Requires permission to access the ListProvisioningTemplateVersions action.
    */
  def listProvisioningTemplateVersions(params: ListProvisioningTemplateVersionsRequest): Request[ListProvisioningTemplateVersionsResponse, AWSError] = js.native
  def listProvisioningTemplateVersions(
    params: ListProvisioningTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningTemplateVersionsResponse, Unit]
  ): Request[ListProvisioningTemplateVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the provisioning templates in your Amazon Web Services account. Requires permission to access the ListProvisioningTemplates action.
    */
  def listProvisioningTemplates(): Request[ListProvisioningTemplatesResponse, AWSError] = js.native
  def listProvisioningTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningTemplatesResponse, Unit]): Request[ListProvisioningTemplatesResponse, AWSError] = js.native
  /**
    * Lists the provisioning templates in your Amazon Web Services account. Requires permission to access the ListProvisioningTemplates action.
    */
  def listProvisioningTemplates(params: ListProvisioningTemplatesRequest): Request[ListProvisioningTemplatesResponse, AWSError] = js.native
  def listProvisioningTemplates(
    params: ListProvisioningTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningTemplatesResponse, Unit]
  ): Request[ListProvisioningTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists the role aliases registered in your account. Requires permission to access the ListRoleAliases action.
    */
  def listRoleAliases(): Request[ListRoleAliasesResponse, AWSError] = js.native
  def listRoleAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListRoleAliasesResponse, Unit]): Request[ListRoleAliasesResponse, AWSError] = js.native
  /**
    * Lists the role aliases registered in your account. Requires permission to access the ListRoleAliases action.
    */
  def listRoleAliases(params: ListRoleAliasesRequest): Request[ListRoleAliasesResponse, AWSError] = js.native
  def listRoleAliases(
    params: ListRoleAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoleAliasesResponse, Unit]
  ): Request[ListRoleAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all of your scheduled audits. Requires permission to access the ListScheduledAudits action.
    */
  def listScheduledAudits(): Request[ListScheduledAuditsResponse, AWSError] = js.native
  def listScheduledAudits(callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledAuditsResponse, Unit]): Request[ListScheduledAuditsResponse, AWSError] = js.native
  /**
    * Lists all of your scheduled audits. Requires permission to access the ListScheduledAudits action.
    */
  def listScheduledAudits(params: ListScheduledAuditsRequest): Request[ListScheduledAuditsResponse, AWSError] = js.native
  def listScheduledAudits(
    params: ListScheduledAuditsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledAuditsResponse, Unit]
  ): Request[ListScheduledAuditsResponse, AWSError] = js.native
  
  /**
    * Lists the Device Defender security profiles you've created. You can filter security profiles by dimension or custom metric. Requires permission to access the ListSecurityProfiles action.   dimensionName and metricName cannot be used in the same request. 
    */
  def listSecurityProfiles(): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, Unit]): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Lists the Device Defender security profiles you've created. You can filter security profiles by dimension or custom metric. Requires permission to access the ListSecurityProfiles action.   dimensionName and metricName cannot be used in the same request. 
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, Unit]
  ): Request[ListSecurityProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the Device Defender security profiles attached to a target (thing group). Requires permission to access the ListSecurityProfilesForTarget action.
    */
  def listSecurityProfilesForTarget(): Request[ListSecurityProfilesForTargetResponse, AWSError] = js.native
  def listSecurityProfilesForTarget(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesForTargetResponse, Unit]): Request[ListSecurityProfilesForTargetResponse, AWSError] = js.native
  /**
    * Lists the Device Defender security profiles attached to a target (thing group). Requires permission to access the ListSecurityProfilesForTarget action.
    */
  def listSecurityProfilesForTarget(params: ListSecurityProfilesForTargetRequest): Request[ListSecurityProfilesForTargetResponse, AWSError] = js.native
  def listSecurityProfilesForTarget(
    params: ListSecurityProfilesForTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesForTargetResponse, Unit]
  ): Request[ListSecurityProfilesForTargetResponse, AWSError] = js.native
  
  /**
    * Lists all of the streams in your Amazon Web Services account. Requires permission to access the ListStreams action.
    */
  def listStreams(): Request[ListStreamsResponse, AWSError] = js.native
  def listStreams(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsResponse, Unit]): Request[ListStreamsResponse, AWSError] = js.native
  /**
    * Lists all of the streams in your Amazon Web Services account. Requires permission to access the ListStreams action.
    */
  def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse, AWSError] = js.native
  def listStreams(
    params: ListStreamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsResponse, Unit]
  ): Request[ListStreamsResponse, AWSError] = js.native
  
  /**
    * Lists the tags (metadata) you have assigned to the resource. Requires permission to access the ListTagsForResource action.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource. Requires permission to access the ListTagsForResource action.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * List targets for the specified policy. Requires permission to access the ListTargetsForPolicy action.
    */
  def listTargetsForPolicy(): Request[ListTargetsForPolicyResponse, AWSError] = js.native
  def listTargetsForPolicy(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsForPolicyResponse, Unit]): Request[ListTargetsForPolicyResponse, AWSError] = js.native
  /**
    * List targets for the specified policy. Requires permission to access the ListTargetsForPolicy action.
    */
  def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse, AWSError] = js.native
  def listTargetsForPolicy(
    params: ListTargetsForPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsForPolicyResponse, Unit]
  ): Request[ListTargetsForPolicyResponse, AWSError] = js.native
  
  /**
    * Lists the targets (thing groups) associated with a given Device Defender security profile. Requires permission to access the ListTargetsForSecurityProfile action.
    */
  def listTargetsForSecurityProfile(): Request[ListTargetsForSecurityProfileResponse, AWSError] = js.native
  def listTargetsForSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsForSecurityProfileResponse, Unit]): Request[ListTargetsForSecurityProfileResponse, AWSError] = js.native
  /**
    * Lists the targets (thing groups) associated with a given Device Defender security profile. Requires permission to access the ListTargetsForSecurityProfile action.
    */
  def listTargetsForSecurityProfile(params: ListTargetsForSecurityProfileRequest): Request[ListTargetsForSecurityProfileResponse, AWSError] = js.native
  def listTargetsForSecurityProfile(
    params: ListTargetsForSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsForSecurityProfileResponse, Unit]
  ): Request[ListTargetsForSecurityProfileResponse, AWSError] = js.native
  
  /**
    * List the thing groups in your account. Requires permission to access the ListThingGroups action.
    */
  def listThingGroups(): Request[ListThingGroupsResponse, AWSError] = js.native
  def listThingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListThingGroupsResponse, Unit]): Request[ListThingGroupsResponse, AWSError] = js.native
  /**
    * List the thing groups in your account. Requires permission to access the ListThingGroups action.
    */
  def listThingGroups(params: ListThingGroupsRequest): Request[ListThingGroupsResponse, AWSError] = js.native
  def listThingGroups(
    params: ListThingGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingGroupsResponse, Unit]
  ): Request[ListThingGroupsResponse, AWSError] = js.native
  
  /**
    * List the thing groups to which the specified thing belongs. Requires permission to access the ListThingGroupsForThing action.
    */
  def listThingGroupsForThing(): Request[ListThingGroupsForThingResponse, AWSError] = js.native
  def listThingGroupsForThing(callback: js.Function2[/* err */ AWSError, /* data */ ListThingGroupsForThingResponse, Unit]): Request[ListThingGroupsForThingResponse, AWSError] = js.native
  /**
    * List the thing groups to which the specified thing belongs. Requires permission to access the ListThingGroupsForThing action.
    */
  def listThingGroupsForThing(params: ListThingGroupsForThingRequest): Request[ListThingGroupsForThingResponse, AWSError] = js.native
  def listThingGroupsForThing(
    params: ListThingGroupsForThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingGroupsForThingResponse, Unit]
  ): Request[ListThingGroupsForThingResponse, AWSError] = js.native
  
  /**
    * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. Requires permission to access the ListThingPrincipals action.
    */
  def listThingPrincipals(): Request[ListThingPrincipalsResponse, AWSError] = js.native
  def listThingPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListThingPrincipalsResponse, Unit]): Request[ListThingPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. Requires permission to access the ListThingPrincipals action.
    */
  def listThingPrincipals(params: ListThingPrincipalsRequest): Request[ListThingPrincipalsResponse, AWSError] = js.native
  def listThingPrincipals(
    params: ListThingPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingPrincipalsResponse, Unit]
  ): Request[ListThingPrincipalsResponse, AWSError] = js.native
  
  /**
    * Information about the thing registration tasks.
    */
  def listThingRegistrationTaskReports(): Request[ListThingRegistrationTaskReportsResponse, AWSError] = js.native
  def listThingRegistrationTaskReports(
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingRegistrationTaskReportsResponse, Unit]
  ): Request[ListThingRegistrationTaskReportsResponse, AWSError] = js.native
  /**
    * Information about the thing registration tasks.
    */
  def listThingRegistrationTaskReports(params: ListThingRegistrationTaskReportsRequest): Request[ListThingRegistrationTaskReportsResponse, AWSError] = js.native
  def listThingRegistrationTaskReports(
    params: ListThingRegistrationTaskReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingRegistrationTaskReportsResponse, Unit]
  ): Request[ListThingRegistrationTaskReportsResponse, AWSError] = js.native
  
  /**
    * List bulk thing provisioning tasks. Requires permission to access the ListThingRegistrationTasks action.
    */
  def listThingRegistrationTasks(): Request[ListThingRegistrationTasksResponse, AWSError] = js.native
  def listThingRegistrationTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListThingRegistrationTasksResponse, Unit]): Request[ListThingRegistrationTasksResponse, AWSError] = js.native
  /**
    * List bulk thing provisioning tasks. Requires permission to access the ListThingRegistrationTasks action.
    */
  def listThingRegistrationTasks(params: ListThingRegistrationTasksRequest): Request[ListThingRegistrationTasksResponse, AWSError] = js.native
  def listThingRegistrationTasks(
    params: ListThingRegistrationTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingRegistrationTasksResponse, Unit]
  ): Request[ListThingRegistrationTasksResponse, AWSError] = js.native
  
  /**
    * Lists the existing thing types. Requires permission to access the ListThingTypes action.
    */
  def listThingTypes(): Request[ListThingTypesResponse, AWSError] = js.native
  def listThingTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListThingTypesResponse, Unit]): Request[ListThingTypesResponse, AWSError] = js.native
  /**
    * Lists the existing thing types. Requires permission to access the ListThingTypes action.
    */
  def listThingTypes(params: ListThingTypesRequest): Request[ListThingTypesResponse, AWSError] = js.native
  def listThingTypes(
    params: ListThingTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingTypesResponse, Unit]
  ): Request[ListThingTypesResponse, AWSError] = js.native
  
  /**
    * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red.  Requires permission to access the ListThings action.  You will not be charged for calling this API if an Access denied error is returned. You will also not be charged if no attributes or pagination token was provided in request and no pagination token and no results were returned. 
    */
  def listThings(): Request[ListThingsResponse, AWSError] = js.native
  def listThings(callback: js.Function2[/* err */ AWSError, /* data */ ListThingsResponse, Unit]): Request[ListThingsResponse, AWSError] = js.native
  /**
    * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red.  Requires permission to access the ListThings action.  You will not be charged for calling this API if an Access denied error is returned. You will also not be charged if no attributes or pagination token was provided in request and no pagination token and no results were returned. 
    */
  def listThings(params: ListThingsRequest): Request[ListThingsResponse, AWSError] = js.native
  def listThings(
    params: ListThingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingsResponse, Unit]
  ): Request[ListThingsResponse, AWSError] = js.native
  
  /**
    * Lists the things you have added to the given billing group. Requires permission to access the ListThingsInBillingGroup action.
    */
  def listThingsInBillingGroup(): Request[ListThingsInBillingGroupResponse, AWSError] = js.native
  def listThingsInBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListThingsInBillingGroupResponse, Unit]): Request[ListThingsInBillingGroupResponse, AWSError] = js.native
  /**
    * Lists the things you have added to the given billing group. Requires permission to access the ListThingsInBillingGroup action.
    */
  def listThingsInBillingGroup(params: ListThingsInBillingGroupRequest): Request[ListThingsInBillingGroupResponse, AWSError] = js.native
  def listThingsInBillingGroup(
    params: ListThingsInBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingsInBillingGroupResponse, Unit]
  ): Request[ListThingsInBillingGroupResponse, AWSError] = js.native
  
  /**
    * Lists the things in the specified group. Requires permission to access the ListThingsInThingGroup action.
    */
  def listThingsInThingGroup(): Request[ListThingsInThingGroupResponse, AWSError] = js.native
  def listThingsInThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListThingsInThingGroupResponse, Unit]): Request[ListThingsInThingGroupResponse, AWSError] = js.native
  /**
    * Lists the things in the specified group. Requires permission to access the ListThingsInThingGroup action.
    */
  def listThingsInThingGroup(params: ListThingsInThingGroupRequest): Request[ListThingsInThingGroupResponse, AWSError] = js.native
  def listThingsInThingGroup(
    params: ListThingsInThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThingsInThingGroupResponse, Unit]
  ): Request[ListThingsInThingGroupResponse, AWSError] = js.native
  
  /**
    * Lists all the topic rule destinations in your Amazon Web Services account. Requires permission to access the ListTopicRuleDestinations action.
    */
  def listTopicRuleDestinations(): Request[ListTopicRuleDestinationsResponse, AWSError] = js.native
  def listTopicRuleDestinations(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRuleDestinationsResponse, Unit]): Request[ListTopicRuleDestinationsResponse, AWSError] = js.native
  /**
    * Lists all the topic rule destinations in your Amazon Web Services account. Requires permission to access the ListTopicRuleDestinations action.
    */
  def listTopicRuleDestinations(params: ListTopicRuleDestinationsRequest): Request[ListTopicRuleDestinationsResponse, AWSError] = js.native
  def listTopicRuleDestinations(
    params: ListTopicRuleDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRuleDestinationsResponse, Unit]
  ): Request[ListTopicRuleDestinationsResponse, AWSError] = js.native
  
  /**
    * Lists the rules for the specific topic. Requires permission to access the ListTopicRules action.
    */
  def listTopicRules(): Request[ListTopicRulesResponse, AWSError] = js.native
  def listTopicRules(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRulesResponse, Unit]): Request[ListTopicRulesResponse, AWSError] = js.native
  /**
    * Lists the rules for the specific topic. Requires permission to access the ListTopicRules action.
    */
  def listTopicRules(params: ListTopicRulesRequest): Request[ListTopicRulesResponse, AWSError] = js.native
  def listTopicRules(
    params: ListTopicRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRulesResponse, Unit]
  ): Request[ListTopicRulesResponse, AWSError] = js.native
  
  /**
    * Lists logging levels. Requires permission to access the ListV2LoggingLevels action.
    */
  def listV2LoggingLevels(): Request[ListV2LoggingLevelsResponse, AWSError] = js.native
  def listV2LoggingLevels(callback: js.Function2[/* err */ AWSError, /* data */ ListV2LoggingLevelsResponse, Unit]): Request[ListV2LoggingLevelsResponse, AWSError] = js.native
  /**
    * Lists logging levels. Requires permission to access the ListV2LoggingLevels action.
    */
  def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): Request[ListV2LoggingLevelsResponse, AWSError] = js.native
  def listV2LoggingLevels(
    params: ListV2LoggingLevelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListV2LoggingLevelsResponse, Unit]
  ): Request[ListV2LoggingLevelsResponse, AWSError] = js.native
  
  /**
    * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior, or thing (device). Requires permission to access the ListViolationEvents action.
    */
  def listViolationEvents(): Request[ListViolationEventsResponse, AWSError] = js.native
  def listViolationEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListViolationEventsResponse, Unit]): Request[ListViolationEventsResponse, AWSError] = js.native
  /**
    * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior, or thing (device). Requires permission to access the ListViolationEvents action.
    */
  def listViolationEvents(params: ListViolationEventsRequest): Request[ListViolationEventsResponse, AWSError] = js.native
  def listViolationEvents(
    params: ListViolationEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListViolationEventsResponse, Unit]
  ): Request[ListViolationEventsResponse, AWSError] = js.native
  
  /**
    * Set a verification state and provide a description of that verification state on a violation (detect alarm).
    */
  def putVerificationStateOnViolation(): Request[PutVerificationStateOnViolationResponse, AWSError] = js.native
  def putVerificationStateOnViolation(
    callback: js.Function2[/* err */ AWSError, /* data */ PutVerificationStateOnViolationResponse, Unit]
  ): Request[PutVerificationStateOnViolationResponse, AWSError] = js.native
  /**
    * Set a verification state and provide a description of that verification state on a violation (detect alarm).
    */
  def putVerificationStateOnViolation(params: PutVerificationStateOnViolationRequest): Request[PutVerificationStateOnViolationResponse, AWSError] = js.native
  def putVerificationStateOnViolation(
    params: PutVerificationStateOnViolationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVerificationStateOnViolationResponse, Unit]
  ): Request[PutVerificationStateOnViolationResponse, AWSError] = js.native
  
  /**
    * Registers a CA certificate with Amazon Web Services IoT Core. There is no limit to the number of CA certificates you can register in your Amazon Web Services account. You can register up to 10 CA certificates with the same CA subject field per Amazon Web Services account. Requires permission to access the RegisterCACertificate action.
    */
  def registerCACertificate(): Request[RegisterCACertificateResponse, AWSError] = js.native
  def registerCACertificate(callback: js.Function2[/* err */ AWSError, /* data */ RegisterCACertificateResponse, Unit]): Request[RegisterCACertificateResponse, AWSError] = js.native
  /**
    * Registers a CA certificate with Amazon Web Services IoT Core. There is no limit to the number of CA certificates you can register in your Amazon Web Services account. You can register up to 10 CA certificates with the same CA subject field per Amazon Web Services account. Requires permission to access the RegisterCACertificate action.
    */
  def registerCACertificate(params: RegisterCACertificateRequest): Request[RegisterCACertificateResponse, AWSError] = js.native
  def registerCACertificate(
    params: RegisterCACertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterCACertificateResponse, Unit]
  ): Request[RegisterCACertificateResponse, AWSError] = js.native
  
  /**
    * Registers a device certificate with IoT in the same certificate mode as the signing CA. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered. Requires permission to access the RegisterCertificate action.
    */
  def registerCertificate(): Request[RegisterCertificateResponse, AWSError] = js.native
  def registerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateResponse, Unit]): Request[RegisterCertificateResponse, AWSError] = js.native
  /**
    * Registers a device certificate with IoT in the same certificate mode as the signing CA. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered. Requires permission to access the RegisterCertificate action.
    */
  def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResponse, AWSError] = js.native
  def registerCertificate(
    params: RegisterCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateResponse, Unit]
  ): Request[RegisterCertificateResponse, AWSError] = js.native
  
  /**
    * Register a certificate that does not have a certificate authority (CA). For supported certificates, consult  Certificate signing algorithms supported by IoT. 
    */
  def registerCertificateWithoutCA(): Request[RegisterCertificateWithoutCAResponse, AWSError] = js.native
  def registerCertificateWithoutCA(callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateWithoutCAResponse, Unit]): Request[RegisterCertificateWithoutCAResponse, AWSError] = js.native
  /**
    * Register a certificate that does not have a certificate authority (CA). For supported certificates, consult  Certificate signing algorithms supported by IoT. 
    */
  def registerCertificateWithoutCA(params: RegisterCertificateWithoutCARequest): Request[RegisterCertificateWithoutCAResponse, AWSError] = js.native
  def registerCertificateWithoutCA(
    params: RegisterCertificateWithoutCARequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateWithoutCAResponse, Unit]
  ): Request[RegisterCertificateWithoutCAResponse, AWSError] = js.native
  
  /**
    * Provisions a thing in the device registry. RegisterThing calls other IoT control plane APIs. These calls might exceed your account level  IoT Throttling Limits and cause throttle errors. Please contact Amazon Web Services Customer Support to raise your throttling limits if necessary. Requires permission to access the RegisterThing action.
    */
  def registerThing(): Request[RegisterThingResponse, AWSError] = js.native
  def registerThing(callback: js.Function2[/* err */ AWSError, /* data */ RegisterThingResponse, Unit]): Request[RegisterThingResponse, AWSError] = js.native
  /**
    * Provisions a thing in the device registry. RegisterThing calls other IoT control plane APIs. These calls might exceed your account level  IoT Throttling Limits and cause throttle errors. Please contact Amazon Web Services Customer Support to raise your throttling limits if necessary. Requires permission to access the RegisterThing action.
    */
  def registerThing(params: RegisterThingRequest): Request[RegisterThingResponse, AWSError] = js.native
  def registerThing(
    params: RegisterThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterThingResponse, Unit]
  ): Request[RegisterThingResponse, AWSError] = js.native
  
  /**
    * Rejects a pending certificate transfer. After IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state. Requires permission to access the RejectCertificateTransfer action.
    */
  def rejectCertificateTransfer(): Request[js.Object, AWSError] = js.native
  def rejectCertificateTransfer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Rejects a pending certificate transfer. After IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state. Requires permission to access the RejectCertificateTransfer action.
    */
  def rejectCertificateTransfer(params: RejectCertificateTransferRequest): Request[js.Object, AWSError] = js.native
  def rejectCertificateTransfer(
    params: RejectCertificateTransferRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the given thing from the billing group. Requires permission to access the RemoveThingFromBillingGroup action.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
    */
  def removeThingFromBillingGroup(): Request[RemoveThingFromBillingGroupResponse, AWSError] = js.native
  def removeThingFromBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ RemoveThingFromBillingGroupResponse, Unit]): Request[RemoveThingFromBillingGroupResponse, AWSError] = js.native
  /**
    * Removes the given thing from the billing group. Requires permission to access the RemoveThingFromBillingGroup action.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
    */
  def removeThingFromBillingGroup(params: RemoveThingFromBillingGroupRequest): Request[RemoveThingFromBillingGroupResponse, AWSError] = js.native
  def removeThingFromBillingGroup(
    params: RemoveThingFromBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveThingFromBillingGroupResponse, Unit]
  ): Request[RemoveThingFromBillingGroupResponse, AWSError] = js.native
  
  /**
    * Remove the specified thing from the specified group. You must specify either a thingGroupArn or a thingGroupName to identify the thing group and either a thingArn or a thingName to identify the thing to remove from the thing group.  Requires permission to access the RemoveThingFromThingGroup action.
    */
  def removeThingFromThingGroup(): Request[RemoveThingFromThingGroupResponse, AWSError] = js.native
  def removeThingFromThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ RemoveThingFromThingGroupResponse, Unit]): Request[RemoveThingFromThingGroupResponse, AWSError] = js.native
  /**
    * Remove the specified thing from the specified group. You must specify either a thingGroupArn or a thingGroupName to identify the thing group and either a thingArn or a thingName to identify the thing to remove from the thing group.  Requires permission to access the RemoveThingFromThingGroup action.
    */
  def removeThingFromThingGroup(params: RemoveThingFromThingGroupRequest): Request[RemoveThingFromThingGroupResponse, AWSError] = js.native
  def removeThingFromThingGroup(
    params: RemoveThingFromThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveThingFromThingGroupResponse, Unit]
  ): Request[RemoveThingFromThingGroupResponse, AWSError] = js.native
  
  /**
    * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule. Requires permission to access the ReplaceTopicRule action.
    */
  def replaceTopicRule(): Request[js.Object, AWSError] = js.native
  def replaceTopicRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule. Requires permission to access the ReplaceTopicRule action.
    */
  def replaceTopicRule(params: ReplaceTopicRuleRequest): Request[js.Object, AWSError] = js.native
  def replaceTopicRule(
    params: ReplaceTopicRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * The query search index. Requires permission to access the SearchIndex action.
    */
  def searchIndex(): Request[SearchIndexResponse, AWSError] = js.native
  def searchIndex(callback: js.Function2[/* err */ AWSError, /* data */ SearchIndexResponse, Unit]): Request[SearchIndexResponse, AWSError] = js.native
  /**
    * The query search index. Requires permission to access the SearchIndex action.
    */
  def searchIndex(params: SearchIndexRequest): Request[SearchIndexResponse, AWSError] = js.native
  def searchIndex(
    params: SearchIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchIndexResponse, Unit]
  ): Request[SearchIndexResponse, AWSError] = js.native
  
  /**
    * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer. Requires permission to access the SetDefaultAuthorizer action.
    */
  def setDefaultAuthorizer(): Request[SetDefaultAuthorizerResponse, AWSError] = js.native
  def setDefaultAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultAuthorizerResponse, Unit]): Request[SetDefaultAuthorizerResponse, AWSError] = js.native
  /**
    * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer. Requires permission to access the SetDefaultAuthorizer action.
    */
  def setDefaultAuthorizer(params: SetDefaultAuthorizerRequest): Request[SetDefaultAuthorizerResponse, AWSError] = js.native
  def setDefaultAuthorizer(
    params: SetDefaultAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultAuthorizerResponse, Unit]
  ): Request[SetDefaultAuthorizerResponse, AWSError] = js.native
  
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicies action. Requires permission to access the SetDefaultPolicyVersion action.
    */
  def setDefaultPolicyVersion(): Request[js.Object, AWSError] = js.native
  def setDefaultPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicies action. Requires permission to access the SetDefaultPolicyVersion action.
    */
  def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object, AWSError] = js.native
  def setDefaultPolicyVersion(
    params: SetDefaultPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead. Requires permission to access the SetLoggingOptions action.
    */
  def setLoggingOptions(): Request[js.Object, AWSError] = js.native
  def setLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead. Requires permission to access the SetLoggingOptions action.
    */
  def setLoggingOptions(params: SetLoggingOptionsRequest): Request[js.Object, AWSError] = js.native
  def setLoggingOptions(
    params: SetLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the logging level. Requires permission to access the SetV2LoggingLevel action.
    */
  def setV2LoggingLevel(): Request[js.Object, AWSError] = js.native
  def setV2LoggingLevel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the logging level. Requires permission to access the SetV2LoggingLevel action.
    */
  def setV2LoggingLevel(params: SetV2LoggingLevelRequest): Request[js.Object, AWSError] = js.native
  def setV2LoggingLevel(
    params: SetV2LoggingLevelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the logging options for the V2 logging service. Requires permission to access the SetV2LoggingOptions action.
    */
  def setV2LoggingOptions(): Request[js.Object, AWSError] = js.native
  def setV2LoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the logging options for the V2 logging service. Requires permission to access the SetV2LoggingOptions action.
    */
  def setV2LoggingOptions(params: SetV2LoggingOptionsRequest): Request[js.Object, AWSError] = js.native
  def setV2LoggingOptions(
    params: SetV2LoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a task that applies a set of mitigation actions to the specified target. Requires permission to access the StartAuditMitigationActionsTask action.
    */
  def startAuditMitigationActionsTask(): Request[StartAuditMitigationActionsTaskResponse, AWSError] = js.native
  def startAuditMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ StartAuditMitigationActionsTaskResponse, Unit]
  ): Request[StartAuditMitigationActionsTaskResponse, AWSError] = js.native
  /**
    * Starts a task that applies a set of mitigation actions to the specified target. Requires permission to access the StartAuditMitigationActionsTask action.
    */
  def startAuditMitigationActionsTask(params: StartAuditMitigationActionsTaskRequest): Request[StartAuditMitigationActionsTaskResponse, AWSError] = js.native
  def startAuditMitigationActionsTask(
    params: StartAuditMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAuditMitigationActionsTaskResponse, Unit]
  ): Request[StartAuditMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    *  Starts a Device Defender ML Detect mitigation actions task.  Requires permission to access the StartDetectMitigationActionsTask action.
    */
  def startDetectMitigationActionsTask(): Request[StartDetectMitigationActionsTaskResponse, AWSError] = js.native
  def startDetectMitigationActionsTask(
    callback: js.Function2[/* err */ AWSError, /* data */ StartDetectMitigationActionsTaskResponse, Unit]
  ): Request[StartDetectMitigationActionsTaskResponse, AWSError] = js.native
  /**
    *  Starts a Device Defender ML Detect mitigation actions task.  Requires permission to access the StartDetectMitigationActionsTask action.
    */
  def startDetectMitigationActionsTask(params: StartDetectMitigationActionsTaskRequest): Request[StartDetectMitigationActionsTaskResponse, AWSError] = js.native
  def startDetectMitigationActionsTask(
    params: StartDetectMitigationActionsTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDetectMitigationActionsTaskResponse, Unit]
  ): Request[StartDetectMitigationActionsTaskResponse, AWSError] = js.native
  
  /**
    * Starts an on-demand Device Defender audit. Requires permission to access the StartOnDemandAuditTask action.
    */
  def startOnDemandAuditTask(): Request[StartOnDemandAuditTaskResponse, AWSError] = js.native
  def startOnDemandAuditTask(callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandAuditTaskResponse, Unit]): Request[StartOnDemandAuditTaskResponse, AWSError] = js.native
  /**
    * Starts an on-demand Device Defender audit. Requires permission to access the StartOnDemandAuditTask action.
    */
  def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): Request[StartOnDemandAuditTaskResponse, AWSError] = js.native
  def startOnDemandAuditTask(
    params: StartOnDemandAuditTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandAuditTaskResponse, Unit]
  ): Request[StartOnDemandAuditTaskResponse, AWSError] = js.native
  
  /**
    * Creates a bulk thing provisioning task. Requires permission to access the StartThingRegistrationTask action.
    */
  def startThingRegistrationTask(): Request[StartThingRegistrationTaskResponse, AWSError] = js.native
  def startThingRegistrationTask(callback: js.Function2[/* err */ AWSError, /* data */ StartThingRegistrationTaskResponse, Unit]): Request[StartThingRegistrationTaskResponse, AWSError] = js.native
  /**
    * Creates a bulk thing provisioning task. Requires permission to access the StartThingRegistrationTask action.
    */
  def startThingRegistrationTask(params: StartThingRegistrationTaskRequest): Request[StartThingRegistrationTaskResponse, AWSError] = js.native
  def startThingRegistrationTask(
    params: StartThingRegistrationTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartThingRegistrationTaskResponse, Unit]
  ): Request[StartThingRegistrationTaskResponse, AWSError] = js.native
  
  /**
    * Cancels a bulk thing provisioning task. Requires permission to access the StopThingRegistrationTask action.
    */
  def stopThingRegistrationTask(): Request[StopThingRegistrationTaskResponse, AWSError] = js.native
  def stopThingRegistrationTask(callback: js.Function2[/* err */ AWSError, /* data */ StopThingRegistrationTaskResponse, Unit]): Request[StopThingRegistrationTaskResponse, AWSError] = js.native
  /**
    * Cancels a bulk thing provisioning task. Requires permission to access the StopThingRegistrationTask action.
    */
  def stopThingRegistrationTask(params: StopThingRegistrationTaskRequest): Request[StopThingRegistrationTaskResponse, AWSError] = js.native
  def stopThingRegistrationTask(
    params: StopThingRegistrationTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopThingRegistrationTaskResponse, Unit]
  ): Request[StopThingRegistrationTaskResponse, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. Requires permission to access the TagResource action.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. Requires permission to access the TagResource action.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Tests if a specified principal is authorized to perform an IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the IoT device gateway. Requires permission to access the TestAuthorization action.
    */
  def testAuthorization(): Request[TestAuthorizationResponse, AWSError] = js.native
  def testAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ TestAuthorizationResponse, Unit]): Request[TestAuthorizationResponse, AWSError] = js.native
  /**
    * Tests if a specified principal is authorized to perform an IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the IoT device gateway. Requires permission to access the TestAuthorization action.
    */
  def testAuthorization(params: TestAuthorizationRequest): Request[TestAuthorizationResponse, AWSError] = js.native
  def testAuthorization(
    params: TestAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestAuthorizationResponse, Unit]
  ): Request[TestAuthorizationResponse, AWSError] = js.native
  
  /**
    * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the IoT device gateway. Requires permission to access the TestInvokeAuthorizer action.
    */
  def testInvokeAuthorizer(): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  def testInvokeAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeAuthorizerResponse, Unit]): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  /**
    * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the IoT device gateway. Requires permission to access the TestInvokeAuthorizer action.
    */
  def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  def testInvokeAuthorizer(
    params: TestInvokeAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeAuthorizerResponse, Unit]
  ): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  
  /**
    * Transfers the specified certificate to the specified Amazon Web Services account. Requires permission to access the TransferCertificate action. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate action to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPolicy action to detach them.
    */
  def transferCertificate(): Request[TransferCertificateResponse, AWSError] = js.native
  def transferCertificate(callback: js.Function2[/* err */ AWSError, /* data */ TransferCertificateResponse, Unit]): Request[TransferCertificateResponse, AWSError] = js.native
  /**
    * Transfers the specified certificate to the specified Amazon Web Services account. Requires permission to access the TransferCertificate action. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate action to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPolicy action to detach them.
    */
  def transferCertificate(params: TransferCertificateRequest): Request[TransferCertificateResponse, AWSError] = js.native
  def transferCertificate(
    params: TransferCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TransferCertificateResponse, Unit]
  ): Request[TransferCertificateResponse, AWSError] = js.native
  
  /**
    * Removes the given tags (metadata) from the resource. Requires permission to access the UntagResource action.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource. Requires permission to access the UntagResource action.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled. Requires permission to access the UpdateAccountAuditConfiguration action.
    */
  def updateAccountAuditConfiguration(): Request[UpdateAccountAuditConfigurationResponse, AWSError] = js.native
  def updateAccountAuditConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountAuditConfigurationResponse, Unit]
  ): Request[UpdateAccountAuditConfigurationResponse, AWSError] = js.native
  /**
    * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled. Requires permission to access the UpdateAccountAuditConfiguration action.
    */
  def updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest): Request[UpdateAccountAuditConfigurationResponse, AWSError] = js.native
  def updateAccountAuditConfiguration(
    params: UpdateAccountAuditConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountAuditConfigurationResponse, Unit]
  ): Request[UpdateAccountAuditConfigurationResponse, AWSError] = js.native
  
  /**
    *  Updates a Device Defender audit suppression. 
    */
  def updateAuditSuppression(): Request[UpdateAuditSuppressionResponse, AWSError] = js.native
  def updateAuditSuppression(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuditSuppressionResponse, Unit]): Request[UpdateAuditSuppressionResponse, AWSError] = js.native
  /**
    *  Updates a Device Defender audit suppression. 
    */
  def updateAuditSuppression(params: UpdateAuditSuppressionRequest): Request[UpdateAuditSuppressionResponse, AWSError] = js.native
  def updateAuditSuppression(
    params: UpdateAuditSuppressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuditSuppressionResponse, Unit]
  ): Request[UpdateAuditSuppressionResponse, AWSError] = js.native
  
  /**
    * Updates an authorizer. Requires permission to access the UpdateAuthorizer action.
    */
  def updateAuthorizer(): Request[UpdateAuthorizerResponse, AWSError] = js.native
  def updateAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthorizerResponse, Unit]): Request[UpdateAuthorizerResponse, AWSError] = js.native
  /**
    * Updates an authorizer. Requires permission to access the UpdateAuthorizer action.
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse, AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthorizerResponse, Unit]
  ): Request[UpdateAuthorizerResponse, AWSError] = js.native
  
  /**
    * Updates information about the billing group. Requires permission to access the UpdateBillingGroup action.
    */
  def updateBillingGroup(): Request[UpdateBillingGroupResponse, AWSError] = js.native
  def updateBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBillingGroupResponse, Unit]): Request[UpdateBillingGroupResponse, AWSError] = js.native
  /**
    * Updates information about the billing group. Requires permission to access the UpdateBillingGroup action.
    */
  def updateBillingGroup(params: UpdateBillingGroupRequest): Request[UpdateBillingGroupResponse, AWSError] = js.native
  def updateBillingGroup(
    params: UpdateBillingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBillingGroupResponse, Unit]
  ): Request[UpdateBillingGroupResponse, AWSError] = js.native
  
  /**
    * Updates a registered CA certificate. Requires permission to access the UpdateCACertificate action.
    */
  def updateCACertificate(): Request[js.Object, AWSError] = js.native
  def updateCACertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a registered CA certificate. Requires permission to access the UpdateCACertificate action.
    */
  def updateCACertificate(params: UpdateCACertificateRequest): Request[js.Object, AWSError] = js.native
  def updateCACertificate(
    params: UpdateCACertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the status of the specified certificate. This operation is idempotent. Requires permission to access the UpdateCertificate action. Certificates must be in the ACTIVE state to authenticate devices that use a certificate to connect to IoT. Within a few minutes of updating a certificate from the ACTIVE state to any other state, IoT disconnects all devices that used that certificate to connect. Devices cannot use a certificate that is not in the ACTIVE state to reconnect.
    */
  def updateCertificate(): Request[js.Object, AWSError] = js.native
  def updateCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the status of the specified certificate. This operation is idempotent. Requires permission to access the UpdateCertificate action. Certificates must be in the ACTIVE state to authenticate devices that use a certificate to connect to IoT. Within a few minutes of updating a certificate from the ACTIVE state to any other state, IoT disconnects all devices that used that certificate to connect. Devices cannot use a certificate that is not in the ACTIVE state to reconnect.
    */
  def updateCertificate(params: UpdateCertificateRequest): Request[js.Object, AWSError] = js.native
  def updateCertificate(
    params: UpdateCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a Device Defender detect custom metric.  Requires permission to access the UpdateCustomMetric action.
    */
  def updateCustomMetric(): Request[UpdateCustomMetricResponse, AWSError] = js.native
  def updateCustomMetric(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomMetricResponse, Unit]): Request[UpdateCustomMetricResponse, AWSError] = js.native
  /**
    * Updates a Device Defender detect custom metric.  Requires permission to access the UpdateCustomMetric action.
    */
  def updateCustomMetric(params: UpdateCustomMetricRequest): Request[UpdateCustomMetricResponse, AWSError] = js.native
  def updateCustomMetric(
    params: UpdateCustomMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomMetricResponse, Unit]
  ): Request[UpdateCustomMetricResponse, AWSError] = js.native
  
  /**
    * Updates the definition for a dimension. You cannot change the type of a dimension after it is created (you can delete it and recreate it). Requires permission to access the UpdateDimension action.
    */
  def updateDimension(): Request[UpdateDimensionResponse, AWSError] = js.native
  def updateDimension(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDimensionResponse, Unit]): Request[UpdateDimensionResponse, AWSError] = js.native
  /**
    * Updates the definition for a dimension. You cannot change the type of a dimension after it is created (you can delete it and recreate it). Requires permission to access the UpdateDimension action.
    */
  def updateDimension(params: UpdateDimensionRequest): Request[UpdateDimensionResponse, AWSError] = js.native
  def updateDimension(
    params: UpdateDimensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDimensionResponse, Unit]
  ): Request[UpdateDimensionResponse, AWSError] = js.native
  
  /**
    * Updates values stored in the domain configuration. Domain configurations for default endpoints can't be updated. Requires permission to access the UpdateDomainConfiguration action.
    */
  def updateDomainConfiguration(): Request[UpdateDomainConfigurationResponse, AWSError] = js.native
  def updateDomainConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigurationResponse, Unit]): Request[UpdateDomainConfigurationResponse, AWSError] = js.native
  /**
    * Updates values stored in the domain configuration. Domain configurations for default endpoints can't be updated. Requires permission to access the UpdateDomainConfiguration action.
    */
  def updateDomainConfiguration(params: UpdateDomainConfigurationRequest): Request[UpdateDomainConfigurationResponse, AWSError] = js.native
  def updateDomainConfiguration(
    params: UpdateDomainConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigurationResponse, Unit]
  ): Request[UpdateDomainConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a dynamic thing group. Requires permission to access the UpdateDynamicThingGroup action.
    */
  def updateDynamicThingGroup(): Request[UpdateDynamicThingGroupResponse, AWSError] = js.native
  def updateDynamicThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDynamicThingGroupResponse, Unit]): Request[UpdateDynamicThingGroupResponse, AWSError] = js.native
  /**
    * Updates a dynamic thing group. Requires permission to access the UpdateDynamicThingGroup action.
    */
  def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): Request[UpdateDynamicThingGroupResponse, AWSError] = js.native
  def updateDynamicThingGroup(
    params: UpdateDynamicThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDynamicThingGroupResponse, Unit]
  ): Request[UpdateDynamicThingGroupResponse, AWSError] = js.native
  
  /**
    * Updates the event configurations. Requires permission to access the UpdateEventConfigurations action.
    */
  def updateEventConfigurations(): Request[UpdateEventConfigurationsResponse, AWSError] = js.native
  def updateEventConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventConfigurationsResponse, Unit]): Request[UpdateEventConfigurationsResponse, AWSError] = js.native
  /**
    * Updates the event configurations. Requires permission to access the UpdateEventConfigurations action.
    */
  def updateEventConfigurations(params: UpdateEventConfigurationsRequest): Request[UpdateEventConfigurationsResponse, AWSError] = js.native
  def updateEventConfigurations(
    params: UpdateEventConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventConfigurationsResponse, Unit]
  ): Request[UpdateEventConfigurationsResponse, AWSError] = js.native
  
  /**
    * Updates the data for a fleet metric. Requires permission to access the UpdateFleetMetric action.
    */
  def updateFleetMetric(): Request[js.Object, AWSError] = js.native
  def updateFleetMetric(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the data for a fleet metric. Requires permission to access the UpdateFleetMetric action.
    */
  def updateFleetMetric(params: UpdateFleetMetricRequest): Request[js.Object, AWSError] = js.native
  def updateFleetMetric(
    params: UpdateFleetMetricRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the search configuration. Requires permission to access the UpdateIndexingConfiguration action.
    */
  def updateIndexingConfiguration(): Request[UpdateIndexingConfigurationResponse, AWSError] = js.native
  def updateIndexingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIndexingConfigurationResponse, Unit]): Request[UpdateIndexingConfigurationResponse, AWSError] = js.native
  /**
    * Updates the search configuration. Requires permission to access the UpdateIndexingConfiguration action.
    */
  def updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest): Request[UpdateIndexingConfigurationResponse, AWSError] = js.native
  def updateIndexingConfiguration(
    params: UpdateIndexingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIndexingConfigurationResponse, Unit]
  ): Request[UpdateIndexingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates supported fields of the specified job. Requires permission to access the UpdateJob action.
    */
  def updateJob(): Request[js.Object, AWSError] = js.native
  def updateJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates supported fields of the specified job. Requires permission to access the UpdateJob action.
    */
  def updateJob(params: UpdateJobRequest): Request[js.Object, AWSError] = js.native
  def updateJob(params: UpdateJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the definition for the specified mitigation action. Requires permission to access the UpdateMitigationAction action.
    */
  def updateMitigationAction(): Request[UpdateMitigationActionResponse, AWSError] = js.native
  def updateMitigationAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMitigationActionResponse, Unit]): Request[UpdateMitigationActionResponse, AWSError] = js.native
  /**
    * Updates the definition for the specified mitigation action. Requires permission to access the UpdateMitigationAction action.
    */
  def updateMitigationAction(params: UpdateMitigationActionRequest): Request[UpdateMitigationActionResponse, AWSError] = js.native
  def updateMitigationAction(
    params: UpdateMitigationActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMitigationActionResponse, Unit]
  ): Request[UpdateMitigationActionResponse, AWSError] = js.native
  
  /**
    * Updates a provisioning template. Requires permission to access the UpdateProvisioningTemplate action.
    */
  def updateProvisioningTemplate(): Request[UpdateProvisioningTemplateResponse, AWSError] = js.native
  def updateProvisioningTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisioningTemplateResponse, Unit]): Request[UpdateProvisioningTemplateResponse, AWSError] = js.native
  /**
    * Updates a provisioning template. Requires permission to access the UpdateProvisioningTemplate action.
    */
  def updateProvisioningTemplate(params: UpdateProvisioningTemplateRequest): Request[UpdateProvisioningTemplateResponse, AWSError] = js.native
  def updateProvisioningTemplate(
    params: UpdateProvisioningTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisioningTemplateResponse, Unit]
  ): Request[UpdateProvisioningTemplateResponse, AWSError] = js.native
  
  /**
    * Updates a role alias. Requires permission to access the UpdateRoleAlias action.
    */
  def updateRoleAlias(): Request[UpdateRoleAliasResponse, AWSError] = js.native
  def updateRoleAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleAliasResponse, Unit]): Request[UpdateRoleAliasResponse, AWSError] = js.native
  /**
    * Updates a role alias. Requires permission to access the UpdateRoleAlias action.
    */
  def updateRoleAlias(params: UpdateRoleAliasRequest): Request[UpdateRoleAliasResponse, AWSError] = js.native
  def updateRoleAlias(
    params: UpdateRoleAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleAliasResponse, Unit]
  ): Request[UpdateRoleAliasResponse, AWSError] = js.native
  
  /**
    * Updates a scheduled audit, including which checks are performed and how often the audit takes place. Requires permission to access the UpdateScheduledAudit action.
    */
  def updateScheduledAudit(): Request[UpdateScheduledAuditResponse, AWSError] = js.native
  def updateScheduledAudit(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduledAuditResponse, Unit]): Request[UpdateScheduledAuditResponse, AWSError] = js.native
  /**
    * Updates a scheduled audit, including which checks are performed and how often the audit takes place. Requires permission to access the UpdateScheduledAudit action.
    */
  def updateScheduledAudit(params: UpdateScheduledAuditRequest): Request[UpdateScheduledAuditResponse, AWSError] = js.native
  def updateScheduledAudit(
    params: UpdateScheduledAuditRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduledAuditResponse, Unit]
  ): Request[UpdateScheduledAuditResponse, AWSError] = js.native
  
  /**
    * Updates a Device Defender security profile. Requires permission to access the UpdateSecurityProfile action.
    */
  def updateSecurityProfile(): Request[UpdateSecurityProfileResponse, AWSError] = js.native
  def updateSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityProfileResponse, Unit]): Request[UpdateSecurityProfileResponse, AWSError] = js.native
  /**
    * Updates a Device Defender security profile. Requires permission to access the UpdateSecurityProfile action.
    */
  def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[UpdateSecurityProfileResponse, AWSError] = js.native
  def updateSecurityProfile(
    params: UpdateSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityProfileResponse, Unit]
  ): Request[UpdateSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Updates an existing stream. The stream version will be incremented by one. Requires permission to access the UpdateStream action.
    */
  def updateStream(): Request[UpdateStreamResponse, AWSError] = js.native
  def updateStream(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamResponse, Unit]): Request[UpdateStreamResponse, AWSError] = js.native
  /**
    * Updates an existing stream. The stream version will be incremented by one. Requires permission to access the UpdateStream action.
    */
  def updateStream(params: UpdateStreamRequest): Request[UpdateStreamResponse, AWSError] = js.native
  def updateStream(
    params: UpdateStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamResponse, Unit]
  ): Request[UpdateStreamResponse, AWSError] = js.native
  
  /**
    * Updates the data for a thing. Requires permission to access the UpdateThing action.
    */
  def updateThing(): Request[UpdateThingResponse, AWSError] = js.native
  def updateThing(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingResponse, Unit]): Request[UpdateThingResponse, AWSError] = js.native
  /**
    * Updates the data for a thing. Requires permission to access the UpdateThing action.
    */
  def updateThing(params: UpdateThingRequest): Request[UpdateThingResponse, AWSError] = js.native
  def updateThing(
    params: UpdateThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingResponse, Unit]
  ): Request[UpdateThingResponse, AWSError] = js.native
  
  /**
    * Update a thing group. Requires permission to access the UpdateThingGroup action.
    */
  def updateThingGroup(): Request[UpdateThingGroupResponse, AWSError] = js.native
  def updateThingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingGroupResponse, Unit]): Request[UpdateThingGroupResponse, AWSError] = js.native
  /**
    * Update a thing group. Requires permission to access the UpdateThingGroup action.
    */
  def updateThingGroup(params: UpdateThingGroupRequest): Request[UpdateThingGroupResponse, AWSError] = js.native
  def updateThingGroup(
    params: UpdateThingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingGroupResponse, Unit]
  ): Request[UpdateThingGroupResponse, AWSError] = js.native
  
  /**
    * Updates the groups to which the thing belongs. Requires permission to access the UpdateThingGroupsForThing action.
    */
  def updateThingGroupsForThing(): Request[UpdateThingGroupsForThingResponse, AWSError] = js.native
  def updateThingGroupsForThing(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingGroupsForThingResponse, Unit]): Request[UpdateThingGroupsForThingResponse, AWSError] = js.native
  /**
    * Updates the groups to which the thing belongs. Requires permission to access the UpdateThingGroupsForThing action.
    */
  def updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest): Request[UpdateThingGroupsForThingResponse, AWSError] = js.native
  def updateThingGroupsForThing(
    params: UpdateThingGroupsForThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingGroupsForThingResponse, Unit]
  ): Request[UpdateThingGroupsForThingResponse, AWSError] = js.native
  
  /**
    * Updates a topic rule destination. You use this to change the status, endpoint URL, or confirmation URL of the destination. Requires permission to access the UpdateTopicRuleDestination action.
    */
  def updateTopicRuleDestination(): Request[UpdateTopicRuleDestinationResponse, AWSError] = js.native
  def updateTopicRuleDestination(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicRuleDestinationResponse, Unit]): Request[UpdateTopicRuleDestinationResponse, AWSError] = js.native
  /**
    * Updates a topic rule destination. You use this to change the status, endpoint URL, or confirmation URL of the destination. Requires permission to access the UpdateTopicRuleDestination action.
    */
  def updateTopicRuleDestination(params: UpdateTopicRuleDestinationRequest): Request[UpdateTopicRuleDestinationResponse, AWSError] = js.native
  def updateTopicRuleDestination(
    params: UpdateTopicRuleDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicRuleDestinationResponse, Unit]
  ): Request[UpdateTopicRuleDestinationResponse, AWSError] = js.native
  
  /**
    * Validates a Device Defender security profile behaviors specification. Requires permission to access the ValidateSecurityProfileBehaviors action.
    */
  def validateSecurityProfileBehaviors(): Request[ValidateSecurityProfileBehaviorsResponse, AWSError] = js.native
  def validateSecurityProfileBehaviors(
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSecurityProfileBehaviorsResponse, Unit]
  ): Request[ValidateSecurityProfileBehaviorsResponse, AWSError] = js.native
  /**
    * Validates a Device Defender security profile behaviors specification. Requires permission to access the ValidateSecurityProfileBehaviors action.
    */
  def validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest): Request[ValidateSecurityProfileBehaviorsResponse, AWSError] = js.native
  def validateSecurityProfileBehaviors(
    params: ValidateSecurityProfileBehaviorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSecurityProfileBehaviorsResponse, Unit]
  ): Request[ValidateSecurityProfileBehaviorsResponse, AWSError] = js.native
}
