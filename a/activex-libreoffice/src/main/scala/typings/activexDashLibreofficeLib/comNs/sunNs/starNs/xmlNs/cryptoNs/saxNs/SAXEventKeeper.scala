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
    acquire: js.Function0[scala.Unit],
    addBlocker: js.Function0[scala.Double],
    addElementCollector: js.Function0[scala.Double],
    addReferenceResolvedListener: js.Function2[scala.Double, XReferenceResolvedListener, scala.Unit],
    addSAXEventKeeperStatusChangeListener: js.Function1[XSAXEventKeeperStatusChangeListener, scala.Unit],
    addSecurityElementCollector: js.Function2[ElementMarkPriority, scala.Boolean, scala.Double],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    getCurrentBlockingNode: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    getElement: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
    ],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isBlocking: js.Function0[scala.Boolean],
    printBufferNodeTree: js.Function0[java.lang.String],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeBlocker: js.Function1[scala.Double, scala.Unit],
    removeElementCollector: js.Function1[scala.Double, scala.Unit],
    removeReferenceResolvedListener: js.Function2[scala.Double, XReferenceResolvedListener, scala.Unit],
    removeSAXEventKeeperStatusChangeListener: js.Function1[XSAXEventKeeperStatusChangeListener, scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    setElement: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ],
    setNextHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
    ],
    setSecurityId: js.Function2[scala.Double, scala.Double, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList, 
      scala.Unit
    ]
  ): SAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode, acquire = acquire, addBlocker = addBlocker, addElementCollector = addElementCollector, addReferenceResolvedListener = addReferenceResolvedListener, addSAXEventKeeperStatusChangeListener = addSAXEventKeeperStatusChangeListener, addSecurityElementCollector = addSecurityElementCollector, characters = characters, endDocument = endDocument, endElement = endElement, getCurrentBlockingNode = getCurrentBlockingNode, getElement = getElement, ignorableWhitespace = ignorableWhitespace, initialize = initialize, isBlocking = isBlocking, printBufferNodeTree = printBufferNodeTree, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, removeBlocker = removeBlocker, removeElementCollector = removeElementCollector, removeReferenceResolvedListener = removeReferenceResolvedListener, removeSAXEventKeeperStatusChangeListener = removeSAXEventKeeperStatusChangeListener, setDocumentLocator = setDocumentLocator, setElement = setElement, setNextHandler = setNextHandler, setSecurityId = setSecurityId, startDocument = startDocument, startElement = startElement)
  
    __obj.asInstanceOf[SAXEventKeeper]
  }
}

