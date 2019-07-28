package typings.atom.atomMod

import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferScanResult extends js.Object {
  var buffer: TextBuffer
  var lineText: String
  var `match`: RegExpExecArray
  var matchText: String
  var range: Range
  var stopped: Boolean
  def replace(replacementText: String): Unit
  def stop(): Unit
}

object BufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): BufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, lineText = lineText, matchText = matchText, range = range, replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[BufferScanResult]
  }
}

