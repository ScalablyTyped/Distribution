package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNodePOSTR3 extends DebugNode {
  @JSName("nativeNode")
  val nativeNode_DebugNodePOSTR3: Node
}

object DebugNodePOSTR3 {
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    nativeNode: Node,
    providerTokens: js.Array[_],
    references: StringDictionary[js.Any],
    parent: DebugElement = null
  ): DebugNodePOSTR3 = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugNodePOSTR3]
  }
}

