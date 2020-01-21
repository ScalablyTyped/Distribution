package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft XML Writer 6.0 */
@JSGlobal("MSXML2.MXXMLWriter60")
@js.native
class MXXMLWriter60 protected () extends js.Object {
  @JSName("MSXML2.MXXMLWriter60_typekey")
  var MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60 = js.native
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: Boolean = js.native
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: Boolean = js.native
  /** Set or get the output encoding. */
  var encoding: String = js.native
  /** Enable or disable auto indent mode. */
  var indent: Boolean = js.native
  /** Determine whether or not to omit the XML declaration. */
  var omitXMLDeclaration: Boolean = js.native
  /** Set or get the output. */
  var output: js.Any = js.native
  /** Set or get the standalone document declaration. */
  var standalone: Boolean = js.native
  /** Set or get the xml version info. */
  var version: String = js.native
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): Unit = js.native
}

