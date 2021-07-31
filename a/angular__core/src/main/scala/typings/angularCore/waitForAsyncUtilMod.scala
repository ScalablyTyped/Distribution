package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForAsyncUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/wait-for-async/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findAsyncReferences(sourceFile: SourceFile, typeChecker: TypeChecker, asyncImportSpecifier: ImportSpecifier): Set[Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsyncReferences")(sourceFile.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], asyncImportSpecifier.asInstanceOf[js.Any])).asInstanceOf[Set[Identifier]]
}
