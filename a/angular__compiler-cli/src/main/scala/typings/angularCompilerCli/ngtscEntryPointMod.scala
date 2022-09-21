package typings.angularCompilerCli

import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngtscEntryPointMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point", "FlatIndexGenerator")
  @js.native
  open class FlatIndexGenerator protected ()
    extends typings.angularCompilerCli.generatorMod.FlatIndexGenerator {
    def this(entryPoint: AbsoluteFsPath, relativeFlatIndexPath: String) = this()
    def this(entryPoint: AbsoluteFsPath, relativeFlatIndexPath: String, moduleName: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point", "ReferenceGraph")
  @js.native
  open class ReferenceGraph[T] ()
    extends typings.angularCompilerCli.referenceGraphMod.ReferenceGraph[T]
  
  inline def checkForPrivateExports(
    entryPoint: SourceFile,
    checker: TypeChecker,
    refGraph: typings.angularCompilerCli.referenceGraphMod.ReferenceGraph[DeclarationNode]
  ): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForPrivateExports")(entryPoint.asInstanceOf[js.Any], checker.asInstanceOf[js.Any], refGraph.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  
  inline def findFlatIndexEntryPoint(rootFiles: js.Array[AbsoluteFsPath]): AbsoluteFsPath | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findFlatIndexEntryPoint")(rootFiles.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath | Null]
}
