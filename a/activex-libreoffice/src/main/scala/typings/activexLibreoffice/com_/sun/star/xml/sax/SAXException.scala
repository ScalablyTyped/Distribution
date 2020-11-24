package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SAXException extends Exception {
  
  /** This field may contain a wrapped exception. */
  var WrappedException: js.Any = js.native
}
object SAXException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, WrappedException: js.Any): SAXException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], WrappedException = WrappedException.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXException]
  }
  
  @scala.inline
  implicit class SAXExceptionOps[Self <: SAXException] (val x: Self) extends AnyVal {
    
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
    def setWrappedException(value: js.Any): Self = this.set("WrappedException", value.asInstanceOf[js.Any])
  }
}
