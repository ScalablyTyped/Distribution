package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path of the BasePathMapping resource to change.
    */
  var basePath: String
  /**
    * [Required] The domain name of the BasePathMapping resource to change.
    */
  var domainName: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}

object UpdateBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String, patchOperations: ListOfPatchOperation = null): UpdateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath, domainName = domainName)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateBasePathMappingRequest]
  }
}

