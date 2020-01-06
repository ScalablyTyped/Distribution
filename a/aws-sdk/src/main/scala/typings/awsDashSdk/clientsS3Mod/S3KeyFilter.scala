package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3KeyFilter extends js.Object {
  var FilterRules: js.UndefOr[FilterRuleList] = js.native
}

object S3KeyFilter {
  @scala.inline
  def apply(FilterRules: FilterRuleList = null): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3KeyFilter]
  }
}

