package typings
package astDashTypesLib.libNodeDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePath[N, V]
  extends astDashTypesLib.libPathMod.Path[V] {
  var node: N = js.native
  var parent: js.Any = js.native
  @JSName("replace")
  var replace_Original: js.Function2[
    /* replacement */ js.UndefOr[astDashTypesLib.libTypesMod.ASTNode], 
    /* repeated */ astDashTypesLib.libTypesMod.ASTNode, 
    _
  ] = js.native
  var scope: js.Any = js.native
  def _computeNode(): js.Any = js.native
  def _computeParent(): js.Any = js.native
  def _computeScope(): astDashTypesLib.libScopeMod.Scope | scala.Null = js.native
  def canBeFirstInStatement(): scala.Boolean = js.native
  def firstInStatement(): scala.Boolean = js.native
  def needsParens(): scala.Boolean = js.native
  def needsParens(assumeExpressionContext: scala.Boolean): scala.Boolean = js.native
  def prune(args: js.Any*): js.Any = js.native
}

