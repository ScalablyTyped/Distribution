package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual node.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var meshOwner: AccountId = js.native
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's
    the ID of the mesh owner, or another account that the mesh is shared with. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var resourceOwner: AccountId = js.native
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName = js.native
}

object VirtualNodeRef {
  @scala.inline
  def apply(
    arn: Arn,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    virtualNodeName: ResourceName
  ): VirtualNodeRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeRef]
  }
}

