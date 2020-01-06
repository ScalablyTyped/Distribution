package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPHIDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[
    typings.awsDashSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList
  ] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListPHIDetectionJobsResponse {
  @scala.inline
  def apply(
    ComprehendMedicalAsyncJobPropertiesList: ComprehendMedicalAsyncJobPropertiesList = null,
    NextToken: String = null
  ): ListPHIDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobPropertiesList != null) __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(ComprehendMedicalAsyncJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPHIDetectionJobsResponse]
  }
}

