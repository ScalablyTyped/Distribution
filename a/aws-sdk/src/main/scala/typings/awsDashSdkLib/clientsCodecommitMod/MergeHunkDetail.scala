package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeHunkDetail extends js.Object {
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.undefined
  /**
    * The base-64 encoded content of the hunk merged region that might or might not contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.undefined
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.undefined
}

object MergeHunkDetail {
  @scala.inline
  def apply(
    endLine: js.UndefOr[LineNumber] = js.undefined,
    hunkContent: HunkContent = null,
    startLine: js.UndefOr[LineNumber] = js.undefined
  ): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine)
    if (hunkContent != null) __obj.updateDynamic("hunkContent")(hunkContent)
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine)
    __obj.asInstanceOf[MergeHunkDetail]
  }
}

