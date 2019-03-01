package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceScanOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[scala.Double] = js.undefined
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ scala.Double, scala.Unit]] = js.undefined
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[scala.Double] = js.undefined
}

object WorkspaceScanOptions {
  @scala.inline
  def apply(
    leadingContextLineCount: scala.Int | scala.Double = null,
    onPathsSearched: js.Function1[/* pathsSearched */ scala.Double, scala.Unit] = null,
    paths: js.Array[java.lang.String] = null,
    trailingContextLineCount: scala.Int | scala.Double = null
  ): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    if (leadingContextLineCount != null) __obj.updateDynamic("leadingContextLineCount")(leadingContextLineCount.asInstanceOf[js.Any])
    if (onPathsSearched != null) __obj.updateDynamic("onPathsSearched")(onPathsSearched)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (trailingContextLineCount != null) __obj.updateDynamic("trailingContextLineCount")(trailingContextLineCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
}

