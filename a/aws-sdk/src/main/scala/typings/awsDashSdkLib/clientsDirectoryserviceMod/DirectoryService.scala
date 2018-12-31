package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DirectoryService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ClientConfiguration = js.native
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptSharedDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptSharedDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AcceptSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addIpRoutes(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTagsToResource(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.AddTagsToResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSchemaExtension(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSchemaExtension(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CancelSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def connectDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def connectDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ConnectDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateAliasResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a computer account in the specified directory, and joins the computer to the directory.
    */
  def createComputer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createComputer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a computer account in the specified directory, and joins the computer to the directory.
    */
  def createComputer(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createComputer(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateComputerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
    */
  def createLogSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLogSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
    */
  def createLogSubscription(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLogSubscription(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMicrosoftAD(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMicrosoftAD(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateMicrosoftADResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSnapshot(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTrust(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLogSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLogSubscription(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteLogSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSnapshot(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTrust(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeleteTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterEventTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterEventTopic(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DeregisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConditionalForwarders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConditionalForwarders(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeConditionalForwardersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectories(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDomainControllers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDomainControllers(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventTopics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventTopics(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeEventTopicsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSharedDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSharedDirectories(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSharedDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTrusts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTrusts(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DescribeTrustsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableRadius(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableSso(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableSso(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DisableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableRadius(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables single sign-on for a directory.
    */
  def enableSso(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableSso(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables single sign-on for a directory.
    */
  def enableSso(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableSso(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.EnableSsoResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains directory limit information for the current region.
    */
  def getDirectoryLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDirectoryLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains directory limit information for the current region.
    */
  def getDirectoryLimits(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDirectoryLimits(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetDirectoryLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSnapshotLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSnapshotLimits(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.GetSnapshotLimitsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIpRoutes(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLogSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLogSubscriptions(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListLogSubscriptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSchemaExtensions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSchemaExtensions(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListSchemaExtensionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerEventTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerEventTopic(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RegisterEventTopicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectSharedDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectSharedDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RejectSharedDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeIpRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeIpRoutes(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveIpRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoveTagsFromResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
    */
  def resetUserPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
    */
  def resetUserPassword(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetUserPassword(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResetUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreFromSnapshot(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RestoreFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def shareDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def shareDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startSchemaExtension(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startSchemaExtension(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.StartSchemaExtensionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unshareDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unshareDirectory(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareDirectoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConditionalForwarder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConditionalForwarder(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateConditionalForwarderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNumberOfDomainControllers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNumberOfDomainControllers(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateNumberOfDomainControllersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRadius(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRadius(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateRadiusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTrust(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UpdateTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyTrust(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyTrust(
    params: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VerifyTrustResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

