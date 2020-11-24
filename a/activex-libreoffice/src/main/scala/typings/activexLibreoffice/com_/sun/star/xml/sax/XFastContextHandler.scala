package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
@js.native
trait XFastContextHandler extends XInterface {
  
  /** receives notification of character data. */
  def characters(aChars: String): Unit = js.native
  
  /**
    * receives notification of the beginning of a known child element.
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} .;  If the element has a namespace th
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def createFastChildContext(Element: Double, Attribs: XFastAttributeList): XFastContextHandler = js.native
  
  /**
    * receives notification of the beginning of a unknown child element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes the element.
    */
  def createUnknownChildContext(Namespace: String, Name: String, Attribs: XFastAttributeList): XFastContextHandler = js.native
  
  /**
    * receives notification of the end of an known element.
    * @see startFastElement
    */
  def endFastElement(Element: Double): Unit = js.native
  
  /**
    * receives notification of the end of an known element.
    * @see startUnknownElement
    */
  def endUnknownElement(Namespace: String, Name: String): Unit = js.native
  
  /**
    * receives notification of the beginning of an element .
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the element has a namespace t
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startFastElement(Element: Double, Attribs: XFastAttributeList): Unit = js.native
  
  /**
    * receives notification of the beginning of an unknown element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startUnknownElement(Namespace: String, Name: String, Attribs: XFastAttributeList): Unit = js.native
}
object XFastContextHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endFastElement: Double => Unit,
    endUnknownElement: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startFastElement: (Double, XFastAttributeList) => Unit,
    startUnknownElement: (String, String, XFastAttributeList) => Unit
  ): XFastContextHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
    __obj.asInstanceOf[XFastContextHandler]
  }
  
  @scala.inline
  implicit class XFastContextHandlerOps[Self <: XFastContextHandler] (val x: Self) extends AnyVal {
    
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
    def setCharacters(value: String => Unit): Self = this.set("characters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFastChildContext(value: (Double, XFastAttributeList) => XFastContextHandler): Self = this.set("createFastChildContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUnknownChildContext(value: (String, String, XFastAttributeList) => XFastContextHandler): Self = this.set("createUnknownChildContext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndFastElement(value: Double => Unit): Self = this.set("endFastElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUnknownElement(value: (String, String) => Unit): Self = this.set("endUnknownElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartFastElement(value: (Double, XFastAttributeList) => Unit): Self = this.set("startFastElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUnknownElement(value: (String, String, XFastAttributeList) => Unit): Self = this.set("startUnknownElement", js.Any.fromFunction3(value))
  }
}
