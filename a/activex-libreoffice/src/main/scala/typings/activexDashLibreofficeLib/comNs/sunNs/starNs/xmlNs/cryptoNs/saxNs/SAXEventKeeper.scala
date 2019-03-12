package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link SAXEventKeeper} */
trait SAXEventKeeper
  extends XSecuritySAXEventKeeper
     with XReferenceResolvedBroadcaster
     with XSAXEventKeeperStatusChangeBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object SAXEventKeeper {
  @scala.inline
  def apply(
    CurrentBlockingNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    acquire: () => scala.Unit,
    addBlocker: () => scala.Double,
    addElementCollector: () => scala.Double,
    addReferenceResolvedListener: (scala.Double, XReferenceResolvedListener) => scala.Unit,
    addSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => scala.Unit,
    addSecurityElementCollector: (ElementMarkPriority, scala.Boolean) => scala.Double,
    characters: java.lang.String => scala.Unit,
    endDocument: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    getCurrentBlockingNode: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    getElement: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    ignorableWhitespace: java.lang.String => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isBlocking: () => scala.Boolean,
    printBufferNodeTree: () => java.lang.String,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeBlocker: scala.Double => scala.Unit,
    removeElementCollector: scala.Double => scala.Unit,
    removeReferenceResolvedListener: (scala.Double, XReferenceResolvedListener) => scala.Unit,
    removeSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => scala.Unit,
    setDocumentLocator: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator => scala.Unit,
    setElement: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper) => scala.Unit,
    setNextHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    setSecurityId: (scala.Double, scala.Double) => scala.Unit,
    startDocument: () => scala.Unit,
    startElement: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList) => scala.Unit
  ): SAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode, acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), addReferenceResolvedListener = js.Any.fromFunction2(addReferenceResolvedListener), addSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(addSAXEventKeeperStatusChangeListener), addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), initialize = js.Any.fromFunction1(initialize), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), removeReferenceResolvedListener = js.Any.fromFunction2(removeReferenceResolvedListener), removeSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(removeSAXEventKeeperStatusChangeListener), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2(setSecurityId), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
  
    __obj.asInstanceOf[SAXEventKeeper]
  }
}

