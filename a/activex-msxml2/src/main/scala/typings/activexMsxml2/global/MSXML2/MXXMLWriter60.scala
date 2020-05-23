package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft XML Writer 6.0 */
@JSGlobal("MSXML2.MXXMLWriter60")
@js.native
class MXXMLWriter60 protected ()
  extends typings.activexMsxml2.MSXML2.MXXMLWriter60 {
  /* CompleteClass */
  @JSName("MSXML2.MXXMLWriter60_typekey")
  override var MSXML2DotMXXMLWriter60_typekey: typings.activexMsxml2.MSXML2.MXXMLWriter60 = js.native
  /** Determine whether or not to write the byte order mark */
  /* CompleteClass */
  override var byteOrderMark: Boolean = js.native
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  /* CompleteClass */
  override var disableOutputEscaping: Boolean = js.native
  /** Set or get the output encoding. */
  /* CompleteClass */
  override var encoding: String = js.native
  /** Enable or disable auto indent mode. */
  /* CompleteClass */
  override var indent: Boolean = js.native
  /** Determine whether or not to omit the XML declaration. */
  /* CompleteClass */
  override var omitXMLDeclaration: Boolean = js.native
  /** Set or get the output. */
  /* CompleteClass */
  override var output: js.Any = js.native
  /** Set or get the standalone document declaration. */
  /* CompleteClass */
  override var standalone: Boolean = js.native
  /** Set or get the xml version info. */
  /* CompleteClass */
  override var version: String = js.native
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  /* CompleteClass */
  override def flush(): Unit = js.native
}

