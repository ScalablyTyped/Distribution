package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchGroupsResult extends js.Object {
  /**
    * Each entry in the array contains: PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$) PatchBaselineIdentity: A PatchBaselineIdentity element. 
    */
  var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribePatchGroupsResult {
  @scala.inline
  def apply(Mappings: PatchGroupPatchBaselineMappingList = null, NextToken: NextToken = null): DescribePatchGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (Mappings != null) __obj.updateDynamic("Mappings")(Mappings)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribePatchGroupsResult]
  }
}

