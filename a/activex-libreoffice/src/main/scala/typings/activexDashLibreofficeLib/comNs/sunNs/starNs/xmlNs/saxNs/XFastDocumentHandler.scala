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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("createFastChildContext")(createFastChildContext)
    __obj.updateDynamic("createUnknownChildContext")(createUnknownChildContext)
    __obj.updateDynamic("endDocument")(endDocument)
    __obj.updateDynamic("endFastElement")(endFastElement)
    __obj.updateDynamic("endUnknownElement")(endUnknownElement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDocumentLocator")(setDocumentLocator)
    __obj.updateDynamic("startDocument")(startDocument)
    __obj.updateDynamic("startFastElement")(startFastElement)
    __obj.updateDynamic("startUnknownElement")(startUnknownElement)
    __obj.asInstanceOf[XFastDocumentHandler]
  }
}

