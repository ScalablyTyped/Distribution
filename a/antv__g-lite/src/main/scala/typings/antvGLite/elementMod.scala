package typings.antvGLite

import typings.antvGLite.cullableMod.Cullable
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.ICSSStyleDeclaration
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.domInterfacesMod.IParentNode
import typings.antvGLite.geometryMod.Geometry
import typings.antvGLite.nodeMod.Node
import typings.antvGLite.rbushnodeMod.RBushNode
import typings.antvGLite.renderableMod.Renderable
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import typings.antvGLite.shapesMod.AABB
import typings.antvGLite.shapesMod.Rectangle
import typings.antvGLite.sortableMod.Sortable
import typings.antvGLite.transformMod.Transform
import typings.std.Attr
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvGLite.domInterfacesMod.IEventTarget because Already inherited
  - typings.antvGLite.domInterfacesMod.INode because Already inherited
  - typings.antvGLite.domInterfacesMod.IChildNode because var conflicts: childNodes, firstChild, isConnected, lastChild, nextSibling, nodeName, nodeType, nodeValue, ownerDocument, parentElement, parentNode, previousSibling, shadow, textContent. Inlined after, before, remove, replaceWith
  - typings.antvGLite.domInterfacesMod.IElement because var conflicts: childNodes, firstChild, isConnected, lastChild, nextSibling, nodeName, nodeType, nodeValue, ownerDocument, parentElement, parentNode, previousSibling, shadow, textContent. Inlined id, tagName, name, className, classList, attributes, style, parsedStyle, getElementById, getElementsByName, getElementsByClassName, getElementsByTagName, scrollLeft, scrollTop, clientLeft, clientTop, setAttribute, setAttribute, getAttribute, removeAttribute, hasAttribute */ @JSImport("@antv/g-lite/dist/dom/Element", "Element")
  @js.native
  open class Element[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] ()
    extends Node
       with IParentNode {
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/after
      */
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def after(nodes: INode*): Unit = js.native
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* CompleteClass */
    override def append(nodes: INode*): Unit = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/attributes
      */
    val attributes: StyleProps = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/before
      */
    /**
      * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def before(nodes: INode*): Unit = js.native
    
    /* CompleteClass */
    override val childElementCount: Double = js.native
    @JSName("childElementCount")
    def childElementCount_MElement: Double = js.native
    
    /**
      * Returns the child elements.
      */
    /* CompleteClass */
    override val children: js.Array[IElement[Any, Any]] = js.native
    @JSName("children")
    def children_MElement: js.Array[IElement[Any, Any]] = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/classList
      */
    def classList: js.Array[String] = js.native
    @JSName("classList")
    var classList_FElement: js.Array[String] = js.native
    
    /**
      * used in `getElementsByClassName`
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByClassName
      */
    def className: String = js.native
    def className_=(className: String): Unit = js.native
    /**
      * Returns the value of element's class content attribute. Can be set to change it.
      */
    @JSName("className")
    var className_FElement: String = js.native
    
    var clientLeft: Double = js.native
    
    /**
      * We don't support border now
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/clientTop
      */
    var clientTop: Double = js.native
    
    /**
      * should traverses the element and its parents (heading toward the document root)
      * until it finds a node that matches the specified CSS selector.
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/closest
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/closest#polyfill
      */
    def closest[E /* <: IElement[Any, Any] */](selectors: String): E | Null = js.native
    
    var computedStyle: Any = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/computedStyleMap
      * eg. circle.computedStyleMap().get('fill');
      */
    def computedStyleMap(): Map[String, Any] = js.native
    
    var cullable: Cullable = js.native
    
    /**
      * is destroyed or not
      */
    var destroyed: Boolean = js.native
    
    /**
      * Unique id.
      */
    var entity: Double = js.native
    
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
    def firstElementChild_MElement: (IElement[Any, Any]) | Null = js.native
    
    var geometry: Geometry = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute
      */
    def getAttribute(name: /* keyof StyleProps */ String): /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[keyof StyleProps] */ js.Any = js.native
    
    def getAttributeNS(namespace: String, localName: String): String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttributeNames
      */
    def getAttributeNames(): js.Array[String] = js.native
    
    def getAttributeNode(qualifiedName: String): Attr = js.native
    
    def getAttributeNodeNS(namespace: String, localName: String): Attr = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute
      */
    @JSName("getAttribute")
    def getAttribute_Union(attributeName: /* keyof StyleProps */ String): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[keyof StyleProps] */ js.Any
      ] = js.native
    
    /**
      * account for context's bounds in client space,
      * but not accounting for children
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getBoundingClientRect
      */
    def getBoundingClientRect(): Rectangle = js.native
    
    /**
      * get bounds in world space, account for children
      */
    def getBounds(): AABB = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/getClientRects
      */
    def getClientRects(): js.Array[Rectangle] = js.native
    
    def getElementById[E /* <: IElement[Any, Any] */](id: String): E | Null = js.native
    
    def getElementsByClassName[E /* <: IElement[Any, Any] */](className: String): js.Array[E] = js.native
    
    def getElementsByName[E /* <: IElement[Any, Any] */](name: String): js.Array[E] = js.native
    
    def getElementsByTagName[E /* <: IElement[Any, Any] */](tagName: String): js.Array[E] = js.native
    
    def getGeometryBounds(): AABB = js.native
    
    /**
      * get bounds in local space, account for children
      */
    def getLocalBounds(): AABB = js.native
    
    def getRenderBounds(): AABB = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttribute
      */
    def hasAttribute(qualifiedName: String): Boolean = js.native
    
    def hasAttributeNS(namespace: String, localName: String): Boolean = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttributes
      */
    def hasAttributes(): Boolean = js.native
    
    /**
      * used with `getElementById()`
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/id
      */
    var id: String = js.native
    
    /**
      * Returns the last child that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val lastElementChild: (IElement[Any, Any]) | Null = js.native
    @JSName("lastElementChild")
    def lastElementChild_MElement: (IElement[Any, Any]) | Null = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/matches
      */
    def matches(selector: String): Boolean = js.native
    
    /**
      * used in `getElementsByName`
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByName
      */
    var name: String = js.native
    
    /**
      * https://developer.mozilla.org/zh-CN/docs/Web/API/Element/namespaceURI
      */
    var namespaceURI: String = js.native
    
    @JSName("nextSibling")
    def nextSibling_MElement: (IElement[Any, Any]) | Null = js.native
    
    @JSName("parentElement")
    def parentElement_MElement: (IElement[Any, Any]) | Null = js.native
    
    /**
      * Renderers will use these used values.
      */
    var parsedStyle: ParsedStyleProps = js.native
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* CompleteClass */
    override def prepend(nodes: INode*): Unit = js.native
    
    @JSName("previousSibling")
    def previousSibling_MElement: (IElement[Any, Any]) | Null = js.native
    
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
    
    var rBushNode: RBushNode = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/remove
      */
    def remove(): this.type = js.native
    
    /**
      * should use removeAttribute() instead of setting the attribute value to null either directly or using setAttribute(). Many attributes will not behave as expected if you set them to null.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
      */
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
      */
    def removeAttribute(attributeName: /* keyof StyleProps */ String): Unit = js.native
    
    def removeAttributeNS(namespace: String, localName: String): Unit = js.native
    
    def removeAttributeNode(attr: Attr): Attr = js.native
    
    /**
      * Remove all children and destroy them.
      */
    def removeChildren(): Unit = js.native
    
    /**
      * Removes node.
      */
    @JSName("remove")
    def remove_Unit(): Unit = js.native
    
    var renderable: Renderable = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/replaceChildren
      */
    def replaceChildren(nodes: INode*): Unit = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/replaceWith
      */
    /**
      * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def replaceWith(nodes: INode*): Unit = js.native
    
    /* protected */ var sceneGraphService: SceneGraphService = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
      */
    def setAttribute[Key /* <: /* keyof StyleProps */ String */](
      attributeName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any
    ): Unit = js.native
    def setAttribute[Key /* <: /* keyof StyleProps */ String */](
      attributeName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any,
      force: Boolean
    ): Unit = js.native
    
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit = js.native
    
    def setAttributeNode(attr: Attr): Attr = js.native
    
    def setAttributeNodeNS(attr: Attr): Attr = js.native
    
    var sortable: Sortable = js.native
    
    /**
      * compatible with `style`
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style
      */
    var style: StyleProps & ICSSStyleDeclaration[StyleProps] = js.native
    
    def tagName: String = js.native
    /**
      * Returns the qualified name.
      */
    @JSName("tagName")
    var tagName_FElement: String = js.native
    
    def toggleAttribute(qualifiedName: String): Boolean = js.native
    def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
    
    var transformable: Transform = js.native
  }
  /* static members */
  object Element {
    
    @JSImport("@antv/g-lite/dist/dom/Element", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isElement(target: IElement[Any, Any]): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
    inline def isElement(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
    inline def isElement(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  }
}
