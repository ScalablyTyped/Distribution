package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Microsoft XML Writer 6.0 */
trait MXXMLWriter60 extends StObject {
  
  /* private */ @JSName("MSXML2.MXXMLWriter60_typekey")
  var MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60
  
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: Boolean
  
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: Boolean
  
  /** Set or get the output encoding. */
  var encoding: String
  
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): Unit
  
  /** Enable or disable auto indent mode. */
  var indent: Boolean
  
  /** Determine whether or not to omit the XML declaration. */
  var omitXMLDeclaration: Boolean
  
  /** Set or get the output. */
  var output: Any
  
  /** Set or get the standalone document declaration. */
  var standalone: Boolean
  
  /** Set or get the xml version info. */
  var version: String
}
object MXXMLWriter60 {
  
  inline def apply(
    MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60,
    byteOrderMark: Boolean,
    disableOutputEscaping: Boolean,
    encoding: String,
    flush: () => Unit,
    indent: Boolean,
    omitXMLDeclaration: Boolean,
    output: Any,
    standalone: Boolean,
    version: String
  ): MXXMLWriter60 = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], disableOutputEscaping = disableOutputEscaping.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), indent = indent.asInstanceOf[js.Any], omitXMLDeclaration = omitXMLDeclaration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.MXXMLWriter60_typekey")(MSXML2DotMXXMLWriter60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXXMLWriter60]
  }
  
  extension [Self <: MXXMLWriter60](x: Self) {
    
    inline def setByteOrderMark(value: Boolean): Self = StObject.set(x, "byteOrderMark", value.asInstanceOf[js.Any])
    
    inline def setDisableOutputEscaping(value: Boolean): Self = StObject.set(x, "disableOutputEscaping", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setMSXML2DotMXXMLWriter60_typekey(value: MXXMLWriter60): Self = StObject.set(x, "MSXML2.MXXMLWriter60_typekey", value.asInstanceOf[js.Any])
    
    inline def setOmitXMLDeclaration(value: Boolean): Self = StObject.set(x, "omitXMLDeclaration", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
