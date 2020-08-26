package typings.activexLibreoffice.com_.sun.star.xml.wrapper

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
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
@js.native
trait XXMLDocumentWrapper extends XInterface {
  /**
    * Gets the current element.
    * @returns the current element in the SAX event stream
    */
  var CurrentElement: XXMLElementWrapper = js.native
  /**
    * Clears all useless element in a branch of the DOM tree along the tree order.
    * @param node the start point of the branch to clear
    * @param reservedDescendants an array including all elements that need to be reserved (along their ancestor path)
    * @param stopAtNode the stop element. The operation have to interrupt when this element is met during clearing
    */
  def clearUselessData(
    node: XXMLElementWrapper,
    reservedDescendants: SeqEquiv[XXMLElementWrapper],
    stopAtNode: XXMLElementWrapper
  ): Unit = js.native
  /**
    * Collapses a tree path
    *
    * Each element in the ancestor path of the node will be checked, if this element is empty, then deletes it.
    * @param node the start point of the path from where the tree path will be collapsed
    */
  def collapse(node: XXMLElementWrapper): Unit = js.native
  /**
    * Converts a part of the DOM tree into SAX events.
    * @param handler the document handler which will receive generated SAX events
    * @param saxEventKeeperHandler the SAXEventKeeper connecting with this XMLDocumentHandler
    * @param startNode the start point to generate SAX events
    * @param endNode the end point where to stop generating
    */
  def generateSAXEvents(
    handler: XDocumentHandler,
    saxEventKeeperHandler: XDocumentHandler,
    startNode: XXMLElementWrapper,
    endNode: XXMLElementWrapper
  ): Unit = js.native
  /**
    * Gets the current element.
    * @returns the current element in the SAX event stream
    */
  def getCurrentElement(): XXMLElementWrapper = js.native
  /**
    * Gets the name of the element.
    * @param node the element whose name will be gotten
    * @returns the name of the element
    */
  def getNodeName(node: XXMLElementWrapper): String = js.native
  /**
    * Converts the whole DOM tree into a SAX event stream.
    * @param handler the document handler which will receive the SAX event stream
    */
  def getTree(handler: XDocumentHandler): Unit = js.native
  /**
    * Checks whether an element is the current element.
    * @param node the element to be checked
    * @returns `true` if the node is the current element, `false` otherwise
    */
  def isCurrent(node: XXMLElementWrapper): Boolean = js.native
  /**
    * Checks whether the current element is empty.
    * @returns `true` if the current element is empty, `false` otherwise
    */
  def isCurrentElementEmpty(): Boolean = js.native
  /**
    * Rebuild the ID attribute in the branch starting from the particular element.
    * @param node the root element of the branch whose ID link will be built
    */
  def rebuildIDLink(node: XXMLElementWrapper): Unit = js.native
  /**
    * Removes the current element.
    *
    * When the current element is removed, then its parent element becomes the new current element.
    */
  def removeCurrentElement(): Unit = js.native
  /**
    * Sets the current element.
    *
    * When the current element is replaced outside of this interface, then uses this method can update the current element pointer.
    * @param element the new current element
    */
  def setCurrentElement(element: XXMLElementWrapper): Unit = js.native
}

object XXMLDocumentWrapper {
  @scala.inline
  def apply(
    CurrentElement: XXMLElementWrapper,
    acquire: () => Unit,
    clearUselessData: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Unit,
    collapse: XXMLElementWrapper => Unit,
    generateSAXEvents: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Unit,
    getCurrentElement: () => XXMLElementWrapper,
    getNodeName: XXMLElementWrapper => String,
    getTree: XDocumentHandler => Unit,
    isCurrent: XXMLElementWrapper => Boolean,
    isCurrentElementEmpty: () => Boolean,
    queryInterface: `type` => js.Any,
    rebuildIDLink: XXMLElementWrapper => Unit,
    release: () => Unit,
    removeCurrentElement: () => Unit,
    setCurrentElement: XXMLElementWrapper => Unit
  ): XXMLDocumentWrapper = {
    val __obj = js.Dynamic.literal(CurrentElement = CurrentElement.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearUselessData = js.Any.fromFunction3(clearUselessData), collapse = js.Any.fromFunction1(collapse), generateSAXEvents = js.Any.fromFunction4(generateSAXEvents), getCurrentElement = js.Any.fromFunction0(getCurrentElement), getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1(getTree), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = js.Any.fromFunction0(isCurrentElementEmpty), queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1(rebuildIDLink), release = js.Any.fromFunction0(release), removeCurrentElement = js.Any.fromFunction0(removeCurrentElement), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
    __obj.asInstanceOf[XXMLDocumentWrapper]
  }
  @scala.inline
  implicit class XXMLDocumentWrapperOps[Self <: XXMLDocumentWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentElement(value: XXMLElementWrapper): Self = this.set("CurrentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearUselessData(value: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Unit): Self = this.set("clearUselessData", js.Any.fromFunction3(value))
    @scala.inline
    def setCollapse(value: XXMLElementWrapper => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def setGenerateSAXEvents(value: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Unit): Self = this.set("generateSAXEvents", js.Any.fromFunction4(value))
    @scala.inline
    def setGetCurrentElement(value: () => XXMLElementWrapper): Self = this.set("getCurrentElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodeName(value: XXMLElementWrapper => String): Self = this.set("getNodeName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTree(value: XDocumentHandler => Unit): Self = this.set("getTree", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCurrent(value: XXMLElementWrapper => Boolean): Self = this.set("isCurrent", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCurrentElementEmpty(value: () => Boolean): Self = this.set("isCurrentElementEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setRebuildIDLink(value: XXMLElementWrapper => Unit): Self = this.set("rebuildIDLink", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveCurrentElement(value: () => Unit): Self = this.set("removeCurrentElement", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCurrentElement(value: XXMLElementWrapper => Unit): Self = this.set("setCurrentElement", js.Any.fromFunction1(value))
  }
  
}

