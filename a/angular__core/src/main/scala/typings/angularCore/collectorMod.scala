package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectorMod {
  
  @JSImport("@angular/core/schematics/migrations/initial-navigation/collector", "InitialNavigationCollector")
  @js.native
  class InitialNavigationCollector protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    var assignments: Set[PropertyAssignment] = js.native
    
    var getLiteralNeedingMigration: js.Any = js.native
    
    var getLiteralNeedingMigrationFromIdentifier: js.Any = js.native
    
    val typeChecker: js.Any = js.native
    
    def visitExtraOptionsLiteral(extraOptionsLiteral: ObjectLiteralExpression): Unit = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
}
