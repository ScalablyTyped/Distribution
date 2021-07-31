package typings.acornWalk

import org.scalablytyped.runtime.StringDictionary
import typings.acorn.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acorn-walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ancestor[TState](node: Node, visitors: AncestorVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestor")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ancestor[TState](node: Node, visitors: AncestorVisitors[TState], base: Unit, state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestor")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ancestor[TState](node: Node, visitors: AncestorVisitors[TState], base: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestor")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ancestor[TState](node: Node, visitors: AncestorVisitors[TState], base: RecursiveVisitors[TState], state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestor")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findNodeAfter[TState](node: Node): js.UndefOr[Found[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAfter[TState](node: Node, start: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAfter")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  
  @scala.inline
  def findNodeAround[TState](node: Node): js.UndefOr[Found[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Double, `type`: FindPredicate, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAround[TState](node: Node, start: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAround")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  
  @scala.inline
  def findNodeAt[TState](node: Node): js.UndefOr[Found[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Double,
    end: Double,
    `type`: String,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Double,
    end: Double,
    `type`: Unit,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Double, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Double,
    end: Double,
    `type`: FindPredicate,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Double,
    end: Unit,
    `type`: String,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Double, end: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Double,
    end: Unit,
    `type`: FindPredicate,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Unit,
    end: Double,
    `type`: String,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Double, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Unit,
    end: Double,
    `type`: FindPredicate,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: String): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: String, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: String, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: String, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: Unit, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: Unit, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: Unit, base: RecursiveVisitors[TState], state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: FindPredicate): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: FindPredicate, base: Unit, state: TState): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](node: Node, start: Unit, end: Unit, `type`: FindPredicate, base: RecursiveVisitors[TState]): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  @scala.inline
  def findNodeAt[TState](
    node: Node,
    start: Unit,
    end: Unit,
    `type`: FindPredicate,
    base: RecursiveVisitors[TState],
    state: TState
  ): js.UndefOr[Found[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAt")(node.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Found[TState]]]
  
  @scala.inline
  def full[TState](node: Node, callback: FullWalkerCallback[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def full[TState](node: Node, callback: FullWalkerCallback[TState], base: Unit, state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def full[TState](node: Node, callback: FullWalkerCallback[TState], base: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def full[TState](node: Node, callback: FullWalkerCallback[TState], base: RecursiveVisitors[TState], state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fullAncestor[TState](node: Node, callback: FullAncestorWalkerCallback[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fullAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fullAncestor[TState](node: Node, callback: FullAncestorWalkerCallback[TState], base: Unit, state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fullAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fullAncestor[TState](node: Node, callback: FullAncestorWalkerCallback[TState], base: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fullAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fullAncestor[TState](
    node: Node,
    callback: FullAncestorWalkerCallback[TState],
    base: RecursiveVisitors[TState],
    state: TState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fullAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def make[TState](functions: RecursiveVisitors[TState]): RecursiveVisitors[TState] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(functions.asInstanceOf[js.Any]).asInstanceOf[RecursiveVisitors[TState]]
  @scala.inline
  def make[TState](functions: RecursiveVisitors[TState], base: RecursiveVisitors[TState]): RecursiveVisitors[TState] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(functions.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[RecursiveVisitors[TState]]
  
  @scala.inline
  def recursive[TState](node: Node, state: TState, functions: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any], functions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def recursive[TState](node: Node, state: TState, functions: RecursiveVisitors[TState], base: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any], functions.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def simple[TState](node: Node, visitors: SimpleVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simple")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def simple[TState](node: Node, visitors: SimpleVisitors[TState], base: Unit, state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simple")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def simple[TState](node: Node, visitors: SimpleVisitors[TState], base: RecursiveVisitors[TState]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simple")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def simple[TState](node: Node, visitors: SimpleVisitors[TState], base: RecursiveVisitors[TState], state: TState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simple")(node.asInstanceOf[js.Any], visitors.asInstanceOf[js.Any], base.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AncestorVisitors[TState] = StringDictionary[AncestorWalkerFn[TState]]
  
  type AncestorWalkerFn[TState] = js.Function3[
    /* node */ Node, 
    /* state */ TState | js.Array[Node], 
    /* ancestors */ js.Array[Node], 
    Unit
  ]
  
  type FindPredicate = js.Function2[/* type */ String, /* node */ Node, Boolean]
  
  trait Found[TState] extends StObject {
    
    var node: Node
    
    var state: TState
  }
  object Found {
    
    @scala.inline
    def apply[TState](node: Node, state: TState): Found[TState] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Found[TState]]
    }
    
    @scala.inline
    implicit class FoundMutableBuilder[Self <: Found[?], TState] (val x: Self & Found[TState]) extends AnyVal {
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type FullAncestorWalkerCallback[TState] = js.Function4[
    /* node */ Node, 
    /* state */ TState | js.Array[Node], 
    /* ancestors */ js.Array[Node], 
    /* type */ String, 
    Unit
  ]
  
  type FullWalkerCallback[TState] = js.Function3[/* node */ Node, /* state */ TState, /* type */ String, Unit]
  
  type RecursiveVisitors[TState] = StringDictionary[RecursiveWalkerFn[TState]]
  
  type RecursiveWalkerFn[TState] = js.Function3[/* node */ Node, /* state */ TState, /* callback */ WalkerCallback[TState], Unit]
  
  type SimpleVisitors[TState] = StringDictionary[SimpleWalkerFn[TState]]
  
  type SimpleWalkerFn[TState] = js.Function2[/* node */ Node, /* state */ TState, Unit]
  
  type WalkerCallback[TState] = js.Function2[/* node */ Node, /* state */ TState, Unit]
}
