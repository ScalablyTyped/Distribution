package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/relative-link-resolution/collector", JSImport.Namespace)
@js.native
object relativeLinkResolutionCollectorMod extends js.Object {
  
  @js.native
  class RelativeLinkResolutionCollector protected () extends js.Object {
    def this(typeChecker: TypeChecker) = this()
    
    val extraOptionsLiterals: js.Array[ObjectLiteralExpression] = js.native
    
    val forRootCalls: js.Array[CallExpression] = js.native
    
    var getLiteralNeedingMigration: js.Any = js.native
    
    var getLiteralNeedingMigrationFromIdentifier: js.Any = js.native
    
    val typeChecker: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
}
