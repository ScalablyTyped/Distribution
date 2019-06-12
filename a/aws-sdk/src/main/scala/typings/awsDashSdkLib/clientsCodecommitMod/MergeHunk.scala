package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeHunk extends js.Object {
  /**
    * Information about the merge hunk in the base of a merge or pull request.
    */
  var base: js.UndefOr[MergeHunkDetail] = js.undefined
  /**
    * Information about the merge hunk in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[MergeHunkDetail] = js.undefined
  /**
    * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid values include true, false, and null.
    */
  var isConflict: js.UndefOr[IsHunkConflict] = js.undefined
  /**
    * Information about the merge hunk in the source of a merge or pull request.
    */
  var source: js.UndefOr[MergeHunkDetail] = js.undefined
}

object MergeHunk {
  @scala.inline
  def apply(
    base: MergeHunkDetail = null,
    destination: MergeHunkDetail = null,
    isConflict: js.UndefOr[IsHunkConflict] = js.undefined,
    source: MergeHunkDetail = null
  ): MergeHunk = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(isConflict)) __obj.updateDynamic("isConflict")(isConflict)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MergeHunk]
  }
}

