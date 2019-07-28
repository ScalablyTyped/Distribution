package typings.astDashTypes.libNodeDashPathMod

import typings.astDashTypes.libPathMod.Path
import typings.astDashTypes.libScopeMod.Scope
import typings.astDashTypes.libTypesMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePath[N, V] extends Path[V] {
  var node: N = js.native
  var parent: js.Any = js.native
  @JSName("replace")
  var replace_Original: js.Function2[/* replacement */ js.UndefOr[ASTNode], /* repeated */ ASTNode, _] = js.native
  var scope: js.Any = js.native
  def _computeNode(): js.Any = js.native
  def _computeParent(): js.Any = js.native
  def _computeScope(): Scope | Null = js.native
  def canBeFirstInStatement(): Boolean = js.native
  def firstInStatement(): Boolean = js.native
  def needsParens(): Boolean = js.native
  def needsParens(assumeExpressionContext: Boolean): Boolean = js.native
  def prune(args: js.Any*): js.Any = js.native
}

