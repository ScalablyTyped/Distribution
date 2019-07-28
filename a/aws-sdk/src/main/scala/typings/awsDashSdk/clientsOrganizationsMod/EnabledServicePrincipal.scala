package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledServicePrincipal extends js.Object {
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.ServicePrincipal] = js.undefined
}

object EnabledServicePrincipal {
  @scala.inline
  def apply(DateEnabled: Timestamp = null, ServicePrincipal: ServicePrincipal = null): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    if (DateEnabled != null) __obj.updateDynamic("DateEnabled")(DateEnabled)
    if (ServicePrincipal != null) __obj.updateDynamic("ServicePrincipal")(ServicePrincipal)
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
}

