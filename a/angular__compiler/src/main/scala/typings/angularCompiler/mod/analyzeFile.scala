package typings.angularCompiler.mod

import typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost
import typings.angularCompiler.aotCompilerMod.NgAnalyzedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}

