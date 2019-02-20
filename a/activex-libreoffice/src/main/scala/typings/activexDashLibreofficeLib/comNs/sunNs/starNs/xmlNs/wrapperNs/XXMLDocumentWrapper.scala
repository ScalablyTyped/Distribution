package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML Document Wrapper.
  *
  * When converting SAX events into a DOM tree, this interface is used to manipulate the DOM data in UNO perspective.
  *
  * Every language has its own methods to manipulate its native DOM data structure, this interface provides a common method set which each language have
  * to implement.
  *
  * In another word, this interface wraps language dependent methods, then other component can manipulate DOM data through UNO methods.
  */
trait XXMLDocumentWrapper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the current element.
    * @returns the current element in the SAX event stream
    */
  var CurrentElement: XXMLElementWrapper
  /**
    * Clears all useless element in a branch of the DOM tree along the tree order.
    * @param node the start point of the branch to clear
    * @param reservedDescendants an array including all elements that need to be reserved (along their ancestor path)
    * @param stopAtNode the stop element. The operation have to interrupt when this element is met during clearing
    */
  def clearUselessData(
    node: XXMLElementWrapper,
    reservedDescendants: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XXMLElementWrapper],
    stopAtNode: XXMLElementWrapper
  ): scala.Unit
  /**
    * Collapses a tree path
    *
    * Each element in the ancestor path of the node will be checked, if this element is empty, then deletes it.
    * @param node the start point of the path from where the tree path will be collapsed
    */
  def collapse(node: XXMLElementWrapper): scala.Unit
  /**
    * Converts a part of the DOM tree into SAX events.
    * @param handler the document handler which will receive generated SAX events
    * @param saxEventKeeperHandler the SAXEventKeeper connecting with this XMLDocumentHandler
    * @param startNode the start point to generate SAX events
    * @param endNode the end point where to stop generating
    */
  def generateSAXEvents(
    handler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    saxEventKeeperHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    startNode: XXMLElementWrapper,
    endNode: XXMLElementWrapper
  ): scala.Unit
  /**
    * Gets the current element.
    * @returns the current element in the SAX event stream
    */
  def getCurrentElement(): XXMLElementWrapper
  /**
    * Gets the name of the element.
    * @param node the element whose name will be gotten
    * @returns the name of the element
    */
  def getNodeName(node: XXMLElementWrapper): java.lang.String
  /**
    * Converts the whole DOM tree into a SAX event stream.
    * @param handler the document handler which will receive the SAX event stream
    */
  def getTree(handler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler): scala.Unit
  /**
    * Checks whether an element is the current element.
    * @param node the element to be checked
    * @returns `true` if the node is the current element, `false` otherwise
    */
  def isCurrent(node: XXMLElementWrapper): scala.Boolean
  /**
    * Checks whether the current element is empty.
    * @returns `true` if the current element is empty, `false` otherwise
    */
  def isCurrentElementEmpty(): scala.Boolean
  /**
    * Rebuild the ID attribute in the branch starting from the particular element.
    * @param node the root element of the branch whose ID link will be built
    */
  def rebuildIDLink(node: XXMLElementWrapper): scala.Unit
  /**
    * Removes the current element.
    *
    * When the current element is removed, then its parent element becomes the new current element.
    */
  def removeCurrentElement(): scala.Unit
  /**
    * Sets the current element.
    *
    * When the current element is replaced outside of this interface, then uses this method can update the current element pointer.
    * @param element the new current element
    */
  def setCurrentElement(element: XXMLElementWrapper): scala.Unit
}

