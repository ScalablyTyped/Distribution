package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugElement extends DebugNode {
  val attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  val childNodes: js.Array[DebugNode]
  val children: js.Array[DebugElement]
  val classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val name: java.lang.String
  val nativeElement: js.Any
  val properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  val styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  def query(predicate: Predicate[DebugElement]): DebugElement
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement]
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode]
  def triggerEventHandler(eventName: java.lang.String, eventObj: js.Any): scala.Unit
}

object DebugElement {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    childNodes: js.Array[DebugNode],
    children: js.Array[DebugElement],
    classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    componentInstance: js.Any,
    context: js.Any,
    injector: atAngularCoreLib.srcDiMod.Injector,
    listeners: js.Array[EventListener],
    name: java.lang.String,
    nativeElement: js.Any,
    nativeNode: js.Any,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any],
    providerTokens: js.Array[_],
    query: js.Function1[Predicate[DebugElement], DebugElement],
    queryAll: js.Function1[Predicate[DebugElement], js.Array[DebugElement]],
    queryAllNodes: js.Function1[Predicate[DebugNode], js.Array[DebugNode]],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    triggerEventHandler: js.Function2[java.lang.String, js.Any, scala.Unit],
    parent: DebugElement = null
  ): DebugElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, childNodes = childNodes, children = children, classes = classes, componentInstance = componentInstance, context = context, injector = injector, listeners = listeners, name = name, nativeElement = nativeElement, nativeNode = nativeNode, properties = properties, providerTokens = providerTokens, query = query, queryAll = queryAll, queryAllNodes = queryAllNodes, references = references, styles = styles, triggerEventHandler = triggerEventHandler)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DebugElement]
  }
}

