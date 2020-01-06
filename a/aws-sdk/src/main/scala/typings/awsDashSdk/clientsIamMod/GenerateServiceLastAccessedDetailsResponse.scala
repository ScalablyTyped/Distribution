package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
  /**
    * The job ID that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}

object GenerateServiceLastAccessedDetailsResponse {
  @scala.inline
  def apply(JobId: jobIDType = null): GenerateServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
  }
}

