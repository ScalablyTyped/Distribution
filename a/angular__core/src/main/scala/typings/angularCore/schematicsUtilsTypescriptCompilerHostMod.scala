package typings.angularCore

import typings.angularCore.anon.Host
import typings.angularDevkitSchematics.mod.Tree
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptCompilerHostMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/compiler_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canMigrateFile(basePath: String, sourceFile: SourceFile, program: Program): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canMigrateFile")(basePath.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createMigrationCompilerHost(tree: Tree, options: CompilerOptions, basePath: String): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationCompilerHost")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def createMigrationCompilerHost(tree: Tree, options: CompilerOptions, basePath: String, fakeRead: FakeReadFileFn): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationCompilerHost")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeRead.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  
  inline def createMigrationProgram(tree: Tree, tsconfigPath: String, basePath: String): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(
    tree: Tree,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: Unit,
    additionalFiles: js.Array[String]
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any], additionalFiles.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(tree: Tree, tsconfigPath: String, basePath: String, fakeFileRead: FakeReadFileFn): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(
    tree: Tree,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: FakeReadFileFn,
    additionalFiles: js.Array[String]
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any], additionalFiles.asInstanceOf[js.Any])).asInstanceOf[Host]
  
  type FakeReadFileFn = js.Function1[/* fileName */ String, js.UndefOr[String]]
}
