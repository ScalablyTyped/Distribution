package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEndpointOptionsResponse extends js.Object {
  /**
    * The newly-configured domain endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}

object UpdateDomainEndpointOptionsResponse {
  @scala.inline
  def apply(DomainEndpointOptions: DomainEndpointOptionsStatus = null): UpdateDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEndpointOptionsResponse]
  }
}

