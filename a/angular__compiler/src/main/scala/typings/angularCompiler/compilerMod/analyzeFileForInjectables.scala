package typings.angularCompiler.compilerMod

import typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost
import typings.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "analyzeFileForInjectables")
@js.native
object analyzeFileForInjectables extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
}

