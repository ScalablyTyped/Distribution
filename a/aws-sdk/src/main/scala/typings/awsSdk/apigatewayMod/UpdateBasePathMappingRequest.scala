package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path of the BasePathMapping resource to change. To specify an empty base path, set this parameter to '(none)'.
    */
  var basePath: String = js.native
  /**
    * [Required] The domain name of the BasePathMapping resource to change.
    */
  var domainName: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
}

object UpdateBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): UpdateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBasePathMappingRequest]
  }
  @scala.inline
  implicit class UpdateBasePathMappingRequestOps[Self <: UpdateBasePathMappingRequest] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = this.set("patchOperations", js.Array(value :_*))
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = this.set("patchOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchOperations: Self = this.set("patchOperations", js.undefined)
  }
  
}

