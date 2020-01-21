package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.NamedImports
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/migration", JSImport.Namespace)
@js.native
object migrationMod extends js.Object {
  def migrateExpression(node: CallExpression, typeChecker: TypeChecker): AnonNode = js.native
  def replaceImport(node: NamedImports, oldImport: String, newImport: String): NamedImports = js.native
}

