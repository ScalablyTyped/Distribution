package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "DebugElement")
@js.native
open class DebugElement protected () extends DebugNode {
  def this(nativeNode: Element) = this()
  
  /**
    *  A map of attribute names to attribute values for an element.
    */
  def attributes: StringDictionary[String | Null] = js.native
  
  /**
    * The `childNodes` of the DOM element as a `DebugNode` array.
    *
    * @see [Node.childNodes](https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes)
    */
  def childNodes: js.Array[DebugNode] = js.native
  
  /**
    * The immediate `DebugElement` children. Walk the tree by descending through `children`.
    */
  def children: js.Array[DebugElement] = js.native
  
  /**
    * A map containing the class names on the element as keys.
    *
    * This map is derived from the `className` property of the DOM element.
    *
    * Note: The values of this object will always be `true`. The class key will not appear in the KV
    * object if it does not exist on the element.
    *
    * @see [Element.className](https://developer.mozilla.org/en-US/docs/Web/API/Element/className)
    */
  def classes: StringDictionary[Boolean] = js.native
  
  /**
    * The element tag name, if it is an element.
    */
  def name: String = js.native
  
  /**
    * The underlying DOM element at the root of the component.
    */
  def nativeElement: Any = js.native
  
  /**
    *  Gets a map of property names to property values for an element.
    *
    *  This map includes:
    *  - Regular property bindings (e.g. `[id]="id"`)
    *  - Host property bindings (e.g. `host: { '[id]': "id" }`)
    *  - Interpolated property bindings (e.g. `id="{{ value }}")
    *
    *  It does not include:
    *  - input property bindings (e.g. `[myCustomInput]="value"`)
    *  - attribute bindings (e.g. `[attr.role]="menu"`)
    */
  def properties: StringDictionary[Any] = js.native
  
  /**
    * @returns the first `DebugElement` that matches the predicate at any depth in the subtree.
    */
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  
  /**
    * @returns All `DebugElement` matches for the predicate at any depth in the subtree.
    */
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  
  /**
    * @returns All `DebugNode` matches for the predicate at any depth in the subtree.
    */
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  
  /**
    * The inline styles of the DOM element.
    *
    * Will be `null` if there is no `style` property on the underlying DOM element.
    *
    * @see [ElementCSSInlineStyle](https://developer.mozilla.org/en-US/docs/Web/API/ElementCSSInlineStyle/style)
    */
  def styles: StringDictionary[String | Null] = js.native
  
  /**
    * Triggers the event by its name if there is a corresponding listener in the element's
    * `listeners` collection.
    *
    * If the event lacks a listener or there's some other problem, consider
    * calling `nativeElement.dispatchEvent(eventObject)`.
    *
    * @param eventName The name of the event to trigger
    * @param eventObj The _event object_ expected by the handler
    *
    * @see [Testing components scenarios](guide/testing-components-scenarios#trigger-event-handler)
    */
  def triggerEventHandler(eventName: String): Unit = js.native
  def triggerEventHandler(eventName: String, eventObj: Any): Unit = js.native
}
