package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanContextOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}

object ScanContextOptions {
  @scala.inline
  def apply(
    leadingContextLineCount: js.UndefOr[Double] = js.undefined,
    trailingContextLineCount: js.UndefOr[Double] = js.undefined
  ): ScanContextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leadingContextLineCount)) __obj.updateDynamic("leadingContextLineCount")(leadingContextLineCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailingContextLineCount)) __obj.updateDynamic("trailingContextLineCount")(trailingContextLineCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanContextOptions]
  }
}

