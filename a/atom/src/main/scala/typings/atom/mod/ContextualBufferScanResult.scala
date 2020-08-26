package typings.atom.mod

import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualBufferScanResult extends BufferScanResult {
  var leadingContextLines: js.Array[String] = js.native
  var trailingContextLines: js.Array[String] = js.native
}

object ContextualBufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    leadingContextLines: js.Array[String],
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean,
    trailingContextLines: js.Array[String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
  @scala.inline
  implicit class ContextualBufferScanResultOps[Self <: ContextualBufferScanResult] (val x: Self) extends AnyVal {
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
    def setLeadingContextLinesVarargs(value: String*): Self = this.set("leadingContextLines", js.Array(value :_*))
    @scala.inline
    def setLeadingContextLines(value: js.Array[String]): Self = this.set("leadingContextLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingContextLinesVarargs(value: String*): Self = this.set("trailingContextLines", js.Array(value :_*))
    @scala.inline
    def setTrailingContextLines(value: js.Array[String]): Self = this.set("trailingContextLines", value.asInstanceOf[js.Any])
  }
  
}

