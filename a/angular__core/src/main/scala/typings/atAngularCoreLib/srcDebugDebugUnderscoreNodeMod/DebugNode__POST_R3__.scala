package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `DebugNode__POST_R3__` extends DebugNode {
  @JSName("nativeNode")
  val `nativeNode_DebugNode__POST_R3__`: stdLib.Node
}

object `DebugNode__POST_R3__` {
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: atAngularCoreLib.srcDiMod.Injector,
    listeners: js.Array[EventListener],
    nativeNode: stdLib.Node,
    providerTokens: js.Array[_],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    parent: DebugElement = null
  ): `DebugNode__POST_R3__` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentInstance")(componentInstance)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("injector")(injector)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("nativeNode")(nativeNode)
    __obj.updateDynamic("providerTokens")(providerTokens)
    __obj.updateDynamic("references")(references)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[`DebugNode__POST_R3__`]
  }
}

