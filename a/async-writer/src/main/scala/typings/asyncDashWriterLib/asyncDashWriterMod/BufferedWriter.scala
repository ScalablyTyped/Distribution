package typings
package asyncDashWriterLib.asyncDashWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "BufferedWriter")
@js.native
class BufferedWriter protected ()
  extends asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.BufferedWriter {
  def this(wrappedStream: nodeLib.streamMod.Stream) = this()
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def end(): scala.Unit = js.native
  /* CompleteClass */
  override def flush(): scala.Unit = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, callback: js.Function): asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.BufferedWriter = js.native
  /* CompleteClass */
  override def once(event: java.lang.String, callback: js.Function): asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.BufferedWriter = js.native
  /* CompleteClass */
  override def write(what: java.lang.String): asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.BufferedWriter = js.native
}

