package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferScanResult extends js.Object {
  var buffer: TextBuffer
  var lineText: java.lang.String
  var `match`: stdLib.RegExpExecArray
  var matchText: java.lang.String
  var range: Range
  var stopped: scala.Boolean
  def replace(replacementText: java.lang.String): scala.Unit
  def stop(): scala.Unit
}

object BufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    lineText: java.lang.String,
    `match`: stdLib.RegExpExecArray,
    matchText: java.lang.String,
    range: Range,
    replace: js.Function1[java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    stopped: scala.Boolean
  ): BufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, lineText = lineText, matchText = matchText, range = range, replace = replace, stop = stop, stopped = stopped)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[BufferScanResult]
  }
}

