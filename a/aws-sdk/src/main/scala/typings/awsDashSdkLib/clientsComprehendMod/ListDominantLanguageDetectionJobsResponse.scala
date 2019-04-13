package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDominantLanguageDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDominantLanguageDetectionJobsResponse {
  @scala.inline
  def apply(
    DominantLanguageDetectionJobPropertiesList: DominantLanguageDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListDominantLanguageDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (DominantLanguageDetectionJobPropertiesList != null) __obj.updateDynamic("DominantLanguageDetectionJobPropertiesList")(DominantLanguageDetectionJobPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
  }
}

