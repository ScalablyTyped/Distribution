package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualRouterInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual router in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The name of the virtual router to delete.
    */
  var virtualRouterName: ResourceName = js.native
}

object DeleteVirtualRouterInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualRouterName: ResourceName, meshOwner: AccountId = null): DeleteVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (meshOwner != null) __obj.updateDynamic("meshOwner")(meshOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualRouterInput]
  }
}

