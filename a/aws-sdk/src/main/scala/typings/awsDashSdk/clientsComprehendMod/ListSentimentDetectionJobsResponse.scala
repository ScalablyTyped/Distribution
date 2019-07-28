package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSentimentDetectionJobsResponse extends js.Object {
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list containing the properties of each job that is returned.
    */
  var SentimentDetectionJobPropertiesList: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.SentimentDetectionJobPropertiesList] = js.undefined
}

object ListSentimentDetectionJobsResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    SentimentDetectionJobPropertiesList: SentimentDetectionJobPropertiesList = null
  ): ListSentimentDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SentimentDetectionJobPropertiesList != null) __obj.updateDynamic("SentimentDetectionJobPropertiesList")(SentimentDetectionJobPropertiesList)
    __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
  }
}

