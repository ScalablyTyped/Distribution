package typings.antvGLite

import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.ElementEvent
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.servicesMod.EventService
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@antv/g-lite/dist/dom", "CustomElementRegistry")
  @js.native
  open class CustomElementRegistry ()
    extends typings.antvGLite.customElementRegistryMod.CustomElementRegistry
  
  @JSImport("@antv/g-lite/dist/dom", "CustomEvent")
  @js.native
  open class CustomEvent protected ()
    extends typings.antvGLite.customEventMod.CustomEvent {
    def this(eventName: String) = this()
    def this(eventName: String, `object`: js.Object) = this()
  }
  
  @JSImport("@antv/g-lite/dist/dom", "Document")
  @js.native
  open class Document ()
    extends typings.antvGLite.documentMod.Document
  
  @JSImport("@antv/g-lite/dist/dom", "Element")
  @js.native
  open class Element[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] ()
    extends typings.antvGLite.elementMod.Element[StyleProps, ParsedStyleProps]
  /* static members */
  object Element {
    
    @JSImport("@antv/g-lite/dist/dom", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isElement(target: IElement[Any, Any]): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
    inline def isElement(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
    inline def isElement(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/dom", "ElementEvent")
  @js.native
  object ElementEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.antvGLite.domInterfacesMod.ElementEvent & String] = js.native
    
    /* "DOMAttrModified" */ val ATTR_MODIFIED: typings.antvGLite.domInterfacesMod.ElementEvent.ATTR_MODIFIED & String = js.native
    
    /* "bounds-changed" */ val BOUNDS_CHANGED: typings.antvGLite.domInterfacesMod.ElementEvent.BOUNDS_CHANGED & String = js.native
    
    /* "child-inserted" */ val CHILD_INSERTED: typings.antvGLite.domInterfacesMod.ElementEvent.CHILD_INSERTED & String = js.native
    
    /* "child-removed" */ val CHILD_REMOVED: typings.antvGLite.domInterfacesMod.ElementEvent.CHILD_REMOVED & String = js.native
    
    /* "culled" */ val CULLED: typings.antvGLite.domInterfacesMod.ElementEvent.CULLED & String = js.native
    
    /* "destroy" */ val DESTROY: typings.antvGLite.domInterfacesMod.ElementEvent.DESTROY & String = js.native
    
    /* "DOMNodeInserted" */ val INSERTED: typings.antvGLite.domInterfacesMod.ElementEvent.INSERTED & String = js.native
    
    /* "DOMNodeInsertedIntoDocument" */ val MOUNTED: typings.antvGLite.domInterfacesMod.ElementEvent.MOUNTED & String = js.native
    
    /* "removed" */ val REMOVED: typings.antvGLite.domInterfacesMod.ElementEvent.REMOVED & String = js.native
    
    /* "render-order-changed" */ val RENDER_ORDER_CHANGED: typings.antvGLite.domInterfacesMod.ElementEvent.RENDER_ORDER_CHANGED & String = js.native
    
    /* "DOMNodeRemovedFromDocument" */ val UNMOUNTED: typings.antvGLite.domInterfacesMod.ElementEvent.UNMOUNTED & String = js.native
  }
  
  @JSImport("@antv/g-lite/dist/dom", "EventTarget")
  @js.native
  open class EventTarget ()
    extends typings.antvGLite.eventTargetMod.EventTarget
  
  @JSImport("@antv/g-lite/dist/dom", "FederatedEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedEvent[N /* <: Event */, T] ()
    extends typings.antvGLite.federatedEventMod.FederatedEvent[N, T] {
    def this(manager: EventService) = this()
  }
  
  @JSImport("@antv/g-lite/dist/dom", "FederatedMouseEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedMouseEvent ()
    extends typings.antvGLite.federatedMouseEventMod.FederatedMouseEvent {
    def this(manager: EventService) = this()
  }
  
  @JSImport("@antv/g-lite/dist/dom", "FederatedPointerEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedPointerEvent ()
    extends typings.antvGLite.federatedPointerEventMod.FederatedPointerEvent {
    def this(manager: EventService) = this()
  }
  
  @JSImport("@antv/g-lite/dist/dom", "FederatedWheelEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedWheelEvent ()
    extends typings.antvGLite.federatedWheelEventMod.FederatedWheelEvent {
    def this(manager: EventService) = this()
  }
  
  @JSImport("@antv/g-lite/dist/dom", "MutationEvent")
  @js.native
  open class MutationEvent protected ()
    extends typings.antvGLite.mutationEventMod.MutationEvent {
    def this(
      typeArg: ElementEvent,
      relatedNode: IElement[Any, Any],
      prevValue: Any,
      newValue: Any,
      attrName: String,
      attrChange: Double,
      prevParsedValue: Any,
      newParsedValue: Any
    ) = this()
  }
  /* static members */
  object MutationEvent {
    
    @JSImport("@antv/g-lite/dist/dom", "MutationEvent.ADDITION")
    @js.native
    val ADDITION: Double = js.native
    
    @JSImport("@antv/g-lite/dist/dom", "MutationEvent.MODIFICATION")
    @js.native
    val MODIFICATION: Double = js.native
    
    @JSImport("@antv/g-lite/dist/dom", "MutationEvent.REMOVAL")
    @js.native
    val REMOVAL: Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/dom", "Node")
  @js.native
  abstract class Node ()
    extends typings.antvGLite.nodeMod.Node
  /* static members */
  object Node {
    
    @JSImport("@antv/g-lite/dist/dom", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * otherNode is a descendant of the node.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_CONTAINED_BY")
    @js.native
    def DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    inline def DOCUMENT_POSITION_CONTAINED_BY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode is an ancestor of the node.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_CONTAINS")
    @js.native
    def DOCUMENT_POSITION_CONTAINS: Double = js.native
    inline def DOCUMENT_POSITION_CONTAINS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(x.asInstanceOf[js.Any])
    
    /**
      * Both nodes are in different documents or different trees in the same document.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_DISCONNECTED")
    @js.native
    def DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    inline def DOCUMENT_POSITION_DISCONNECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode follows the node in either a pre-order depth-first traversal of a tree containing both (e.g., as a descendant or following sibling or a descendant of a following sibling or following sibling of an ancestor) or (if they are disconnected) in an arbitrary but consistent ordering.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_FOLLOWING")
    @js.native
    def DOCUMENT_POSITION_FOLLOWING: Double = js.native
    inline def DOCUMENT_POSITION_FOLLOWING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(x.asInstanceOf[js.Any])
    
    /**
      * The result relies upon arbitrary and/or implementation-specific behavior and is not guaranteed to be portable.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    @js.native
    def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    inline def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(x.asInstanceOf[js.Any])
    
    /**
      * otherNode precedes the node in either a pre-order depth-first traversal
      * of a tree containing both (e.g., as an ancestor or previous sibling or a descendant of a previous sibling or previous sibling of an ancestor) or (if they are disconnected) in an arbitrary but consistent ordering.
      */
    @JSImport("@antv/g-lite/dist/dom", "Node.DOCUMENT_POSITION_PRECEDING")
    @js.native
    def DOCUMENT_POSITION_PRECEDING: Double = js.native
    inline def DOCUMENT_POSITION_PRECEDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(x.asInstanceOf[js.Any])
    
    inline def isNode(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean]
    inline def isNode(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.INode */ Boolean]
  }
}
