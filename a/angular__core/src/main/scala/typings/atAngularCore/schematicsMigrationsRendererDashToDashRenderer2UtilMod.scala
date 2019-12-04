package typings.atAngularCore

import typings.typescript.typescriptMod.ImportSpecifier
import typings.typescript.typescriptMod.NamedImports
import typings.typescript.typescriptMod.NodeArray
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object schematicsMigrationsRendererDashToDashRenderer2UtilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): Anon_ForwardRefs = js.native
}

