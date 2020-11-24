package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/wait-for-async/util", JSImport.Namespace)
@js.native
object waitForAsyncUtilMod extends js.Object {
  
  def findAsyncReferences(sourceFile: SourceFile, typeChecker: TypeChecker, asyncImportSpecifier: ImportSpecifier): Set[Identifier] = js.native
}
