package typings.activexLibreoffice.com_.sun.star.xml.input

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Root interface being passed to {@link SaxDocumentHandler} service upon instantiation. */
@js.native
trait XRoot extends XInterface {
  
  /** Receives notification of the end of a document. */
  def endDocument(): Unit = js.native
  
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: String, data: String): Unit = js.native
  
  /**
    * Receives an object for locating the origin of SAX document events.
    * @param locator locator
    */
  def setDocumentLocator(locator: XLocator): Unit = js.native
  
  /**
    * Receives notification of the beginning of a document.
    * @param xMapping mapping to obtain ids out of XML namespace URIs and vice versa
    */
  def startDocument(xMapping: XNamespaceMapping): Unit = js.native
  
  /**
    * Called upon root element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    */
  def startRootElement(uid: Double, localName: String, xAttributes: XAttributes): XElement = js.native
}
object XRoot {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    endDocument: () => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: XNamespaceMapping => Unit,
    startRootElement: (Double, String, XAttributes) => XElement
  ): XRoot = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endDocument = js.Any.fromFunction0(endDocument), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction1(startDocument), startRootElement = js.Any.fromFunction3(startRootElement))
    __obj.asInstanceOf[XRoot]
  }
  
  @scala.inline
  implicit class XRootOps[Self <: XRoot] (val x: Self) extends AnyVal {
    
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
    def setEndDocument(value: () => Unit): Self = this.set("endDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessingInstruction(value: (String, String) => Unit): Self = this.set("processingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDocumentLocator(value: XLocator => Unit): Self = this.set("setDocumentLocator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDocument(value: XNamespaceMapping => Unit): Self = this.set("startDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartRootElement(value: (Double, String, XAttributes) => XElement): Self = this.set("startRootElement", js.Any.fromFunction3(value))
  }
}
