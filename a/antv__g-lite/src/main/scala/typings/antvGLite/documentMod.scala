package typings.antvGLite

import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.displayObjectsMod.Group
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.domInterfacesMod.IAnimationTimeline
import typings.antvGLite.domInterfacesMod.ICanvas
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.domInterfacesMod.IParentNode
import typings.antvGLite.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvGLite.domInterfacesMod.IEventTarget because Already inherited
  - typings.antvGLite.domInterfacesMod.INode because Already inherited
  - typings.antvGLite.domInterfacesMod.IDocument because var conflicts: childNodes, firstChild, isConnected, lastChild, nextSibling, nodeName, nodeType, nodeValue, ownerDocument, parentElement, parentNode, previousSibling, shadow, textContent. Inlined defaultView, documentElement, timeline, createElement, elementFromPoint, elementsFromPoint, elementsFromBBox */ @JSImport("@antv/g-lite/dist/dom/Document", "Document")
  @js.native
  open class Document ()
    extends Node
       with IParentNode {
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* CompleteClass */
    override def append(nodes: INode*): Unit = js.native
    
    /* CompleteClass */
    override val childElementCount: Double = js.native
    @JSName("childElementCount")
    def childElementCount_MDocument: Double = js.native
    
    /**
      * Returns the child elements.
      */
    /* CompleteClass */
    override val children: js.Array[IElement[Any, Any]] = js.native
    @JSName("children")
    def children_MDocument: js.Array[IElement[Any, Any]] = js.native
    
    /**
      * @example const circle = document.createElement('circle', { style: { r: 10 } });
      */
    /**
      * Creates an instance of the element for the specified tag.
      */
    def createElement[T /* <: DisplayObject[StyleProps, Any] */, StyleProps /* <: BaseStyleProps */](tagName: String, options: DisplayObjectConfig[StyleProps]): T = js.native
    
    def createElementNS[T /* <: DisplayObject[StyleProps, Any] */, StyleProps /* <: BaseStyleProps */](namespaceURI: String, tagName: String, options: DisplayObjectConfig[StyleProps]): T = js.native
    
    /**
      * only document has defaultView, points to canvas,
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Document/defaultView
      */
    var defaultView: ICanvas | Null = js.native
    
    /**
      * the root element of document, eg. <html>
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Document/documentElement
      */
    val documentElement: Group | (IElement[Any, Any]) = js.native
    
    /**
      * Do picking with API instead of triggering interactive events.
      *
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Document/elementFromPoint
      */
    def elementFromPoint(x: Double, y: Double): js.Promise[DisplayObject[Any, Any]] = js.native
    
    def elementFromPointSync(x: Double, y: Double): DisplayObject[Any, Any] = js.native
    
    /**
      * Picking 2D graphics with RBush based on BBox, fast but inaccurate.
      */
    def elementsFromBBox(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[DisplayObject[Any, Any]] = js.native
    
    /**
      * Do picking with API instead of triggering interactive events.
      *
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Document/elementsFromPoint
      */
    def elementsFromPoint(x: Double, y: Double): js.Promise[js.Array[DisplayObject[Any, Any]]] = js.native
    
    def elementsFromPointSync(x: Double, y: Double): js.Array[DisplayObject[Any, Any]] = js.native
    
    /**
      * Similar to querySelector, use custom filter instead of selectors.
      */
    /* CompleteClass */
    override def find[E /* <: IElement[Any, Any] */](filter: js.Function1[/* node */ E, Boolean]): E | Null = js.native
    
    /**
      * Similar to querySelectorAll, use custom filter instead of selectors.
      */
    /* CompleteClass */
    override def findAll[E /* <: IElement[Any, Any] */](filter: js.Function1[/* node */ E, Boolean]): js.Array[E] = js.native
    
    /**
      * Returns the first child that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val firstElementChild: (IElement[Any, Any]) | Null = js.native
    @JSName("firstElementChild")
    def firstElementChild_MDocument: (IElement[Any, Any]) | Null = js.native
    
    /**
      * Execute query on documentElement.
      */
    def getElementById[E /* <: IElement[Any, Any] */](id: String): E | Null = js.native
    
    def getElementsByClassName[E /* <: IElement[Any, Any] */](className: String): js.Array[E] = js.native
    
    def getElementsByName[E /* <: IElement[Any, Any] */](name: String): js.Array[E] = js.native
    
    def getElementsByTagName[E /* <: IElement[Any, Any] */](tagName: String): js.Array[E] = js.native
    
    /**
      * Returns the last child that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val lastElementChild: (IElement[Any, Any]) | Null = js.native
    @JSName("lastElementChild")
    def lastElementChild_MDocument: (IElement[Any, Any]) | Null = js.native
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* CompleteClass */
    override def prepend(nodes: INode*): Unit = js.native
    
    /**
      * Returns the first element that is a descendant of node that matches selectors.
      */
    /* CompleteClass */
    override def querySelector[E /* <: IElement[Any, Any] */](selectors: String): E | Null = js.native
    
    /**
      * Returns all element descendants of node that match selectors.
      */
    /* CompleteClass */
    override def querySelectorAll[E /* <: IElement[Any, Any] */](selectors: String): js.Array[E] = js.native
    
    def removeChild[T /* <: INode */](oldChild: T, destroy: Boolean): T = js.native
    
    def replaceChild[T /* <: INode */](newChild: INode, oldChild: T, destroy: Boolean): T = js.native
    
    /**
      * document.timeline in WAAPI
      */
    val timeline: IAnimationTimeline = js.native
  }
}
