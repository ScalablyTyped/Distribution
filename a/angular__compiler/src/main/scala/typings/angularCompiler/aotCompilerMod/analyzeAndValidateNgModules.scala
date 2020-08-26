package typings.angularCompiler.aotCompilerMod

import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", "analyzeAndValidateNgModules")
@js.native
object analyzeAndValidateNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

