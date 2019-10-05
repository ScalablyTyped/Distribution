package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzeModulesHost
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFileWithInjectables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "analyzeFileForInjectables")
@js.native
object analyzeFileForInjectables extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
}

