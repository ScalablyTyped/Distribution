package typings.asyncWriter.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "BufferedWriter")
@js.native
class BufferedWriter protected () extends js.Object {
  def this(wrappedStream: Stream) = this()
  def clear(): Unit = js.native
  def end(): Unit = js.native
  def flush(): Unit = js.native
  def on(event: String, callback: js.Function): BufferedWriter = js.native
  def once(event: String, callback: js.Function): BufferedWriter = js.native
  def write(what: String): BufferedWriter = js.native
}

