package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
  /**
    * The job ID that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations.
    */
  var JobId: js.UndefOr[jobIDType] = js.undefined
}

object GenerateServiceLastAccessedDetailsResponse {
  @scala.inline
  def apply(JobId: jobIDType = null): GenerateServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
  }
}

