package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppStream
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppStream: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(params: AssociateFleetRequest): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateFleet(
    params: AssociateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchAssociateUserStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchAssociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(params: BatchAssociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchAssociateUserStack(
    params: BatchAssociateUserStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchAssociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisassociateUserStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisassociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(params: BatchDisassociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisassociateUserStack(
    params: BatchDisassociateUserStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisassociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(params: CopyImageRequest): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyImage(
    params: CopyImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def createDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def createDirectoryConfig(params: CreateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectoryConfig(
    params: CreateDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of streaming instances that run a specified image.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of streaming instances that run a specified image.
    */
  def createFleet(params: CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(params: CreateImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImageBuilder(
    params: CreateImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImageBuilderStreamingURL(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImageBuilderStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImageBuilderStreamingURL(
    params: CreateImageBuilderStreamingURLRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImageBuilderStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(params: CreateStackRequest): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStack(
    params: CreateStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingURL(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(params: CreateStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingURL(
    params: CreateStreamingURLRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new user in the user pool.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new user in the user pool.
    */
  def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectoryConfig(
    params: DeleteDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(params: DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(params: DeleteImageRequest): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImage(
    params: DeleteImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(params: DeleteImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImageBuilder(
    params: DeleteImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(params: DeleteImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteImagePermissions(
    params: DeleteImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(params: DeleteStackRequest): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStack(
    params: DeleteStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectoryConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectoryConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectoryConfigs(
    params: DescribeDirectoryConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectoryConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(params: DescribeFleetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleets(
    params: DescribeFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImageBuilders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImageBuildersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(params: DescribeImageBuildersRequest): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImageBuilders(
    params: DescribeImageBuildersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImageBuildersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(params: DescribeImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImagePermissions(
    params: DescribeImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(params: DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeImages(
    params: DescribeImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(params: DescribeSessionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSessions(
    params: DescribeSessionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(params: DescribeStacksRequest): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStacks(
    params: DescribeStacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserStackAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserStackAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(params: DescribeUserStackAssociationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserStackAssociations(
    params: DescribeUserStackAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserStackAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUsersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(params: DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUsers(
    params: DescribeUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUsersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(params: DisableUserRequest): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableUser(
    params: DisableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(params: DisassociateFleetRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFleet(
    params: DisassociateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(params: EnableUserRequest): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableUser(
    params: EnableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def expireSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExpireSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(params: ExpireSessionRequest): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def expireSession(
    params: ExpireSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExpireSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociatedFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociatedFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(params: ListAssociatedFleetsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociatedFleets(
    params: ListAssociatedFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociatedFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociatedStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociatedStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(params: ListAssociatedStacksRequest): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociatedStacks(
    params: ListAssociatedStacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociatedStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Starts the specified fleet.
    */
  def startFleet(): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the specified fleet.
    */
  def startFleet(params: StartFleetRequest): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startFleet(
    params: StartFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(params: StartImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startImageBuilder(
    params: StartImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the specified fleet.
    */
  def stopFleet(): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopFleet(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopFleetResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the specified fleet.
    */
  def stopFleet(params: StopFleetRequest): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopFleet(
    params: StopFleetRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopFleetResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(params: StopImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopImageBuilder(
    params: StopImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def updateDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDirectoryConfig(
    params: UpdateDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
    */
  def updateFleet(): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
    */
  def updateFleet(params: UpdateFleetRequest): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFleet(
    params: UpdateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(params: UpdateImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateImagePermissions(
    params: UpdateImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(params: UpdateStackRequest): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStack(
    params: UpdateStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

