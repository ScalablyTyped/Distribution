package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.compilerMod.NgAnalyzeModulesHost
import typings.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeNgModules")
@js.native
object analyzeNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

