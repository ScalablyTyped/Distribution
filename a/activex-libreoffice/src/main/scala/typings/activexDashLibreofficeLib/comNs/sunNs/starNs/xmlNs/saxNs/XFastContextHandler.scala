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
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    createFastChildContext: js.Function2[scala.Double, XFastAttributeList, XFastContextHandler],
    createUnknownChildContext: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, XFastContextHandler],
    endFastElement: js.Function1[scala.Double, scala.Unit],
    endUnknownElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startFastElement: js.Function2[scala.Double, XFastAttributeList, scala.Unit],
    startUnknownElement: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, scala.Unit]
  ): XFastContextHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, characters = characters, createFastChildContext = createFastChildContext, createUnknownChildContext = createUnknownChildContext, endFastElement = endFastElement, endUnknownElement = endUnknownElement, queryInterface = queryInterface, release = release, startFastElement = startFastElement, startUnknownElement = startUnknownElement)
  
    __obj.asInstanceOf[XFastContextHandler]
  }
}

