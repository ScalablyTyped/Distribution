package typings.acornWalk.mod

import typings.acorn.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn-walk", "full")
@js.native
object full extends js.Object {
  
  def apply[TState](node: Node, callback: FullWalkerCallback[TState]): Unit = js.native
  def apply[TState](node: Node, callback: FullWalkerCallback[TState], base: js.UndefOr[scala.Nothing], state: TState): Unit = js.native
  def apply[TState](node: Node, callback: FullWalkerCallback[TState], base: RecursiveVisitors[TState]): Unit = js.native
  def apply[TState](node: Node, callback: FullWalkerCallback[TState], base: RecursiveVisitors[TState], state: TState): Unit = js.native
}
