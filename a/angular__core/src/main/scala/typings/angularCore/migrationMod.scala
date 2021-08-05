package typings.angularCore

import typings.angularCore.anon.Node
import typings.typescript.mod.CallExpression
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationMod {
  
  @JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/migration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrateExpression(node: CallExpression, typeChecker: TypeChecker): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateExpression")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[Node]
}
