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
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    createFastChildContext: js.Function2[scala.Double, XFastAttributeList, XFastContextHandler],
    createUnknownChildContext: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, XFastContextHandler],
    endDocument: js.Function0[scala.Unit],
    endFastElement: js.Function1[scala.Double, scala.Unit],
    endUnknownElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[XLocator, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startFastElement: js.Function2[scala.Double, XFastAttributeList, scala.Unit],
    startUnknownElement: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, scala.Unit]
  ): XFastDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, characters = characters, createFastChildContext = createFastChildContext, createUnknownChildContext = createUnknownChildContext, endDocument = endDocument, endFastElement = endFastElement, endUnknownElement = endUnknownElement, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, startDocument = startDocument, startFastElement = startFastElement, startUnknownElement = startUnknownElement)
  
    __obj.asInstanceOf[XFastDocumentHandler]
  }
}

