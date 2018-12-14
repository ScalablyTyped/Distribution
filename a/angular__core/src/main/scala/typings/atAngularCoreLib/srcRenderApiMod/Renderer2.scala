package typings
package atAngularCoreLib.srcRenderApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render/api", "Renderer2")
@js.native
abstract class Renderer2 () extends js.Object {
  /**
       * Use to store arbitrary developer-defined data on a renderer instance,
       * as an object containing key-value pairs.
       * This is useful for renderers that delegate to other renderers.
       */
  val data: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * If null or undefined, the view engine won't call it.
       * This is used as a performance optimization for production mode.
       */
  var destroyNode: (js.Function1[/* node */ js.Any, scala.Unit]) | scala.Null = js.native
  /**
       * Implement this callback to add a class to an element in the DOM.
       * @param el The element.
       * @param name The class name.
       */
  def addClass(el: js.Any, name: java.lang.String): scala.Unit = js.native
  /**
       * Appends a child to a given parent node in the host element DOM.
       * @param parent The parent node.
       * @param newChild The new child node.
       */
  def appendChild(parent: js.Any, newChild: js.Any): scala.Unit = js.native
  /**
       * Implement this callback to add a comment to the DOM of the host element.
       * @param value The comment text.
       * @returns The modified element.
       */
  def createComment(value: java.lang.String): js.Any = js.native
  /**
       * Implement this callback to create an instance of the host element.
       * @param name An identifying name for the new element, unique within the namespace.
       * @param namespace The namespace for the new element.
       * @returns The new element.
       */
  def createElement(name: java.lang.String): js.Any = js.native
  /**
       * Implement this callback to create an instance of the host element.
       * @param name An identifying name for the new element, unique within the namespace.
       * @param namespace The namespace for the new element.
       * @returns The new element.
       */
  def createElement(name: java.lang.String, namespace: java.lang.String): js.Any = js.native
  /**
       * Implement this callback to add text to the DOM of the host element.
       * @param value The text string.
       * @returns The modified element.
       */
  def createText(value: java.lang.String): js.Any = js.native
  /**
       * Implement this callback to destroy the renderer or the host element.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Implement this callback to insert a child node at a given position in a parent node
       * in the host element DOM.
       * @param parent The parent node.
       * @param newChild The new child nodes.
       * @param refChild The existing child node that should precede the new node.
       */
  def insertBefore(parent: js.Any, newChild: js.Any, refChild: js.Any): scala.Unit = js.native
  /**
       * Implement this callback to start an event listener.
       * @param target The context in which to listen for events. Can be
       * the entire window or document, the body of the document, or a specific
       * DOM element.
       * @param eventName The event to listen for.
       * @param callback A handler function to invoke when the event occurs.
       * @returns An "unlisten" function for disposing of this handler.
       */
  def listen(
    target: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean | scala.Unit]
  ): js.Function0[scala.Unit] = js.native
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
  def listen_body(
    target: atAngularCoreLib.atAngularCoreLibStrings.body,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean | scala.Unit]
  ): js.Function0[scala.Unit] = js.native
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
  def listen_document(
    target: atAngularCoreLib.atAngularCoreLibStrings.document,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean | scala.Unit]
  ): js.Function0[scala.Unit] = js.native
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
  def listen_window(
    target: atAngularCoreLib.atAngularCoreLibStrings.window,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean | scala.Unit]
  ): js.Function0[scala.Unit] = js.native
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
  def removeAttribute(el: js.Any, name: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to remove an attribute from an element in the DOM.
       * @param el The element.
       * @param name The attribute name.
       * @param namespace The namespace.
       */
  def removeAttribute(el: js.Any, name: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to remove a child node from the host element's DOM.
       * @param parent The parent node.
       * @param oldChild The child node to remove.
       */
  def removeChild(parent: js.Any, oldChild: js.Any): scala.Unit = js.native
  /**
       * Implement this callback to remove a class from an element in the DOM.
       * @param el The element.
       * @param name The class name.
       */
  def removeClass(el: js.Any, name: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to remove the value from a CSS style for an element in the DOM.
       * @param el The element.
       * @param style The name of the style.
       * @param flags Flags for style variations to remove, if set. ???
       */
  def removeStyle(el: js.Any, style: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to remove the value from a CSS style for an element in the DOM.
       * @param el The element.
       * @param style The name of the style.
       * @param flags Flags for style variations to remove, if set. ???
       */
  def removeStyle(el: js.Any, style: java.lang.String, flags: RendererStyleFlags2): scala.Unit = js.native
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
  def selectRootElement(selectorOrNode: java.lang.String): js.Any = js.native
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
  def selectRootElement(selectorOrNode: java.lang.String, preserveContent: scala.Boolean): js.Any = js.native
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
  def selectRootElement(selectorOrNode: js.Any): js.Any = js.native
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
  def selectRootElement(selectorOrNode: js.Any, preserveContent: scala.Boolean): js.Any = js.native
  /**
       * Implement this callback to set an attribute value for an element in the DOM.
       * @param el The element.
       * @param name The attribute name.
       * @param value The new value.
       * @param namespace The namespace.
       */
  def setAttribute(el: js.Any, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to set an attribute value for an element in the DOM.
       * @param el The element.
       * @param name The attribute name.
       * @param value The new value.
       * @param namespace The namespace.
       */
  def setAttribute(el: js.Any, name: java.lang.String, value: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  /**
       * Implement this callback to set the value of a property of an element in the DOM.
       * @param el The element.
       * @param name The property name.
       * @param value The new value.
       */
  def setProperty(el: js.Any, name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
       * Implement this callback to set a CSS style for an element in the DOM.
       * @param el The element.
       * @param style The name of the style.
       * @param value The new value.
       * @param flags Flags for style variations. No flags are set by default.
       */
  def setStyle(el: js.Any, style: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
       * Implement this callback to set a CSS style for an element in the DOM.
       * @param el The element.
       * @param style The name of the style.
       * @param value The new value.
       * @param flags Flags for style variations. No flags are set by default.
       */
  def setStyle(el: js.Any, style: java.lang.String, value: js.Any, flags: RendererStyleFlags2): scala.Unit = js.native
  /**
       * Implement this callback to set the value of a node in the host element.
       * @param node The node.
       * @param value The new value.
       */
  def setValue(node: js.Any, value: java.lang.String): scala.Unit = js.native
}

