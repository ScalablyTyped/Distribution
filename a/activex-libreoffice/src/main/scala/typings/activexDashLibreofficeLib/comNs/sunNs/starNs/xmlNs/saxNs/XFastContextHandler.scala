package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastContextHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of character data. */
  def characters(aChars: java.lang.String): scala.Unit
  /**
    * receives notification of the beginning of a known child element.
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} .;  If the element has a namespace th
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def createFastChildContext(Element: scala.Double, Attribs: XFastAttributeList): XFastContextHandler
  /**
    * receives notification of the beginning of a unknown child element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes the element.
    */
  def createUnknownChildContext(Namespace: java.lang.String, Name: java.lang.String, Attribs: XFastAttributeList): XFastContextHandler
  /**
    * receives notification of the end of an known element.
    * @see startFastElement
    */
  def endFastElement(Element: scala.Double): scala.Unit
  /**
    * receives notification of the end of an known element.
    * @see startUnknownElement
    */
  def endUnknownElement(Namespace: java.lang.String, Name: java.lang.String): scala.Unit
  /**
    * receives notification of the beginning of an element .
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the element has a namespace t
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startFastElement(Element: scala.Double, Attribs: XFastAttributeList): scala.Unit
  /**
    * receives notification of the beginning of an unknown element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startUnknownElement(Namespace: java.lang.String, Name: java.lang.String, Attribs: XFastAttributeList): scala.Unit
}

object XFastContextHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    createFastChildContext: (scala.Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (java.lang.String, java.lang.String, XFastAttributeList) => XFastContextHandler,
    endFastElement: scala.Double => scala.Unit,
    endUnknownElement: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    startFastElement: (scala.Double, XFastAttributeList) => scala.Unit,
    startUnknownElement: (java.lang.String, java.lang.String, XFastAttributeList) => scala.Unit
  ): XFastContextHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
  
    __obj.asInstanceOf[XFastContextHandler]
  }
}

