package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft XML Writer 6.0 */
@js.native
trait MXXMLWriter60 extends js.Object {
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

object MXXMLWriter60 {
  @scala.inline
  def apply(
    MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60,
    byteOrderMark: Boolean,
    disableOutputEscaping: Boolean,
    encoding: String,
    flush: () => Unit,
    indent: Boolean,
    omitXMLDeclaration: Boolean,
    output: js.Any,
    standalone: Boolean,
    version: String
  ): MXXMLWriter60 = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], disableOutputEscaping = disableOutputEscaping.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), indent = indent.asInstanceOf[js.Any], omitXMLDeclaration = omitXMLDeclaration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.MXXMLWriter60_typekey")(MSXML2DotMXXMLWriter60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXXMLWriter60]
  }
  @scala.inline
  implicit class MXXMLWriter60Ops[Self <: MXXMLWriter60] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSXML2DotMXXMLWriter60_typekey(value: MXXMLWriter60): Self = this.set("MSXML2.MXXMLWriter60_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteOrderMark(value: Boolean): Self = this.set("byteOrderMark", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableOutputEscaping(value: Boolean): Self = this.set("disableOutputEscaping", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setIndent(value: Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setOmitXMLDeclaration(value: Boolean): Self = this.set("omitXMLDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

