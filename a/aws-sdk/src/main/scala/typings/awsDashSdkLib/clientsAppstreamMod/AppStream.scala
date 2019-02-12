package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppStream
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppStream: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ClientConfiguration = js.native
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified fleet with the specified stack.
    */
  def associateFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.AssociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchAssociateUserStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
    */
  def batchAssociateUserStack(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchAssociateUserStack(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchAssociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisassociateUserStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified users from the specified stacks.
    */
  def batchDisassociateUserStack(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisassociateUserStack(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.BatchDisassociateUserStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
    */
  def copyImage(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyImage(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CopyImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def createDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def createDirectoryConfig(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectoryConfig(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet. A fleet consists of streaming instances that run a specified image.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet. A fleet consists of streaming instances that run a specified image.
    */
  def createFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
    */
  def createImageBuilder(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImageBuilder(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImageBuilderStreamingURL(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a URL to start an image builder streaming session.
    */
  def createImageBuilderStreamingURL(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImageBuilderStreamingURL(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateImageBuilderStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
    */
  def createStack(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStack(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStreamingURL(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
    */
  def createStreamingURL(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStreamingURL(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateStreamingURLResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new user in the user pool.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new user in the user pool.
    */
  def createUser(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.CreateUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def deleteDirectoryConfig(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectoryConfig(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified fleet.
    */
  def deleteFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
    */
  def deleteImage(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImage(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image builder and releases the capacity.
    */
  def deleteImageBuilder(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImageBuilder(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
    */
  def deleteImagePermissions(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteImagePermissions(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
    */
  def deleteStack(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStack(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a user from the user pool.
    */
  def deleteUser(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUser(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DeleteUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectoryConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
    */
  def describeDirectoryConfigs(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectoryConfigs(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeDirectoryConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
    */
  def describeFleets(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleets(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImageBuilders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
    */
  def describeImageBuilders(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImageBuilders(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImageBuildersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
    */
  def describeImagePermissions(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImagePermissions(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
    */
  def describeImages(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImages(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
    */
  def describeSessions(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSessions(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
    */
  def describeStacks(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStacks(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserStackAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
    */
  def describeUserStackAssociations(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserStackAssociations(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUserStackAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified users in the user pool.
    */
  def describeUsers(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUsers(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeUsersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
    */
  def disableUser(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableUser(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified fleet from the specified stack.
    */
  def disassociateFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DisassociateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
    */
  def enableUser(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableUser(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.EnableUserResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def expireSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Immediately stops the specified streaming session.
    */
  def expireSession(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def expireSession(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ExpireSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociatedFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the name of the fleet that is associated with the specified stack.
    */
  def listAssociatedFleets(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociatedFleets(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociatedStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the name of the stack with which the specified fleet is associated.
    */
  def listAssociatedStacks(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociatedStacks(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListAssociatedStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified fleet.
    */
  def startFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified fleet.
    */
  def startFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified image builder.
    */
  def startImageBuilder(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImageBuilder(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StartImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the specified fleet.
    */
  def stopFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the specified fleet.
    */
  def stopFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopImageBuilder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the specified image builder.
    */
  def stopImageBuilder(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopImageBuilder(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.StopImageBuilderResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def tagResource(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  def untagResource(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def updateDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDirectoryConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
    */
  def updateDirectoryConfig(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDirectoryConfig(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateDirectoryConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
    */
  def updateFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
    */
  def updateFleet(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleet(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateImagePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates permissions for the specified private image. 
    */
  def updateImagePermissions(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateImagePermissions(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateImagePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified fields for the specified stack.
    */
  def updateStack(params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStack(
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.UpdateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_fleetStarted(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_fleetStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
    params: awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppstreamMod.AppStreamNs.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

