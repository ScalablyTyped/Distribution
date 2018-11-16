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

