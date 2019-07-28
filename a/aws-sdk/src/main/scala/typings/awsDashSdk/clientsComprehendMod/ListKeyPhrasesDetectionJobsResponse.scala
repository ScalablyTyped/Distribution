package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.KeyPhrasesDetectionJobPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListKeyPhrasesDetectionJobsResponse {
  @scala.inline
  def apply(
    KeyPhrasesDetectionJobPropertiesList: KeyPhrasesDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyPhrasesDetectionJobPropertiesList != null) __obj.updateDynamic("KeyPhrasesDetectionJobPropertiesList")(KeyPhrasesDetectionJobPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
}

