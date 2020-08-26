package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugNodePOSTR3 extends DebugNode {
  @JSName("nativeNode")
  val nativeNode_DebugNodePOSTR3: Node = js.native
  @JSName("componentInstance")
  def componentInstance_MDebugNodePOSTR3: js.Any = js.native
  @JSName("context")
  def context_MDebugNodePOSTR3: js.Any = js.native
  @JSName("injector")
  def injector_MDebugNodePOSTR3: Injector = js.native
  @JSName("listeners")
  def listeners_MDebugNodePOSTR3: js.Array[DebugEventListener] = js.native
  @JSName("parent")
  def parent_MDebugNodePOSTR3: DebugElement | Null = js.native
  @JSName("providerTokens")
  def providerTokens_MDebugNodePOSTR3: js.Array[_] = js.native
  @JSName("references")
  def references_MDebugNodePOSTR3: StringDictionary[js.Any] = js.native
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
  @scala.inline
  implicit class DebugNodePOSTR3Ops[Self <: DebugNodePOSTR3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentInstance(value: () => js.Any): Self = this.set("componentInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setContext(value: () => js.Any): Self = this.set("context", js.Any.fromFunction0(value))
    @scala.inline
    def setInjector(value: () => Injector): Self = this.set("injector", js.Any.fromFunction0(value))
    @scala.inline
    def setListeners(value: () => js.Array[DebugEventListener]): Self = this.set("listeners", js.Any.fromFunction0(value))
    @scala.inline
    def setNativeNode(value: Node): Self = this.set("nativeNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: () => DebugElement | Null): Self = this.set("parent", js.Any.fromFunction0(value))
    @scala.inline
    def setProviderTokens(value: () => js.Array[_]): Self = this.set("providerTokens", js.Any.fromFunction0(value))
    @scala.inline
    def setReferences(value: () => StringDictionary[js.Any]): Self = this.set("references", js.Any.fromFunction0(value))
  }
  
}

