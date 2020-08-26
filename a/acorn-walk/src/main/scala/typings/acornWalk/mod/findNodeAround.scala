package typings.acornWalk.mod

import typings.acorn.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn-walk", "findNodeAround")
@js.native
object findNodeAround extends js.Object {
  def apply[TState](node: Node): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    base: js.UndefOr[scala.Nothing],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    base: RecursiveVisitors[TState]
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: js.UndefOr[scala.Nothing], `type`: String): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: String,
    base: js.UndefOr[scala.Nothing],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: js.UndefOr[scala.Nothing], `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: String,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: js.UndefOr[scala.Nothing], `type`: FindPredicate): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: FindPredicate,
    base: js.UndefOr[scala.Nothing],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: FindPredicate,
    base: RecursiveVisitors[TState]
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: js.UndefOr[scala.Nothing],
    `type`: FindPredicate,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: Double,
    `type`: js.UndefOr[scala.Nothing],
    base: js.UndefOr[scala.Nothing],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: js.UndefOr[scala.Nothing], base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = js.native
  def apply[TState](
    node: Node,
    start: Double,
    `type`: js.UndefOr[scala.Nothing],
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: String): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: String, base: js.UndefOr[scala.Nothing], state: TState): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: FindPredicate): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: FindPredicate, base: js.UndefOr[scala.Nothing], state: TState): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = js.native
  def apply[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = js.native
}

