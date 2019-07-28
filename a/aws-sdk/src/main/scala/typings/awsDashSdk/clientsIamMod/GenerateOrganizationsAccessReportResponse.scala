package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOrganizationsAccessReportResponse extends js.Object {
  /**
    * The job identifier that you can use in the GetOrganizationsAccessReport operation.
    */
  var JobId: js.UndefOr[jobIDType] = js.undefined
}

object GenerateOrganizationsAccessReportResponse {
  @scala.inline
  def apply(JobId: jobIDType = null): GenerateOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
  }
}

