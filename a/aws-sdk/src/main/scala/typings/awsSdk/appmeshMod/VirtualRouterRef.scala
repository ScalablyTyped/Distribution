package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual router.
    */
  var arn: Arn = js.native
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: Timestamp = js.native
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: AccountId = js.native
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's
    the ID of the mesh owner or of another account that the mesh is shared with. For more information about mesh sharing, see Working with shared meshes.
    */
  var resourceOwner: AccountId = js.native
  /**
    * The version of the resource. Resources are created at version 1, and this version is incremented each time that they're updated.
    */
  var version: Long = js.native
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}

object VirtualRouterRef {
  @scala.inline
  def apply(
    arn: Arn,
    createdAt: Timestamp,
    lastUpdatedAt: Timestamp,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    version: Long,
    virtualRouterName: ResourceName
  ): VirtualRouterRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterRef]
  }
  @scala.inline
  implicit class VirtualRouterRefOps[Self <: VirtualRouterRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceOwner(value: AccountId): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Long): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = this.set("virtualRouterName", value.asInstanceOf[js.Any])
  }
  
}

