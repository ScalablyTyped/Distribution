package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanContextOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.native
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.native
}

object ScanContextOptions {
  @scala.inline
  def apply(): ScanContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanContextOptions]
  }
  @scala.inline
  implicit class ScanContextOptionsOps[Self <: ScanContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeadingContextLineCount(value: Double): Self = this.set("leadingContextLineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingContextLineCount: Self = this.set("leadingContextLineCount", js.undefined)
    @scala.inline
    def setTrailingContextLineCount(value: Double): Self = this.set("trailingContextLineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingContextLineCount: Self = this.set("trailingContextLineCount", js.undefined)
  }
  
}

