package typings.antvGLite

import typings.antvGLite.anon.Composed
import typings.antvGLite.domInterfacesMod.IChildNode
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.eventTargetMod.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@antv/g-lite/dist/dom/Node", "Node")
  @js.native
  abstract class Node ()
    extends EventTarget
       with INode {
    
    /**
      * @deprecated
      * @alias contains
      */
    def contain[T /* <: INode */](): Boolean = js.native
    def contain[T /* <: INode */](other: T): Boolean = js.native
    
    def contains[T /* <: INode */](other: T): Boolean = js.native
    
    @JSName("firstChild")
    def firstChild_MNode: IChildNode | Null = js.native
    
    def getRootNode(opts: Composed): INode = js.native
    
    @JSName("lastChild")
    def lastChild_MNode: IChildNode | Null = js.native
    
    @JSName("nextSibling")
    def nextSibling_MNode: IChildNode | Null = js.native
    
    /**
      * @deprecated
      * @alias parentNode
      */
    def parent: INode | Null = js.native
    
    @JSName("parentElement")
    def parentElement_MNode: (IElement[Any, Any]) | Null = js.native
    
    @JSName("previousSibling")
    def previousSibling_MNode: IChildNode | Null = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Node/textContent
      */
    @JSName("textContent")
    def textContent_MNode: String = js.native
  }
  /* static members */
  object Node {
    
    @JSImport("@antv/g-lite/dist/dom/Node", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * otherNode is a descendant of the node.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_CONTAINED_BY")
    @js.native
    def DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    inline def DOCUMENT_POSITION_CONTAINED_BY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode is an ancestor of the node.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_CONTAINS")
    @js.native
    def DOCUMENT_POSITION_CONTAINS: Double = js.native
    inline def DOCUMENT_POSITION_CONTAINS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(x.asInstanceOf[js.Any])
    
    /**
      * Both nodes are in different documents or different trees in the same document.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_DISCONNECTED")
    @js.native
    def DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    inline def DOCUMENT_POSITION_DISCONNECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode follows the node in either a pre-order depth-first traversal of a tree containing both (e.g., as a descendant or following sibling or a descendant of a following sibling or following sibling of an ancestor) or (if they are disconnected) in an arbitrary but consistent ordering.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_FOLLOWING")
    @js.native
    def DOCUMENT_POSITION_FOLLOWING: Double = js.native
    inline def DOCUMENT_POSITION_FOLLOWING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(x.asInstanceOf[js.Any])
    
    /**
      * The result relies upon arbitrary and/or implementation-specific behavior and is not guaranteed to be portable.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    @js.native
    def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    inline def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode precedes the node in either a pre-order depth-first traversal
      * of a tree containing both (e.g., as an ancestor or previous sibling or a descendant of a previous sibling or previous sibling of an ancestor) or (if they are disconnected) in an arbitrary but consistent ordering.
      */
    @JSImport("@antv/g-lite/dist/dom/Node", "Node.DOCUMENT_POSITION_PRECEDING")
    @js.native
    def DOCUMENT_POSITION_PRECEDING: Double = js.native
    inline def DOCUMENT_POSITION_PRECEDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(x.asInstanceOf[js.Any])
    
    inline def isNode(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean]
    inline def isNode(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean]
  }
}
