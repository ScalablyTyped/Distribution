package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntityRecognizersRequest extends js.Object {
  /**
    * Filters the list of entities returned. You can filter on Status, SubmitTimeBefore, or SubmitTimeAfter. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[EntityRecognizerFilter] = js.native
  /**
    *  The maximum number of results to return on each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntityRecognizersRequest {
  @scala.inline
  def apply(
    Filter: EntityRecognizerFilter = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): ListEntityRecognizersRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntityRecognizersRequest]
  }
}

