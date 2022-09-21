package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface does not conform to the SAX-standard.
  *
  * Note: Whether or not every callback is supported is dependent on the parser implementation.
  */
trait XExtendedDocumentHandler
  extends StObject
     with XDocumentHandler {
  
  /** informs a writer that it is allowable to insert a line break and indentation before the next XDocumentHandler-call. */
  def allowLineBreak(): Unit
  
  /** receives notification about a comment in the XML-source. */
  def comment(sComment: String): Unit
  
  /**
    * informs about the end of a CDATA-Section.
    *
    * Note that `startCDATA/endCDATA` MUST NOT enclose any `startElement/endElement` -call!
    */
  def endCDATA(): Unit
  
  /**
    * receives notification about the start of a CDATA section in the XML-source.
    *
    * Any string coming in via character handler may include chars, that would otherwise be interpreted as markup.
    */
  def startCDATA(): Unit
  
  /** notifies that any characters that cannot be handled by other callback methods are announced through this method. */
  def unknown(sString: String): Unit
}
object XExtendedDocumentHandler {
  
  inline def apply(
    acquire: () => Unit,
    allowLineBreak: () => Unit,
    characters: String => Unit,
    comment: String => Unit,
    endCDATA: () => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startCDATA: () => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit,
    unknown: String => Unit
  ): XExtendedDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allowLineBreak = js.Any.fromFunction0(allowLineBreak), characters = js.Any.fromFunction1(characters), comment = js.Any.fromFunction1(comment), endCDATA = js.Any.fromFunction0(endCDATA), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startCDATA = js.Any.fromFunction0(startCDATA), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement), unknown = js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[XExtendedDocumentHandler]
  }
  
  extension [Self <: XExtendedDocumentHandler](x: Self) {
    
    inline def setAllowLineBreak(value: () => Unit): Self = StObject.set(x, "allowLineBreak", js.Any.fromFunction0(value))
    
    inline def setComment(value: String => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
    
    inline def setEndCDATA(value: () => Unit): Self = StObject.set(x, "endCDATA", js.Any.fromFunction0(value))
    
    inline def setStartCDATA(value: () => Unit): Self = StObject.set(x, "startCDATA", js.Any.fromFunction0(value))
    
    inline def setUnknown(value: String => Unit): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
  }
}
