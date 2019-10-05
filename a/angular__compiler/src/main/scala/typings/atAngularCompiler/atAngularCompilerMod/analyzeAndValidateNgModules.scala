package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzeModulesHost
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "analyzeAndValidateNgModules")
@js.native
object analyzeAndValidateNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

