package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3KeyFilter extends js.Object {
  /**
    * 
    */
  var FilterRules: js.UndefOr[FilterRuleList] = js.undefined
}

object S3KeyFilter {
  @scala.inline
  def apply(FilterRules: FilterRuleList = null): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules)
    __obj.asInstanceOf[S3KeyFilter]
  }
}

