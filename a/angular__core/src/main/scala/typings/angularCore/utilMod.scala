package typings.angularCore

import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.NodeArray
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): AnonForwardRefs = js.native
}

