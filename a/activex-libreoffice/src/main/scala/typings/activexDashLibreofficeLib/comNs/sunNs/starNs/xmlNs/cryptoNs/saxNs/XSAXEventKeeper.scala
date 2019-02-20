package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of SAX Event Keeper.
  *
  * This interface is used to manipulate element marks in a SAX event stream.
  *
  * There are two kinds of element mark, one is element collector, which is used to collect a particular element from the SAX event stream; the other is
  * blocker, which is used to block the SAX event stream.
  */
trait XSAXEventKeeper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  val CurrentBlockingNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  /**
    * Adds a new blocker on the next element in the SAX event stream.
    *
    * No SAX event starting from the next element will be forwarded until this blocker is removed.
    * @returns the keeper id of the new blocker
    */
  def addBlocker(): scala.Double
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @returns the keeper id of the new element collector
    */
  def addElementCollector(): scala.Double
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  def getCurrentBlockingNode(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  /**
    * Gets the element of an element mark.
    * @param id the keeper id of the element mark, it can be a element collector or a blocker
    */
  def getElement(id: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  /**
    * Checks whether the SAX event stream is blocking.
    * @returns `true` if blocking, `false` otherwise
    */
  def isBlocking(): scala.Boolean
  /**
    * Prints information about all buffered elements.
    * @returns a tree-style string including all buffer information
    */
  def printBufferNodeTree(): java.lang.String
  /**
    * Removes a blocker
    * @param id the keeper id of the blocker to be removed
    */
  def removeBlocker(id: scala.Double): scala.Unit
  /**
    * Removes an element collector.
    * @param id the keeper id of the element collector to be removed
    */
  def removeElementCollector(id: scala.Double): scala.Unit
  /**
    * Sets the element of an element mark.
    *
    * When an element is replaced outside of this interface, then uses this method can restore the link between an element mark and its working element.
    * @param id the keeper id of the element mark to be set
    * @param aElement the new element for this element mark.
    */
  def setElement(
    id: scala.Double,
    aElement: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  ): scala.Unit
  /**
    * Sets the next document handler in the SAX chain.
    *
    * This handler will receive SAX events forwarded by the {@link SAXEventKeeper} .
    * @param nextHandler the next handler in the SAX chain
    * @returns the old next handler
    */
  def setNextHandler(nextHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
}

