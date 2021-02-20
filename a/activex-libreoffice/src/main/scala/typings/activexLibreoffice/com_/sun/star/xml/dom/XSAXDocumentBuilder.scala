package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds a new dom tree */
@js.native
trait XSAXDocumentBuilder extends XInterface {
  
  val Document: XDocument = js.native
  
  val DocumentFragment: XDocumentFragment = js.native
  
  val State: SAXDocumentBuilderState = js.native
  
  def endDocumentFragment(): Unit = js.native
  
  def getDocument(): XDocument = js.native
  
  def getDocumentFragment(): XDocumentFragment = js.native
  
  def getState(): SAXDocumentBuilderState = js.native
  
  def reset(): Unit = js.native
  
  def startDocumentFragment(ownerDoc: XDocument): Unit = js.native
}
object XSAXDocumentBuilder {
  
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => Unit,
    endDocumentFragment: () => Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reset: () => Unit,
    startDocumentFragment: XDocument => Unit
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], DocumentFragment = DocumentFragment.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment))
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
  
  @scala.inline
  implicit class XSAXDocumentBuilderMutableBuilder[Self <: XSAXDocumentBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: XDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFragment(value: XDocumentFragment): Self = StObject.set(x, "DocumentFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDocumentFragment(value: () => Unit): Self = StObject.set(x, "endDocumentFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocument(value: () => XDocument): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocumentFragment(value: () => XDocumentFragment): Self = StObject.set(x, "getDocumentFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetState(value: () => SAXDocumentBuilderState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartDocumentFragment(value: XDocument => Unit): Self = StObject.set(x, "startDocumentFragment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: SAXDocumentBuilderState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
