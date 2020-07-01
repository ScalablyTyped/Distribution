package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualNodeInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The new virtual node specification to apply. This overwrites the existing data.
    */
  var spec: VirtualNodeSpec = js.native
  /**
    * The name of the virtual node to update.
    */
  var virtualNodeName: ResourceName = js.native
}

object UpdateVirtualNodeInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualNodeSpec,
    virtualNodeName: ResourceName,
    clientToken: String = null,
    meshOwner: AccountId = null
  ): UpdateVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (meshOwner != null) __obj.updateDynamic("meshOwner")(meshOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualNodeInput]
  }
}

