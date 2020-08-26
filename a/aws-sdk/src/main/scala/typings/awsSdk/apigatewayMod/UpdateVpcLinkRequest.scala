package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVpcLinkRequest extends js.Object {
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String = js.native
}

object UpdateVpcLinkRequest {
  @scala.inline
  def apply(vpcLinkId: String): UpdateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcLinkRequest]
  }
  @scala.inline
  implicit class UpdateVpcLinkRequestOps[Self <: UpdateVpcLinkRequest] (val x: Self) extends AnyVal {
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
    def setVpcLinkId(value: String): Self = this.set("vpcLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = this.set("patchOperations", js.Array(value :_*))
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = this.set("patchOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchOperations: Self = this.set("patchOperations", js.undefined)
  }
  
}

