package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * encapsulates the details of an XML parse error or warning.
  *
  * This structure is a replacement for the Java class **org.xml.sax.SAXException** .
  *
  * Some abbreviations:
  *
  * SAX = Simple API for XMLURI = Uniform Resource IdentifierDTD = document type definition
  */
trait SAXException
  extends StObject
     with Exception {
  
  /** This field may contain a wrapped exception. */
  var WrappedException: Any
}
object SAXException {
  
  inline def apply(Context: XInterface, Message: String, WrappedException: Any): SAXException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], WrappedException = WrappedException.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAXException] (val x: Self) extends AnyVal {
    
    inline def setWrappedException(value: Any): Self = StObject.set(x, "WrappedException", value.asInstanceOf[js.Any])
  }
}
