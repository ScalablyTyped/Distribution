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
    acquire: js.Function0[scala.Unit],
    addBlocker: js.Function0[scala.Double],
    addElementCollector: js.Function0[scala.Double],
    addSecurityElementCollector: js.Function2[ElementMarkPriority, scala.Boolean, scala.Double],
    getCurrentBlockingNode: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    getElement: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
    ],
    isBlocking: js.Function0[scala.Boolean],
    printBufferNodeTree: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeBlocker: js.Function1[scala.Double, scala.Unit],
    removeElementCollector: js.Function1[scala.Double, scala.Unit],
    setElement: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ],
    setNextHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
    ],
    setSecurityId: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XSecuritySAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode, acquire = acquire, addBlocker = addBlocker, addElementCollector = addElementCollector, addSecurityElementCollector = addSecurityElementCollector, getCurrentBlockingNode = getCurrentBlockingNode, getElement = getElement, isBlocking = isBlocking, printBufferNodeTree = printBufferNodeTree, queryInterface = queryInterface, release = release, removeBlocker = removeBlocker, removeElementCollector = removeElementCollector, setElement = setElement, setNextHandler = setNextHandler, setSecurityId = setSecurityId)
  
    __obj.asInstanceOf[XSecuritySAXEventKeeper]
  }
}

