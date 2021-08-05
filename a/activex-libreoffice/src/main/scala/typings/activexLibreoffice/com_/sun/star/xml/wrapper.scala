package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.lang.XUnoTunnel
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapper {
  
  /** Service of {@link XMLDocumentWrapper} */
  trait XMLDocumentWrapper
    extends StObject
       with XXMLDocumentWrapper
       with XInitialization
  object XMLDocumentWrapper {
    
    inline def apply(
      CurrentElement: XXMLElementWrapper,
      acquire: () => Unit,
      clearUselessData: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Unit,
      collapse: XXMLElementWrapper => Unit,
      generateSAXEvents: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Unit,
      getCurrentElement: () => XXMLElementWrapper,
      getNodeName: XXMLElementWrapper => String,
      getTree: XDocumentHandler => Unit,
      initialize: SeqEquiv[js.Any] => Unit,
      isCurrent: XXMLElementWrapper => Boolean,
      isCurrentElementEmpty: () => Boolean,
      queryInterface: `type` => js.Any,
      rebuildIDLink: XXMLElementWrapper => Unit,
      release: () => Unit,
      removeCurrentElement: () => Unit,
      setCurrentElement: XXMLElementWrapper => Unit
    ): XMLDocumentWrapper = {
      val __obj = js.Dynamic.literal(CurrentElement = CurrentElement.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearUselessData = js.Any.fromFunction3(clearUselessData), collapse = js.Any.fromFunction1(collapse), generateSAXEvents = js.Any.fromFunction4(generateSAXEvents), getCurrentElement = js.Any.fromFunction0(getCurrentElement), getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1(getTree), initialize = js.Any.fromFunction1(initialize), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = js.Any.fromFunction0(isCurrentElementEmpty), queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1(rebuildIDLink), release = js.Any.fromFunction0(release), removeCurrentElement = js.Any.fromFunction0(removeCurrentElement), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
      __obj.asInstanceOf[XMLDocumentWrapper]
    }
  }
  
  /** Service of {@link XMLElementWrapper} */
  trait XMLElementWrapper
    extends StObject
       with XUnoTunnel
       with XInitialization
  object XMLElementWrapper {
    
    inline def apply(
      acquire: () => Unit,
      getSomething: SeqEquiv[Double] => Double,
      initialize: SeqEquiv[js.Any] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XMLElementWrapper = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSomething = js.Any.fromFunction1(getSomething), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XMLElementWrapper]
    }
  }
  
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
    extends StObject
       with XInterface {
    
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
      reservedDescendants: SeqEquiv[XXMLElementWrapper],
      stopAtNode: XXMLElementWrapper
    ): Unit
    
    /**
      * Collapses a tree path
      *
      * Each element in the ancestor path of the node will be checked, if this element is empty, then deletes it.
      * @param node the start point of the path from where the tree path will be collapsed
      */
    def collapse(node: XXMLElementWrapper): Unit
    
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
    ): Unit
    
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
    def getNodeName(node: XXMLElementWrapper): String
    
    /**
      * Converts the whole DOM tree into a SAX event stream.
      * @param handler the document handler which will receive the SAX event stream
      */
    def getTree(handler: XDocumentHandler): Unit
    
    /**
      * Checks whether an element is the current element.
      * @param node the element to be checked
      * @returns `true` if the node is the current element, `false` otherwise
      */
    def isCurrent(node: XXMLElementWrapper): Boolean
    
    /**
      * Checks whether the current element is empty.
      * @returns `true` if the current element is empty, `false` otherwise
      */
    def isCurrentElementEmpty(): Boolean
    
    /**
      * Rebuild the ID attribute in the branch starting from the particular element.
      * @param node the root element of the branch whose ID link will be built
      */
    def rebuildIDLink(node: XXMLElementWrapper): Unit
    
    /**
      * Removes the current element.
      *
      * When the current element is removed, then its parent element becomes the new current element.
      */
    def removeCurrentElement(): Unit
    
    /**
      * Sets the current element.
      *
      * When the current element is replaced outside of this interface, then uses this method can update the current element pointer.
      * @param element the new current element
      */
    def setCurrentElement(element: XXMLElementWrapper): Unit
  }
  object XXMLDocumentWrapper {
    
    inline def apply(
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
    
    extension [Self <: XXMLDocumentWrapper](x: Self) {
      
      inline def setClearUselessData(value: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Unit): Self = StObject.set(x, "clearUselessData", js.Any.fromFunction3(value))
      
      inline def setCollapse(value: XXMLElementWrapper => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
      
      inline def setCurrentElement(value: XXMLElementWrapper): Self = StObject.set(x, "CurrentElement", value.asInstanceOf[js.Any])
      
      inline def setGenerateSAXEvents(value: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Unit): Self = StObject.set(x, "generateSAXEvents", js.Any.fromFunction4(value))
      
      inline def setGetCurrentElement(value: () => XXMLElementWrapper): Self = StObject.set(x, "getCurrentElement", js.Any.fromFunction0(value))
      
      inline def setGetNodeName(value: XXMLElementWrapper => String): Self = StObject.set(x, "getNodeName", js.Any.fromFunction1(value))
      
      inline def setGetTree(value: XDocumentHandler => Unit): Self = StObject.set(x, "getTree", js.Any.fromFunction1(value))
      
      inline def setIsCurrent(value: XXMLElementWrapper => Boolean): Self = StObject.set(x, "isCurrent", js.Any.fromFunction1(value))
      
      inline def setIsCurrentElementEmpty(value: () => Boolean): Self = StObject.set(x, "isCurrentElementEmpty", js.Any.fromFunction0(value))
      
      inline def setRebuildIDLink(value: XXMLElementWrapper => Unit): Self = StObject.set(x, "rebuildIDLink", js.Any.fromFunction1(value))
      
      inline def setRemoveCurrentElement(value: () => Unit): Self = StObject.set(x, "removeCurrentElement", js.Any.fromFunction0(value))
      
      inline def setSetCurrentElement(value: XXMLElementWrapper => Unit): Self = StObject.set(x, "setCurrentElement", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface of XML Element Wrapper.
    *
    * This interface is used to wrap a element information, which make it enable to transfer the element information between different languages, such as
    * C++/Java.
    */
  type XXMLElementWrapper = XInterface
}
