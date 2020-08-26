package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCore.mod.DebugNode because Already inherited
- typings.angularCore.mod.DebugElement because var conflicts: componentInstance, context, injector, listeners, parent, providerTokens, references. Inlined name, properties, attributes, classes, styles, childNodes, nativeElement, children, query, queryAll, queryAllNodes, triggerEventHandler */ @js.native
trait DebugElementPOSTR3 extends DebugNodePOSTR3 {
  @JSName("attributes")
  val attributes_FDebugElementPOSTR3: StringDictionary[String | Null] = js.native
  @JSName("childNodes")
  val childNodes_FDebugElementPOSTR3: js.Array[DebugNode] = js.native
  @JSName("children")
  val children_FDebugElementPOSTR3: js.Array[DebugElement] = js.native
  @JSName("classes")
  val classes_FDebugElementPOSTR3: StringDictionary[Boolean] = js.native
  @JSName("name")
  val name_FDebugElementPOSTR3: String = js.native
  @JSName("nativeElement")
  val nativeElement_FDebugElementPOSTR3: js.Any = js.native
  @JSName("properties")
  val properties_FDebugElementPOSTR3: StringDictionary[js.Any] = js.native
  @JSName("styles")
  val styles_FDebugElementPOSTR3: StringDictionary[String | Null] = js.native
  def attributes: StringDictionary[String | Null] = js.native
  def childNodes: js.Array[DebugNode] = js.native
  def children: js.Array[DebugElement] = js.native
  def classes: StringDictionary[Boolean] = js.native
  def name: String = js.native
  def nativeElement: Element | Null = js.native
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
  def properties: StringDictionary[js.Any] = js.native
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  def styles: StringDictionary[String | Null] = js.native
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
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
  @scala.inline
  implicit class DebugElementPOSTR3Ops[Self <: DebugElementPOSTR3] (val x: Self) extends AnyVal {
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
    def setAttributes(value: () => StringDictionary[String | Null]): Self = this.set("attributes", js.Any.fromFunction0(value))
    @scala.inline
    def setChildNodes(value: () => js.Array[DebugNode]): Self = this.set("childNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setChildren(value: () => js.Array[DebugElement]): Self = this.set("children", js.Any.fromFunction0(value))
    @scala.inline
    def setClasses(value: () => StringDictionary[Boolean]): Self = this.set("classes", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: () => String): Self = this.set("name", js.Any.fromFunction0(value))
    @scala.inline
    def setNativeElement(value: () => Element | Null): Self = this.set("nativeElement", js.Any.fromFunction0(value))
    @scala.inline
    def setProperties(value: () => StringDictionary[js.Any]): Self = this.set("properties", js.Any.fromFunction0(value))
    @scala.inline
    def setQuery(value: Predicate[DebugElement] => DebugElement): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def setQueryAll(value: Predicate[DebugElement] => js.Array[DebugElement]): Self = this.set("queryAll", js.Any.fromFunction1(value))
    @scala.inline
    def setQueryAllNodes(value: Predicate[DebugNode] => js.Array[DebugNode]): Self = this.set("queryAllNodes", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: () => StringDictionary[String | Null]): Self = this.set("styles", js.Any.fromFunction0(value))
    @scala.inline
    def setTriggerEventHandler(value: (String, js.Any) => Unit): Self = this.set("triggerEventHandler", js.Any.fromFunction2(value))
  }
  
}

