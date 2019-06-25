package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesResponse extends js.Object {
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns a list of services. 
    */
  var Services: js.UndefOr[ServiceInfoListDefinition] = js.undefined
}

object ListServicesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Services: ServiceInfoListDefinition = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Services != null) __obj.updateDynamic("Services")(Services)
    __obj.asInstanceOf[ListServicesResponse]
  }
}

