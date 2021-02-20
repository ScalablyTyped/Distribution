package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCore.mod.DebugNode because Already inherited
- typings.angularCore.mod.DebugElement because var conflicts: componentInstance, context, injector, listeners, parent, providerTokens, references. Inlined name, properties, attributes, classes, styles, childNodes, nativeElement, children, query, queryAll, queryAllNodes, triggerEventHandler */ @js.native
trait DebugElementPOSTR3 extends DebugNodePOSTR3 {
  
  def attributes: StringDictionary[String | Null] = js.native
  @JSName("attributes")
  val attributes_FDebugElementPOSTR3: StringDictionary[String | Null] = js.native
  
  def childNodes: js.Array[DebugNode] = js.native
  @JSName("childNodes")
  val childNodes_FDebugElementPOSTR3: js.Array[DebugNode] = js.native
  
  def children: js.Array[DebugElement] = js.native
  @JSName("children")
  val children_FDebugElementPOSTR3: js.Array[DebugElement] = js.native
  
  def classes: StringDictionary[Boolean] = js.native
  @JSName("classes")
  val classes_FDebugElementPOSTR3: StringDictionary[Boolean] = js.native
  
  def name: String = js.native
  @JSName("name")
  val name_FDebugElementPOSTR3: String = js.native
  
  def nativeElement: Element | Null = js.native
  @JSName("nativeElement")
  val nativeElement_FDebugElementPOSTR3: js.Any = js.native
  
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
  @JSName("properties")
  val properties_FDebugElementPOSTR3: StringDictionary[js.Any] = js.native
  
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  
  def styles: StringDictionary[String | Null] = js.native
  @JSName("styles")
  val styles_FDebugElementPOSTR3: StringDictionary[String | Null] = js.native
  
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
}
