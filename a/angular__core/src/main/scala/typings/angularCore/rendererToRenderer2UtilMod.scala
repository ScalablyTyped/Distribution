package typings.angularCore

import typings.angularCore.anon.ForwardRefs
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererToRenderer2UtilMod {
  
  @JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImportSpecifier: ImportSpecifier): ForwardRefs = (^.asInstanceOf[js.Dynamic].applyDynamic("findRendererReferences")(sourceFile.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], rendererImportSpecifier.asInstanceOf[js.Any])).asInstanceOf[ForwardRefs]
}
