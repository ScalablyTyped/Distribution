package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft HTML Writer 6.0 */
@JSGlobal("MSXML2.MXHTMLWriter60")
@js.native
class MXHTMLWriter60 protected () extends js.Object {
  var `MSXML2.MXHTMLWriter60_typekey`: MXHTMLWriter60 = js.native
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: scala.Boolean = js.native
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: scala.Boolean = js.native
  /** Set or get the output encoding. */
  var encoding: java.lang.String = js.native
  /** Enable or disable auto indent mode. */
  var indent: scala.Boolean = js.native
  /** Determine whether or not to omit the XML declaration. */
  var omitXMLDeclaration: scala.Boolean = js.native
  /** Set or get the output. */
  var output: js.Any = js.native
  /** Set or get the standalone document declaration. */
  var standalone: scala.Boolean = js.native
  /** Set or get the xml version info. */
  var version: java.lang.String = js.native
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): scala.Unit = js.native
}

