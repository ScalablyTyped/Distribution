package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DirectoryService: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptSharedDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(params: AcceptSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptSharedDirectory(
    params: AcceptSharedDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(params: AddIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addIpRoutes(
    params: AddIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelSchemaExtension(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(params: CancelSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelSchemaExtension(
    params: CancelSchemaExtensionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def connectDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConnectDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(params: ConnectDirectoryRequest): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def connectDirectory(
    params: ConnectDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConnectDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAliasResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAliasResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a computer account in the specified directory, and joins the computer to the directory.
    */
  def createComputer(): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComputer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateComputerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a computer account in the specified directory, and joins the computer to the directory.
    */
  def createComputer(params: CreateComputerRequest): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComputer(
    params: CreateComputerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateComputerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(params: CreateConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConditionalForwarder(
    params: CreateConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(params: CreateDirectoryRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectory(
    params: CreateDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
    */
  def createLogSubscription(): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLogSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
    */
  def createLogSubscription(params: CreateLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLogSubscription(
    params: CreateLogSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMicrosoftAD(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMicrosoftADResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(params: CreateMicrosoftADRequest): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMicrosoftAD(
    params: CreateMicrosoftADRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMicrosoftADResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(params: CreateSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(params: CreateTrustRequest): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrust(
    params: CreateTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(params: DeleteConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConditionalForwarder(
    params: DeleteConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(params: DeleteDirectoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectory(
    params: DeleteDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLogSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(params: DeleteLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLogSubscription(
    params: DeleteLogSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(params: DeleteTrustRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrust(
    params: DeleteTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterEventTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(params: DeregisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterEventTopic(
    params: DeregisterEventTopicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConditionalForwarders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConditionalForwardersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(params: DescribeConditionalForwardersRequest): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConditionalForwarders(
    params: DescribeConditionalForwardersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConditionalForwardersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(params: DescribeDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectories(
    params: DescribeDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomainControllers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(params: DescribeDomainControllersRequest): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomainControllers(
    params: DescribeDomainControllersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventTopics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventTopicsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(params: DescribeEventTopicsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventTopics(
    params: DescribeEventTopicsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventTopicsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSharedDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSharedDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSharedDirectories(
    params: DescribeSharedDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSharedDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(params: DescribeSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTrusts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrustsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(params: DescribeTrustsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTrusts(
    params: DescribeTrustsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrustsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(params: DisableRadiusRequest): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableRadius(
    params: DisableRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSso(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(params: DisableSsoRequest): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSso(
    params: DisableSsoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(params: EnableRadiusRequest): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableRadius(
    params: EnableRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables single sign-on for a directory.
    */
  def enableSso(): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSso(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EnableSsoResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables single sign-on for a directory.
    */
  def enableSso(params: EnableSsoRequest): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSso(
    params: EnableSsoRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EnableSsoResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains directory limit information for the current region.
    */
  def getDirectoryLimits(): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDirectoryLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDirectoryLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains directory limit information for the current region.
    */
  def getDirectoryLimits(params: GetDirectoryLimitsRequest): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDirectoryLimits(
    params: GetDirectoryLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDirectoryLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSnapshotLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSnapshotLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(params: GetSnapshotLimitsRequest): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSnapshotLimits(
    params: GetSnapshotLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSnapshotLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(params: ListIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIpRoutes(
    params: ListIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLogSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLogSubscriptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(params: ListLogSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLogSubscriptions(
    params: ListLogSubscriptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLogSubscriptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSchemaExtensions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSchemaExtensionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(params: ListSchemaExtensionsRequest): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSchemaExtensions(
    params: ListSchemaExtensionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSchemaExtensionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerEventTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(params: RegisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerEventTopic(
    params: RegisterEventTopicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectSharedDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(params: RejectSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectSharedDirectory(
    params: RejectSharedDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(params: RemoveIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeIpRoutes(
    params: RemoveIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
    */
  def resetUserPassword(): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
    */
  def resetUserPassword(params: ResetUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetUserPassword(
    params: ResetUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(params: RestoreFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreFromSnapshot(
    params: RestoreFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def shareDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ShareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(params: ShareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def shareDirectory(
    params: ShareDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ShareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSchemaExtension(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(params: StartSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSchemaExtension(
    params: StartSchemaExtensionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unshareDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnshareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(params: UnshareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unshareDirectory(
    params: UnshareDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnshareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(params: UpdateConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConditionalForwarder(
    params: UpdateConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNumberOfDomainControllers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNumberOfDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(params: UpdateNumberOfDomainControllersRequest): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNumberOfDomainControllers(
    params: UpdateNumberOfDomainControllersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNumberOfDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(params: UpdateRadiusRequest): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRadius(
    params: UpdateRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(params: UpdateTrustRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrust(
    params: UpdateTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifyTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(params: VerifyTrustRequest): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyTrust(
    params: VerifyTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifyTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

