package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugElementPOSTR3
  extends DebugNodePOSTR3
     with DebugElement {
  @JSName("nativeElement")
  val nativeElement_DebugElementPOSTR3: Element | Null
}

object DebugElementPOSTR3 {
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
    nativeNode: js.Any,
    properties: StringDictionary[js.Any],
    providerTokens: js.Array[_],
    query: Predicate[DebugElement] => DebugElement,
    queryAll: Predicate[DebugElement] => js.Array[DebugElement],
    queryAllNodes: Predicate[DebugNode] => js.Array[DebugNode],
    references: StringDictionary[js.Any],
    styles: StringDictionary[String | Null],
    triggerEventHandler: (String, js.Any) => Unit,
    nativeElement: Element = null,
    parent: DebugElement = null
  ): DebugElementPOSTR3 = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), queryAll = js.Any.fromFunction1(queryAll), queryAllNodes = js.Any.fromFunction1(queryAllNodes), references = references.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], triggerEventHandler = js.Any.fromFunction2(triggerEventHandler))
    if (nativeElement != null) __obj.updateDynamic("nativeElement")(nativeElement.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugElementPOSTR3]
  }
}

