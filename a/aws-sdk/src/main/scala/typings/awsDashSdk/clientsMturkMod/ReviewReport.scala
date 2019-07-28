package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewReport extends js.Object {
  /**
    *  A list of ReviewAction objects for each action specified in the Review Policy. 
    */
  var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined
  /**
    *  A list of ReviewResults objects for each action specified in the Review Policy. 
    */
  var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined
}

object ReviewReport {
  @scala.inline
  def apply(ReviewActions: ReviewActionDetailList = null, ReviewResults: ReviewResultDetailList = null): ReviewReport = {
    val __obj = js.Dynamic.literal()
    if (ReviewActions != null) __obj.updateDynamic("ReviewActions")(ReviewActions)
    if (ReviewResults != null) __obj.updateDynamic("ReviewResults")(ReviewResults)
    __obj.asInstanceOf[ReviewReport]
  }
}

