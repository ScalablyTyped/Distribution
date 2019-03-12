package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Security SAX Event Keeper.
  *
  * This interface is an extension of the {@link XSAXEventKeeper} interface, some security related features are added.
  */
trait XSecuritySAXEventKeeper extends XSAXEventKeeper {
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @param priority the priority of the element collector. See ConstOfPriority
    * @param modifyElement a flag representing whether the element collector will modify the content of its element after notification
    * @returns the keeper id of the new element collector
    */
  def addSecurityElementCollector(priority: ElementMarkPriority, modifyElement: scala.Boolean): scala.Double
  /**
    * Sets security id for an element mark.
    * @param id the keeper id of the element collector to be set
    * @param securityId the security id to be set
    */
  def setSecurityId(id: scala.Double, securityId: scala.Double): scala.Unit
}

object XSecuritySAXEventKeeper {
  @scala.inline
  def apply(
    CurrentBlockingNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    acquire: () => scala.Unit,
    addBlocker: () => scala.Double,
    addElementCollector: () => scala.Double,
    addSecurityElementCollector: (ElementMarkPriority, scala.Boolean) => scala.Double,
    getCurrentBlockingNode: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    getElement: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    isBlocking: () => scala.Boolean,
    printBufferNodeTree: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeBlocker: scala.Double => scala.Unit,
    removeElementCollector: scala.Double => scala.Unit,
    setElement: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper) => scala.Unit,
    setNextHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    setSecurityId: (scala.Double, scala.Double) => scala.Unit
  ): XSecuritySAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode, acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2(setSecurityId))
  
    __obj.asInstanceOf[XSecuritySAXEventKeeper]
  }
}

