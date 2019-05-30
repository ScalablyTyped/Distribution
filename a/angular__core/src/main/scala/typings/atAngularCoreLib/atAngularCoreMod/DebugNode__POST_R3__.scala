package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNode__POST_R3__ extends DebugNode {
  @JSName("nativeNode")
  val nativeNode_DebugNode__POST_R3__ : stdLib.Node
}

object DebugNode__POST_R3__ {
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    nativeNode: stdLib.Node,
    providerTokens: js.Array[_],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    parent: DebugElement = null
  ): DebugNode__POST_R3__ = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance, context = context, injector = injector, listeners = listeners, nativeNode = nativeNode, providerTokens = providerTokens, references = references)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DebugNode__POST_R3__]
  }
}

