package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
  /**
    * An array of patches and patch status.
    */
  var EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeEffectivePatchesForPatchBaselineResult {
  @scala.inline
  def apply(EffectivePatches: EffectivePatchList = null, NextToken: NextToken = null): DescribeEffectivePatchesForPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (EffectivePatches != null) __obj.updateDynamic("EffectivePatches")(EffectivePatches)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
  }
}

