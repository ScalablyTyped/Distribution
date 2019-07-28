package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
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
trait XSAXEventKeeper extends XInterface {
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  val CurrentBlockingNode: XXMLElementWrapper
  /**
    * Adds a new blocker on the next element in the SAX event stream.
    *
    * No SAX event starting from the next element will be forwarded until this blocker is removed.
    * @returns the keeper id of the new blocker
    */
  def addBlocker(): Double
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @returns the keeper id of the new element collector
    */
  def addElementCollector(): Double
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  def getCurrentBlockingNode(): XXMLElementWrapper
  /**
    * Gets the element of an element mark.
    * @param id the keeper id of the element mark, it can be a element collector or a blocker
    */
  def getElement(id: Double): XXMLElementWrapper
  /**
    * Checks whether the SAX event stream is blocking.
    * @returns `true` if blocking, `false` otherwise
    */
  def isBlocking(): Boolean
  /**
    * Prints information about all buffered elements.
    * @returns a tree-style string including all buffer information
    */
  def printBufferNodeTree(): String
  /**
    * Removes a blocker
    * @param id the keeper id of the blocker to be removed
    */
  def removeBlocker(id: Double): Unit
  /**
    * Removes an element collector.
    * @param id the keeper id of the element collector to be removed
    */
  def removeElementCollector(id: Double): Unit
  /**
    * Sets the element of an element mark.
    *
    * When an element is replaced outside of this interface, then uses this method can restore the link between an element mark and its working element.
    * @param id the keeper id of the element mark to be set
    * @param aElement the new element for this element mark.
    */
  def setElement(id: Double, aElement: XXMLElementWrapper): Unit
  /**
    * Sets the next document handler in the SAX chain.
    *
    * This handler will receive SAX events forwarded by the {@link SAXEventKeeper} .
    * @param nextHandler the next handler in the SAX chain
    * @returns the old next handler
    */
  def setNextHandler(nextHandler: XDocumentHandler): XDocumentHandler
}

object XSAXEventKeeper {
  @scala.inline
  def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: () => Unit,
    addBlocker: () => Double,
    addElementCollector: () => Double,
    getCurrentBlockingNode: () => XXMLElementWrapper,
    getElement: Double => XXMLElementWrapper,
    isBlocking: () => Boolean,
    printBufferNodeTree: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBlocker: Double => Unit,
    removeElementCollector: Double => Unit,
    setElement: (Double, XXMLElementWrapper) => Unit,
    setNextHandler: XDocumentHandler => XDocumentHandler
  ): XSAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode, acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler))
  
    __obj.asInstanceOf[XSAXEventKeeper]
  }
}

