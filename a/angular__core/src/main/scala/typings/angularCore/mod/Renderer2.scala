package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreStrings.body
import typings.angularCore.angularCoreStrings.document
import typings.angularCore.angularCoreStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Renderer2")
@js.native
abstract class Renderer2 () extends StObject {
  
  /**
    * Implement this callback to add a class to an element in the DOM.
    * @param el The element.
    * @param name The class name.
    */
  def addClass(el: js.Any, name: String): Unit = js.native
  
  /**
    * Appends a child to a given parent node in the host element DOM.
    * @param parent The parent node.
    * @param newChild The new child node.
    */
  def appendChild(parent: js.Any, newChild: js.Any): Unit = js.native
  
  /**
    * Implement this callback to add a comment to the DOM of the host element.
    * @param value The comment text.
    * @returns The modified element.
    */
  def createComment(value: String): js.Any = js.native
  
  /**
    * Implement this callback to create an instance of the host element.
    * @param name An identifying name for the new element, unique within the namespace.
    * @param namespace The namespace for the new element.
    * @returns The new element.
    */
  def createElement(name: String): js.Any = js.native
  def createElement(name: String, namespace: String): js.Any = js.native
  
  /**
    * Implement this callback to add text to the DOM of the host element.
    * @param value The text string.
    * @returns The modified element.
    */
  def createText(value: String): js.Any = js.native
  
  /**
    * Use to store arbitrary developer-defined data on a renderer instance,
    * as an object containing key-value pairs.
    * This is useful for renderers that delegate to other renderers.
    */
  def data: StringDictionary[js.Any] = js.native
  
  /**
    * Implement this callback to destroy the renderer or the host element.
    */
  def destroy(): Unit = js.native
  
  /**
    * If null or undefined, the view engine won't call it.
    * This is used as a performance optimization for production mode.
    */
  var destroyNode: (js.Function1[/* node */ js.Any, Unit]) | Null = js.native
  
  /**
    * Implement this callback to insert a child node at a given position in a parent node
    * in the host element DOM.
    * @param parent The parent node.
    * @param newChild The new child nodes.
    * @param refChild The existing child node before which `newChild` is inserted.
    * @param isMove Optional argument which signifies if the current `insertBefore` is a result of a
    *     move. Animation uses this information to trigger move animations. In the past the Animation
    *     would always assume that any `insertBefore` is a move. This is not strictly true because
    *     with runtime i18n it is possible to invoke `insertBefore` as a result of i18n and it should
    *     not trigger an animation move.
    */
  def insertBefore(parent: js.Any, newChild: js.Any, refChild: js.Any): Unit = js.native
  def insertBefore(parent: js.Any, newChild: js.Any, refChild: js.Any, isMove: Boolean): Unit = js.native
  
  def listen(target: js.Any, eventName: String, callback: js.Function1[/* event */ js.Any, Boolean | Unit]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_body(target: body, eventName: String, callback: js.Function1[/* event */ js.Any, Boolean | Unit]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_document(target: document, eventName: String, callback: js.Function1[/* event */ js.Any, Boolean | Unit]): js.Function0[Unit] = js.native
  /**
    * Implement this callback to start an event listener.
    * @param target The context in which to listen for events. Can be
    * the entire window or document, the body of the document, or a specific
    * DOM element.
    * @param eventName The event to listen for.
    * @param callback A handler function to invoke when the event occurs.
    * @returns An "unlisten" function for disposing of this handler.
    */
  @JSName("listen")
  def listen_window(target: window, eventName: String, callback: js.Function1[/* event */ js.Any, Boolean | Unit]): js.Function0[Unit] = js.native
  
  /**
    * Implement this callback to get the next sibling node of a given node
    * in the host element's DOM.
    * @returns The sibling node, or null if there is no sibling.
    * For WebWorkers, always returns a value.
    * This is because the check is synchronous,
    * and the caller can't rely on checking for null.
    */
  def nextSibling(node: js.Any): js.Any = js.native
  
  /**
    * Implement this callback to get the parent of a given node
    * in the host element's DOM.
    * @param node The child node to query.
    * @returns The parent node, or null if there is no parent.
    * For WebWorkers, always returns true.
    * This is because the check is synchronous,
    * and the caller can't rely on checking for null.
    */
  def parentNode(node: js.Any): js.Any = js.native
  
  /**
    * Implement this callback to remove an attribute from an element in the DOM.
    * @param el The element.
    * @param name The attribute name.
    * @param namespace The namespace.
    */
  def removeAttribute(el: js.Any, name: String): Unit = js.native
  def removeAttribute(el: js.Any, name: String, namespace: String): Unit = js.native
  
  /**
    * Implement this callback to remove a child node from the host element's DOM.
    * @param parent The parent node.
    * @param oldChild The child node to remove.
    * @param isHostElement Optionally signal to the renderer whether this element is a host element
    * or not
    */
  def removeChild(parent: js.Any, oldChild: js.Any): Unit = js.native
  def removeChild(parent: js.Any, oldChild: js.Any, isHostElement: Boolean): Unit = js.native
  
  /**
    * Implement this callback to remove a class from an element in the DOM.
    * @param el The element.
    * @param name The class name.
    */
  def removeClass(el: js.Any, name: String): Unit = js.native
  
  /**
    * Implement this callback to remove the value from a CSS style for an element in the DOM.
    * @param el The element.
    * @param style The name of the style.
    * @param flags Flags for style variations to remove, if set. ???
    */
  def removeStyle(el: js.Any, style: String): Unit = js.native
  def removeStyle(el: js.Any, style: String, flags: RendererStyleFlags2): Unit = js.native
  
  /**
    * Implement this callback to prepare an element to be bootstrapped
    * as a root element, and return the element instance.
    * @param selectorOrNode The DOM element.
    * @param preserveContent Whether the contents of the root element
    * should be preserved, or cleared upon bootstrap (default behavior).
    * Use with `ViewEncapsulation.ShadowDom` to allow simple native
    * content projection via `<slot>` elements.
    * @returns The root element.
    */
  def selectRootElement(selectorOrNode: String): js.Any = js.native
  def selectRootElement(selectorOrNode: String, preserveContent: Boolean): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any, preserveContent: Boolean): js.Any = js.native
  
  /**
    * Implement this callback to set an attribute value for an element in the DOM.
    * @param el The element.
    * @param name The attribute name.
    * @param value The new value.
    * @param namespace The namespace.
    */
  def setAttribute(el: js.Any, name: String, value: String): Unit = js.native
  def setAttribute(el: js.Any, name: String, value: String, namespace: String): Unit = js.native
  
  /**
    * Implement this callback to set the value of a property of an element in the DOM.
    * @param el The element.
    * @param name The property name.
    * @param value The new value.
    */
  def setProperty(el: js.Any, name: String, value: js.Any): Unit = js.native
  
  /**
    * Implement this callback to set a CSS style for an element in the DOM.
    * @param el The element.
    * @param style The name of the style.
    * @param value The new value.
    * @param flags Flags for style variations. No flags are set by default.
    */
  def setStyle(el: js.Any, style: String, value: js.Any): Unit = js.native
  def setStyle(el: js.Any, style: String, value: js.Any, flags: RendererStyleFlags2): Unit = js.native
  
  /**
    * Implement this callback to set the value of a node in the host element.
    * @param node The node.
    * @param value The new value.
    */
  def setValue(node: js.Any, value: String): Unit = js.native
}
