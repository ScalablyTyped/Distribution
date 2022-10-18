package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscEntryPointSrcReferenceGraphMod.ReferenceGraph
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscEntryPointSrcPrivateExportCheckerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point/src/private_export_checker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkForPrivateExports(entryPoint: SourceFile, checker: TypeChecker, refGraph: ReferenceGraph[DeclarationNode]): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForPrivateExports")(entryPoint.asInstanceOf[js.Any], checker.asInstanceOf[js.Any], refGraph.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
}
