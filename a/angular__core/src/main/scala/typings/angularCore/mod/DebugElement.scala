package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugElement extends DebugNode {
  
  val attributes: StringDictionary[String | Null] = js.native
  
  val childNodes: js.Array[DebugNode] = js.native
  
  val children: js.Array[DebugElement] = js.native
  
  val classes: StringDictionary[Boolean] = js.native
  
  val name: String = js.native
  
  val nativeElement: js.Any = js.native
  
  val properties: StringDictionary[js.Any] = js.native
  
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  
  val styles: StringDictionary[String | Null] = js.native
  
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
}
object DebugElement {
  
  @scala.inline
  def apply(
    attributes: StringDictionary[String | Null],
    childNodes: js.Array[DebugNode],
    children: js.Array[DebugElement],
    classes: StringDictionary[Boolean],
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    name: String,
    nativeElement: js.Any,
    nativeNode: js.Any,
    properties: StringDictionary[js.Any],
    providerTokens: js.Array[_],
    query: Predicate[DebugElement] => DebugElement,
    queryAll: Predicate[DebugElement] => js.Array[DebugElement],
    queryAllNodes: Predicate[DebugNode] => js.Array[DebugNode],
    references: StringDictionary[js.Any],
    styles: StringDictionary[String | Null],
    triggerEventHandler: (String, js.Any) => Unit
  ): DebugElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeElement = nativeElement.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), queryAll = js.Any.fromFunction1(queryAll), queryAllNodes = js.Any.fromFunction1(queryAllNodes), references = references.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], triggerEventHandler = js.Any.fromFunction2(triggerEventHandler))
    __obj.asInstanceOf[DebugElement]
  }
  
  @scala.inline
  implicit class DebugElementMutableBuilder[Self <: DebugElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String | Null]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodes(value: js.Array[DebugNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: DebugNode*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DebugElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: DebugElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: StringDictionary[Boolean]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeElement(value: js.Any): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Predicate[DebugElement] => DebugElement): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryAll(value: Predicate[DebugElement] => js.Array[DebugElement]): Self = StObject.set(x, "queryAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryAllNodes(value: Predicate[DebugNode] => js.Array[DebugNode]): Self = StObject.set(x, "queryAllNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: StringDictionary[String | Null]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEventHandler(value: (String, js.Any) => Unit): Self = StObject.set(x, "triggerEventHandler", js.Any.fromFunction2(value))
  }
}
