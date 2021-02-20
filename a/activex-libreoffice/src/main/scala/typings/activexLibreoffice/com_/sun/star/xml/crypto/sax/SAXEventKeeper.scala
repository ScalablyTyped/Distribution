package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import typings.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link SAXEventKeeper} */
@js.native
trait SAXEventKeeper
  extends XSecuritySAXEventKeeper
     with XReferenceResolvedBroadcaster
     with XSAXEventKeeperStatusChangeBroadcaster
     with XDocumentHandler
     with XInitialization
object SAXEventKeeper {
  
  @scala.inline
  def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: () => Unit,
    addBlocker: () => Double,
    addElementCollector: () => Double,
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit,
    addSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Unit,
    addSecurityElementCollector: (ElementMarkPriority, Boolean) => Double,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    getCurrentBlockingNode: () => XXMLElementWrapper,
    getElement: Double => XXMLElementWrapper,
    ignorableWhitespace: String => Unit,
    initialize: SeqEquiv[_] => Unit,
    isBlocking: () => Boolean,
    printBufferNodeTree: () => String,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBlocker: Double => Unit,
    removeElementCollector: Double => Unit,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit,
    removeSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Unit,
    setDocumentLocator: XLocator => Unit,
    setElement: (Double, XXMLElementWrapper) => Unit,
    setNextHandler: XDocumentHandler => XDocumentHandler,
    setSecurityId: (Double, Double) => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): SAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), addReferenceResolvedListener = js.Any.fromFunction2(addReferenceResolvedListener), addSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(addSAXEventKeeperStatusChangeListener), addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), initialize = js.Any.fromFunction1(initialize), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), removeReferenceResolvedListener = js.Any.fromFunction2(removeReferenceResolvedListener), removeSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(removeSAXEventKeeperStatusChangeListener), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2(setSecurityId), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[SAXEventKeeper]
  }
}
