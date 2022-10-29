package typings.awsSdk.clientsAppstreamMod

import typings.awsSdk.anon.DescribeFleetsRequestwait
import typings.awsSdk.awsSdkStrings.fleetStarted
import typings.awsSdk.awsSdkStrings.fleetStopped
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppStream extends Service {
  
  /**
    * Associates the specified application with the specified fleet. This is only supported for Elastic fleets.
    */
  def associateApplicationFleet(): Request[AssociateApplicationFleetResult, AWSError] = js.native
  def associateApplicationFleet(callback: js.Function2[/* err */ AWSError, /* data */ AssociateApplicationFleetResult, Unit]): Request[AssociateApplicationFleetResult, AWSError] = js.native
  /**
    * Associates the specified application with the specified fleet. This is only supported for Elastic fleets.
    */
  def associateApplicationFleet(params: AssociateApplicationFleetRequest): Request[AssociateApplicationFleetResult, AWSError] = js.native
  def associateApplicationFleet(
    params: AssociateApplicationFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateApplicationFleetResult, Unit]
  ): Request[AssociateApplicationFleetResult, AWSError] = js.native
  
  /**
    * Associates an application to entitle.
    */
  def associateApplicationToEntitlement(): Request[AssociateApplicationToEntitlementResult, AWSError] = js.native
  def associateApplicationToEntitlement(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateApplicationToEntitlementResult, Unit]
  ): Request[AssociateApplicationToEntitlementResult, AWSError] = js.native
  /**
    * Associates an application to entitle.
    */
  def associateApplicationToEntitlement(params: AssociateApplicationToEntitlementRequest): Request[AssociateApplicationToEntitlementResult, AWSError] = js.native
  def associateApplicationToEntitlement(
    params: AssociateApplicationToEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateApplicationToEntitlementResult, Unit]
  ): Request[AssociateApplicationToEntitlementResult, AWSError] = js.native
  
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(): Request[AssociateFleetResult, AWSError] = js.native
  def associateFleet(callback: js.Function2[/* err */ AWSError, /* data */ AssociateFleetResult, Unit]): Request[AssociateFleetResult, AWSError] = js.native
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(params: AssociateFleetRequest): Request[AssociateFleetResult, AWSError] = js.native
  def associateFleet(
    params: AssociateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateFleetResult, Unit]
  ): Request[AssociateFleetResult, AWSError] = js.native
  
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(): Request[BatchAssociateUserStackResult, AWSError] = js.native
  def batchAssociateUserStack(callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateUserStackResult, Unit]): Request[BatchAssociateUserStackResult, AWSError] = js.native
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(params: BatchAssociateUserStackRequest): Request[BatchAssociateUserStackResult, AWSError] = js.native
  def batchAssociateUserStack(
    params: BatchAssociateUserStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateUserStackResult, Unit]
  ): Request[BatchAssociateUserStackResult, AWSError] = js.native
  
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(): Request[BatchDisassociateUserStackResult, AWSError] = js.native
  def batchDisassociateUserStack(callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateUserStackResult, Unit]): Request[BatchDisassociateUserStackResult, AWSError] = js.native
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(params: BatchDisassociateUserStackRequest): Request[BatchDisassociateUserStackResult, AWSError] = js.native
  def batchDisassociateUserStack(
    params: BatchDisassociateUserStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateUserStackResult, Unit]
  ): Request[BatchDisassociateUserStackResult, AWSError] = js.native
  
  @JSName("config")
  var config_AppStream: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(): Request[CopyImageResponse, AWSError] = js.native
  def copyImage(callback: js.Function2[/* err */ AWSError, /* data */ CopyImageResponse, Unit]): Request[CopyImageResponse, AWSError] = js.native
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(params: CopyImageRequest): Request[CopyImageResponse, AWSError] = js.native
  def copyImage(
    params: CopyImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyImageResponse, Unit]
  ): Request[CopyImageResponse, AWSError] = js.native
  
  /**
    * Creates an app block. App blocks are an Amazon AppStream 2.0 resource that stores the details about the virtual hard disk in an S3 bucket. It also stores the setup script with details about how to mount the virtual hard disk. The virtual hard disk includes the application binaries and other files necessary to launch your applications. Multiple applications can be assigned to a single app block. This is only supported for Elastic fleets.
    */
  def createAppBlock(): Request[CreateAppBlockResult, AWSError] = js.native
  def createAppBlock(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppBlockResult, Unit]): Request[CreateAppBlockResult, AWSError] = js.native
  /**
    * Creates an app block. App blocks are an Amazon AppStream 2.0 resource that stores the details about the virtual hard disk in an S3 bucket. It also stores the setup script with details about how to mount the virtual hard disk. The virtual hard disk includes the application binaries and other files necessary to launch your applications. Multiple applications can be assigned to a single app block. This is only supported for Elastic fleets.
    */
  def createAppBlock(params: CreateAppBlockRequest): Request[CreateAppBlockResult, AWSError] = js.native
  def createAppBlock(
    params: CreateAppBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppBlockResult, Unit]
  ): Request[CreateAppBlockResult, AWSError] = js.native
  
  /**
    * Creates an application. Applications are an Amazon AppStream 2.0 resource that stores the details about how to launch applications on Elastic fleet streaming instances. An application consists of the launch details, icon, and display name. Applications are associated with an app block that contains the application binaries and other files. The applications assigned to an Elastic fleet are the applications users can launch.  This is only supported for Elastic fleets.
    */
  def createApplication(): Request[CreateApplicationResult, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResult, Unit]): Request[CreateApplicationResult, AWSError] = js.native
  /**
    * Creates an application. Applications are an Amazon AppStream 2.0 resource that stores the details about how to launch applications on Elastic fleet streaming instances. An application consists of the launch details, icon, and display name. Applications are associated with an app block that contains the application binaries and other files. The applications assigned to an Elastic fleet are the applications users can launch.  This is only supported for Elastic fleets.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResult, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResult, Unit]
  ): Request[CreateApplicationResult, AWSError] = js.native
  
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  def createDirectoryConfig(): Request[CreateDirectoryConfigResult, AWSError] = js.native
  def createDirectoryConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryConfigResult, Unit]): Request[CreateDirectoryConfigResult, AWSError] = js.native
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  def createDirectoryConfig(params: CreateDirectoryConfigRequest): Request[CreateDirectoryConfigResult, AWSError] = js.native
  def createDirectoryConfig(
    params: CreateDirectoryConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryConfigResult, Unit]
  ): Request[CreateDirectoryConfigResult, AWSError] = js.native
  
  /**
    * Creates a new entitlement. Entitlements control access to specific applications within a stack, based on user attributes. Entitlements apply to SAML 2.0 federated user identities. Amazon AppStream 2.0 user pool and streaming URL users are entitled to all applications in a stack. Entitlements don't apply to the desktop stream view application, or to applications managed by a dynamic app provider using the Dynamic Application Framework.
    */
  def createEntitlement(): Request[CreateEntitlementResult, AWSError] = js.native
  def createEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ CreateEntitlementResult, Unit]): Request[CreateEntitlementResult, AWSError] = js.native
  /**
    * Creates a new entitlement. Entitlements control access to specific applications within a stack, based on user attributes. Entitlements apply to SAML 2.0 federated user identities. Amazon AppStream 2.0 user pool and streaming URL users are entitled to all applications in a stack. Entitlements don't apply to the desktop stream view application, or to applications managed by a dynamic app provider using the Dynamic Application Framework.
    */
  def createEntitlement(params: CreateEntitlementRequest): Request[CreateEntitlementResult, AWSError] = js.native
  def createEntitlement(
    params: CreateEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEntitlementResult, Unit]
  ): Request[CreateEntitlementResult, AWSError] = js.native
  
  /**
    * Creates a fleet. A fleet consists of streaming instances that your users access for their applications and desktops.
    */
  def createFleet(): Request[CreateFleetResult, AWSError] = js.native
  def createFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResult, Unit]): Request[CreateFleetResult, AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of streaming instances that your users access for their applications and desktops.
    */
  def createFleet(params: CreateFleetRequest): Request[CreateFleetResult, AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResult, Unit]
  ): Request[CreateFleetResult, AWSError] = js.native
  
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(): Request[CreateImageBuilderResult, AWSError] = js.native
  def createImageBuilder(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageBuilderResult, Unit]): Request[CreateImageBuilderResult, AWSError] = js.native
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(params: CreateImageBuilderRequest): Request[CreateImageBuilderResult, AWSError] = js.native
  def createImageBuilder(
    params: CreateImageBuilderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageBuilderResult, Unit]
  ): Request[CreateImageBuilderResult, AWSError] = js.native
  
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(): Request[CreateImageBuilderStreamingURLResult, AWSError] = js.native
  def createImageBuilderStreamingURL(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageBuilderStreamingURLResult, Unit]): Request[CreateImageBuilderStreamingURLResult, AWSError] = js.native
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest): Request[CreateImageBuilderStreamingURLResult, AWSError] = js.native
  def createImageBuilderStreamingURL(
    params: CreateImageBuilderStreamingURLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageBuilderStreamingURLResult, Unit]
  ): Request[CreateImageBuilderStreamingURLResult, AWSError] = js.native
  
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(): Request[CreateStackResult, AWSError] = js.native
  def createStack(callback: js.Function2[/* err */ AWSError, /* data */ CreateStackResult, Unit]): Request[CreateStackResult, AWSError] = js.native
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(params: CreateStackRequest): Request[CreateStackResult, AWSError] = js.native
  def createStack(
    params: CreateStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStackResult, Unit]
  ): Request[CreateStackResult, AWSError] = js.native
  
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(): Request[CreateStreamingURLResult, AWSError] = js.native
  def createStreamingURL(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingURLResult, Unit]): Request[CreateStreamingURLResult, AWSError] = js.native
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(params: CreateStreamingURLRequest): Request[CreateStreamingURLResult, AWSError] = js.native
  def createStreamingURL(
    params: CreateStreamingURLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingURLResult, Unit]
  ): Request[CreateStreamingURLResult, AWSError] = js.native
  
  /**
    * Creates a new image with the latest Windows operating system updates, driver updates, and AppStream 2.0 agent software. For more information, see the "Update an Image by Using Managed AppStream 2.0 Image Updates" section in Administer Your AppStream 2.0 Images, in the Amazon AppStream 2.0 Administration Guide.
    */
  def createUpdatedImage(): Request[CreateUpdatedImageResult, AWSError] = js.native
  def createUpdatedImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateUpdatedImageResult, Unit]): Request[CreateUpdatedImageResult, AWSError] = js.native
  /**
    * Creates a new image with the latest Windows operating system updates, driver updates, and AppStream 2.0 agent software. For more information, see the "Update an Image by Using Managed AppStream 2.0 Image Updates" section in Administer Your AppStream 2.0 Images, in the Amazon AppStream 2.0 Administration Guide.
    */
  def createUpdatedImage(params: CreateUpdatedImageRequest): Request[CreateUpdatedImageResult, AWSError] = js.native
  def createUpdatedImage(
    params: CreateUpdatedImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUpdatedImageResult, Unit]
  ): Request[CreateUpdatedImageResult, AWSError] = js.native
  
  /**
    * Creates a usage report subscription. Usage reports are generated daily.
    */
  def createUsageReportSubscription(): Request[CreateUsageReportSubscriptionResult, AWSError] = js.native
  def createUsageReportSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateUsageReportSubscriptionResult, Unit]): Request[CreateUsageReportSubscriptionResult, AWSError] = js.native
  /**
    * Creates a usage report subscription. Usage reports are generated daily.
    */
  def createUsageReportSubscription(params: CreateUsageReportSubscriptionRequest): Request[CreateUsageReportSubscriptionResult, AWSError] = js.native
  def createUsageReportSubscription(
    params: CreateUsageReportSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUsageReportSubscriptionResult, Unit]
  ): Request[CreateUsageReportSubscriptionResult, AWSError] = js.native
  
  /**
    * Creates a new user in the user pool.
    */
  def createUser(): Request[CreateUserResult, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResult, Unit]): Request[CreateUserResult, AWSError] = js.native
  /**
    * Creates a new user in the user pool.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResult, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResult, Unit]
  ): Request[CreateUserResult, AWSError] = js.native
  
  /**
    * Deletes an app block.
    */
  def deleteAppBlock(): Request[DeleteAppBlockResult, AWSError] = js.native
  def deleteAppBlock(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppBlockResult, Unit]): Request[DeleteAppBlockResult, AWSError] = js.native
  /**
    * Deletes an app block.
    */
  def deleteAppBlock(params: DeleteAppBlockRequest): Request[DeleteAppBlockResult, AWSError] = js.native
  def deleteAppBlock(
    params: DeleteAppBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppBlockResult, Unit]
  ): Request[DeleteAppBlockResult, AWSError] = js.native
  
  /**
    * Deletes an application.
    */
  def deleteApplication(): Request[DeleteApplicationResult, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResult, Unit]): Request[DeleteApplicationResult, AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResult, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResult, Unit]
  ): Request[DeleteApplicationResult, AWSError] = js.native
  
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(): Request[DeleteDirectoryConfigResult, AWSError] = js.native
  def deleteDirectoryConfig(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryConfigResult, Unit]): Request[DeleteDirectoryConfigResult, AWSError] = js.native
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): Request[DeleteDirectoryConfigResult, AWSError] = js.native
  def deleteDirectoryConfig(
    params: DeleteDirectoryConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryConfigResult, Unit]
  ): Request[DeleteDirectoryConfigResult, AWSError] = js.native
  
  /**
    * Deletes the specified entitlement.
    */
  def deleteEntitlement(): Request[DeleteEntitlementResult, AWSError] = js.native
  def deleteEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntitlementResult, Unit]): Request[DeleteEntitlementResult, AWSError] = js.native
  /**
    * Deletes the specified entitlement.
    */
  def deleteEntitlement(params: DeleteEntitlementRequest): Request[DeleteEntitlementResult, AWSError] = js.native
  def deleteEntitlement(
    params: DeleteEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntitlementResult, Unit]
  ): Request[DeleteEntitlementResult, AWSError] = js.native
  
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(): Request[DeleteFleetResult, AWSError] = js.native
  def deleteFleet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResult, Unit]): Request[DeleteFleetResult, AWSError] = js.native
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResult, AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResult, Unit]
  ): Request[DeleteFleetResult, AWSError] = js.native
  
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(): Request[DeleteImageResult, AWSError] = js.native
  def deleteImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResult, Unit]): Request[DeleteImageResult, AWSError] = js.native
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(params: DeleteImageRequest): Request[DeleteImageResult, AWSError] = js.native
  def deleteImage(
    params: DeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResult, Unit]
  ): Request[DeleteImageResult, AWSError] = js.native
  
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(): Request[DeleteImageBuilderResult, AWSError] = js.native
  def deleteImageBuilder(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageBuilderResult, Unit]): Request[DeleteImageBuilderResult, AWSError] = js.native
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(params: DeleteImageBuilderRequest): Request[DeleteImageBuilderResult, AWSError] = js.native
  def deleteImageBuilder(
    params: DeleteImageBuilderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageBuilderResult, Unit]
  ): Request[DeleteImageBuilderResult, AWSError] = js.native
  
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(): Request[DeleteImagePermissionsResult, AWSError] = js.native
  def deleteImagePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImagePermissionsResult, Unit]): Request[DeleteImagePermissionsResult, AWSError] = js.native
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(params: DeleteImagePermissionsRequest): Request[DeleteImagePermissionsResult, AWSError] = js.native
  def deleteImagePermissions(
    params: DeleteImagePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImagePermissionsResult, Unit]
  ): Request[DeleteImagePermissionsResult, AWSError] = js.native
  
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(): Request[DeleteStackResult, AWSError] = js.native
  def deleteStack(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackResult, Unit]): Request[DeleteStackResult, AWSError] = js.native
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(params: DeleteStackRequest): Request[DeleteStackResult, AWSError] = js.native
  def deleteStack(
    params: DeleteStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackResult, Unit]
  ): Request[DeleteStackResult, AWSError] = js.native
  
  /**
    * Disables usage report generation.
    */
  def deleteUsageReportSubscription(): Request[DeleteUsageReportSubscriptionResult, AWSError] = js.native
  def deleteUsageReportSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUsageReportSubscriptionResult, Unit]): Request[DeleteUsageReportSubscriptionResult, AWSError] = js.native
  /**
    * Disables usage report generation.
    */
  def deleteUsageReportSubscription(params: DeleteUsageReportSubscriptionRequest): Request[DeleteUsageReportSubscriptionResult, AWSError] = js.native
  def deleteUsageReportSubscription(
    params: DeleteUsageReportSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUsageReportSubscriptionResult, Unit]
  ): Request[DeleteUsageReportSubscriptionResult, AWSError] = js.native
  
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(): Request[DeleteUserResult, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResult, Unit]): Request[DeleteUserResult, AWSError] = js.native
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResult, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResult, Unit]
  ): Request[DeleteUserResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more app blocks.
    */
  def describeAppBlocks(): Request[DescribeAppBlocksResult, AWSError] = js.native
  def describeAppBlocks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppBlocksResult, Unit]): Request[DescribeAppBlocksResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more app blocks.
    */
  def describeAppBlocks(params: DescribeAppBlocksRequest): Request[DescribeAppBlocksResult, AWSError] = js.native
  def describeAppBlocks(
    params: DescribeAppBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppBlocksResult, Unit]
  ): Request[DescribeAppBlocksResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more application fleet associations. Either ApplicationArn or FleetName must be specified.
    */
  def describeApplicationFleetAssociations(): Request[DescribeApplicationFleetAssociationsResult, AWSError] = js.native
  def describeApplicationFleetAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationFleetAssociationsResult, Unit]
  ): Request[DescribeApplicationFleetAssociationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more application fleet associations. Either ApplicationArn or FleetName must be specified.
    */
  def describeApplicationFleetAssociations(params: DescribeApplicationFleetAssociationsRequest): Request[DescribeApplicationFleetAssociationsResult, AWSError] = js.native
  def describeApplicationFleetAssociations(
    params: DescribeApplicationFleetAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationFleetAssociationsResult, Unit]
  ): Request[DescribeApplicationFleetAssociationsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more applications.
    */
  def describeApplications(): Request[DescribeApplicationsResult, AWSError] = js.native
  def describeApplications(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationsResult, Unit]): Request[DescribeApplicationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more applications.
    */
  def describeApplications(params: DescribeApplicationsRequest): Request[DescribeApplicationsResult, AWSError] = js.native
  def describeApplications(
    params: DescribeApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationsResult, Unit]
  ): Request[DescribeApplicationsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the configuration information required to join fleets and image builders to Microsoft Active Directory domains.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(): Request[DescribeDirectoryConfigsResult, AWSError] = js.native
  def describeDirectoryConfigs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectoryConfigsResult, Unit]): Request[DescribeDirectoryConfigsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the configuration information required to join fleets and image builders to Microsoft Active Directory domains.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): Request[DescribeDirectoryConfigsResult, AWSError] = js.native
  def describeDirectoryConfigs(
    params: DescribeDirectoryConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectoryConfigsResult, Unit]
  ): Request[DescribeDirectoryConfigsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one of more entitlements.
    */
  def describeEntitlements(): Request[DescribeEntitlementsResult, AWSError] = js.native
  def describeEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitlementsResult, Unit]): Request[DescribeEntitlementsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one of more entitlements.
    */
  def describeEntitlements(params: DescribeEntitlementsRequest): Request[DescribeEntitlementsResult, AWSError] = js.native
  def describeEntitlements(
    params: DescribeEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitlementsResult, Unit]
  ): Request[DescribeEntitlementsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(): Request[DescribeFleetsResult, AWSError] = js.native
  def describeFleets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult, AWSError] = js.native
  def describeFleets(
    params: DescribeFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(): Request[DescribeImageBuildersResult, AWSError] = js.native
  def describeImageBuilders(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageBuildersResult, Unit]): Request[DescribeImageBuildersResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(params: DescribeImageBuildersRequest): Request[DescribeImageBuildersResult, AWSError] = js.native
  def describeImageBuilders(
    params: DescribeImageBuildersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageBuildersResult, Unit]
  ): Request[DescribeImageBuildersResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(): Request[DescribeImagePermissionsResult, AWSError] = js.native
  def describeImagePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagePermissionsResult, Unit]): Request[DescribeImagePermissionsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(params: DescribeImagePermissionsRequest): Request[DescribeImagePermissionsResult, AWSError] = js.native
  def describeImagePermissions(
    params: DescribeImagePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagePermissionsResult, Unit]
  ): Request[DescribeImagePermissionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(): Request[DescribeImagesResult, AWSError] = js.native
  def describeImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult, AWSError] = js.native
  def describeImages(
    params: DescribeImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the streaming sessions for a specified stack and fleet. If a UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(): Request[DescribeSessionsResult, AWSError] = js.native
  def describeSessions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSessionsResult, Unit]): Request[DescribeSessionsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the streaming sessions for a specified stack and fleet. If a UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResult, AWSError] = js.native
  def describeSessions(
    params: DescribeSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSessionsResult, Unit]
  ): Request[DescribeSessionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(): Request[DescribeStacksResult, AWSError] = js.native
  def describeStacks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksResult, Unit]): Request[DescribeStacksResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult, AWSError] = js.native
  def describeStacks(
    params: DescribeStacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksResult, Unit]
  ): Request[DescribeStacksResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more usage report subscriptions.
    */
  def describeUsageReportSubscriptions(): Request[DescribeUsageReportSubscriptionsResult, AWSError] = js.native
  def describeUsageReportSubscriptions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsageReportSubscriptionsResult, Unit]
  ): Request[DescribeUsageReportSubscriptionsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more usage report subscriptions.
    */
  def describeUsageReportSubscriptions(params: DescribeUsageReportSubscriptionsRequest): Request[DescribeUsageReportSubscriptionsResult, AWSError] = js.native
  def describeUsageReportSubscriptions(
    params: DescribeUsageReportSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsageReportSubscriptionsResult, Unit]
  ): Request[DescribeUsageReportSubscriptionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(): Request[DescribeUserStackAssociationsResult, AWSError] = js.native
  def describeUserStackAssociations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserStackAssociationsResult, Unit]): Request[DescribeUserStackAssociationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(params: DescribeUserStackAssociationsRequest): Request[DescribeUserStackAssociationsResult, AWSError] = js.native
  def describeUserStackAssociations(
    params: DescribeUserStackAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserStackAssociationsResult, Unit]
  ): Request[DescribeUserStackAssociationsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(): Request[DescribeUsersResult, AWSError] = js.native
  def describeUsers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResult, Unit]): Request[DescribeUsersResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResult, AWSError] = js.native
  def describeUsers(
    params: DescribeUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResult, Unit]
  ): Request[DescribeUsersResult, AWSError] = js.native
  
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(): Request[DisableUserResult, AWSError] = js.native
  def disableUser(callback: js.Function2[/* err */ AWSError, /* data */ DisableUserResult, Unit]): Request[DisableUserResult, AWSError] = js.native
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(params: DisableUserRequest): Request[DisableUserResult, AWSError] = js.native
  def disableUser(
    params: DisableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableUserResult, Unit]
  ): Request[DisableUserResult, AWSError] = js.native
  
  /**
    * Disassociates the specified application from the fleet.
    */
  def disassociateApplicationFleet(): Request[DisassociateApplicationFleetResult, AWSError] = js.native
  def disassociateApplicationFleet(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateApplicationFleetResult, Unit]): Request[DisassociateApplicationFleetResult, AWSError] = js.native
  /**
    * Disassociates the specified application from the fleet.
    */
  def disassociateApplicationFleet(params: DisassociateApplicationFleetRequest): Request[DisassociateApplicationFleetResult, AWSError] = js.native
  def disassociateApplicationFleet(
    params: DisassociateApplicationFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateApplicationFleetResult, Unit]
  ): Request[DisassociateApplicationFleetResult, AWSError] = js.native
  
  /**
    * Deletes the specified application from the specified entitlement.
    */
  def disassociateApplicationFromEntitlement(): Request[DisassociateApplicationFromEntitlementResult, AWSError] = js.native
  def disassociateApplicationFromEntitlement(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateApplicationFromEntitlementResult, Unit]
  ): Request[DisassociateApplicationFromEntitlementResult, AWSError] = js.native
  /**
    * Deletes the specified application from the specified entitlement.
    */
  def disassociateApplicationFromEntitlement(params: DisassociateApplicationFromEntitlementRequest): Request[DisassociateApplicationFromEntitlementResult, AWSError] = js.native
  def disassociateApplicationFromEntitlement(
    params: DisassociateApplicationFromEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateApplicationFromEntitlementResult, Unit]
  ): Request[DisassociateApplicationFromEntitlementResult, AWSError] = js.native
  
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(): Request[DisassociateFleetResult, AWSError] = js.native
  def disassociateFleet(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFleetResult, Unit]): Request[DisassociateFleetResult, AWSError] = js.native
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(params: DisassociateFleetRequest): Request[DisassociateFleetResult, AWSError] = js.native
  def disassociateFleet(
    params: DisassociateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFleetResult, Unit]
  ): Request[DisassociateFleetResult, AWSError] = js.native
  
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(): Request[EnableUserResult, AWSError] = js.native
  def enableUser(callback: js.Function2[/* err */ AWSError, /* data */ EnableUserResult, Unit]): Request[EnableUserResult, AWSError] = js.native
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(params: EnableUserRequest): Request[EnableUserResult, AWSError] = js.native
  def enableUser(
    params: EnableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableUserResult, Unit]
  ): Request[EnableUserResult, AWSError] = js.native
  
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(): Request[ExpireSessionResult, AWSError] = js.native
  def expireSession(callback: js.Function2[/* err */ AWSError, /* data */ ExpireSessionResult, Unit]): Request[ExpireSessionResult, AWSError] = js.native
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(params: ExpireSessionRequest): Request[ExpireSessionResult, AWSError] = js.native
  def expireSession(
    params: ExpireSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExpireSessionResult, Unit]
  ): Request[ExpireSessionResult, AWSError] = js.native
  
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(): Request[ListAssociatedFleetsResult, AWSError] = js.native
  def listAssociatedFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedFleetsResult, Unit]): Request[ListAssociatedFleetsResult, AWSError] = js.native
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(params: ListAssociatedFleetsRequest): Request[ListAssociatedFleetsResult, AWSError] = js.native
  def listAssociatedFleets(
    params: ListAssociatedFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedFleetsResult, Unit]
  ): Request[ListAssociatedFleetsResult, AWSError] = js.native
  
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(): Request[ListAssociatedStacksResult, AWSError] = js.native
  def listAssociatedStacks(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedStacksResult, Unit]): Request[ListAssociatedStacksResult, AWSError] = js.native
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(params: ListAssociatedStacksRequest): Request[ListAssociatedStacksResult, AWSError] = js.native
  def listAssociatedStacks(
    params: ListAssociatedStacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedStacksResult, Unit]
  ): Request[ListAssociatedStacksResult, AWSError] = js.native
  
  /**
    * Retrieves a list of entitled applications.
    */
  def listEntitledApplications(): Request[ListEntitledApplicationsResult, AWSError] = js.native
  def listEntitledApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitledApplicationsResult, Unit]): Request[ListEntitledApplicationsResult, AWSError] = js.native
  /**
    * Retrieves a list of entitled applications.
    */
  def listEntitledApplications(params: ListEntitledApplicationsRequest): Request[ListEntitledApplicationsResult, AWSError] = js.native
  def listEntitledApplications(
    params: ListEntitledApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitledApplicationsResult, Unit]
  ): Request[ListEntitledApplicationsResult, AWSError] = js.native
  
  /**
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts the specified fleet.
    */
  def startFleet(): Request[StartFleetResult, AWSError] = js.native
  def startFleet(callback: js.Function2[/* err */ AWSError, /* data */ StartFleetResult, Unit]): Request[StartFleetResult, AWSError] = js.native
  /**
    * Starts the specified fleet.
    */
  def startFleet(params: StartFleetRequest): Request[StartFleetResult, AWSError] = js.native
  def startFleet(
    params: StartFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFleetResult, Unit]
  ): Request[StartFleetResult, AWSError] = js.native
  
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(): Request[StartImageBuilderResult, AWSError] = js.native
  def startImageBuilder(callback: js.Function2[/* err */ AWSError, /* data */ StartImageBuilderResult, Unit]): Request[StartImageBuilderResult, AWSError] = js.native
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(params: StartImageBuilderRequest): Request[StartImageBuilderResult, AWSError] = js.native
  def startImageBuilder(
    params: StartImageBuilderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImageBuilderResult, Unit]
  ): Request[StartImageBuilderResult, AWSError] = js.native
  
  /**
    * Stops the specified fleet.
    */
  def stopFleet(): Request[StopFleetResult, AWSError] = js.native
  def stopFleet(callback: js.Function2[/* err */ AWSError, /* data */ StopFleetResult, Unit]): Request[StopFleetResult, AWSError] = js.native
  /**
    * Stops the specified fleet.
    */
  def stopFleet(params: StopFleetRequest): Request[StopFleetResult, AWSError] = js.native
  def stopFleet(
    params: StopFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopFleetResult, Unit]
  ): Request[StopFleetResult, AWSError] = js.native
  
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(): Request[StopImageBuilderResult, AWSError] = js.native
  def stopImageBuilder(callback: js.Function2[/* err */ AWSError, /* data */ StopImageBuilderResult, Unit]): Request[StopImageBuilderResult, AWSError] = js.native
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(params: StopImageBuilderRequest): Request[StopImageBuilderResult, AWSError] = js.native
  def stopImageBuilder(
    params: StopImageBuilderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopImageBuilderResult, Unit]
  ): Request[StopImageBuilderResult, AWSError] = js.native
  
  /**
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified application.
    */
  def updateApplication(): Request[UpdateApplicationResult, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResult, Unit]): Request[UpdateApplicationResult, AWSError] = js.native
  /**
    * Updates the specified application.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResult, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResult, Unit]
  ): Request[UpdateApplicationResult, AWSError] = js.native
  
  /**
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  def updateDirectoryConfig(): Request[UpdateDirectoryConfigResult, AWSError] = js.native
  def updateDirectoryConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDirectoryConfigResult, Unit]): Request[UpdateDirectoryConfigResult, AWSError] = js.native
  /**
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): Request[UpdateDirectoryConfigResult, AWSError] = js.native
  def updateDirectoryConfig(
    params: UpdateDirectoryConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDirectoryConfigResult, Unit]
  ): Request[UpdateDirectoryConfigResult, AWSError] = js.native
  
  /**
    * Updates the specified entitlement.
    */
  def updateEntitlement(): Request[UpdateEntitlementResult, AWSError] = js.native
  def updateEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEntitlementResult, Unit]): Request[UpdateEntitlementResult, AWSError] = js.native
  /**
    * Updates the specified entitlement.
    */
  def updateEntitlement(params: UpdateEntitlementRequest): Request[UpdateEntitlementResult, AWSError] = js.native
  def updateEntitlement(
    params: UpdateEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEntitlementResult, Unit]
  ): Request[UpdateEntitlementResult, AWSError] = js.native
  
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the following based on the fleet type:   Always-On and On-Demand fleet types You can update the DisplayName, ComputeCapacity, ImageARN, ImageName, IdleDisconnectTimeoutInSeconds, and DisconnectTimeoutInSeconds attributes.   Elastic fleet type You can update the DisplayName, IdleDisconnectTimeoutInSeconds, DisconnectTimeoutInSeconds, MaxConcurrentSessions, SessionScriptS3Location and UsbDeviceFilterStrings attributes.   If the fleet is in the STARTING or STOPPED state, you can't update it.
    */
  def updateFleet(): Request[UpdateFleetResult, AWSError] = js.native
  def updateFleet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetResult, Unit]): Request[UpdateFleetResult, AWSError] = js.native
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the following based on the fleet type:   Always-On and On-Demand fleet types You can update the DisplayName, ComputeCapacity, ImageARN, ImageName, IdleDisconnectTimeoutInSeconds, and DisconnectTimeoutInSeconds attributes.   Elastic fleet type You can update the DisplayName, IdleDisconnectTimeoutInSeconds, DisconnectTimeoutInSeconds, MaxConcurrentSessions, SessionScriptS3Location and UsbDeviceFilterStrings attributes.   If the fleet is in the STARTING or STOPPED state, you can't update it.
    */
  def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResult, AWSError] = js.native
  def updateFleet(
    params: UpdateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetResult, Unit]
  ): Request[UpdateFleetResult, AWSError] = js.native
  
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(): Request[UpdateImagePermissionsResult, AWSError] = js.native
  def updateImagePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateImagePermissionsResult, Unit]): Request[UpdateImagePermissionsResult, AWSError] = js.native
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(params: UpdateImagePermissionsRequest): Request[UpdateImagePermissionsResult, AWSError] = js.native
  def updateImagePermissions(
    params: UpdateImagePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImagePermissionsResult, Unit]
  ): Request[UpdateImagePermissionsResult, AWSError] = js.native
  
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(): Request[UpdateStackResult, AWSError] = js.native
  def updateStack(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackResult, Unit]): Request[UpdateStackResult, AWSError] = js.native
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(params: UpdateStackRequest): Request[UpdateStackResult, AWSError] = js.native
  def updateStack(
    params: UpdateStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackResult, Unit]
  ): Request[UpdateStackResult, AWSError] = js.native
  
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(state: fleetStarted): Request[DescribeFleetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: fleetStarted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(state: fleetStarted, params: DescribeFleetsRequestwait): Request[DescribeFleetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: fleetStarted,
    params: DescribeFleetsRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(state: fleetStopped): Request[DescribeFleetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: fleetStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(state: fleetStopped, params: DescribeFleetsRequestwait): Request[DescribeFleetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: fleetStopped,
    params: DescribeFleetsRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
}
