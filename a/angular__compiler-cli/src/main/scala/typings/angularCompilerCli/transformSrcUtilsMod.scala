package typings.angularCompilerCli

import typings.angularCompilerCli.ngtscTranslatorMod.ImportManager
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformSrcUtilsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addImports(importManager: ImportManager, sf: SourceFile): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("addImports")(importManager.asInstanceOf[js.Any], sf.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  inline def addImports(importManager: ImportManager, sf: SourceFile, extraStatements: js.Array[Statement]): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("addImports")(importManager.asInstanceOf[js.Any], sf.asInstanceOf[js.Any], extraStatements.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
}
