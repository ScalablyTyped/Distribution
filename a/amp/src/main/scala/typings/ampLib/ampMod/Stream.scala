package typings
package ampLib.ampMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amp", "Stream")
@js.native
class Stream protected ()
  extends nodeLib.streamMod.Writable {
  def this(opts: nodeLib.streamMod.WritableOptions) = this()
  def _write(chunk: js.Any, encoding: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
}

