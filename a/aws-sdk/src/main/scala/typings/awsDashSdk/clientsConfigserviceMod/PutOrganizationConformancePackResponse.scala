package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConformancePackResponse extends js.Object {
  /**
    * ARN of the organization conformance pack.
    */
  var OrganizationConformancePackArn: js.UndefOr[StringWithCharLimit256] = js.native
}

object PutOrganizationConformancePackResponse {
  @scala.inline
  def apply(OrganizationConformancePackArn: StringWithCharLimit256 = null): PutOrganizationConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationConformancePackArn != null) __obj.updateDynamic("OrganizationConformancePackArn")(OrganizationConformancePackArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConformancePackResponse]
  }
}

