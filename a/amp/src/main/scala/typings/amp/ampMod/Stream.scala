package typings.amp.ampMod

import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amp", "Stream")
@js.native
class Stream protected () extends Writable {
  def this(opts: WritableOptions) = this()
  def _write(chunk: js.Any, encoding: String, fn: js.Function0[Unit]): Unit = js.native
}

