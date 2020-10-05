package typings.angularCore

import typings.angularCore.anon.ForwardRefs
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.NodeArray
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object rendererToRenderer2UtilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): ForwardRefs = js.native
}

