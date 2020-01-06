package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainConfigurationsResponse extends js.Object {
  /**
    * A list of objects that contain summary information about the user's domain configurations.
    */
  var domainConfigurations: js.UndefOr[DomainConfigurations] = js.native
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListDomainConfigurationsResponse {
  @scala.inline
  def apply(domainConfigurations: DomainConfigurations = null, nextMarker: Marker = null): ListDomainConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (domainConfigurations != null) __obj.updateDynamic("domainConfigurations")(domainConfigurations.asInstanceOf[js.Any])
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainConfigurationsResponse]
  }
}

