package typings.astTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.astTypes.astTypesMod.Fork
import typings.astTypes.typesMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ast-types/lib/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  def default(fork: Fork): PathConstructor = js.native
  
  @js.native
  trait Path[V] extends js.Object {
    
    var __childCache: js.Object | Null = js.native
    
    def each(callback: js.Any, context: js.Any): js.Any = js.native
    
    def filter(callback: js.Any, context: js.Any): js.Any = js.native
    
    def get(names: js.Any*): js.Any = js.native
    
    def getValueProperty(name: js.Any): js.Any = js.native
    
    def insertAfter(args: js.Any*): js.Any = js.native
    
    def insertAt(index: Double, args: js.Any*): js.Any = js.native
    
    def insertBefore(args: js.Any*): js.Any = js.native
    
    def map(callback: js.Any, context: js.Any): js.Any = js.native
    
    var name: js.Any = js.native
    
    var parentPath: js.Any = js.native
    
    def pop(): js.Any = js.native
    
    def push(args: js.Any*): js.Any = js.native
    
    def replace(replacement: js.UndefOr[scala.Nothing], args: ASTNode*): js.Any = js.native
    def replace(replacement: ASTNode, args: ASTNode*): js.Any = js.native
    
    def shift(): js.Any = js.native
    
    def unshift(args: js.Any*): js.Any = js.native
    
    var value: V = js.native
  }
  
  @js.native
  trait PathConstructor
    extends Instantiable1[/* value */ js.Any, Path[js.Object]]
       with Instantiable2[/* value */ js.Any, /* parentPath */ js.Any, Path[js.Object]]
       with Instantiable3[
          /* value */ js.Any, 
          js.UndefOr[/* parentPath */ js.Any], 
          /* name */ js.Any, 
          Path[js.Object]
        ]
}
