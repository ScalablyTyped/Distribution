package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives notification of sax document events from a {@link XFastParser} */
trait XFastDocumentHandler extends XFastContextHandler {
  /** called by the parser after the last XML element of a stream is processed. */
  def endDocument(): scala.Unit
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): scala.Unit
  /** called by the parser when parsing of an XML stream is started. */
  def startDocument(): scala.Unit
}

object XFastDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    createFastChildContext: (scala.Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (java.lang.String, java.lang.String, XFastAttributeList) => XFastContextHandler,
    endDocument: () => scala.Unit,
    endFastElement: scala.Double => scala.Unit,
    endUnknownElement: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDocumentLocator: XLocator => scala.Unit,
    startDocument: () => scala.Unit,
    startFastElement: (scala.Double, XFastAttributeList) => scala.Unit,
    startUnknownElement: (java.lang.String, java.lang.String, XFastAttributeList) => scala.Unit
  ): XFastDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endDocument = js.Any.fromFunction0(endDocument), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
  
    __obj.asInstanceOf[XFastDocumentHandler]
  }
}

