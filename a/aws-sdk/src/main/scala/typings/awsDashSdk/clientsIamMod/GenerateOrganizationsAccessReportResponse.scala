package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOrganizationsAccessReportResponse extends js.Object {
  /**
    * The job identifier that you can use in the GetOrganizationsAccessReport operation.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}

object GenerateOrganizationsAccessReportResponse {
  @scala.inline
  def apply(JobId: jobIDType = null): GenerateOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
  }
}

