package typings
package asyncDashWriterLib.asyncDashWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "BufferedWriter")
@js.native
class BufferedWriter protected () extends js.Object {
  def this(wrappedStream: nodeLib.streamMod.Stream) = this()
  def clear(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): BufferedWriter = js.native
  def once(event: java.lang.String, callback: js.Function): BufferedWriter = js.native
  def write(what: java.lang.String): BufferedWriter = js.native
}

