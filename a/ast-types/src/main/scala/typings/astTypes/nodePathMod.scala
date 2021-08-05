package typings.astTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.astTypes.astTypesMod.Fork
import typings.astTypes.pathMod.Path
import typings.astTypes.scopeMod.Scope
import typings.astTypes.typesMod.ASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodePathMod {
  
  @JSImport("ast-types/lib/node-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fork: Fork): NodePathConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fork.asInstanceOf[js.Any]).asInstanceOf[NodePathConstructor]
  
  @js.native
  trait NodePath[N, V]
    extends StObject
       with Path[V] {
    
    def _computeNode(): js.Any = js.native
    
    def _computeParent(): js.Any = js.native
    
    def _computeScope(): Scope | Null = js.native
    
    def canBeFirstInStatement(): Boolean = js.native
    
    def firstInStatement(): Boolean = js.native
    
    def needsParens(): Boolean = js.native
    def needsParens(assumeExpressionContext: Boolean): Boolean = js.native
    
    var node: N = js.native
    
    var parent: js.Any = js.native
    
    def prune(args: js.Any*): js.Any = js.native
    
    @JSName("replace")
    var replace_Original: js.Function2[/* replacement */ js.UndefOr[ASTNode], /* repeated */ ASTNode, js.Any] = js.native
    
    var scope: js.Any = js.native
  }
  
  @js.native
  trait NodePathConstructor
    extends StObject
       with Instantiable1[/* value */ js.Any, NodePath[ASTNode, js.Object]]
       with Instantiable2[/* value */ js.Any, /* parentPath */ js.Any, NodePath[ASTNode, js.Object]]
       with Instantiable3[
          /* value */ js.Any, 
          (/* parentPath */ js.Any) | (/* parentPath */ Unit), 
          /* name */ js.Any, 
          NodePath[ASTNode, js.Object]
        ]
}
