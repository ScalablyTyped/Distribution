package typings.acornWalk.mod

import typings.acorn.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn-walk", "recursive")
@js.native
object recursive extends js.Object {
  
  def apply[TState](node: Node, state: TState, functions: RecursiveVisitors[TState]): Unit = js.native
  def apply[TState](node: Node, state: TState, functions: RecursiveVisitors[TState], base: RecursiveVisitors[TState]): Unit = js.native
}
