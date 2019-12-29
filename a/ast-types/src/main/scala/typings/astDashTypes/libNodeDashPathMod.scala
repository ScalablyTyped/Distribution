package typings.astDashTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.astDashTypes.libPathMod.Path
import typings.astDashTypes.libScopeMod.Scope
import typings.astDashTypes.libTypesMod.ASTNode
import typings.astDashTypes.typesMod.Fork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/lib/node-path", JSImport.Namespace)
@js.native
object libNodeDashPathMod extends js.Object {
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
  
  @js.native
  trait NodePathConstructor
    extends Instantiable1[/* value */ js.Any, NodePath[ASTNode, js.Object]]
       with Instantiable2[/* value */ js.Any, /* parentPath */ js.Any, NodePath[ASTNode, js.Object]]
       with Instantiable3[
          /* value */ js.Any, 
          /* parentPath */ js.Any, 
          /* name */ js.Any, 
          NodePath[ASTNode, js.Object]
        ]
  
  def default(fork: Fork): NodePathConstructor = js.native
}

