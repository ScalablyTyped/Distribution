package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * stores information for locating the error in the original XML document.
  * @see XLocator
  */
trait SAXParseException
  extends StObject
     with SAXException {
  
  /** contains the column number in the document. */
  var ColumnNumber: Double
  
  /** contains the line number in the document. */
  var LineNumber: Double
  
  /** contains the public identifier of the document where the exception has occurred. */
  var PublicId: String
  
  /** contains the system identifier of the document. */
  var SystemId: String
}
object SAXParseException {
  
  inline def apply(
    ColumnNumber: Double,
    Context: XInterface,
    LineNumber: Double,
    Message: String,
    PublicId: String,
    SystemId: String,
    WrappedException: Any
  ): SAXParseException = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], WrappedException = WrappedException.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXParseException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAXParseException] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
