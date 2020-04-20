package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNodePOSTR3 extends DebugNode {
  @JSName("nativeNode")
  val nativeNode_DebugNodePOSTR3: Node
  @JSName("componentInstance")
  def componentInstance_MDebugNodePOSTR3: js.Any
  @JSName("context")
  def context_MDebugNodePOSTR3: js.Any
  @JSName("injector")
  def injector_MDebugNodePOSTR3: Injector
  @JSName("listeners")
  def listeners_MDebugNodePOSTR3: js.Array[DebugEventListener]
  @JSName("parent")
  def parent_MDebugNodePOSTR3: DebugElement | Null
  @JSName("providerTokens")
  def providerTokens_MDebugNodePOSTR3: js.Array[_]
  @JSName("references")
  def references_MDebugNodePOSTR3: StringDictionary[js.Any]
}

object DebugNodePOSTR3 {
  @scala.inline
  def apply(
    componentInstance: () => js.Any,
    context: () => js.Any,
    injector: () => Injector,
    listeners: () => js.Array[DebugEventListener],
    nativeNode: Node,
    parent: () => DebugElement | Null,
    providerTokens: () => js.Array[_],
    references: () => StringDictionary[js.Any]
  ): DebugNodePOSTR3 = {
    val __obj = js.Dynamic.literal(componentInstance = js.Any.fromFunction0(componentInstance), context = js.Any.fromFunction0(context), injector = js.Any.fromFunction0(injector), listeners = js.Any.fromFunction0(listeners), nativeNode = nativeNode.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), providerTokens = js.Any.fromFunction0(providerTokens), references = js.Any.fromFunction0(references))
    __obj.asInstanceOf[DebugNodePOSTR3]
  }
}

