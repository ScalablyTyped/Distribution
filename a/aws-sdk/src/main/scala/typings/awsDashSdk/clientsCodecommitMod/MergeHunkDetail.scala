package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHunkDetail extends js.Object {
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.native
  /**
    * The base-64 encoded content of the hunk merged region that might contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.native
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.native
}

object MergeHunkDetail {
  @scala.inline
  def apply(endLine: Int | Double = null, hunkContent: HunkContent = null, startLine: Int | Double = null): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (hunkContent != null) __obj.updateDynamic("hunkContent")(hunkContent.asInstanceOf[js.Any])
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeHunkDetail]
  }
}

