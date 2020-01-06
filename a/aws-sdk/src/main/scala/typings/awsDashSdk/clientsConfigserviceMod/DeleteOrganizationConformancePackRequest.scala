package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOrganizationConformancePackRequest extends js.Object {
  /**
    * The name of organization conformance pack that you want to delete.
    */
  var OrganizationConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackName = js.native
}

object DeleteOrganizationConformancePackRequest {
  @scala.inline
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): DeleteOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOrganizationConformancePackRequest]
  }
}

