package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The name of the virtual service to describe.
    */
  var virtualServiceName: ServiceName = js.native
}

object DescribeVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DescribeVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceInput]
  }
  @scala.inline
  implicit class DescribeVirtualServiceInputOps[Self <: DescribeVirtualServiceInput] (val x: Self) extends AnyVal {
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
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualServiceName(value: ServiceName): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
  }
  
}

