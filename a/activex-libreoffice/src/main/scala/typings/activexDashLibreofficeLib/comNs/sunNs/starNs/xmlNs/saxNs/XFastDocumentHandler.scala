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

