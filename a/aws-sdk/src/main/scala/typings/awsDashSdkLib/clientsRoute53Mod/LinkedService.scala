package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedService extends js.Object {
  /**
    * If the health check or hosted zone was created by another service, an optional description that can be provided by the other service. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * If the health check or hosted zone was created by another service, the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
}

object LinkedService {
  @scala.inline
  def apply(Description: ResourceDescription = null, ServicePrincipal: ServicePrincipal = null): LinkedService = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ServicePrincipal != null) __obj.updateDynamic("ServicePrincipal")(ServicePrincipal)
    __obj.asInstanceOf[LinkedService]
  }
}

