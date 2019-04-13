package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchBaselinesResult extends js.Object {
  /**
    * An array of PatchBaselineIdentity elements.
    */
  var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribePatchBaselinesResult {
  @scala.inline
  def apply(BaselineIdentities: PatchBaselineIdentityList = null, NextToken: NextToken = null): DescribePatchBaselinesResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineIdentities != null) __obj.updateDynamic("BaselineIdentities")(BaselineIdentities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribePatchBaselinesResult]
  }
}

