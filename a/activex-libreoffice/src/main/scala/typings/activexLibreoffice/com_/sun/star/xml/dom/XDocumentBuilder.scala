package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XEntityResolver
import typings.activexLibreoffice.com_.sun.star.xml.sax.XErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds a new dom tree */
trait XDocumentBuilder
  extends StObject
     with XInterface {
  
  /** Obtain an instance of a DOMImplementation object. */
  val DOMImplementation: XDOMImplementation
  
  /** Obtain an instance of a DOMImplementation object. */
  def getDOMImplementation(): XDOMImplementation
  
  /** Indicates whether or not this parser is configured to understand namespaces. */
  def isNamespaceAware(): Boolean
  
  /** Indicates whether or not this parser is configured to validate XML documents. */
  def isValidating(): Boolean
  
  /** Obtain a new instance of a DOM Document object to build a DOM tree with. */
  def newDocument(): XDocument
  
  /** Parse the content of the given InputStream as an XML document and return a new DOM Document object. */
  def parse(is: XInputStream): XDocument
  
  /** Parse the content of the given URI as an XML document and return a new DOM Document object. */
  def parseURI(uri: String): XDocument
  
  /** Specify the EntityResolver to be used to resolve entities present in the XML document to be parsed. */
  def setEntityResolver(er: XEntityResolver): Unit
  
  /** Specify the ErrorHandler to be used to report errors present in the XML document to be parsed. */
  def setErrorHandler(eh: XErrorHandler): Unit
}
object XDocumentBuilder {
  
  inline def apply(
    DOMImplementation: XDOMImplementation,
    acquire: () => Unit,
    getDOMImplementation: () => XDOMImplementation,
    isNamespaceAware: () => Boolean,
    isValidating: () => Boolean,
    newDocument: () => XDocument,
    parse: XInputStream => XDocument,
    parseURI: String => XDocument,
    queryInterface: `type` => Any,
    release: () => Unit,
    setEntityResolver: XEntityResolver => Unit,
    setErrorHandler: XErrorHandler => Unit
  ): XDocumentBuilder = {
    val __obj = js.Dynamic.literal(DOMImplementation = DOMImplementation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDOMImplementation = js.Any.fromFunction0(getDOMImplementation), isNamespaceAware = js.Any.fromFunction0(isNamespaceAware), isValidating = js.Any.fromFunction0(isValidating), newDocument = js.Any.fromFunction0(newDocument), parse = js.Any.fromFunction1(parse), parseURI = js.Any.fromFunction1(parseURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEntityResolver = js.Any.fromFunction1(setEntityResolver), setErrorHandler = js.Any.fromFunction1(setErrorHandler))
    __obj.asInstanceOf[XDocumentBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDocumentBuilder] (val x: Self) extends AnyVal {
    
    inline def setDOMImplementation(value: XDOMImplementation): Self = StObject.set(x, "DOMImplementation", value.asInstanceOf[js.Any])
    
    inline def setGetDOMImplementation(value: () => XDOMImplementation): Self = StObject.set(x, "getDOMImplementation", js.Any.fromFunction0(value))
    
    inline def setIsNamespaceAware(value: () => Boolean): Self = StObject.set(x, "isNamespaceAware", js.Any.fromFunction0(value))
    
    inline def setIsValidating(value: () => Boolean): Self = StObject.set(x, "isValidating", js.Any.fromFunction0(value))
    
    inline def setNewDocument(value: () => XDocument): Self = StObject.set(x, "newDocument", js.Any.fromFunction0(value))
    
    inline def setParse(value: XInputStream => XDocument): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseURI(value: String => XDocument): Self = StObject.set(x, "parseURI", js.Any.fromFunction1(value))
    
    inline def setSetEntityResolver(value: XEntityResolver => Unit): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1(value))
    
    inline def setSetErrorHandler(value: XErrorHandler => Unit): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1(value))
  }
}
