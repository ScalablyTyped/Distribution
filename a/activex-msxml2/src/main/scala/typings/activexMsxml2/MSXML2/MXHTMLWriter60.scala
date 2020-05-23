package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft HTML Writer 6.0 */
trait MXHTMLWriter60 extends js.Object {
  @JSName("MSXML2.MXHTMLWriter60_typekey")
  var MSXML2DotMXHTMLWriter60_typekey: MXHTMLWriter60
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: Boolean
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: Boolean
  /** Set or get the output encoding. */
  var encoding: String
  /** Enable or disable auto indent mode. */
  var indent: Boolean
  /** Determine whether or not to omit the XML declaration. */
  var omitXMLDeclaration: Boolean
  /** Set or get the output. */
  var output: js.Any
  /** Set or get the standalone document declaration. */
  var standalone: Boolean
  /** Set or get the xml version info. */
  var version: String
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): Unit
}

object MXHTMLWriter60 {
  @scala.inline
  def apply(
    MSXML2DotMXHTMLWriter60_typekey: MXHTMLWriter60,
    byteOrderMark: Boolean,
    disableOutputEscaping: Boolean,
    encoding: String,
    flush: () => Unit,
    indent: Boolean,
    omitXMLDeclaration: Boolean,
    output: js.Any,
    standalone: Boolean,
    version: String
  ): MXHTMLWriter60 = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], disableOutputEscaping = disableOutputEscaping.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), indent = indent.asInstanceOf[js.Any], omitXMLDeclaration = omitXMLDeclaration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.MXHTMLWriter60_typekey")(MSXML2DotMXHTMLWriter60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXHTMLWriter60]
  }
}

