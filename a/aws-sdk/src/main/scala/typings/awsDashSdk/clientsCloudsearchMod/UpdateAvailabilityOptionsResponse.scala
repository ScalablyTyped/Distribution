package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityOptionsResponse extends js.Object {
  /**
    * The newly-configured availability options. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.native
}

object UpdateAvailabilityOptionsResponse {
  @scala.inline
  def apply(AvailabilityOptions: AvailabilityOptionsStatus = null): UpdateAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityOptions != null) __obj.updateDynamic("AvailabilityOptions")(AvailabilityOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
  }
}

