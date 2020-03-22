package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.angularCore.mod.DebugNode because Already inherited
- typings.angularCore.mod.DebugElement because var conflicts: componentInstance, context, injector, listeners, parent, providerTokens, references. Inlined name, properties, attributes, classes, styles, childNodes, nativeElement, children, query, queryAll, queryAllNodes, triggerEventHandler */ trait DebugElementPOSTR3 extends DebugNodePOSTR3 {
  @JSName("attributes")
  val attributes_FDebugElementPOSTR3: StringDictionary[String | Null]
  @JSName("childNodes")
  val childNodes_FDebugElementPOSTR3: js.Array[DebugNode]
  @JSName("children")
  val children_FDebugElementPOSTR3: js.Array[DebugElement]
  @JSName("classes")
  val classes_FDebugElementPOSTR3: StringDictionary[Boolean]
  @JSName("name")
  val name_FDebugElementPOSTR3: String
  @JSName("nativeElement")
  val nativeElement_FDebugElementPOSTR3: js.Any
  @JSName("properties")
  val properties_FDebugElementPOSTR3: StringDictionary[js.Any]
  @JSName("styles")
  val styles_FDebugElementPOSTR3: StringDictionary[String | Null]
  def attributes(): StringDictionary[String | Null]
  def childNodes(): js.Array[DebugNode]
  def children(): js.Array[DebugElement]
  def classes(): StringDictionary[Boolean]
  def name(): String
  def nativeElement(): Element | Null
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
  def properties(): StringDictionary[js.Any]
  def query(predicate: Predicate[DebugElement]): DebugElement
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement]
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode]
  def styles(): StringDictionary[String | Null]
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit
}

object DebugElementPOSTR3 {
  @scala.inline
  def apply(
    attributes: () => StringDictionary[String | Null],
    childNodes: () => js.Array[DebugNode],
    children: () => js.Array[DebugElement],
    classes: () => StringDictionary[Boolean],
    componentInstance: () => js.Any,
    context: () => js.Any,
    injector: () => Injector,
    listeners: () => js.Array[DebugEventListener],
    name: () => String,
    nativeElement: () => Element | Null,
    nativeNode: Node,
    parent: () => DebugElement | Null,
    properties: () => StringDictionary[js.Any],
    providerTokens: () => js.Array[_],
    query: Predicate[DebugElement] => DebugElement,
    queryAll: Predicate[DebugElement] => js.Array[DebugElement],
    queryAllNodes: Predicate[DebugNode] => js.Array[DebugNode],
    references: () => StringDictionary[js.Any],
    styles: () => StringDictionary[String | Null],
    triggerEventHandler: (String, js.Any) => Unit
  ): DebugElementPOSTR3 = {
    val __obj = js.Dynamic.literal(attributes = js.Any.fromFunction0(attributes), childNodes = js.Any.fromFunction0(childNodes), children = js.Any.fromFunction0(children), classes = js.Any.fromFunction0(classes), componentInstance = js.Any.fromFunction0(componentInstance), context = js.Any.fromFunction0(context), injector = js.Any.fromFunction0(injector), listeners = js.Any.fromFunction0(listeners), name = js.Any.fromFunction0(name), nativeElement = js.Any.fromFunction0(nativeElement), nativeNode = nativeNode.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), properties = js.Any.fromFunction0(properties), providerTokens = js.Any.fromFunction0(providerTokens), query = js.Any.fromFunction1(query), queryAll = js.Any.fromFunction1(queryAll), queryAllNodes = js.Any.fromFunction1(queryAllNodes), references = js.Any.fromFunction0(references), styles = js.Any.fromFunction0(styles), triggerEventHandler = js.Any.fromFunction2(triggerEventHandler))
  
    __obj.asInstanceOf[DebugElementPOSTR3]
  }
}

