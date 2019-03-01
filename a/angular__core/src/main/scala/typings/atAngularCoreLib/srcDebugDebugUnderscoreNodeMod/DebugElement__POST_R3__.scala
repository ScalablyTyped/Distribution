package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `DebugElement__POST_R3__`
  extends `DebugNode__POST_R3__`
     with DebugElement {
  @JSName("nativeElement")
  val `nativeElement_DebugElement__POST_R3__`: stdLib.Element | scala.Null
}

object `DebugElement__POST_R3__` {
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
    nativeNode: js.Any,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any],
    providerTokens: js.Array[_],
    query: js.Function1[Predicate[DebugElement], DebugElement],
    queryAll: js.Function1[Predicate[DebugElement], js.Array[DebugElement]],
    queryAllNodes: js.Function1[Predicate[DebugNode], js.Array[DebugNode]],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    triggerEventHandler: js.Function2[java.lang.String, js.Any, scala.Unit],
    nativeElement: stdLib.Element = null,
    parent: DebugElement = null
  ): `DebugElement__POST_R3__` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("classes")(classes)
    __obj.updateDynamic("componentInstance")(componentInstance)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("injector")(injector)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nativeNode")(nativeNode)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("providerTokens")(providerTokens)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("queryAll")(queryAll)
    __obj.updateDynamic("queryAllNodes")(queryAllNodes)
    __obj.updateDynamic("references")(references)
    __obj.updateDynamic("styles")(styles)
    __obj.updateDynamic("triggerEventHandler")(triggerEventHandler)
    if (nativeElement != null) __obj.updateDynamic("nativeElement")(nativeElement)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[`DebugElement__POST_R3__`]
  }
}

