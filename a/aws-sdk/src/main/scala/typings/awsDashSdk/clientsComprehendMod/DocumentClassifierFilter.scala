package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentClassifierFilter extends js.Object {
  /**
    * Filters the list of classifiers based on status. 
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted after the specified time. Classifiers are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted before the specified time. Classifiers are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
}

object DocumentClassifierFilter {
  @scala.inline
  def apply(Status: ModelStatus = null, SubmitTimeAfter: Timestamp = null, SubmitTimeBefore: Timestamp = null): DocumentClassifierFilter = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTimeAfter != null) __obj.updateDynamic("SubmitTimeAfter")(SubmitTimeAfter)
    if (SubmitTimeBefore != null) __obj.updateDynamic("SubmitTimeBefore")(SubmitTimeBefore)
    __obj.asInstanceOf[DocumentClassifierFilter]
  }
}

