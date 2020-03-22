package typings.angularCore

import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/compiler_host", JSImport.Namespace)
@js.native
object compilerHostMod extends js.Object {
  def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String
  ): CompilerHost = js.native
  def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String,
    fakeRead: js.Function1[/* fileName */ String, String | Null]
  ): CompilerHost = js.native
}

