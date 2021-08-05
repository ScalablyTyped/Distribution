package typings.angularCore

import typings.angularCore.anon.Host
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerHostMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/compiler_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationCompilerHost")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String,
    fakeRead: FakeReadFileFn
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationCompilerHost")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeRead.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  
  inline def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: Unit,
    additionalFiles: js.Array[String]
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any], additionalFiles.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: FakeReadFileFn
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any])).asInstanceOf[Host]
  inline def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: FakeReadFileFn,
    additionalFiles: js.Array[String]
  ): Host = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrationProgram")(tree.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], fakeFileRead.asInstanceOf[js.Any], additionalFiles.asInstanceOf[js.Any])).asInstanceOf[Host]
  
  type FakeReadFileFn = js.Function1[/* fileName */ String, String | Null]
}
