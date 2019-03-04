package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualBufferScanResult extends BufferScanResult {
  var leadingContextLines: js.Array[java.lang.String]
  var trailingContextLines: js.Array[java.lang.String]
}

object ContextualBufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    leadingContextLines: js.Array[java.lang.String],
    lineText: java.lang.String,
    `match`: stdLib.RegExpExecArray,
    matchText: java.lang.String,
    range: Range,
    replace: js.Function1[java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    stopped: scala.Boolean,
    trailingContextLines: js.Array[java.lang.String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, leadingContextLines = leadingContextLines, lineText = lineText, matchText = matchText, range = range, replace = replace, stop = stop, stopped = stopped, trailingContextLines = trailingContextLines)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
}

