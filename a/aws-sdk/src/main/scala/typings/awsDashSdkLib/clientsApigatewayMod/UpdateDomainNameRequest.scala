package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainNameRequest extends js.Object {
  /**
    * [Required] The name of the DomainName resource to be changed.
    */
  var domainName: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}

object UpdateDomainNameRequest {
  @scala.inline
  def apply(domainName: String, patchOperations: ListOfPatchOperation = null): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
}

