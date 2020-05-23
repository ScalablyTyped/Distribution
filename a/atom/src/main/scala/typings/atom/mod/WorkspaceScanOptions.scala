package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceScanOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.undefined
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}

object WorkspaceScanOptions {
  @scala.inline
  def apply(
    leadingContextLineCount: js.UndefOr[Double] = js.undefined,
    onPathsSearched: /* pathsSearched */ Double => Unit = null,
    paths: js.Array[String] = null,
    trailingContextLineCount: js.UndefOr[Double] = js.undefined
  ): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leadingContextLineCount)) __obj.updateDynamic("leadingContextLineCount")(leadingContextLineCount.get.asInstanceOf[js.Any])
    if (onPathsSearched != null) __obj.updateDynamic("onPathsSearched")(js.Any.fromFunction1(onPathsSearched))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(trailingContextLineCount)) __obj.updateDynamic("trailingContextLineCount")(trailingContextLineCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
}

