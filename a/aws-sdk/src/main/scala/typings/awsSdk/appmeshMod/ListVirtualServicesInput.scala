package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualServicesInput extends js.Object {
  /**
    * The maximum number of results returned by ListVirtualServices in paginated
    output. When you use this parameter, ListVirtualServices returns only
    limit results in a single page along with a nextToken response
    element. You can see the remaining results of the initial request by sending another
    ListVirtualServices request with the returned nextToken value.
    This value can be between 1 and 100. If you don't use this
    parameter, ListVirtualServices returns up to 100 results and
    a nextToken value if applicable.
    */
  var limit: js.UndefOr[ListVirtualServicesLimit] = js.native
  /**
    * The name of the service mesh to list virtual services in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListVirtualServices request where limit was used and the
    results exceeded the value of that parameter. Pagination continues from the end of the
    previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListVirtualServicesInput {
  @scala.inline
  def apply(meshName: ResourceName): ListVirtualServicesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualServicesInput]
  }
  @scala.inline
  implicit class ListVirtualServicesInputOps[Self <: ListVirtualServicesInput] (val x: Self) extends AnyVal {
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
    def setLimit(value: ListVirtualServicesLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

