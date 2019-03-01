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
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("leadingContextLines")(leadingContextLines)
    __obj.updateDynamic("lineText")(lineText)
    __obj.updateDynamic("matchText")(matchText)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("replace")(replace)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("stopped")(stopped)
    __obj.updateDynamic("trailingContextLines")(trailingContextLines)
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
}

