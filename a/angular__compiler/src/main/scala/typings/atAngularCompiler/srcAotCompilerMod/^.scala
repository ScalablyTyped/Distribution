package typings.atAngularCompiler.srcAotCompilerMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def analyzeAndValidateNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def analyzeFile(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
  def analyzeFileForInjectables(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
  def analyzeNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

