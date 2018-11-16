package typings
package asyncDashWriterLib.asyncDashWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "StringWriter")
@js.native
class StringWriter protected ()
  extends asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.StringWriter {
  def this(events: nodeLib.eventsMod.EventEmitter) = this()
  /* CompleteClass */
  override def end(): scala.Unit = js.native
  /* CompleteClass */
  override def write(what: java.lang.String): asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs.StringWriter = js.native
}

