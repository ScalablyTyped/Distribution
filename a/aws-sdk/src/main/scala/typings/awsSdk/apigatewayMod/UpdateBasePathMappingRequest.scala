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
  def apply(basePath: String, domainName: String, patchOperations: ListOfPatchOperation = null): UpdateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBasePathMappingRequest]
  }
}

