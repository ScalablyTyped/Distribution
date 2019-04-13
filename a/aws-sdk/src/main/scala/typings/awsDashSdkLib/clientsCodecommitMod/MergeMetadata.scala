package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeMetadata extends js.Object {
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.undefined
}

object MergeMetadata {
  @scala.inline
  def apply(isMerged: js.UndefOr[IsMerged] = js.undefined, mergedBy: Arn = null): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMerged)) __obj.updateDynamic("isMerged")(isMerged)
    if (mergedBy != null) __obj.updateDynamic("mergedBy")(mergedBy)
    __obj.asInstanceOf[MergeMetadata]
  }
}

