package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugElement__POST_R3__
  extends DebugNode__POST_R3__
     with DebugElement {
  @JSName("nativeElement")
  val nativeElement_DebugElement__POST_R3__ : stdLib.Element | scala.Null
}

object DebugElement__POST_R3__ {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    childNodes: js.Array[DebugNode],
    children: js.Array[DebugElement],
    classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    name: java.lang.String,
    nativeNode: js.Any,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any],
    providerTokens: js.Array[_],
    query: Predicate[DebugElement] => DebugElement,
    queryAll: Predicate[DebugElement] => js.Array[DebugElement],
    queryAllNodes: Predicate[DebugNode] => js.Array[DebugNode],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    triggerEventHandler: (java.lang.String, js.Any) => scala.Unit,
    nativeElement: stdLib.Element = null,
    parent: DebugElement = null
  ): DebugElement__POST_R3__ = {
    val __obj = js.Dynamic.literal(attributes = attributes, childNodes = childNodes, children = children, classes = classes, componentInstance = componentInstance, context = context, injector = injector, listeners = listeners, name = name, nativeNode = nativeNode, properties = properties, providerTokens = providerTokens, query = js.Any.fromFunction1(query), queryAll = js.Any.fromFunction1(queryAll), queryAllNodes = js.Any.fromFunction1(queryAllNodes), references = references, styles = styles, triggerEventHandler = js.Any.fromFunction2(triggerEventHandler))
    if (nativeElement != null) __obj.updateDynamic("nativeElement")(nativeElement)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DebugElement__POST_R3__]
  }
}

